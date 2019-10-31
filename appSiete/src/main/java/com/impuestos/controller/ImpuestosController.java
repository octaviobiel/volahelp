package com.impuestos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImpuestosController {

    @GetMapping("/precio")
    public String greetingForm(Model model) {
        model.addAttribute("precio", new Precio());
        return "precio";
    }

    @PostMapping("/precio")
    public String greetingSubmit(@ModelAttribute Precio precio) {
    	precio.setIva(precio.getValor()*0.21);
    	precio.setIibb(precio.getValor()*0.035);
        return "precio";
    }

}