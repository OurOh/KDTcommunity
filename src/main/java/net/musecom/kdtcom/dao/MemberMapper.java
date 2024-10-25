package net.musecom.kdtcom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.musecom.kdtcom.model.MemberDto;

@Mapper
public interface MemberMapper {
	
	//회원정보 조회
	MemberDto findById(int id);
	
	//회원목록 조회
	List<MemberDto> findList();
	
	//회원추가
	void insertMember(MemberDto mem);
	
	//회원수정
	void updateMember(MemberDto mem);
	
	//회원삭제
	void deleteMember(int id);
}
