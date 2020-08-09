package com.github.truongbb.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RunnersApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(RunnersApplication.class, args);
  }

  @Override
  public void run(String... args) {
    System.out.println("Run in run() of CommanLineRunner");
    Arrays.asList(args).forEach(System.out::println);
  }

}
