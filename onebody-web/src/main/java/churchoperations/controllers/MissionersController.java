package churchoperations.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MissionersController {

    @RequestMapping({"/Missioners","/Missioners/index", "/Missioners/index.html"})
    public String listMissioners(){

        return "missioners/index";
    }
}

