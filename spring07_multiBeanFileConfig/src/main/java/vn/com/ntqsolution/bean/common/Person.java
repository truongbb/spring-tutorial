package vn.com.ntqsolution.bean.common;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    int id;
    String name;
    String phone;
    Gender gender;
}
