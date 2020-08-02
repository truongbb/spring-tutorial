package com.github.truongbb.main;

import com.github.truongbb.bean.Person;
import com.github.truongbb.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Theory {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Person student = (Student) context.getBean("student-byName");
    System.out.println(student);


    Person student1 = (Student) context.getBean("student-byType");
    System.out.println(student1);


    Person student2 = (Student) context.getBean("student-constructor");
    System.out.println(student2);


    Person student3 = (Student) context.getBean("student-default");
    System.out.println(student3);
  }

}
