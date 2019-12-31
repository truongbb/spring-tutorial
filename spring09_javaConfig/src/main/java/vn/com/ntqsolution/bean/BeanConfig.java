package vn.com.ntqsolution.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(name = "student", initMethod = "initStudent", destroyMethod = "destroyStudent")
    @Scope("prototype")
    public Student student() {
        return new Student();
    }
}
