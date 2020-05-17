package com.example.mybatis_for_mysql.controller;

import com.example.mybatis_for_mysql.domain.User;
import com.example.mybatis_for_mysql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    // 메인 페이지
    @GetMapping("/")
    public String index() {
        return "/practice";
    }

    // 회원가입 처리
    @PostMapping("/pass")
    public String execSignup(User user ) {

        userMapper.insert(user.getIdx(),user.getName(),user.getLocal());

        return "redirect:/";
    }

}
