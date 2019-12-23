package vn.com.ntqsolution.bean.book;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Publisher {

    int id;
    String name;
    String phone;

}
