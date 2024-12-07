package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.MemberVO;

public class IceSelectController implements Controller {
	
	
	HttpSession session;
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		this.session = request.getSession();
		
		
		return "/jsp/member/update.jsp";
	}
}
