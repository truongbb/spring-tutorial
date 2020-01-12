package vn.com.ntqsolution.runners.theory;

public class Theory {

    /**
     *
     * ------------SPRING RUNNERS--------------
     *
     * Spring boot cung cấp 2 interface đó là CommandLineRunner và ApplicationRunner,
     * khi ứng dụng của ta implement 1 trong 2 interface này thì ta phải cài đè hàm run().
     *
     * Hàm run() này sẽ được chạy chỉ sau khi application context được tạo và trước khi ứng dụng spring boot của chúng ta start.
     * Điểm khác biệt giữa 2 interface này chính là CommandLineRunner.run() sẽ chấp nhận tham số đầu vào là một mảng String
     * còn APplicationRunners.run() chấp nhận tham số đầu vào là ApplicationArgument.
     *
     * Nói cách khác, chỉ khi ta quan tâm tới tham số đầu vào của ứng dụng thì ta mới quan tâm nên sử dụng loại nào.
     * Nếu như ta chỉ cần viết một đoạn công việc để thực hiện trước khi ứng dụng khởi chạy và sau khi application context đươc tạo
     * thì ta không cần quan tâm tới chúng.
     *
     * Tham số đầu vào chính là các tham số được lấy từ câu lệnh chạy file jar của ta, ví dụ như:
     * java -jar spring26.jar -Darg1=HELLO
     * thì ta có tham số arg1 mang giá trị HELLO
     * Các tham số này được cho vào câu lệnh chứ không để ở file config hay file Constant nào đó,
     * vì để che giấu thông tin không để một số đối tượng thấy được.
     *
     * Có một thuộc tính được config trong file application.yml để đánh dấu project không phải là project web đó là
     * spring.main.web-application-type=NONE
     * và khi ấy ta có thể chỉ chạy các hàm mà ta gọi trong run() khi project ta muốn không cần là một project web.
     *
     */

}
