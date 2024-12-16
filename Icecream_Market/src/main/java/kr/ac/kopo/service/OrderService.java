package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.board.dao.OrderDAO;
import kr.ac.kopo.board.dao.OrderDAOImpl;
import kr.ac.kopo.vo.OrderVO;

public class OrderService {
	
	OrderDAO orderDao;

	public OrderService() {
		this.orderDao = new OrderDAOImpl();
	}
	
	public void insertOrder(OrderVO order) {
		int result = orderDao.insert(order);
		System.out.println(result + "개 주문생성");
	}
	
	public int selectSeq() {
		int result = orderDao.selectSeq();
		return result;
	}
	
	public List<OrderVO> selectAllOrder() {
		List<OrderVO> list = orderDao.selectAll();
		return list;
	}
	
	public List<OrderVO> selectMemberOrder(String id) {
		List<OrderVO> list = orderDao.selectCup(id);
		return list;
	}
	
	public void updateAcceptOrder(String state) {
		int result = orderDao.updateAcceptStatement(state);
		System.out.println(result + "개 주문 승인");
	}
	
	public void updateRejectOrder(String state) {
		int result = orderDao.updateRejectStatement(state);
		System.out.println(result + "개 주문 취소");
	}

	public void deleteAll(String id) {
		int result = orderDao.deleteAll(id);
		System.out.println(result + "개 주문 삭제");
	}
}
