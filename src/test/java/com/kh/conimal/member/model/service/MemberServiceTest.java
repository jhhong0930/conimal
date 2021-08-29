package com.kh.conimal.member.model.service;

import com.kh.conimal.member.model.vo.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired MemberService service;

    @Test
    void loginTest() {

        Member member = new Member();

        member.setMemId("admin");
        member.setMemPwd("1234");

        Member member1 = service.loginMember(member);

        assertThat(member1.getMemNo()).isEqualTo(1);
    }

}