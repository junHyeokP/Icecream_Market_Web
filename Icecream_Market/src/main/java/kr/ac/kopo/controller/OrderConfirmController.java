package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.vo.MemberVO;
import kr.ac.kopo.vo.OrderVO;

public class OrderConfirmController implements Controller {
	
	OrderService oService;
	HttpSession session;
	
	public OrderConfirmController() {
		this.oService = new OrderService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		this.session = request.getSession();
		
		String accept = request.getParameter("accept");
		String reject = request.getParameter("reject");
		
		
		if(accept != null) {
			oService.updateAcceptOrder(accept);
			session.setAttribute("rig", true);
		}
		else if(reject != null) {
			oService.updateRejectOrder(reject);
			session.setAttribute("rejected", true);
		}
		
		
		return "/jsp/icecream/orderListAdmin.jsp";
	}
}
