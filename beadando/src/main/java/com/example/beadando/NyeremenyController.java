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
public class NyeremenyController {
    @Autowired
    private nyeremenyRepo NyeremenyRepo;

    @GetMapping("/nyeremenyek")
    public String nyeremenyekOldal(Model model) {
        model.addAttribute("nyeremenyek", NyeremenyRepo.findAll());
        return "nyeremeny";
    }
}
