package net.musecom.kdtcom.dao;

public class MemberDaoImpl implements MemberDao {

	
	
	@Override
	public List<MemberDto> getAllMem(){
		return mem.findList();
	}
	
	@Override
	public MemberDto getMem(int num) {
		return mem.findById();
	}
	
	
	
}
