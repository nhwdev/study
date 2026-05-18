package com.study.boot.security.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 스프링 시큐리티가 사용자의 정보를 파악할 수 있도록 구현한 커스텀 유저 상세 클래스
 * UserDetails 인터페이스를 구현하여 시큐리티의 인증 객체(Authentication) 내부로 들어갈 수 있게 함
 */
public class CustomUserDetails implements UserDetails {

    // 우리가 정의한 실제 DB의 회원 엔티티
    private final UserEntity userEntity;

    // 생성자를 통해 데이터베이스에서 조회한 회원 엔티티를 주입받음
    public CustomUserDetails(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    /**
     * 사용자가 가진 권한(Role) 목록을 반환하는 메서드
     * 스프링 시큐리티가 인가(Authorization) 처리를 할 때 이 권한 목록을 확인하고 페이지 접근을 허용/차단함
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new ArrayList<>();

        // 익명 클래스를 통해 GrantedAuthority 인터페이스를 구현하고 리스트에 추가
        collection.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                // 시큐리티 권한 관례에 맞게 "ROLE_ADMIN" 또는 "ROLE_USER" 형태의 문자열을 반환해야 함
                // (만약 DB에 "ADMIN"으로 저장된다면 "ROLE_" + userEntity.getRole() 형태로 리턴 필요)
                return userEntity.getRole();
            }
        });

        // 사용자의 권한이 담긴 컬렉션을 반환 (인증 완료 후 시큐리티가 이를 기억함)
        return collection;
    }

    /**
     * 사용자의 비밀번호를 반환하는 메서드
     * 스프링 시큐리티가 로그인 시 사용자가 입력한 비밀번호와 DB의 비밀번호를 비교할 때 사용함
     */
    @Override
    public String getPassword() {
        return userEntity.getPassword();
    }

    /**
     * 사용자의 아이디(고유 식별자)를 반환하는 메서드
     */
    @Override
    public String getUsername() {
        return userEntity.getUsername();
    }

    /**
     * 계정 만료 여부를 반환하는 메서드
     * 주석 처리된 default 구현(UserDetails.super.isAccountNonExpired())은 기본적으로 true(만료 안 됨)를 반환함
     * 필요 시 DB에 만료 여부 컬럼을 두고 연동 가능 (true: 만료 안 됨, false: 만료됨)
     */
    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    /**
     * 계정 잠금 여부를 반환하는 메서드
     * (true: 잠기지 않음, false: 잠김 - 로그인 불가능)
     */
    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    /**
     * 비밀번호(자격 증명) 만료 여부를 반환하는 메서드
     * (true: 만료 안 됨, false: 만료됨 - 비밀번호 변경 필요 등)
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    /**
     * 계정 활성화(사용 가능) 여부를 반환하는 메서드
     * (true: 활성화됨, false: 비활성화됨 - 휴면 계정이나 탈퇴 대기 상태 등)
     */
    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}