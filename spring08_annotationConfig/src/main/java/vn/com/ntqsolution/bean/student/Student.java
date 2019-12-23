package vn.com.ntqsolution.bean.student;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    int id;
    String name;

    @Autowired
    @Qualifier("clazzImpl")
    Clazz clazz;

}
