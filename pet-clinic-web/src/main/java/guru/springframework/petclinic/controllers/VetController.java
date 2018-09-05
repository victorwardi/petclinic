package guru.springframework.petclinic.controllers;

import guru.springframework.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Victor Wardi - @vwardi - on 23/08/2018.
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets.html", "/vets/index.html"})
    public String index(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
