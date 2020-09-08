package com.totp.project.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication
@Controller
public class IndexController {
    @RequestMapping(value="/")
    public String index(){
        return "/index";
    }
}
