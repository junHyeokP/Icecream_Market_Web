package kopo.ac.kr.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {
	
	SqlSession sqlSession;
	
	
	
	public MemberDAOImpl() {
		sqlSession = new MyConfig().getInstance();
	}

	@Override
	public int createMember(MemberVO member) {
		int result = sqlSession.insert("dao.memberDAO.insertMember", member);
		sqlSession.commit();
		return result;
	}

	@Override
	public List<MemberVO> selectAllMembers() {
		
		return null;
	}


	@Override
	public MemberVO selectMemberByID(String id) {
		MemberVO member = sqlSession.selectOne("dao.memberDAO.selectByID", id);
		return member;
	}


	@Override
	public int updateMember(MemberVO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String id) {
		// TODO Auto-generated method stub
		return 0;
	}



	
}
