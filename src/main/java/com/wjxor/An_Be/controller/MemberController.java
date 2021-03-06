package com.wjxor.An_Be.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjxor.An_Be.dto.Member;
import com.wjxor.An_Be.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/usr/member/getMembers")
	@ResponseBody
	public List<Member> getMembers(@RequestParam Map<String, Object> param) {
		if (param.get("limit") != null) {
			int limit = Integer.parseInt((String) param.get("limit"));
			param.put("limit", limit);
			param.put("limitFrom", 0);
		}
		
		if (param.get("page") != null) {
			int page = Integer.parseInt((String) param.get("page"));
			int limit = 10;
			int limitFrom = (page - 1) * limit;
			param.put("limit", limit);
			param.put("limitFrom", limitFrom);
		}
		
		List<Member> members = memberService.getMembers(param);
		
		return members;
	}
	
	@RequestMapping("/usr/member/getMember")
	@ResponseBody
	public Member getMember(int id) {
		Member member = memberService.getMember(id);
		
		return member;
	}
}
