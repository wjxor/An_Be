package com.wjxor.An_Be.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wjxor.An_Be.dto.Member;

@Mapper
public interface MemberDao {
	
	List<Member> getMembers();

	Member getMember(@Param("id") int id);

	List<Member> getMembers(Map<String, Object> param);
	
}
