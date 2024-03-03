package com.m5a.complexivo_user_card.controllers;

import com.m5a.complexivo_user_card.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class indexcontroller {
    @Autowired
    @Qualifier("miServicioComplejo")
    private Iservice service;

    @GetMapping({"/", "/home", "/index"})
    public String index(Model model) {
        model.addAttribute("objeto", service.operacion());
        return "index";
    }
}
