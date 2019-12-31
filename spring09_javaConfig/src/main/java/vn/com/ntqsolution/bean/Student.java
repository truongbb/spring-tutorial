package vn.com.ntqsolution.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Student {

    int id;
    String name;
    Clazz clazz;

    public void initStudent() {
        System.out.println("INIT STUDENT");
    }

    public void destroyStudent() {
        System.out.println("DESTROY STUDENT");
    }

}
