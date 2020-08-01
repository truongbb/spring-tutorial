package com.github.truongbb.main;

import com.github.truongbb.bean.book.Author;
import com.github.truongbb.bean.book.Book;
import com.github.truongbb.bean.others.Car;
import com.github.truongbb.bean.student.Clazz;
import com.github.truongbb.bean.student.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {


  public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // <editor-fold desc="demo @Required">
    Clazz clazz = (Clazz) context.getBean("clazz");
    System.out.println(clazz);
    // </editor-fold>

    // <editor-fold desc="demo @Autowired">
    Book book = (Book) context.getBean("book");

    Author author = new Author();
    author.setName("AA");
    book.setAuthor(author);
    System.out.println(book);

    Author author1 = (Author) context.getBean("author");
    author1.setName("#####");
    book.setAuthor(author1);
    System.out.println(book);
    // </editor-fold>

    // <editor-fold desc="demo @Qualifier">
    Student student = (Student) context.getBean("student");
    student.setName("AAAAAAAAA");

    System.out.println(student);
    // </editor-fold>

    // <editor-fold desc="@PostConstruct & @PreDestroy">
    // nhìn console xem nó in ra từng dòng trong từng hàm ở class Car
    Car car = (Car) context.getBean("car");
    System.out.println(car);
    context.getBeanFactory().destroyBean(car);
    // </editor-fold>
  }

}
