package com.example.beadando;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UzenetekController {
    @Autowired
    private uzenetekRepo UzenetekRepo;

    @GetMapping("/visszajelzesek")
    public String uzenetekOldal(Model model) {
        model.addAttribute("uzenetek", UzenetekRepo.findAll());
        return "uzenetek";
    }
}
