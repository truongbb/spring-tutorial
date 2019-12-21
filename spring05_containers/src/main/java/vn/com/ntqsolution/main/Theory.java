package vn.com.ntqsolution.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import vn.com.ntqsolution.bean.Clazz;
import vn.com.ntqsolution.bean.Student;


public class Theory {
    /**
     * ==================CONTAINER TRONG SPRING==================
     * <p>
     * Container là xương sống của Spring framwork, nó là nhân tố quan trọng để làm việc với bean.
     * Các container sẽ khởi tạo bean, thiết lập các mối quan hệ giữa các bean và inject các thuộc tính của bean.
     * Ngoài ra, các container còn cung cấp API để truy vấn và sử dụng bean đã được khởi tạo.
     * <p>
     * Lưu ý rằng các bean được lazy load vào container. Tức là trừ khi chúng ta yêu cầu tạo bean,
     * hoặc là khi tạo bean có thuộc tính là một bean khác thì các container sẽ không tự động tạo bean một cách bừa bãi,
     * nhằm tránh các vấn đề về hiệu năng và bộ nhớ.
     * Lazy load được áp dụng cho tất cả các container trong speing, chỉ trừ khi load Singletons vào trong ApplicationContext container mà thôi.
     * <p>
     * <p>
     * Các container trong Spring chủ yếu được chia làm 2 loại: Bean Factories và Application Contexts.
     * BeanFactory đơn giản là một container cung cấp việc inject sử dụng DI, còn ApplicationContxet là một phần mở rộng của BeanFactory
     * chứa các công cụ để thực hiện giao tiếp với beans
     */


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
