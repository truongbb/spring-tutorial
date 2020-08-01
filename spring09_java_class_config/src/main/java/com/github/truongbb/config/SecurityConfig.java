package com.github.truongbb.config;

import com.github.truongbb.bean.Clazz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

  @Bean
  public Clazz clazz() {
    return new Clazz();
  }

}
