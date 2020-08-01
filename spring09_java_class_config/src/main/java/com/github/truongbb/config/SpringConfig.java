package com.github.truongbb.config;

import com.github.truongbb.bean.BeanConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BeanConfig.class, SecurityConfig.class})
public class SpringConfig {

}
