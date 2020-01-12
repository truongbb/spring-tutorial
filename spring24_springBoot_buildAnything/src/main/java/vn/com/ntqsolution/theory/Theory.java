package vn.com.ntqsolution.theory;

public class Theory {

    /**
     *
     * ------------SPRING BOOT - BUILD ANYTHING------------
     *
     *
     * Với Spring boot ta có thể làm mọi thứ mà Spring trước kia cung cấp với cách làm nhanh và gọn nhẹ hơn rát nhiều.
     *
     * Trong ví dụ này, có sử dụng config bằng file application.yml.
     * Đây là kiểu config mới và hiện đại được khuyến nghị sử dụng nhất, cấu trúc của file .yml/.yaml là cấu trúc cây,
     * ví dụ như trong application.properties có thuộc tính là a.b.c thì trong application.yml nó sẽ được tổ chức như sau:
     *
     *  a:
     *      b:
     *          c:
     * vì vậy ta có thể ánh xạ được các cấu hình từ 2 file.
     * Trong application.yml ta có thể cấu hình được các thông tin về spring như data source, config mail, logging, server, ...
     * Chi tiết hơn xem tại: https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html
     *
     * Ngoài ra, ngoài các cấu hình được spring cung cấp sẵn ở link trên, spring cũng cho phép ta tự tạo ra cấu hình của riêng mình
     * và viết vào trong file cấu hình(phần này sẽ tìm hiểu sau).
     * Một lưu ý khác nữa là khi ta có nhiều file cấu hình cho nhiều môi trường khác nhau: developer sử dụng appliation.yml,
     * staging sử dụng application-staging.yml, production sử dụng application-prod.yml thì khi build project ta cần chỉ rõ là ta dùng file config nào.
     * Nếu không chỉ rõ thì spring sẽ lấy file cấu hình mặc định là file có tên application.yml
     *
     *
     * Trong ví dụ này, một api find-by-name được viết với cách bố trí 3 tầng quen thuộc nhưng không cần cấu hình phức tạp như ở file xml,
     * mọi thứ dùng annotation để cấu hình, rất đơn giản và tiện lợi.
     * Ta vẫn có thể dùng các công nghệ mà ta muốn nhu hibernate, spring data jpa, spring data jdbc, spring web mvc, ...
     *
     *
     *
     *
     */

}
