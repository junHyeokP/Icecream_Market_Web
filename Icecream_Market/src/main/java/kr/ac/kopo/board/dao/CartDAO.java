package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.vo.CartVO;

public interface CartDAO {
	
	int insert(CartVO cart);
	List<CartVO> selectAll();
	CartVO selectByCup_and_Id(CartVO cart);
	int updateByCup_and_Id(CartVO cart);
	int deleteByCup_and_Id(CartVO cart);
	int deleteAll();
	
}
