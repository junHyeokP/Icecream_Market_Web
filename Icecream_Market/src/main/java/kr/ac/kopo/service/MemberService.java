package kr.ac.kopo.service;

import java.util.List;

import kopo.ac.kr.board.dao.MemberDAO;
import kopo.ac.kr.board.dao.MemberDAOImpl;
import kr.ac.kopo.vo.MemberVO;

public class MemberService {
	
	MemberDAO memberDao;

	public MemberService() {
		this.memberDao = new MemberDAOImpl();
	}
	
	public void registMember(MemberVO member) {
		int result = memberDao.createMember(member);
		System.out.println(result + "개 행 생성");
	}
	
	public List<MemberVO> selectMember() {
		List<MemberVO> list = memberDao.selectAllMembers();
		return list;
	}

	public MemberVO findMember(String id) {
		MemberVO member = memberDao.selectMemberByID(id);
		return member;
	}
	
	public void updateMember(MemberVO member) {
		int result = memberDao.updateMember(member);
		if(result > 0) {
			System.out.println(result + "개 행 수정");
		} else {
			System.out.println("수정된 행이 없습니다.");
		}
	}

	public void removeMember(String id) {
		
		int result = memberDao.deleteMember(id);
		if(result > 0) {
			System.out.println(result + "개 행 삭제");
		} else {
			System.out.println("삭제된 행이 없습니다.");
		}
	}
	
}
