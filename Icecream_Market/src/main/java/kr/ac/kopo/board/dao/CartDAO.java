package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.vo.CartVO;

public interface CartDAO {
	
	int insert(CartVO cart);
	List<CartVO> selectAll();
	CartVO selectByCupName(CartVO cart);
	int deleteByCupName(CartVO cart);
	int deleteAll();
	
}
