package com.jwt.example.jwt.Controller;

import com.jwt.example.jwt.Model.JwtModel;
import com.jwt.example.jwt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class JwtController {

    @Autowired
    UserService jwtService;
    @GetMapping("/get")
    public List<JwtModel> getUser(){
        return jwtService.GetUser();
    }

    @GetMapping("/get1")
    public String get1Usre(){
        return "Hello";
    }

    @GetMapping("/current-user")
    public String current(Principal principal){
        return principal.getName();
    }
}
