package net.musecom.kdtcom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.musecom.kdtcom.model.MemberDto;

public class MemberDaoImpl implements MemberDao {

	@Autowired
	private MemberMapper mem;
	
	@Override
	public List<MemberDto> getAllMem() {
		return mem.findList();
	}

	@Override
	public MemberDto getMem(int num) {
		return mem.findById(num);
	}

	@Override
	public void insertMem(MemberDto dto) {
       mem.insertMember(dto);
	}

	@Override
	public void updateMem(MemberDto dto) {
       mem.updateMember(dto);
	}

	@Override
	public void delMember(int num) {
       mem.deleteMember(num);
	}

}
