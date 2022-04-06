package churchoperations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MembersController {

    @RequestMapping({"/members","/members/index","/members/index.html"})
    public String listMembers(){

        return "/members/index";
    }
}
