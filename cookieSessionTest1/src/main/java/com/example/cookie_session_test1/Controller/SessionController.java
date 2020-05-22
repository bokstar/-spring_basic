package com.example.cookie_session_test1.Controller;

import com.example.cookie_session_test1.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.CookieGenerator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class SessionController {

    //cookie를 setting
    @GetMapping("/cookieWrite")
    public String cookieWrite( HttpServletResponse response){
        CookieGenerator generator = new CookieGenerator();
        generator.setCookieName("name");
        generator.addCookie(response,"javaking");
        generator.setCookieName("blog");
        generator.addCookie(response,"www.naver.com");
        return "home";
    }
    //cookie를 읽어 온다..
    @GetMapping("/cookieRider")
    public String cookieRider(
                                @CookieValue("name") String name,
                                @CookieValue("blog") String blog){
        System.out.println(name);
        System.out.println(blog);

        return "home";
    }
}
