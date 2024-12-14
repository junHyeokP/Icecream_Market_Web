package kr.ac.kopo.controller;

import jakarta.servlet.http.Cookie; 
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.vo.MemberVO;

public class IceSelectController implements Controller {
	
	OrderService cService;
	HttpSession session;
	
	public IceSelectController() {
		cService = new OrderService();
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
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tempArr.length; i++) {
			if(tempArr[i] != null) {
				iceArr[i] = tempArr[i]; 
				sb.append(iceArr[i] + " ");
			}
		}
		
		iceCup = sb.toString();
		System.out.println(iceCup);
		
		return "/jsp/icecream/iceSelect.jsp";
	}
}
