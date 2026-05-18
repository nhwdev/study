package com.study.boot.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.session.HttpSessionEventPublisher;

@Configuration // 스프링에게 이 클래스가 설정(Configuration) 파일임을 알림
@EnableWebSecurity // 스프링 시큐리티를 활성화하고 웹 보안 설정을 구성함
public class SecurityConfig {

    /**
     * 중복 로그인 통제 및 세션 만료 이벤트를 처리하기 위한 리스너 빈 등록
     * 이를 등록해야 sessionManagement()의 maximumSessions 기능이 정상 작동함
     */
    @Bean
    public HttpSessionEventPublisher httpSessionEventPublisher() {
        return new HttpSessionEventPublisher();
    }

    /**
     * HTTP 요청에 대한 보안 필터 체인을 구성하는 핵심 메서드
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        // 1. URL별 접근 권한 설정 (인가, Authorization)
        httpSecurity.authorizeHttpRequests((auth) -> auth
                // 메인, 로그인, 회원가입 관련 URL은 인증받지 않은 모든 사용자에게 허용
                .requestMatchers("/", "/login", "/home", "/join", "/joinProc").permitAll()
                // '/admin' 경로는 오직 'ADMIN' 권한을 가진 사용자만 접근 가능
                .requestMatchers("/admin").hasRole("ADMIN")
                // '/my/*' 밑의 모든 경로는 'ADMIN' 또는 'USER' 권한 중 하나라도 있어야 접근 가능
                .requestMatchers("/my/*").hasAnyRole("ADMIN", "USER")
                // 위에서 정의한 URL 외의 모든 요청은 로그인(인증)을 완료해야만 접근 가능
                .anyRequest().authenticated());

        // 2. 폼 로그인(Form Login) 방식 설정
        httpSecurity.formLogin((auth) -> auth
                .loginPage("/login") // 커스텀 로그인 페이지 경로 지정
                .loginProcessingUrl("/loginProc") // 로그인 폼의 action URL 지정 (스프링 시큐리티가 뒷단에서 로그인 처리)
                .defaultSuccessUrl("/my", true) // 로그인 성공 시 이동할 기본 페이지 (true 설정 시 무조건 이 페이지로 리다이렉트)
                .permitAll() // 로그인 페이지는 누구나 접근 가능하게 설정
        );

        // 3. 로그아웃(Logout) 설정
        httpSecurity.logout(logout -> logout
                .logoutUrl("/logout") // 로그아웃을 진행할 URL 지정
                .logoutSuccessUrl("/login") // 로그아웃 성공 시 리다이렉트할 URL
                .invalidateHttpSession(true) // 로그아웃 시 현재 HTTP 세션을 무효화(삭제)
                .deleteCookies("JSESSIONID") // 브라우저에 저장된 세션 쿠키(JSESSIONID)를 삭제
                .permitAll()); // 로그아웃 기능도 누구나 접근 가능

        // 4. 세션 관리 및 보안 정책 설정
        httpSecurity.sessionManagement((auth) -> auth
                // 세션 고정 보호(Session Fixation Protection): 로그인 시마다 새로운 세션 ID를 발급하여 하이재킹 공격 방지
                .sessionFixation().changeSessionId()
                // 동시 다중 로그인 제어 정책
                .maximumSessions(1) // 한 아이디당 최대 허용 가능한 세션 수를 1개로 제한
                // true: 이미 다른 곳에서 로그인 중이면 '새로운 로그인 시도를 차단' (기존 사용자 유지)
                // false: 새로운 로그인을 허용하고 '기존 사용자의 세션을 만료'시킴
                .maxSessionsPreventsLogin(true));

        // 5. CSRF(사이트 간 요청 위조) 방어 기능 비활성화
        // API 서버 구축이나 개발 단계 편의를 위해 꺼두는 경우가 많으나, 타임리프/JSP 기반 웹이면 추후 켜두는 것이 안전함
        httpSecurity.csrf(AbstractHttpConfigurer::disable);

        // 위에서 설정한 필터들의 체인을 최종 빌드하여 반환
        return httpSecurity.build();
    }

    /**
     * 비밀번호를 안전하게 암호화(해시)해주는 빈 등록
     * BCrypt 해시 함수를 사용하여 회원가입 시 비밀번호 암호화 및 로그인 시 비밀번호 검증에 사용됨
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}