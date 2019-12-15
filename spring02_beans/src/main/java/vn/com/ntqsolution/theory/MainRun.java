package vn.com.ntqsolution.theory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {

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


        // cách dùng file xml để cấu hình bean là một cách dùng phổ biến nhưng không được ưa chuộng nữa
        // ngày nay người ta thường sử dụng annotation, java config hoặc yaml để cấu hình các đối tượng kiểu khác: list, object, ... xin google
        // ngày nay người ta thường sử dụng spring boot
    }
}
