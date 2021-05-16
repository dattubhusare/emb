package com.dattu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home()
    {
        System.out.println("hello");
        return "home.jsp";
    }
}
