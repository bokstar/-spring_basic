package com.example.google_oauth_springboot.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

    @RequestMapping("/")
    public String login(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getPrincipal());
        return "before_authocation";
    }
    @RequestMapping("/callback")
    public String callback() {
        System.out.println("redirecting to home page");
        return "after_authocation";
    }
}
