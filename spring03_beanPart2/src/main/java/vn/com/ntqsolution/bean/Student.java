package vn.com.ntqsolution.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends Person {

    private Clazz clazz;
    private float avgMark;
}
