package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.*;


@Controller
public class HelloWorldController {
    // need a controller method to show initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }


    // need a controller method to process a from
    
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

}
