package com.github.truongbb.main;

import com.github.truongbb.entity.StudentEntity;
import com.github.truongbb.repository.StudentRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainRun {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.github.truongbb");
    StudentRepository studentRepository = (StudentRepository) context.getBean("studentRepository");

    List<StudentEntity> studentEntities = studentRepository.findByLastName("Hà");
    studentEntities.forEach(System.out::println);

    List<StudentEntity> studentEntities1 = studentRepository.findByLastNameEndWiths("à");
    studentEntities1.forEach(System.out::println);

    List<StudentEntity> studentEntities2 = studentRepository.findByLastNameEndWithsUsingParameter("a");
    studentEntities2.forEach(System.out::println);

  }
}
