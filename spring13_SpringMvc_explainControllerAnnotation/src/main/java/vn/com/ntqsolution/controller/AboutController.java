package vn.com.ntqsolution.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    // khi một class extends AbstractController hoặc implement Controller của Spring thì nó được đánh dấu là một Controller
    // tất nhiên là phải cấu hình ở applicationContext.xml nữa

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("About"); // cái này lấy page About.jsp
        modelAndView.addObject("message", "About page!");
        return modelAndView;
    }

}
