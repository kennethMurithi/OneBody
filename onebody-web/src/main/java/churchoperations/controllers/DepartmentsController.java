package churchoperations.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentsController {

    @RequestMapping({"departments/","departments/index","departments/index.html"})
    public String listDepartments(){

        return "departments/index";
    }
}
