package com.furkankayam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "World!");
        return "index";
    }

}
