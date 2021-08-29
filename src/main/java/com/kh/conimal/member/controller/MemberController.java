package com.kh.conimal.member.controller;

import com.kh.conimal.member.model.service.MemberService;
import com.kh.conimal.member.model.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired private MemberService service;

    @GetMapping("/")
    public String mainPage() {
        return "mainPage";
    }

    @PostMapping("/login.me")
    public String loginMember(Member member, Model model) {

        Member loginMember = service.loginMember(member);

        model.addAttribute("loginMember", loginMember);

        return "fragement/layout";
    }

}
