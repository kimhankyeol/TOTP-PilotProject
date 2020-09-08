package com.totp.project.controller;

import com.totp.project.model.entity.User;
import com.totp.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/list")
    public String getUserList(Model model){
        List<User> uList = userService.findAll();
        model.addAttribute("uList",uList);
        return "/user/list";
    }
}
