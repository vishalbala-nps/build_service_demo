package com.oracle.buildservicedemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${message}")
    String message;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", message);
        return "home";
    }
}
