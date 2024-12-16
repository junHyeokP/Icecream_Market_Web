package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.vo.MemberVO;
import kr.ac.kopo.vo.OrderVO;

public class OrderPageController implements Controller {
	
	OrderService oService;
	HttpSession session;
	
	public OrderPageController() {
		this.oService = new OrderService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		this.session = request.getSession();
		String reject = request.getParameter("rejectAll");
		if(reject != null) {
			oService.deleteAll(reject);
		}

		int sum = 0;
		
		OrderVO or = (OrderVO)session.getAttribute("icecreamOrder");
		
		
		sum += or.getOrder_cup_price();
		
		session.setAttribute("totalPrice", sum);
		return "/jsp/icecream/orderPage.jsp";
	}
}
