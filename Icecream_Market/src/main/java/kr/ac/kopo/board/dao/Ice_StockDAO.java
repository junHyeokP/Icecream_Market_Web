package kr.ac.kopo.board.dao;

import java.util.List;

import kr.ac.kopo.vo.Ice_StockVO;

public interface Ice_StockDAO {
	
	int insertIce(Ice_StockVO stock);
	List<Ice_StockVO> selectAllIce();
	int updateIce(Ice_StockVO stock);
	int deleteIce(Ice_StockVO stock);
}
