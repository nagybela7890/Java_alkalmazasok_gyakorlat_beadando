package com.example.beadando;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UrlapController {
    private uzenetekRepo UzenetekRepo;
    @GetMapping("/urlap1")
    public String urlapForm(Model model) {
        model.addAttribute("uzenetOsztaly", new UzenetOsztaly());
        return "urlap";
    }
    @PostMapping("/feladat2")
    public String urlapSubmit(@Valid @ModelAttribute UzenetOsztaly uzenetOsztaly, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors())
            return "urlap";
        model.addAttribute("attr2", uzenetOsztaly);
        return "eredmeny";
    }
}

