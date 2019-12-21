package vn.com.ntqsolution.theory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {

    /**
     * ==================BEAN===================
     *
     * Trong spring, các đối tượng được nó quản lý gọi là bean (hạt đậu :v)
     *
     * Các bean này sẽ được IoC container quản lý và inject
     *
     * Các bean được định nghĩa trong file applicationContext.xml và được đọc ra như hàm main bên dưới làm
     *
     * Context (ngữ cảnh) trong spring là phạm vi hoạt động của spring, các bean được quản lý bởi IoC trong Context của chương trình
     *
     * Spring sẽ tự tạo các bean khi cần thiết mà chúng ta không phải khởi tạo nó như trước kia ta vẫn làm
     * ta không cần phải Message m = new Message(); nữa, mà Spring sẽ tự động khởi tạo, inject các thành phần cần thiết
     *
     * Để định nghĩa ra các bean, trước kia, cách được sử dụng đàu tiên chính là file xml như bài đã làm
     * nhưng về sau, khi spring phát triển hơn, thì việc định nghĩa các bean bằng file xml bộc lộ nhiều khuyết điểm
     * như là số lượng bean gia tăng ta phải tách file, hoặc quá nhiều bean trong file dẫn tới khó quản lý và inject
     *
     * người ta đã sinh ra các annotation để thực hiện việc đó, theo dõi các bài sau nữa để thấy thêm
     *
     */

    public static void main(String[] args) {
        // đọc file cấu hình sping, file cấu hình có tên mặc định là applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // trả về objet theo id
        // Object bean1 = context.getBean("Mess1");
        Message bean1 = (Message) context.getBean("Mess1"); // --> ép kiểu để nhận về kiểu mong muốn
        bean1.showMessage();
        // giá trị của message của bean1 được định nghĩa trong thẻ <property> trong file cấu hình

        // tương tự với bean được lấy bằng cách inject constructor
        Message bean2 = (Message) context.getBean("Mess2"); // --> ép kiểu để nhận về kiểu mong muốn
        bean2.showMessage();

    }
}
