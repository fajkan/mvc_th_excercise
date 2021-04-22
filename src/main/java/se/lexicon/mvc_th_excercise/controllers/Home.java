package se.lexicon.mvc_th_excercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Home {

    private List<String> contactList;


    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }


    @PostMapping("/contact")
    public String contact(@RequestParam String input){
        contactList.add(input);

        return "contact";
    }

    @GetMapping("/contactList")
    public String contactList(Model model){
        model.addAttribute("contactlist",contactList);

        return "contactlist";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
