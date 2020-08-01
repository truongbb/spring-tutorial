package com.github.truongbb.bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

  int id;
  String name;
  Clazz clazz;

  public void initStudent() {
    System.out.println("INIT STUDENT");
  }

  public void destroyStudent() {
    System.out.println("DESTROY STUDENT");
  }

}
