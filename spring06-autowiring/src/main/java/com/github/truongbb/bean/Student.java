package com.github.truongbb.bean;

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

  public Student(Clazz clazz) { // nếu không có constructor này thì bean Clazz sẽ khong được inject theo kiểu constructor
    this.clazz = clazz;
  }

}
