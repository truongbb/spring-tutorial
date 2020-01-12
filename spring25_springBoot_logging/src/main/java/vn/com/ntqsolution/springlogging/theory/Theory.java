package vn.com.ntqsolution.springlogging.theory;

public class Theory {

    /**
     *
     * ------------SPRING LOGGING---------------
     *
     * Logging là một công việc quan trọng trnog mỗi project, nó giúp ta theo dõi được tình trạng hiện tại của project,
     * ngoài ra còn giúp tìm và phát hiện lỗi khi cần.
     * Việc log các kết quả được trả ra đã có từ rất lâu, điển hình là các thư viện logging nổi tiếng như log4j, log của apache, ...
     *
     * Với Spring, logging lại càng quan trọng hơn và cũng có rất nhiều cách để làm điều này.
     * Mặc định, trong spring đã cấu hình logging rồi, ta không cần cấu hình thì log cũng bắn ra console như thường,
     * và đó là cấu hình sẵn có và chuẩn mực của spring.
     * nhưng nếu ta muốn custom cho dự án thì ta phải cấu hình thêm ở file application.yml hoặc sử dụng logback.xml file đặt trong resource.
     *
     *
     * Các cấp độ log level từ thấp tới cao là TRACE -> DUBUG -> INFO -> WARN -> ERROR.
     * Khi ta bật log ở level X nào đó thì nó sẽ thực hiện bắn log từ level X trở lên.
     * Mặc định log level root của spring là INFO
     *
     * Trong file application.yml đã cấu hình logging mẫu, với pattern:
     * %d{dd-MM-yyyy HH:mm:ss.SSS} %magenta([%thread]) %highlight(%-5level) %logger.%M - %msg%n
     *
     * vói
     * %d : thời gian ghi message, có thể chấp nhận tất các các định dạng SimperDateFormat cho phép
     * %thread : tên thread ghi message
     * $-5level : level ghi log (các mức level có thể là trace, debug, info, warn, error)
     * %logger{36} : tên package class nơi log được ghi ra. Số 36 có ý nghĩa là lược ngắn tên package class trong trường hợp tên quá dài.
     * %M : tên của method nơi log được ghi ra
     * %msg: message chính
     * %n : ngắt dòng
     * %magenta() : đặt màu của message đầu ra trong dấu (), có thể chọn các màu khác
     * highlight() : đặt màu của message đầu ra trong dấu (), tùy thuộc vào level log (ví dụ ERROR là màu đỏ)
     *
     *
     * đó là một số config cơ bản
     *
     * ngoài ra, log còn có thể được ghi lại vào file để có thể theo dõi được lịch sử,
     * hoặc được chuyển sang hệ thống quản lý log như EFK để dễ dàng theo dõi và quản lý,
     * cấu hình được demo trong file application.yml
     *
     * Ngoài cách cấu hình bằng file application.yml ra, ta hoàn toàn có thể cấu hình bằng logback.xml,
     * (bản chất log của spring chính là logback), chi tiết cấu hình xem tại:
     * https://viblo.asia/p/spring-logback-config-E375zg6bKGW
     *
     *
     */

}
