package vn.com.ntqsolution.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vn.com.ntqsolution.entity.StudentEntity;
import vn.com.ntqsolution.repository.StudentRepository;

import java.util.List;

public class MainRun {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("vn.com.ntqsolution");
        StudentRepository studentRepository = (StudentRepository) context.getBean("studentRepository");

        List<StudentEntity> studentEntities = studentRepository.findByLastName("Hà");
        studentEntities.forEach(System.out::println);

        List<StudentEntity> studentEntities1 = studentRepository.findByLastNameEndWiths("à");
        studentEntities1.forEach(System.out::println);

        List<StudentEntity> studentEntities2 = studentRepository.findByLastNameEndWithsUsingParameter("a");
        studentEntities2.forEach(System.out::println);

    }
}
