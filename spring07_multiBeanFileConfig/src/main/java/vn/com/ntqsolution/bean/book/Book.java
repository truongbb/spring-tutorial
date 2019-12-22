package vn.com.ntqsolution.bean.book;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {

    int id;
    String name;
    Author author;
    float unitPrice;

}
