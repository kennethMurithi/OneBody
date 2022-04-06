package churchoperations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadersControler {

    @RequestMapping({"/leaders","/leaders/index","/leaders/index.html"})
    public String listLeaders(){

        return "leaders/index";
    }
}
