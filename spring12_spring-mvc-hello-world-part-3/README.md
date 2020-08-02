# Spring web MVC - Hello world part 3 (JAVA CONFIGURATION)

Config hoàn toàn sử dụng java 100%, không dùng tới các file `xml`. Đây là một kiểu config tốt hơn, mới hơn và được khuyến nghị sử dụng hơn.
Tất nhiên vẫn phải sử dụng Tomcat để chạy.


`DispatcherServlet` là một phần trung tâm của Spring MVC, nó là người điều hướng, kiến thiết cho các request.
Ở 2 project trước, nó chính là file `web.xml` và `dispatcher-servlet.xml`
Nhưng ở project này nó chính là class `WebAppInitializer`.

Explain:
Tất cả các class nào mà kế thùa `AbstractAnnotationConfigDispatcherServletInitializer` sẽ được mặc định được sử dụng để cấu hình `DispatcherServlet`
và Spring context trong một servlet web app.

Một cách cụ thể hơn, bất cứ class nào implement `javax.servlet.ServletContainerInitializer` thì mặc định được sử dụng để cấu hình servlet container.
Riêng về Spring, nó có class `SpringServletContainerInitializer` để implement interface kia.
Class này sẽ tìm kiếm bất cứ class nào implement `WebApplicationInitializer` và giao cho chúng nhiệm vụ cấu hình.
Và từ Spring 3.2, chúng ta có `AbstractAnnotationConfigDispatcherServletInitializer` implement `WebApplicationInitializer` để làm nhiệm vụ đó.
Vì WebAppInitializer của ta đã extends `AbstractAnnotationConfigDispatcherServletInitializer` nên nó chính là một `dispatcher-servlet` như mô tả trong kiến trúc của Spring MVC.


Đi vào cụ thể hơn trong class `WebAppInitializer`, có 3 phương thức mà ta cài đè:

   - `getServletMappings()`: phương thức này giống như thuộc tính `servlet-mapping` ở trong file `web.xml`, nó sẽ xác định xem là xử lý request nào.
       Trong bài này là "/" nghĩa là nó sẽ nhận mọi request, nếu như để "/abc" thì nó chỉ nhân các request có đầu là http(s)://<ip>:<port>/abc/...

   - `getServletConfigClasses()`: Khi `DispatcherServlet` được khởi động, nó sẽ tạo ra Spring context và load các bean được cấu hình (có thể trong file xml, có thể trong file java sử dụng `anotation`)
       Với phương thức `getServletConfigClasses()`, nó sẽ load Config ở `WebConfig` mà ta return trong hàm đó tương ứng với `DispatcherServlet`.

   - `getRootConfigClasses()`: Nó sẽ load các config của `ContextLoaderListener` mà ta cấu hình trong `RootConfig`, trong ví dụ này là không có config trong `RootConfig`.


Việc load config ở `DispatcherServlet` và `ContextLoaderListener` có điểm gì khác biệt?

`DispatcherServlet` và `ContextLoaderListener` là 2 context khác nhau của Spring.
`AbstractAnnotationConfigDispatcherServletInitializer` khi khởi động sẽ tạo ra Spring context (đề cập bên trên) bao gồm `DispatcherServlet` và `ContextLoaderListener`.

Các class được return ở hàm `getServletConfigClasses()` là các class có `@Configuration` ở đầu (như là `WebConfig`) và nó có nhiệm vụ load cấu hình bean cho `DispatcherServlet` context.
Các class được return ở hàm `getRootConfigClasses()` là các class có `@Configuration` ở đầu (như là `RootConfig`) và nó có nhiệm vụ load cấu hình bean cho `ContextLoaderListener` context.

Việc load bean ở  `DispatcherServlet` và `ContextLoaderListener` là hòan toàn khác nhau:
   - `DispatcherServlet` load các bean cơ bản như ta thường biết như `controller`, `view resolver`, `handler mappings`, ...
   - `ContextLoaderListener` load các bean khác như tầng giữa (middle-tier) hoặc tầng dữ liệu (data-tier) phục vụ việc xử lý phía sau (back end) của một ứng dụng.

----------------------

Trong `WebConfig` chứa một số annotation:

   - `@EnableWebMvc`: annotation này tương tự như khi cấu hình bằng xml file sử dụng `<mvc:annotation-driven>`, bật chế độ web mvc lên thôi.
       Nhưng bật annotation này lên sẽ có 1 số vấn đề ở đây:
       
       - Không có `view resolver` nào được cấu hình. Nếu không cấu hình view resolver thì Spring sẽ sử dụng `BeanNameViewResolver` mặc định.
           `BeanNameViewResolver` này sẽ resolve các view bằng cách tìm kiếm view nào có ID khớp với tên mà nó nhận được và các view đó phải implement View interface.
           
       - `Component scanning` không được bật, hậu quả là nó sẽ quét toàn bộ `controller` được định nghĩa trong các file cấu hình có chứa `@Configuration` hoặc các file `applicationContext.xml` của project.

       -  `DispatcherServlet` sẽ xử lý tất cả các request không phân chia static request (gửi ảnh, file nhị phân, .... ) hay request thông thường
           Vì thế nên phải `@ComponentScan`, và config bean `ViewResolver` bên trong cùng với `configureDefaultServletHandling()` để giải quyết các static content

   - Phần `@Bean` resolver quá rõ ràng và giống với file cofig sử dụng xml.

-----------------------

Trong `HomeController`, không có `@RequestMapping` ở trên class, điều này hoàn toàn hợp lệ, Spring sẽ kiếm tìm các `@RequestMapping` tương ứng ở bên dưới các hàm như thường.
Trong trường hợp này URL của API chuẩn sẽ là `http://localhost:8080/<project-name>/home`
(về phần tên project có thể thay đổi lúc cấu hình tomcat)
