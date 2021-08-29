package com.kh.conimal.member.model.service;

import com.kh.conimal.member.model.dao.MemberDao;
import com.kh.conimal.member.model.vo.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired private MemberDao dao;

    @Autowired private SqlSessionTemplate session;

    @Override
    public Member loginMember(Member m) {
        return dao.loginMember(session, m);
    }

    @Override
    public int insertMember(Member m) {
        return dao.insertMember(session, m);
    }

    @Override
    public int idCheck(String checkId) {
        return 0;
    }

    @Override
    public Member selectMember(String memName, String email) {
        return null;
    }

    @Override
    public Member selecPwdMember(String memName, String email, String memId) {
        return null;
    }

    @Override
    public int insertSh(Member m) {
        return 0;
    }

    @Override
    public int updateMember(Member m) {
        return 0;
    }

    @Override
    public Member updatePwdMember(String memId, String memPwd, String updatePwd) {
        return null;
    }

    @Override
    public int changePwdMember(Member m) {
        return 0;
    }

    @Override
    public int deleteMember(String memId, String memPwd) {
        return 0;
    }

    @Override
    public int selectListCount() {
        return 0;
    }

    @Override
    public ArrayList<Member> selectMemberList() {
        return null;
    }

    @Override
    public ArrayList<Member> searchMemberList(String keyword) {
        return null;
    }
}
