package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Victor Wardi - @vwardi - on 23/08/2018.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index.html"})
    public String index(){

        return "vets/index";
    }
}
