package se.lexicon.mvc_th_excercise.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.lexicon.mvc_th_excercise.dto.FeverCheck;

@Controller
public class FeverController {

    @GetMapping("/fever")
    public String fever(Model model) {
        FeverCheck feverCheck = new FeverCheck();
        model.addAttribute("feverCheck", feverCheck);
        return "fever";
    }
}
