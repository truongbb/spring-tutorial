package com.github.truongbb.main;

import com.github.truongbb.bean.book.Book;
import com.github.truongbb.bean.common.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Person person = (Person) context.getBean("person");
    System.out.println(person);

    Book book = (Book) context.getBean("book");
    System.out.println(book);
  }

}
