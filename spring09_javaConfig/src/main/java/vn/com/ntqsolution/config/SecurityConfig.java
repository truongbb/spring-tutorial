package vn.com.ntqsolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.com.ntqsolution.bean.Clazz;

@Configuration
public class SecurityConfig {

    @Bean
    public Clazz clazz() {
        return new Clazz();
    }

}
