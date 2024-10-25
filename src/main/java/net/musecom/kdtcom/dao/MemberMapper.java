package net.musecom.kdtcom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.musecom.kdtcom.model.MemberDto;

@Mapper
public interface MemberMapper {
	
	//ȸ������ ��ȸ
	MemberDto findById(int id);
	
	//ȸ����� ��ȸ
	List<MemberDto> findList();
	
	//ȸ���߰�
	void insertMember(MemberDto mem);
	
	//ȸ������
	void updateMember(MemberDto mem);
	
	//ȸ������
	void deleteMember(int id);
}