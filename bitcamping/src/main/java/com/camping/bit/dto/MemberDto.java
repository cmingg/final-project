package com.camping.bit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class MemberDto {

 private String id;
 private String pwd;
 private String name;
// private String nickname;
// private String birth;
// private String phone;
 private String email;
// private String createDate;
// private String snsType;
 private int auth;

}