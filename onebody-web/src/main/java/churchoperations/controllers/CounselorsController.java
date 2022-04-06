package churchoperations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounselorsController {

    @RequestMapping({"counselors","counselors/index","counselors/index.html"})
    public String listCounselors(){

        return "counselors/index";
    }
}
