package com.totp.project.controller;

import com.totp.project.model.entity.User;
import com.totp.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    @GetMapping(value="/loginView")
    public String loginView(){
        return "/user/login";
    }
    @GetMapping(value="/login")
    public @ResponseBody String login(HttpServletRequest req){
        String email = req.getParameter("useremail");
        //String password = req.getParameter("password");
        System.out.println(email);
        //User uDTO = userService.findByEmailAndPassword(email,password);
        User uDTO = userService.findByEmail(email);
        if(uDTO==null){
            return "failed";
        }
        return "success";
    }
}
