package kopo.ac.kr.board.dao;

import java.util.List;

import kr.ac.kopo.vo.MemberVO;

public interface MemberDAO {
	
	int createMember(MemberVO member);
	List<MemberVO> selectAllMembers();
	MemberVO selectMemberByID(String id);
	int updateMember(MemberVO member);
	int deleteMember(String id);
}
