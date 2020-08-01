package com.github.truongbb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {

    public static void main(String[] args) {
        // đọc file cấu hình spring, file cấu hình có tên mặc định là applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // trả về object theo id
        // Object bean1 = context.getBean("Mess1");
        Message bean1 = (Message) context.getBean("Mess1"); // --> ép kiểu để nhận về kiểu mong muốn
        bean1.showMessage();
        // giá trị của message của bean1 được định nghĩa trong thẻ <property> trong file cấu hình

        // tương tự với bean được lấy bằng cách inject constructor
        Message bean2 = (Message) context.getBean("Mess2"); // --> ép kiểu để nhận về kiểu mong muốn
        bean2.showMessage();
    }

}
