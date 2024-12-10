package kr.ac.kopo.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.Ice_StockVO;

public class Ice_StockDAOImpl implements Ice_StockDAO {

	SqlSession sqlSession;

	public Ice_StockDAOImpl() {
		this.sqlSession = new MyConfig().getInstance();
	}

	@Override
	public List<Ice_StockVO> selectAllIce() {
		List<Ice_StockVO> iceList = sqlSession.selectList("dao.Ice_StockDAO.selectAllIce");
		return iceList;
	}
	
	@Override
	public int insertIce(Ice_StockVO stock) {
		sqlSession.commit();
		return 0;
	}

	@Override
	public int updateIce(Ice_StockVO stock) {
		sqlSession.commit();
		return 0;
	}

	@Override
	public int deleteIce(Ice_StockVO stock) {
		// TODO Auto-generated method stub
		return 0;
	}

}
