package com.github.truongbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public String hello(ModelMap model) {
    model.addAttribute("message", "World");
    return "Hello";
  }

}
