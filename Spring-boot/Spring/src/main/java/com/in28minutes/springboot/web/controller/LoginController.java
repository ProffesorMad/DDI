package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.LoginService;

@Controller
@SessionAttributes("Nombre")
public class LoginController {

    @Autowired
    LoginService service;

    @RequestMapping(value="/Iniciar", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "Iniciar";
    }

    @RequestMapping(value="/Iniciar", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String Nombre, @RequestParam String Contraseña){

        boolean isValidUser = service.validateUser(Nombre, Contraseña);

        if (!isValidUser) {
            model.put("Error", "Datos Erroneos");
            return "Iniciar";
        }

        model.put("Nombre", Nombre);
        model.put("Contraseña", Contraseña);

        return "Bienvenido";
    }

}