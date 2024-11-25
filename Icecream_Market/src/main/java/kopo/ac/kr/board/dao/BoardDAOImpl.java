package kopo.ac.kr.board.dao;

import java.util.List; 

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	
	private SqlSession sqlSession; 
	
	public BoardDAOImpl() {
		sqlSession = new MyConfig().getInstance();
	}

	@Override
	public List<BoardVO> selectAllBoard() throws Exception {
		// "mapping name.query id"
		List<BoardVO> list = sqlSession.selectList("dao.BoardDAO.selectAllBoard");
		return list;
	}

	@Override
	public BoardVO selectBoardByNo(int no) throws Exception {
		BoardVO board = sqlSession.selectOne("dao.BoardDAO.selectByNo", no);
		return board;
	}

	@Override
	public int createBoard() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoardByNo() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoardByNo() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



}
