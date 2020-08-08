package com.github.truongbb.bo;

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
  int age;
  String name;
  String address;
  String password;
  String gender;
  String description;
  boolean isAdult;
  String country;
  String hiddenItem;

}
