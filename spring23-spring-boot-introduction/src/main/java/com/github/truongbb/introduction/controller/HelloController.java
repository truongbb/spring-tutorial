package com.github.truongbb.introduction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping("/world")
  public ResponseEntity<String> helloWorld() {
    return new ResponseEntity<>("Hello world", HttpStatus.OK);
  }

}
