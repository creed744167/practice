package com.example.form.controller;

import com.example.form.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute User user) {
        // Print user details to console
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());

        return "form"; // return the same form or redirect if needed
    }
}
