package com.github.truongbb.controller;

import com.github.truongbb.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

  @RequestMapping(value = "/student", method = RequestMethod.GET)
  public ModelAndView student() {
    return new ModelAndView("Student", "command", new Student());
  }

  @RequestMapping(value = "/student", method = RequestMethod.POST)
  public String studentHandle(@ModelAttribute("abc") Student student, ModelMap modelMap) {
    modelMap.addAttribute("name", student.toString());
    System.out.println(student);
    return "Hello";
  }

  /**
   * hàm này để lấy ra một map các giá trị cho dropdown ở file Student.jsp
   * <p>
   * chung quy lại, những element nào phía giao diện cần nhiều giá trị
   * như là dropdown list, radio button group, checkbox group cũng đều làm tương tự thế này,
   * cũng có một hàm phía controller để khởi tạo giá trị, có thể fix cứng hoặc lấy ra từ DB,
   * kiểu dữ liệu trả về tùy theo element mà ta mong muốn,
   * như ví dụ này thì dropdown list cần value và label nên ta trả dạng map,
   * còn như checkbox thì ta trả dạng list, ...
   */
  @ModelAttribute("countryList")
  public Map<String, String> getCountryList() {
    Map<String, String> countryList = new HashMap<>();
    countryList.put("US", "United States");
    countryList.put("CH", "China");
    countryList.put("SG", "Singapore");
    countryList.put("MY", "Malaysia");
    return countryList;
  }

}
