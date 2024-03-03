package com.m5a.complexivo_user_card.controllers;

import com.m5a.complexivo_user_card.models.VCardProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/perfil")
public class VCardController {
    @Autowired
    private VCardProperties vCardProperties;

    @GetMapping("/tarjetas")
    public String mostrarTarjetas(Model model) {
        model.addAttribute("empleados", vCardProperties.getEmpleados());
        return "factura/tarjet";
    }
}