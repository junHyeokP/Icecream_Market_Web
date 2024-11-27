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
	
}
