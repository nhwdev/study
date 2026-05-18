package com.study.boot.react.controller;

import com.study.boot.react.dto.MemberDto;
import com.study.boot.react.service.MemberService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/idCheck")
    public ResponseEntity<Boolean> idCheck(@RequestParam String id) {
        return ResponseEntity.ok().body(memberService.idCheck(id));
    }

    @PostMapping("/joinPro")
    public ResponseEntity<?> joinPro(@ModelAttribute MemberDto memberDto) {
        memberService.insertMember(memberDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody MemberDto memberDto, HttpServletResponse response) {

        // 1. [서비스 영역] 순수 비즈니스 로직 처리 (회원 확인, 로그인 성공 여부 검증 등)
        // 서비스는 성공/실패 여부나 회원 정보만 컨트롤러에 돌려줍니다.
        try {
            memberService.loginMember(memberDto);
            // 2. [컨트롤러 영역] 웹 환경(HTTP)에 맞는 응답 처리 (쿠키 생성 및 추가)
            Cookie cookie = new Cookie("id", memberDto.getId());
            // cookie.setHttpOnly(true);
            cookie.setPath("/");
            cookie.setMaxAge(-1);
            cookie.setSecure(true);
            cookie.setAttribute("SameSite", "None");

            response.addCookie(cookie);

            return ResponseEntity.ok(memberDto.getId());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("아이디 또는 비밀번호가 일치하지 않습니다.");
        }
    }

    @GetMapping("/mypage")
    public ResponseEntity<?> myPage(@RequestParam(value = "id") String paramId, @CookieValue(name = "id", required = false) String cookieId) {
        try {
            MemberDto memberDto = memberService.getMember(paramId, cookieId);
            return ResponseEntity.ok(memberDto);
        } catch (NullPointerException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 세션이 만료되었습니다.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("비정상적인 접근입니다. 인증 정보가 일치하지 않습니다");
        }
    }
}