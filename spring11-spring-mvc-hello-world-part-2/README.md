# Spring web MVC - Hello world part 2

Trong ví dụ này đã làm rõ hơn về chức năng của `DispatcherServlet`, đó chính là file `dispatcher-servlet.xml`
     
Nó đón vai trò điều hướng, đưa các `request` tới các `bean controller` tương ứng bằng cách:
   - Scan các package chứa `Controller` (các class chứa `@Controller`)
   - Thêm `prefix` và `suffix`

Nó cùng với `web.xml` (config cho web project - trong trường hợp này là config servlet) đã làm nên một `Dispatcher` hoàn thiện.


Nhìn vào file `dispatcher-servlet.xml` cũng chỉ là config các bean của spring mà thôi, bản chất của một `dispatcher`
là một tập các `bean` để trỏ tới `controller` mà spring quản lý.

Nhưng khi ta cần có các `bean` khác ngoài `controller` mà ta định nghĩa (như `Student` trong ví dụ)
thì spring vẫn có file `applicationContext.xml` cho ta như trước.
File này cũng được cắm vào `web.xml` ở thuộc tính `context-param`.


Một điểm chú ý là trong ví dụ lần này, ở hàm `hello` của `controller` có nhận vào một tham số truyền vào,
và trong `controller` có set `Attribute` cho nó. Đây chính là `Model` được đóng gói và gửi về client,
nó sẽ chứa các dữ liệu mà client mong muốn, như trong trường hợp này là một `message`.
Và ở phía nhận được sẽ sử dụng message này như một biến bình thường (trong phạm vi request).
Ví dụ ở file `Hello.jsp`

Còn `Model`, `ModelMap`, `ModelAndView` sẽ được tìm hiểu dần.
