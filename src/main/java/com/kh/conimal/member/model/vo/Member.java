package com.kh.conimal.member.model.vo;

import lombok.*;

import java.sql.Date;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    private int memNo;
    private String memId;
    private String memPwd;
    private String memName;
    private String email;
    private Date enrollDate;
    private String status;
    private int memCode;

    private String shName;
    private String shPhone;
    private String shAddress;
    private String shAbout;
    private String admission;
    private String shLocal;
    private String refType;

}
