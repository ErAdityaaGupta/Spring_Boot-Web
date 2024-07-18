package com.gupta.SimpleWebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to the family";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is the about section.";
    }

}
