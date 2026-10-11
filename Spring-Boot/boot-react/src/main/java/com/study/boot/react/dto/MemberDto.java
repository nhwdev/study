package com.study.boot.react.dto;

import com.study.boot.react.entity.MemberEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
public class MemberDto {
    private String id;
    private String pass;
    private String name;
    private int gender;
    private String tel;
    private String email;
    private MultipartFile profileFile;
    private String picture;

    public MemberDto(MemberEntity entity) {
        if (entity != null) {
            this.id = entity.getId();
            this.pass = entity.getPass();
            this.name = entity.getName();
            this.gender = entity.getGender();
            this.tel = entity.getTel();
            this.email = entity.getEmail();
            this.picture = entity.getProfileFileName(); // 변수명 매칭 확인!
        }
    }

    public MemberEntity toEntity(MemberDto memberDto) {
        return MemberEntity.builder()
                .id(id)
                .pass(pass)
                .name(name)
                .gender(gender)
                .tel(tel)
                .email(email)
                .profileFileName(picture)
                .build();
    }
}
