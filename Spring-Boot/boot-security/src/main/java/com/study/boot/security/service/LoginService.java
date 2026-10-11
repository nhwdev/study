package com.study.boot.security.service;

import com.study.boot.security.Entity.CustomUserDetails;
import com.study.boot.security.Entity.UserEntity;
import com.study.boot.security.dto.JoinDto;
import com.study.boot.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
// 여기에 implements UserDetailsService 를 추가해서 로그인 기능도 하겠다고 선언합니다!
public class LoginService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * 1. 회원가입 담당
     */
    public void joinProcess(JoinDto joinDto) {
        try {
            UserEntity target = new UserEntity();
            target.setUsername(joinDto.getUsername());
            target.setPassword(bCryptPasswordEncoder.encode(joinDto.getPassword()));
            if ("ADMIN".equals(joinDto.getUsername())) {
                target.setRole("ROLE_ADMIN");
            } else {
                target.setRole("ROLE_USER");
            }
            userRepository.save(target);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 2. 로그인 담당 (시큐리티 요구사항 필수 추가!)
     * 이 메서드가 이 클래스 안에 같이 들어있어야 시큐리티가 로그인을 시켜줍니다.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userData = userRepository.findByUsername(username);

        if (userData != null) {
            return new CustomUserDetails(userData);
        }

        throw new UsernameNotFoundException("존재하지 않는 사용자: " + username);
    }
}