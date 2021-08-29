package com.kh.conimal.member.model.service;

import com.kh.conimal.member.model.vo.Member;

import java.util.ArrayList;

public interface MemberService {

    // 로그인
    Member loginMember(Member m);

    // 회원 가입
    int insertMember(Member m);

    // 아이디 중복 체크
    int idCheck(String checkId);

    // 아이디 찾기
    Member selectMember(String memName, String email);

    // 비밀번호 찾기
    Member selecPwdMember(String memName, String email, String memId);

    // 보호소 회원가입
    int insertSh(Member m);

    // 보호소 마이페이지 정보수정
    int updateMember(Member m);

    // 보호소 비밀번호 변경
    Member updatePwdMember(String memId, String memPwd, String updatePwd);

    // 비밀번호 변경
    int changePwdMember(Member m);

    // 보호소/사용자 회원 탈퇴
    int deleteMember(String memId, String memPwd);

    // 총 회원 수
    int selectListCount();

    // 전체 회원 조회(관리자)
    ArrayList<Member> selectMemberList();

    // 회원 검색(관리자)
    ArrayList<Member> searchMemberList(String keyword);

}
