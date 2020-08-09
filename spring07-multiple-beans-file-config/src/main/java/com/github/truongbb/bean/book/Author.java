package com.github.truongbb.bean.book;

import com.github.truongbb.bean.common.Person;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author extends Person {

  String description;

}
