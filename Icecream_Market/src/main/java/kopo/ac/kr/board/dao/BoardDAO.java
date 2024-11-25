package kopo.ac.kr.board.dao;

import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public interface BoardDAO {
	
	List<BoardVO> selectAllBoard() throws Exception;
	BoardVO selectBoardByNo(int no) throws Exception;
	int createBoard() throws Exception;
	int updateBoardByNo() throws Exception;
	int deleteBoardByNo() throws Exception;
			
}
