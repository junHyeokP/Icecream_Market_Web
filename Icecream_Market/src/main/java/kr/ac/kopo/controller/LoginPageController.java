package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.MemberVO;

public class LoginPageController implements Controller {
	
	MemberService mService;
	HttpSession session;
	
	public LoginPageController() {
		this.mService = new MemberService();
		
	}
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		this.session = request.getSession();
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		
		if(id != null) {
		MemberVO member = mService.findMember(id); 
		
			if (member != null) {
				session.setAttribute("member", member);
			} else {
				request.setAttribute("loginFailed", true);
			}
		
		}
		return "/jsp/member/loginPage.jsp";
	}
}
