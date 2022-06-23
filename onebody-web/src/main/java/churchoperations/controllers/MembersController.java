package churchoperations.controllers;

import churchoperations.model.Member;
import churchoperations.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MembersController {

    private final MemberService memberService;

    private static final String VIEWS_MEMBER_CREATE_OR_UPDATE_FORM = "members/createOrUpdateMemberForm";

    public MembersController(MemberService memberService) {
        this.memberService = memberService;
    }


    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }


    @RequestMapping("/find")
    public String findMembers(Model model){
        model.addAttribute("member", Member.builder().build());
        return "members/findMembers";
    }

    @RequestMapping({"/members","/members/index","/members/index.html"})
    public String listMembers(Model model) {

        model.addAttribute("members", memberService.findAll());

        return "members/index";
    }

    @GetMapping
    public String processFindForm(Member member, BindingResult result, Model model){
        // allow parameterless GET request for /members to return all records
        if (member.getLastName() == null) {
            member.setLastName(""); // empty string signifies broadest possible search
        }

        // find members by last name
        List<Member> results = memberService.findAllByLastNameLike("%"+ member.getLastName() + "%");

        if (results.isEmpty()) {
            // no members found
            result.rejectValue("lastName", "notFound", "not found");
            return "members/findMembers";
        } else if (results.size() == 1) {
            // 1 member found
            member = results.get(0);
            return "redirect:/members/" + member.getId();
        } else {
            // multiple members found
            model.addAttribute("selections", results);
            return "members/membersList";
        }
    }

    @GetMapping("/{memberId}")
    public ModelAndView showMember(@PathVariable Long memberId) {
        ModelAndView mav = new ModelAndView("members/memberDetails");
        mav.addObject(memberService.findById(memberId));
        return mav;
    }

    @GetMapping("/new")
    public String initCreationForm(Model model) {
        model.addAttribute("member", Member.builder().build());
        return VIEWS_MEMBER_CREATE_OR_UPDATE_FORM;
    }

    @PostMapping("/new")
    public String processCreationForm(@Valid Member member, BindingResult result) {
        if (result.hasErrors()) {
            return VIEWS_MEMBER_CREATE_OR_UPDATE_FORM;
        } else {
            Member savedMember =  memberService.save(member);
            return "redirect:/members/" + savedMember.getId();
        }
    }

    @GetMapping("/{memberId}/edit")
    public String initUpdateMemberForm(@PathVariable Long memberId, Model model) {
        model.addAttribute(memberService.findById(memberId));
        return VIEWS_MEMBER_CREATE_OR_UPDATE_FORM;
    }

    @PostMapping("/{memberId}/edit")
    public String processUpdateOwnerForm(@Valid Member member, BindingResult result, @PathVariable Long memberId) {
        if (result.hasErrors()) {
            return VIEWS_MEMBER_CREATE_OR_UPDATE_FORM;
        } else {
            member.setId(memberId);
            Member savedMember = memberService.save(member);
            return "redirect:/members/" + savedMember.getId();
        }
    }

}
