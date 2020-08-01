package com.github.truongbb.bean.student;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
