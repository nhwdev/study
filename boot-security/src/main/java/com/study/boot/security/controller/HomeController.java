package com.study.boot.security.controller;

import com.study.boot.security.dto.JoinDto;
import com.study.boot.security.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
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

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("msg", "/admin로 요청");
        return "home";
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
        return "redircet:/login";
    }

    @GetMapping("/my")
    public String my(Model model) {
//        String id = SecurityContextHolder.getContext().getAuthentication().getName();
        Authentication authentication = // 사용자 정보, 권한정보
                SecurityContextHolder.getContext().getAuthentication();

        String id = authentication.getName();

        String role = authentication.getAuthorities()
                .stream()
                .findFirst()
                .map(GrantedAuthority::getAuthority)
                .orElse("ROLE_NONE");
//        Collection<? extends GrantedAuthority> authorities = // 권한정보
//                authentication.getAuthorities();
//        // iterator : 반복자
//        Iterator<? extends GrantedAuthority> iter = authorities.iterator();
//        GrantedAuthority auth = iter.next(); // 권한 1개
//        String role = auth.getAuthority();
        model.addAttribute("msg", "/my로 접근: id=" + id + ", role= " + role);
        return "/home";
    }
}
