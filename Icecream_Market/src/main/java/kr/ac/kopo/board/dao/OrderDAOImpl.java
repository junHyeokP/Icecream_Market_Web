package kr.ac.kopo.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.OrderVO;

public class OrderDAOImpl implements OrderDAO{

private SqlSession sqlSession; 
	
	public OrderDAOImpl() {
		this.sqlSession = new MyConfig().getInstance();
	}

	@Override
	public int insert(OrderVO order) {
		int result = sqlSession.insert("dao.orderDAO.insertCart", order);
		sqlSession.commit();
		return result;
	}

	@Override
	public List<OrderVO> selectAll() {
		List<OrderVO> list = sqlSession.selectList("dao.orderDAO.selectAllCart");
		return list;
	}

	@Override
	public OrderVO selectByCup_and_Id(OrderVO order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByCup_and_Id(OrderVO order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCup_and_Id(OrderVO order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll() {
		int result = sqlSession.delete("dao.orderDAO.deleteAllCart");
		sqlSession.commit();
		return result;
	}
	
}
