package com.laboratorio.lab3_20192858.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home_controller {

    @GetMapping("")
    public String index(){
        return "index";
    }
}
