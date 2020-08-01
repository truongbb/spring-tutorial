package com.github.truongbb.main;

import com.github.truongbb.bean.Clazz;
import com.github.truongbb.bean.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Theory {

  public static void main1(String[] args) {
    /**
     * BeanFactory
     *
     * BeanFactory như đã đề cập bên trên, nó là một container thực hiện việc khởi tạo beans, đọc cấu hình beans từ file xml mà ta config
     * Ngoài ra nó hỗ trợ hàm init và destroy để ta custom vòng đời của bean.
     *
     * Spring cung cấp vài class kế thừa BeanFactory, mà điển hình đó chính là XmlBeanFactory
     * Tác dụng của nó khi sử dụng để đọc cấu hình bean hệt như là ApplicationContext làm như đã demo ở các bài trước
     *
     */

    BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

    Student student = (Student) factory.getBean("student");
    System.out.println(student);

    /**
     * BeanFactory thường được sử dụng ở các ứng dụng quy mô nhỏ nhưng mobile vì resource của nó bị giới hạn và các phương thức gần như deprecated
     * Hiện tại, nếu sử dụng container thì chúng ta nên sử dụng ApplicationContext
     *
     */
  }

  public static void main(String[] args) {
    /**
     * ApplicationContext
     *
     *
     * Đơn giản là một container được mở rộng và cải tiến của BeanFactory nhằm mục đích sử dụng trong cách ứng dụng Standard Java
     *
     * Nó kế thừa các tính năng cảu  BeanFactory và mở rộng ra thêm một chút. Có 3 clas kế thừa ApplicationContext:
     *
     * 1. FileSystemXmlApplicationContext: container này sẽ load file cấu hình của chúng ta ở một thư mục trong máy của ta, một nơi nào đó bất kì,
     * công việc của ta cần làm là cung cấp đường dẫn chính xác tới file cấu hình đó để nó có thể đọc được.
     *
     * 2. ClassPathXmlApplicationContext: container này sẽ load file config từ resource của project chúng ta, hay được sử dụng bởi vì file config sẽ thường được để chung vào project
     *
     * 3. WebXmlApplicationContext: tất nhiên là load file config từ web rồi, một page nào đó
     *
     */

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context1 = new FileSystemXmlApplicationContext("C:/spring-tut/applicationContext.xml"); --> ví dụ đường dẫn tuyệt đối cần chỉ ra để spring đọc file cấu hình

    Clazz clazz = (Clazz) context.getBean("clazz");
    System.out.println(clazz);
  }

}
