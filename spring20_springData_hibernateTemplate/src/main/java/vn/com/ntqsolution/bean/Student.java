package vn.com.ntqsolution.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class Student {

    String id;
    String firstName;
    String lastName;
    String gender;
    Date birthday;
    String address;

}
