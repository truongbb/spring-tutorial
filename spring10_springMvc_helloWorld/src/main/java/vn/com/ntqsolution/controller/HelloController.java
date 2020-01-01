package vn.com.ntqsolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello";
    }

//    thả comment hàm này ra là lỗi cmnl

//    @RequestMapping(method = RequestMethod.GET)
//    public String helloWorld1() {
//        return "Hello1";
//    }

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    private String helloMe() {
        return "HelloMe";
    }

}
