package churchoperations.controllers;

import churchoperations.service.HomeCellService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomecellgroupsController {

    private final HomeCellService homeCellService;

    public HomecellgroupsController(HomeCellService homeCellService) {
        this.homeCellService = homeCellService;
    }

    @RequestMapping({"/homecellgroups","homecellgroups/index","/homecellgroups/index.html"})
    public String listHomecellgroups(Model model){

        model.addAttribute("homecellgroups", homeCellService.findAll());

        return "homecellgroups/index";
    }
}
