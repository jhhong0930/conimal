package com.kh.conimal.member.model.dao;

import com.kh.conimal.member.model.vo.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    public Member loginMember(SqlSessionTemplate session, Member m) {
        return session.selectOne("memberMapper.loginMember", m);
    }

    public int insertMember(SqlSessionTemplate session, Member m) {
        return session.insert("memberMapper.insertMember", m);
    }

}
