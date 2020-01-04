package vn.com.ntqsolution.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    String id;
    String firstName;
    String lastName;
    String gender;
    Date birthday;
    String address;

}
