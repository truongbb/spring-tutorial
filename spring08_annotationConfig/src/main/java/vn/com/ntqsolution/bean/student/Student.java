package vn.com.ntqsolution.bean.student;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

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

    // annotation này tương đương với cả 2 annotation trên
    @Resource(name = "clazz")
    Clazz clazz1;

}
