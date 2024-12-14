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
	
	public void insertCart(OrderVO cart) {
		int result = orderDao.insert(cart);
		System.out.println(result + "개 아이템이 장바구니에 들어감");
	}
	
	public List<OrderVO> selectAllCart() {
		List<OrderVO> list = orderDao.selectAll();
		return list;
	}
	
	public void deleteAllCart() {
		int result = orderDao.deleteAll();
		System.out.println(result + "개 아이템 삭제");
	}
}
