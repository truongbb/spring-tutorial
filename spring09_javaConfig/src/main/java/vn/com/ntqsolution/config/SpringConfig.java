package vn.com.ntqsolution.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import vn.com.ntqsolution.bean.BeanConfig;

@Configuration
@Import({BeanConfig.class, SecurityConfig.class})
public class SpringConfig {
}
