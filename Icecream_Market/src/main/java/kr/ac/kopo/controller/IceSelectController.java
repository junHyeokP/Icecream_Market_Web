package kr.ac.kopo.controller;

import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.vo.MemberVO;
import kr.ac.kopo.vo.OrderVO;

public class IceSelectController implements Controller {
	
	OrderService oService;
	HttpSession session;
	
	public IceSelectController() {
		oService = new OrderService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		this.session = request.getSession();
		MemberVO member = (MemberVO)session.getAttribute("member");
		String iceCup;
		String im_id = member.getIm_id();
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		
		String[] tempArr = request.getParameterValues("ice");
		String[] iceArr = new String[tempArr.length];
		int total = 0;
		
		System.out.println(tempArr.length);
		for(int i = 0; i < tempArr.length; i++) {
			total += Integer.parseInt(request.getParameter(tempArr[i]));
		}
		System.out.println(total);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tempArr.length; i++) {
			if(tempArr[i] != null) {
				iceArr[i] = tempArr[i]; 
				sb.append(iceArr[i] + " ");
			}
		}
		
		iceCup = sb.toString();
		System.out.println(iceCup);
		
		int no = oService.selectSeq();
		
		OrderVO order = new OrderVO(no, im_id, iceCup, quantity, total*quantity);
		System.out.println("order no :" + order.getOrder_ice_no());
		
		session.setAttribute("icecreamOrder", order);
		
		return "/jsp/icecream/iceSelect.jsp";
	}
}
