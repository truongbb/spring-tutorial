package vn.com.ntqsolution.bo;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    int id;
    int age;
    String name;
    String address;
    String password;
    String gender;
    String description;
    boolean isAdult;
    String country;
    String hiddenItem;
}
