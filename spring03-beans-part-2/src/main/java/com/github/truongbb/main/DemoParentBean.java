package com.github.truongbb.main;

import com.github.truongbb.bean.Faculty;
import com.github.truongbb.bean.Person;
import com.github.truongbb.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoParentBean {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Person person = (Person) context.getBean("person");
    System.out.println(person);

    Person student = (Student) context.getBean("student");
    System.out.println(student);

    Person student1 = (Student) context.getBean("student1");
    System.out.println(student1);

    /**
     * Một ví dụ nhỏ demo cho thuộc tính parent khi config một bean
     *
     * Các quan hệ kế thừa của bean cũng được thể hiện rõ rệt khi mà ta cấu hình bean đó, và khi set giá trị cho các thuộc tính của bean
     * khi xem kết quả có thể thấy được giá trị các thuộc tính chung như phone hay name của student sẽ set đè lên person khi khởi tạo student
     *
     */

    // demo inject collection
    Faculty faculty = (Faculty) context.getBean("faculty");
    System.out.println(faculty);
  }

}
