package vn.com.ntqsolution.bean.book;

import lombok.*;
import lombok.experimental.FieldDefaults;
import vn.com.ntqsolution.bean.common.Person;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author extends Person {

    String description;

}
