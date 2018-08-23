package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Victor Wardi - @vwardi - on 22/08/2018.
 */
@Controller
public class PetClinicController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }

}
