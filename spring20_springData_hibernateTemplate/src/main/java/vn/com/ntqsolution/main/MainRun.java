package vn.com.ntqsolution.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.com.ntqsolution.entity.StudentEntity;
import vn.com.ntqsolution.repository.StudentRepository;

import java.util.List;

public class MainRun {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentRepository studentRepository = (StudentRepository) context.getBean("studentRepository");

        List<StudentEntity> studentEntities = studentRepository.findByLastName("n");
        if (studentEntities != null) {
            studentEntities.forEach(System.out::println);
        }
    }
}
