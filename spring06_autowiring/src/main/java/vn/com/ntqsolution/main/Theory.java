package vn.com.ntqsolution.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.com.ntqsolution.bean.Clazz;
import vn.com.ntqsolution.bean.Person;
import vn.com.ntqsolution.bean.Student;

public class Theory {

    /**
     * =========== AUTOWIRE ==============
     * <p>
     * Khi tạo một bean, chúng ta set các thuộc tính cho bean đó dựa vào 2 thẻ property và constructor-arg trong file config.
     * Nhưng, Spring có một khái niệm cao cấp hơn, đó chính là autowiring.
     * <p>
     * Như ta đã biết, các thuộc tính, các giá trị ban đầu, các mối quan hệ, ràng buộc, hay sự phụ thuộc của 1 bean được Spring đọc
     * ở trong file cấu hình và tạo bean. Những thứ Spring đọc ấy là do ta tự tay config, tự tay định nghĩa ra
     * và cuối cùng là Spring sẽ kết nối chúng lại (wire).
     * <p>
     * Công việc "wire" này cũng sẽ được thực hiện một cách tự động (autowire) dựa vào cơ chế mà chúng ta sẽ đề cập ngay sau đây.
     * Việc autowire nhằm mục đích lược giảm các cấu hình của file config xml đi khi dự án Spring quá lớn, quá nhiều bean.
     * <p>
     * <p>
     * Có 3 loại autowire trong Spring (xem file config):
     * - byName
     * - byType
     * - byConstructor
     * <p>
     * Khi config bean không nói gì tức là không bật chế độ autowire.
     * Mặc định chế độ autowire = default, tức là Spring sẽ sử dụng chế độ constructor, nếu không được nó sẽ chuyển qua chế độ byType
     * <p>
     * <p>
     * -------byName-------
     * Khi bật chế độ này lên, Spring sẽ tự detect bean con được inject trong bean đang config này bằng tên mà chúng ta cung cấp.
     * Nếu nó scan hết các bean mà không thấy bean nào có tên như tên ta cấu hình thì sẽ bắn ra exception và việc tạo bean thất bại.
     * <p>
     * <p>
     * -------byType-------
     * Tương tự byName, byType là chế độ mà Spring sẽ thực hiện tìm kiếm và inject bean theo type của bean, tất cả công việc cần làm là bật mode autowire byType
     * <p>
     * <p>
     * -------byConstructor-------
     * Detect và inject theo constructor mà ta định nghĩa
     */


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person student = (Student) context.getBean("student-byName");
        System.out.println(student);


        Person student1 = (Student) context.getBean("student-byType");
        System.out.println(student1);


        Person student2 = (Student) context.getBean("student-constructor");
        System.out.println(student2);


        Person student3 = (Student) context.getBean("student-default");
        System.out.println(student3);


    }
}
