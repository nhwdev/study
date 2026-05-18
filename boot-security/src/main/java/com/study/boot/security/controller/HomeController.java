package com.study.boot.security.controller;

import com.study.boot.security.dto.JoinDto;
import com.study.boot.security.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String root(Model model) {
        model.addAttribute("msg", "/으로 요청");
        return "/home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("msg", "/home으로 요청");
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/join")
    public String join() {
        return "/join";
    }

    @PostMapping("/joinProc")
    public String joinProc(JoinDto joinDto) {
        loginService.joinProcess(joinDto);
        return "/login";
    }

    @GetMapping("/my")
    public String my(Model model) {
        model.addAttribute("msg", "/my로 요청");
        return "/home";
    }
}
