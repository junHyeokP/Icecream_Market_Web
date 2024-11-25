package kr.ac.kopo.service;

import java.util.List;

import kopo.ac.kr.board.dao.BoardDAO;
import kopo.ac.kr.board.dao.BoardDAOImpl;
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
}
