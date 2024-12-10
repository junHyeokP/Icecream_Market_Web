package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.board.dao.Ice_StockDAO;
import kr.ac.kopo.board.dao.Ice_StockDAOImpl;
import kr.ac.kopo.vo.Ice_StockVO;

public class Ice_StockService {
	
	Ice_StockDAO ice_StockDao;
	
	public Ice_StockService() {
		ice_StockDao = new Ice_StockDAOImpl();
	}
	
	public List<Ice_StockVO> selctAll() {
		
		List<Ice_StockVO> iceList = ice_StockDao.selectAllIce();
		
		return iceList;
	}
	
	public int update(Ice_StockVO ice) {
		int result = ice_StockDao.updateIce(ice);
		return result;
	}
}
