package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.OrderService;
import kr.ac.kopo.service.Ice_StockService;
import kr.ac.kopo.vo.Ice_StockVO;

public class IceSelectPageController implements Controller {
	
	Ice_StockService i_sService;
	OrderService cService;
	HttpSession session;
	
	public IceSelectPageController() {
		this.i_sService = new Ice_StockService();
		this.cService = new OrderService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		session = request.getSession();
		
		List<Ice_StockVO> iceList = i_sService.selctAll();
		request.setAttribute("ice_Stock", iceList);
		
		return "/jsp/icecream/iceSelectPage.jsp";
	}
}
