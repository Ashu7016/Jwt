package com.jwt.example.controllers;


import com.jwt.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api")

public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/users

    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting user");
        return userService.getUser();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
