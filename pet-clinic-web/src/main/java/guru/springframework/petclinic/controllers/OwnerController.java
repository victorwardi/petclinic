package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Victor Wardi - @vwardi - on 23/08/2018.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({""})
    public String listOwners(){
        return "owners/index";
    }
}
