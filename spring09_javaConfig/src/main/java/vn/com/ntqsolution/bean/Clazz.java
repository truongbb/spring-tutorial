package vn.com.ntqsolution.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Clazz {

    int id;
    String name;

}
