package vn.com.ntqsolution.bean.book;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {

    int id;
    String name;
    String description;

}
