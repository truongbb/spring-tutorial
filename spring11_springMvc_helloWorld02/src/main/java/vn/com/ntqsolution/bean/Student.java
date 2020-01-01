package vn.com.ntqsolution.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    int id;
    String name;

}
