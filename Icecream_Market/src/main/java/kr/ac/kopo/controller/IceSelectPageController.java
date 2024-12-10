package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.CartService;
import kr.ac.kopo.service.Ice_StockService;
import kr.ac.kopo.vo.Ice_StockVO;

public class IceSelectPageController implements Controller {
	
	Ice_StockService i_sService;
	CartService cService;
	HttpSession session;
	
	public IceSelectPageController() {
		this.i_sService = new Ice_StockService();
		this.cService = new CartService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		session = request.getSession();
		
		List<Ice_StockVO> iceList = i_sService.selctAll();
		request.setAttribute("ice_Stock", iceList);
		
		if(session.getAttribute("cart") == null) {
			cService.deleteAllCart();
		}
		
		return "/jsp/icecream/iceSelectPage.jsp";
	}
}
