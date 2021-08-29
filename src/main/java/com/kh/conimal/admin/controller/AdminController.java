package com.kh.conimal.admin.controller;

import com.kh.conimal.member.controller.MemberController;
import com.kh.conimal.member.model.service.MemberService;
import com.kh.conimal.member.model.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AdminController {

    @Autowired
    private MemberService mService;

    @GetMapping("/list.me")
    public String selectMemberList(Model model){
        int selectListCount = mService.selectListCount();
        ArrayList<Member> mList = mService.selectMemberList();
        System.out.println(mList);
        model.addAttribute("mList", mList);
        return "admin/memberListView";
    }
}
