package com.example;/// Created by BB on 2017-01-16.

import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.packages.UserRepo;

@Controller
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserRepo repo;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", repo.findAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User user) {
        repo.save(user);
        return "redirect:/app/";
    }
}
