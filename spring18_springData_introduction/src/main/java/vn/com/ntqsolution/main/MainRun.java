package vn.com.ntqsolution.main;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.com.ntqsolution.bean.Student;
import vn.com.ntqsolution.repository.StudentRepository;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class MainRun {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentRepository studentRepository = (StudentRepository) context.getBean("studentRepository");

        System.out.println(studentRepository);
        System.out.println("=======GET ALL USING TRADITIONAL JDBC=============");
        List<Student> allUsingJdbc = studentRepository.getAllUsingJdbc();
        allUsingJdbc.forEach(System.out::println);
        System.out.println();
        System.out.println("=======GET ALL USING TRADITIONAL JDBC=============");
        List<Student> allUsingJdbcTemplate = studentRepository.getAllUsingJdbcTemplate();
        allUsingJdbcTemplate.forEach(System.out::println);
        System.out.println();
        System.out.println("=======GET ALL USING TRADITIONAL JDBC MAPPING MANUAL=============");
        List<Student> allUsingJdbcTemplate1 = studentRepository.getAllUsingJdbcTemplateMappingManual();
        allUsingJdbcTemplate1.forEach(System.out::println);
        System.out.println();
        System.out.println("=======GET ONE=============");
        Student a01 = studentRepository.getOneById("A01");
        System.out.println(a01);
    }
}
