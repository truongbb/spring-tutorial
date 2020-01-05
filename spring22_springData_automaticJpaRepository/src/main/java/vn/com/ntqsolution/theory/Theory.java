package vn.com.ntqsolution.theory;

public class Theory {

    /**
     * ========== AUTOMATIC JPA REPOSITORY ===========
     *
     * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories
     *
     * Spring data JPA là một phần trong Spring data với khả năng tự động hóa gần như tất cả các thao tác với DB cơ bản.
     *
     * Spring cung cấp cho ta 3 nterface để tùy chọn:
     * - JpaRepository
     * - PagingAndSortingRepository
     * - CrudRepository
     *
     * Khi xem cây kế thừa thì sẽ biết rằng JpaRepository kế thừa PagingAndSortingRepository, PagingAndSortingRepository kế thừa CrudRepository.
     * Nhiệm vụ của ta khi sử dụng Spring data JPA là repository của ta sẽ extends/implements 1 trong 3 interface đó và viết hàm.
     *
     * Công việc viết hàm hết sức đơn giản, ta chỉ cần viết tên hàm "theo đúng quy luật", việc thao tác với dữ liệu là của Spring lo,
     * ta không cần phải viết nội dung của hàm (như ví dụ trong StudentRepository).
     *
     * Vậy, "quy luật" đặt ra ở đây là gì? Các bước làm như sau:
     * 1. Cấu hình DataSrouce EntityManger, Transaction, Spring data JPA như trong DataSourceConfig.
     *      Spring data JPA có thể cấu hình bằng xml (như comment trong file applicationContext.xml,
     *      hoặc cấu hình bằng Java bằng một annotation duy nhất @EnableJpaRepositories (chỉ ra các package mà có implements/extends 1 trong 3 interface được liệt kê ở trên)
     * 2. Entity của ta phải được định nghĩa các thông tin cần thiết (xem StudentEntity) như là entity khi làm việc với hibernate.
     * 3. Class/Interface của ta extends/implements 1 trong 3 interface được liệt kê bên trên.
     *      Ở phần generic truyền vào, đầu tiên là Entity, chỉ ra rằng repository đó làm việc với entity nào,
     *      tham số thứ 2 là kiểu dữ liệu của ID trong Entity đó. Ví dụ như StudentEntity và String(ID có kiểu dữ liệu là String)
     * 4. Viết tên hàm theo mong muốn và quy luật mà Spring data JPA đặt ra ở đây https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
     * ví dụ: findBy<tên trường muốn tìm kiếm>And<tên trường thứ 2 muốn tìm kiếm>(String <tên trường thứ nhất>, String <tên trường thứ 2>)
     * thì khi viết như thế Spring sẽ tìm kiếm trong DB theo điều kiện AND của 2 trường
     *
     *
     * Ngoài ra, PagingAndSortingRepository còn có thể thực hiện chức năng phân trang và sắp xếp một cách tự động,
     * đọc thêm tại: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.sorting
     *
     *
     * Ta hòan toàn có thể sử dụng NamedQuery hoặc Query thông thường để thực hiện truy vấn dữ liệu với câu SQL mà ta mong muôn
     * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
     * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.named-parameters
     *
     *
     *
     *
     */

}
