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
		int result = sqlSession.insert("dao.orderDAO.insertOrder", order);
		sqlSession.commit();
		return result;
	}

	@Override
	public List<OrderVO> selectAll() {
		List<OrderVO> list = sqlSession.selectList("dao.orderDAO.selectAllOrder");
		for(OrderVO order : list) {
			System.out.println("ALL : " + order.toString());
		}
		return list;
	}

	@Override
	public List<OrderVO> selectCup(String im_id) {
		List<OrderVO> list = sqlSession.selectList("dao.orderDAO.selectOrderByID", im_id);
		for(OrderVO order : list) {
			System.out.println(order.toString());
		}
		return list;
	}

	@Override
	public int selectSeq() {
		int no = sqlSession.selectOne("dao.orderDAO.selectSeq");
		return no;
	}
	
	@Override
	public int deleteOrder(int no) {
		int result = sqlSession.delete("dao.orderDAO.deleteOrder", no);
		sqlSession.commit();
		return result;
	}

	@Override
	public int updateAcceptStatement(String no) {
		int result = sqlSession.update("dao.orderDAO.updateAcceptStatement", Integer.parseInt(no));
		sqlSession.commit();
		return result;
	}
	
	@Override
	public int updateRejectStatement(String no) {
		int result = sqlSession.update("dao.orderDAO.updateRejectStatement", Integer.parseInt(no));
		sqlSession.commit();
		return result;
	}

	@Override
	public int deleteAll(String id) {
		int result = sqlSession.update("dao.orderDAO.deleteAll", id);
		sqlSession.commit();
		return result;
	}

	

	
	
}
