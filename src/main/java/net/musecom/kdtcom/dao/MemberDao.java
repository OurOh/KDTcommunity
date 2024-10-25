package net.musecom.kdtcom.dao;

import java.util.List;

import net.musecom.kdtcom.model.MemberDto;

public interface MemberDao {
  List<MemberDto> getAllMem();
  MemberDto getMem(int num);
  void insertMem(MemberDto dto);
  void updateMem(MemberDto dto);
  void delMember(int num);
}