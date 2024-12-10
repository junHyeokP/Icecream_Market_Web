package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.CartService;
import kr.ac.kopo.vo.CartVO;
import kr.ac.kopo.vo.MemberVO;

public class IceSelectController implements Controller {
	
	CartService cService;
	HttpSession session;
	
	public IceSelectController() {
		cService = new CartService();
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
		CartVO cart = new CartVO(iceCup, im_id, quantity);
		
		cService.insertCart(cart);
		session.setAttribute("cart", true);
		
		return "/jsp/icecream/iceSelect.jsp";
	}
}
