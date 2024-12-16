package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.vo.OrderVO;

public interface OrderDAO {
	
	int insert(OrderVO order);
	List<OrderVO> selectAll();
	List<OrderVO> selectCup(String id);
	int selectSeq();
	int updateAcceptStatement(String no);
	int updateRejectStatement(String no);
	int deleteAll(String id);
	int deleteOrder(int no);
	
}
