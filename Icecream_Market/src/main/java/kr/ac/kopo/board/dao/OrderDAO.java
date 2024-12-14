package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.vo.OrderVO;

public interface OrderDAO {
	
	int insert(OrderVO order);
	List<OrderVO> selectAll();
	OrderVO selectByCup_and_Id(OrderVO order);
	int updateByCup_and_Id(OrderVO order);
	int deleteByCup_and_Id(OrderVO order);
	int deleteAll();
	
}
