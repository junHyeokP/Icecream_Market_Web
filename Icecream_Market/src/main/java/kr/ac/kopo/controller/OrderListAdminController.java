package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.vo.MemberVO;
import kr.ac.kopo.vo.OrderVO;

public class OrderListAdminController implements Controller {
	
	OrderService oService;
	HttpSession session;
	
	public OrderListAdminController() {
		this.oService = new OrderService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		this.session = request.getSession();
		
		List<OrderVO> list = oService.selectAllOrder();
		
		session.setAttribute("orderList", list);
		
		
		return "/jsp/icecream/orderListAdmin.jsp";
	}
}
