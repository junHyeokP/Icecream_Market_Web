package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.dao.BoardDAOImpl;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {
	
	BoardDAO boardDao;

	public BoardService() {
		this.boardDao = new BoardDAOImpl();
	}
	
	public List<BoardVO> SelectAll() throws Exception {
		List<BoardVO> list = boardDao.selectAllBoard();
		return list;
	}
	
	public BoardVO selectByNo(int no) throws Exception {
		BoardVO board = boardDao.selectBoardByNo(no);
		return board;
	}
}
