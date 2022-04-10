package churchoperations.controllers;

import churchoperations.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MembersController {

    private final MemberService memberService;

    public MembersController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping({"/members","/members/index","/members/index.html"})
    public String listMembers(Model model){

        model.addAttribute("members",memberService.findAll());

        return "members/index";
    }
}
