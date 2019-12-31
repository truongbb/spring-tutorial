package vn.com.ntqsolution.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vn.com.ntqsolution.bean.BeanConfig;
import vn.com.ntqsolution.bean.Clazz;
import vn.com.ntqsolution.bean.Student;
import vn.com.ntqsolution.config.SpringConfig;

public class MainRun {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student student = context.getBean(Student.class);
        student.setName("DDDDDĐ");
        System.out.println(student);


        /**
         * Việc cấu hình trực tiếp bằng java không sử dụng file xml để cấu hình trở nên rất dễ dàng và tiện lợi.
         *
         * Tất cả thứ chúng ta cần làm là có 1 class sẽ chứa cấu hình cho các bean (định nghĩa ra các bean như là file xml đã làm)
         * class đó trong bài này đó chính là BeanConfig.
         * Class này phải có 1 annotation của Spring để đánh dấu là bật mode config của Spring ở class này, đó là @Configuration
         *
         * Bên trong chúng ta liệt kê các bean của chúng ra bằng các hàm và sử dụng @Bean, việc này hoàn toàn tương đương với:
         * <bean id="student" class="vn.com.ntqsolution.bean.Student"/> trong file xml
         *
         * Ngoài ra còn có @Scope để định nghĩa ra phạm vi hoạt động của bean này, rất tiện lợi.
         * Thêm vào đó, @Bean còn có một số thuộc tính như initMethod, hoặc destroyMethod có chức năng tương tự @PostConstruct và @PreDestroy đã đề cập ở các bài trước
         *
         *
         * Ngoài ra, cũng giống việc chia nhỏ từng file config xml, việc chia nhỏ từng file config java cũng có thể được thực hiện.
         * Trong ví dụ này, SpringConfig sẽ là class config to nhất, sau đó nó sẽ chứa BeanConfig và SecurityConfig
         *
         */

    }
}
