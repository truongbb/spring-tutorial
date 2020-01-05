package vn.com.ntqsolution.theory;

public class Theory {

    /**
     * ========== ANNOTATION CONFIG ===========
     *
     * JPA là một ORM framework của Java EE.
     * Nếu như Session là linh hồn của Hibernate thì EntityManager cũng chính là linh hồn của JPA.
     * Tương ứng với SessionFactory ta sẽ có EntityManagerFactory
     * Và nó có 2 loại:
     *
     * - Application-managed: là loại entityManager mà được tạo khi application yêu cầu trực tiếp từ một entity manager factory.
     * Với loại này, application sẽ có trách nhiệm mở, đóng và thao tác với các transaction thuộc quản lý của entity manger mà nó yêu cầu.
     * Loại này được sử dụng hầu hết ở các ứng dụng không chạy JEE container. (khi cấu hình phải chỉ rõ persistent unit như các ứng dụng JEE ngày trước)
     *
     * - Container-based: Cũng tương tự lọai trên, nhưng loại trên ở mức application thì loại này ở mức container,
     * và loại này cấu hình dễ dàng hơn và quen thuộc hơn, khá giống khi cấu hình hibernate và thường được sử dụng rộng rãi.
     *
     * Điểm chung của cả 2 loại đó chính là đều implement EntityManager interface.
     *
     * Cấu hình của EntityManager được nêu ở file DataSourceConfig.
     *
     * Vì có 2 loại như trên nên Spring cung cấp 2 EntityManager tương ứng với 2 loại để ta tiện sử dụng:
     * - LocalEntityManagerFactoryBean
     * - LocalContainerEntityManagerFactoryBean
     *
     * Trong ví dụ này ta sử dụng LocalContainerEntityManagerFactoryBean, nó cần DataSource và JpaVendorAdapter để config
     * vì vậy không thể thiếu 2 bean này trước khi config LocalContainerEntityManagerFactoryBean.
     *
     *
     * Ngoài ra, một điểm lưu ý nữa là các thao tác liên quan tới việc thay đổi dữ liệu như thêm, sửa, xóa
     * thì ta nên dùng entityManager, hoặc cùng lắm là session, vì entityManager rất dễ thực hiện, quản lý và thao tác nhanh chóng.
     * Còn khi query data có thể thoải mái sử dụng jdbcTemplate hoặc namedParameterJdbcTemplate, hoặc Hibernate.
     *
     * Trong ví dụ này, khi để config của session và entity manager cùng đồng thời tồn tại sẽ dẫn tới Spring không hiểu bean nào để inject,
     * vì trong entityManger có thể lấy ra được Session (Session extends EntityManager)
     * Vậy nên phải loại bỏ bean Session đi, và thực hiện lấy Session từ EntityManger.
     *
     * Ngoài ra, ta còn phải config thêm annotation @EnableTransactionManagement ở class DataSourceConfig, và 1 bean transactionManager()
     * cùng với thêm annotation @Transactional ở BaseRepository
     */

}
