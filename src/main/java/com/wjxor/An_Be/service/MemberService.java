package com.wjxor.An_Be.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjxor.An_Be.dao.MemberDao;
import com.wjxor.An_Be.dto.Member;

@Service
public class MemberService {
	@Autowired
	private MemberDao memberDao;

	public List<Member> getMembers() {
		return memberDao.getMembers();
	}

	public Member getMember(int id) {
		
		
		return memberDao.getMember(id);
	}

	public List<Member> getMembers(Map<String, Object> param) {

		return memberDao.getMembers(param);
	}

}
 