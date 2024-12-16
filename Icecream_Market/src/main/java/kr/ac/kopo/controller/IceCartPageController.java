package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.vo.OrderVO;
import kr.ac.kopo.vo.MemberVO;

public class IceCartPageController implements Controller {
	
	OrderService cService;
	HttpSession session;
	
	public IceCartPageController() {
		cService = new OrderService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		this.session = request.getSession();
		MemberVO member = (MemberVO)session.getAttribute("member");
		String im_id = member.getIm_id();
		
		List<OrderVO> list = cService.selectAllOrder();
		
		if(list != null) {
		session.setAttribute("cartList", list);
		} else {
			System.out.println("null");
		}
		
		return "/jsp/icecream/iceCartPage.jsp";
	}
}
