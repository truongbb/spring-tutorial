package vn.com.ntqsolution.theory;

public class Theory {

    /**
     *
     * Quay lại với việc config bằng xml để hiểu rõ hơn tại sao annotation @Controller được sinh ra và sử dụng.
     *
     * Ở HomeController, ta vẫn sử dujg @Controller như bài trước đã làm, không cần cấu hình ở file config xml, nhưng phải có 2 thuộc tính
     * <context:component-scan base-package="vn.com.ntqsolution.controller"/>
     * <mvc:annotation-driven/>
     * để quét các bean và đánh dấu sử dụng annotation của spring web mvc.
     *
     * Ban đầu, trước khi sinh ra @Controller, thì một class được hiểu là controller khi nó extends AbstractController (như WelcomeController)
     * hoặc implements Controller (như AboutController) và được cấu hình là một bean ở file applicationContext.xml.
     * Điều đương nhiên rằng class extends hoặc implements đó phải cài đè hàm handleRequestInternal() của Controller
     *
     * Điểm khác biệt với HomeController đó chính là hàm handleRequestInternal() trả về một ModelAndView,
     * bên HomeController sẽ trả về một String và dispatcher sẽ map tên thành 1 file jsp.
     * Điều tương tự cũng xảy ra khi chúng ta khởi tạo một đối tượng ModelAndView, chúng ta phải truyền tên của file jsp mà ta mong muốn vào
     * và cuối cùng return lại như bình thường.
     * Tất nhiên là modelAndView có thể mang dữ liệu để truyền lên phía trang jsp bằng các hàm của nó như addObject đã dùng trong AboutController.
     *
     * Sau khi extends/implements và cài đè hàm cần thiết, chúng ta cần cấu hình thêm ở file applicationContext.xml để đánh dấu đây là một bean.
     * Nếu như sử dụng @Controller thì mỗi hàm ở trong controller sẽ có @RequestMapping để dispatcher điều hướng tới đúng hàm xử lý khi có request tương ứng.
     * Vì vậy khi config bằng xml thì có nhiều cách để định nghĩa ra URL cho dispatcher mapping.
     * Trong ví dụ sử dujg 2 cách:
     *  - Sử dụng name của bean để map: như là bean aubout, nhưng chú ý phải có bean
     *      <bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"/>
     *      để đánh dấu là ta sử dụng thuộc tính name của bean để mapping.
     *
     *  - Sử dụng URL mapping như phần còn lại của file cấu hình applicationContext.xml,
     *  các prop có key là URL mà ta muốn còn giá trị của thẻ đó chính là id của bean controller mà ta mong muốn hướng tới.
     *
     *
     *
     *  Trong ví dụ này cũng demo phần chuyển trang, ở Hello.jsp có 3 button nằm ở 3 form riêng biệt submit lên các URL tương ứng được cấu hình
     *  (có thể được cấu hình bằng @RequestMapping hoặc trong file applicationContext.xml)
     *  Khi bấm nút, đồng nghĩa với việc nó sẽ gọi lên Controller để thực hiện gì đó và trả về View,
     *  trong bài này sẽ không thực hiện gì cả chỉ chuyển sang một view khác mà thôi,
     *
     *  Có demo redirect ở HomeController, khi gọi tới hàm đó thì chính cú pháp "redirect:finalPage" sẽ chuyển hướng tới URL ./finalPage để xử lý.
     *
     *
     *
     *
     *
     */

}
