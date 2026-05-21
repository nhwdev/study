package com.study.boot.react.entity;

import com.study.boot.react.dto.MemberDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {
    @Id
    @Column(length = 20)
    private String id;
    private String pass;
    private String name;
    private int gender;
    private String tel;
    private String email;
    private String profileFileName;

    public void patch(MemberDto memberDto) {
        if (!id.equals(memberDto.getId())) {
            id = memberDto.getId();
        }
        if (!pass.equals(memberDto.getPass())) {
            pass = memberDto.getPass();
        }
        if (!name.equals(memberDto.getName())) {
            name = memberDto.getName();
        }
        if (gender != memberDto.getGender()) {
            gender = memberDto.getGender();
        }
        if (!tel.equals(memberDto.getTel())) {
            tel = memberDto.getTel();
        }
        if (!email.equals(memberDto.getEmail())) {
            email = memberDto.getEmail();
        }
    }
}
