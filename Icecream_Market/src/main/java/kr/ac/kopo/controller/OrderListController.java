package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.vo.MemberVO;
import kr.ac.kopo.vo.OrderVO;

public class OrderListController implements Controller {
	
	OrderService oService;
	HttpSession session;
	
	public OrderListController() {
		this.oService = new OrderService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		this.session = request.getSession();
		String isOrder = request.getParameter("orders");
		OrderVO or = (OrderVO)session.getAttribute("icecreamOrder");
		
		if(isOrder != null) {
			System.out.println(or.toString());
			oService.insertOrder(or);
		}
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		List<OrderVO> list = oService.selectMemberOrder(member.getIm_id());
		
		session.setAttribute("memberOrder", list);
		
		return "/jsp/icecream/orderList.jsp";
	}
}
