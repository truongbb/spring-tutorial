package vn.com.ntqsolution.theory;

public class Theory {

    /**
     *
     * Ở bài trước @Controller đã được giải thích sơ bộ.
     *
     * Bài này sẽ đi sâu hơn trong trường hợp khi mà class controller có @Controller và bên trong chứa nhiều @RequestMapping
     * tương ứng với nhiều hàm thì nếu config bằng xml sẽ như thế nào?
     * Việc config bằng xml có trước annotation, chỉ khi hiểu được config xml thì mới sử dụng tốt annotation được.
     *
     * Bài trước, khi controller config bằng xml sẽ implement Controller hoặc extends AbstractController,
     * và bên trong controller đó chỉ có 1 hàm cài đè duy nhất để xử lý các request tới controller này
     * --> nếu như có n request khác loại thì cũng cần có n controller như thế
     * --> việc tổ chức và xử lý code cồng kềnh, chưa kể gây nặng project và hiệu năng
     * --> phải có 1 cách nào đó để 1 controller có thể xử lý nhiều request khác nhau.
     *
     * Spring MVC có một class là MultiActionController, trong đó nó cho phép ta viết nhiều hàm trong một controller để xử lý nhiều request khác nhau như thế.
     *
     * Nhưng hình như bản Spring 5 này đã bỏ đi class đó, nên là không thể demo trong phần ví dụ này được, vui lòng xem tại:
     *
     * https://www.tutorialspoint.com/springmvc/springmvc_multiactioncontroller.htm
     * https://www.tutorialspoint.com/springmvc/springmvc_propertiesmethodnameresolver.htm
     * https://www.tutorialspoint.com/springmvc/springmvc_parametermethodnameresolver.htm
     * https://www.tutorialspoint.com/springmvc/springmvc_parameterizableviewcontroller.htm
     *
     *
     */

}
