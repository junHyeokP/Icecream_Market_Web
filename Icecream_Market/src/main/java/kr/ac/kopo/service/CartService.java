package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.board.dao.CartDAO;
import kr.ac.kopo.board.dao.CartDAOImpl;
import kr.ac.kopo.vo.CartVO;

public class CartService {
	
	CartDAO cartDao;

	public CartService() {
		this.cartDao = new CartDAOImpl();
	}
	
	public void insertCart(CartVO cart) {
		int result = cartDao.insert(cart);
		System.out.println(result + "개 아이템이 장바구니에 들어감");
	}
	
	public List<CartVO> selectAllCart() {
		List<CartVO> list = cartDao.selectAll();
		return list;
	}
	
	public void deleteAllCart() {
		int result = cartDao.deleteAll();
		System.out.println(result + "개 아이템 삭제");
	}
}
