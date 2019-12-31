package vn.com.ntqsolution.bean.others;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {

    int id;
    String brand;

    public Car() {
        System.out.println("Initialize car");
    }

    @PostConstruct
    public void init() {
        System.out.println("Post construct"); // hàm được gọi ngay khi context được khởi tạo
        // và class nào có @PostConstruct thì constructor của class đó được gọi trước hàm có @PostConstruct
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy car object");
    }


}
