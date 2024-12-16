package kr.ac.kopo.controller;

import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.MemberVO;

public class LogoutController implements Controller {
	
	MemberService mService;
	HttpSession session;
	
	public LogoutController() {
		this.mService = new MemberService();
		
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		this.session = request.getSession();
		session.removeAttribute("member");
		session.removeAttribute("admin");
		
		return "/jsp/member/logout.jsp";
	}
}
