package com.wjxor.An_Be.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Member {
	private int id;
	private String regDate;
	private String updateDate;
	private String loginId;
	// 비밀번호가 노출되는것을 막기위함
	@JsonIgnore
	private String loginPw;
	private String name;
	private String nickname;
}
