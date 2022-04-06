package churchoperations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomecellgroupsController {

    @RequestMapping({"/homecellgroups","homecellgroups/index","/homecellgroups/index.html"})
    public String listHomecellgroups(){

        return "homecellgroups/index";
    }
}
