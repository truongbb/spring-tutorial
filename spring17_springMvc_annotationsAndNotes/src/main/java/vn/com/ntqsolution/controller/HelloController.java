package vn.com.ntqsolution.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.com.ntqsolution.bo.Student;
import vn.com.ntqsolution.service.StudentService;

import java.util.Map;

@Controller
@RequestMapping({"/", "/home"}) // nhận các request có đầu là / hoặc /home
public class HelloController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("Student", "command", new Student());
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public String studentHandle(@ModelAttribute("abc") Student student, ModelMap modelMap) {
        String result = studentService.validateInputData(student);
        if (result != null) {
            modelMap.addAttribute("message", result);
            return "Error";
        }
        modelMap.addAttribute("name", student.toString());
        System.out.println(student);
        return "Hello";
    }


    // URL sẽ là http://localhost:8080/<project_name>/student/1 --> lấy student có id là 1
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public String getOneByIdaramP(@PathVariable("id") Long id, ModelMap modelMap) {
        modelMap.addAttribute("message", studentService.getOneById(id));
        return "Error";
    }


    // URL sẽ là http://localhost:8080/<project_name>/student?id=1 --> lấy student có id là 1
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getOneByIdP(@RequestParam("id") Long id, ModelMap modelMap) {
        modelMap.addAttribute("message", studentService.getOneById(id));
        return "Error";
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
        return studentService.getCountryList();
    }

}
