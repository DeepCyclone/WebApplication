package com.ispirer.webapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/controller")
public class MainController {
    @GetMapping
    public String retrieveMainInfo(){
        return "Ispirer test task";
    }
}
