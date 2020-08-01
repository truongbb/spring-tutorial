package com.github.truongbb.main;

import com.github.truongbb.bean.Car;
import com.github.truongbb.bean.Student;
import com.github.truongbb.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.github.truongbb.bean")
public class MainRun {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    Student student = context.getBean(Student.class);
    student.setName("DDDDDĐ");
    System.out.println(student);
    context.close();

    AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MainRun.class);
    Car bean = context1.getBean(Car.class);
    Car xexe = (Car) context1.getBean("xexe");
    System.out.println(bean);
    System.out.println(xexe);

  }

}
