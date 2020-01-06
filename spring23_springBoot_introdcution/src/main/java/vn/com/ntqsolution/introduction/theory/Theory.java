package vn.com.ntqsolution.introduction.theory;

public class Theory {

    /**
     *
     * ========== INTRODUCTION TO SPRING BOOT ===========
     *
     * Spring boot - 1 trong những nhánh của Spring có thể làm gần như mọi thứ đối với Spring mà ta mong muốn.
     *
     * Các ví dụ trước đã demo Spring core, spring mvc, spring data,
     * và ta đã thấy được khả năng của Spring trong các lĩnh vực quản lý object, inject, DI, IoC, web MVC, jdbc, hibernate, jpa, ...
     *
     * Quay lại lịch sử, sự ra đời của Spring là một sự thay thế cho JEE nặng nề và công kềnh ngày trước.
     * Spring, một framework lightweight, nhanh, xử lý tốt và được nhiều người ưa chuộng.
     * Nhưng có một điểm mà khong mấy ai có thể thích ở Spring trước khi phiên bản boot ra đời, đó chính là cấu hình.
     * Để chạy một project demo Spring helloWorld chẳng hạn, ta phải cấu hình rất vất vả,
     * từ thư viện, file xml, hiểu về ApplicationContext, Container, Ioc, DI, ...
     * để rồi in ra một dòng Hello World đơn giản.
     * Việc đó gây tốn công sức, đặc biệt là khi config bằng xml file, gần như đó là chuyện cực hình với 1 số dev.
     * Rồi dần dần ra có cấu hình bằng các annotation, bằng java file nhằm giảm thiểu sự nặng nề khi config project spring,
     * Nhưng config chỉ là một góc nhỏ trong các điểm yếu của Spring trước khi Boot ra đời.
     *
     * Đến khi Boot được phát hành với slogan: "Build anything", và với những cái hay mà nó mang lại, nó được cộng đồng chấp thuận
     * và sử dụng rộng rãi, thậm chí rất yêu thích, vì:
     *
     * - Automatic configuration: Spring boot làm gần như tất cả chuyện cấu hình của spring ngày trước cho chúng ta,
     * giảm thiểu tới mức tối đa config cho người dùng nhất có thể, xem ví dụ trong bài để biết thêm chi tiết.
     *
     * - Starter dependencies: Một bộ các dependencies nền tảng cho tất cả các mảng mà Java dev nhắm tới như web, jdbc, security,
     * messaging, IoT, cloud, ... rất đơn giản và gọn nhẹ, người dùng không cần quan tâm nhiều tới thư viện như trước
     *
     * - CLI: tập các câu lệnh hỗ trợ nhanh chóng và hiệu quả
     *
     * - Actuator
     *
     *
     *
     * ****** AUTOMATIC CONFIGURATION ******
     * Trước kia, ta sử dụng file xml, hoặc file Java có @Configuration để cấu hình.
     * Thì nay với Spring boot, ta không còn cần file xml với những xsd phức tạp nữa,
     * cũng không còn cần những file java Config (nếu tình thế không bắt buộc sử dụng file java để cấu hình).
     * Tất cả nhũng thứ đó được thay thế bằng những thứ đơn giản hơn:
     * - file cấu hình application.properties hoặc application.yml: Spring boot vẫn sử dụng file cấu hình,
     * nhưng chỉ để cấu hình những thứ cần thiết như là data source, các thông số chung của spring
     * như logging, banner, jmx, messaging, cache, mail, ....
     * hoặc ta có thể tự cấu hình các tham số mong muốn không có trong hệ thống cấu hình mặc định của spring(tự custom được)
     * chuyện này file xml ngày trước không làm được. Mặt khác, file properties hoặc yml có cấu trúc rất dễ sử dụng,
     * không gây khó khăn trong chuyện cấu hình.
     * https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html
     *
     * - Annotation config như @Configuration, @ComponentScan, ... và một số annotation khác, tất cả đều được thay thế bằng 1 annotation duy nhất,
     * nằm ở class main của Spring boot, đó chính là @SpringBootApplication.
     * Việc còn lại của chúng ta không cần phải cấu hình các bean như trước, mà ta sử dụng toàn bộ các annotation dựng sẵn
     * như @Controller, @Repository, @Service, @Component, @Autowired, ... trong các class. Việc quản lý, tạo context, lấy bean, inject, ...
     * đều được một cái annotattion @SpringBootApplication làm tất.
     *
     * Trong các ví dụ bài sau sẽ nói rõ hơn về mặt config này.
     *
     *
     *
     *
     * ***** Starter dependencies *****
     * Để một application là Spring boot application, thì trong dependencies của chúng ta bắt buộc phải có:
     * <parent>
     *    <groupId>org.springframework.boot</groupId>
     *    <artifactId>spring-boot-starter-parent</artifactId>
     *    <version>2.2.2.RELEASE</version>
     *    <relativePath/>
     * </parent>
     *
     * để maven dependency hoặc grandle connect tới Spring.io kéo base về cho project của chúng ta.
     * Ngoài ra, khi chúng ta muốn thao tác với Spring web mvc, ta chỉ cần add duy nhất 1 starter dependency sau:
     * <dependency>
     *    <groupId>org.springframework.boot</groupId>
     *    <artifactId>spring-boot-starter-web</artifactId>
     * </dependency>
     * tương tự với spring data jpa:
     * <dependency>
     *    <groupId>org.springframework.boot</groupId>
     *    <artifactId>spring-boot-starter-data-jpa</artifactId>
     * </dependency>
     * hoặc là spring data jdbc:
     * <dependency>
     *    <groupId>org.springframework.boot</groupId>
     *    <artifactId>spring-boot-starter-data-jdbc</artifactId>
     * </dependency>
     *
     * mọi chuyện trở nên rất đơn giản, và trong project của chúng ta sử dụng annotation, method, ... như các bài trước đã làm.
     *
     * Đó chính là hệ thống starter dependencies của spring boot, chúng bao gồm:
     *
     * ■ org.springframework:spring-core
     * ■ org.springframework:spring-web
     * ■ org.springframework:spring-webmvc
     * ■ com.fasterxml.jackson.core:jackson-databind
     * ■ org.hibernate:hibernate-validator
     * ■ org.apache.tomcat.embed:tomcat-embed-core
     * ■ org.apache.tomcat.embed:tomcat-embed-el
     * ■ org.apache.tomcat.embed:tomcat-embed-logging-juli
     * ■ ....
     *
     * các thư viện về core, web mvc, jdbc, ... hoặc tự nhúng tomcat để chạy ứng dụng, ta không cần add tay tomcat như trước nữa, ...
     *
     *
     * Như ở trong ví dụ bài này dựng một API mà không cần có file config xml, thâm chí file application.prperties để trống,
     * và Spring boot làm mọi thứ cho ta, cả việc nhúng tomcat vào chạy
     *
     *
     *
     *
     *
     *
     */
}
