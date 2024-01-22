package com.example.Sem4_Ex04.controllers;

import com.example.Sem4_Ex04.models.Auto;
import com.example.Sem4_Ex04.services.AutoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class AutoController {

    private AutoService autoService;
    /*
    метод получения всех авто
     */
    @GetMapping("/auto")
    public String getAuto(Model model) {
        model.addAttribute("auto", autoService.getAllAutomobiles());
        return "auto";
    }

    /*
    метод добавления авто
     */
    @PostMapping("/auto")
    public String addAuto(Auto a, Model model) {
        autoService.addAuto(a);
        model.addAttribute("auto", autoService.getAllAutomobiles());
        return "auto";
    }
}
