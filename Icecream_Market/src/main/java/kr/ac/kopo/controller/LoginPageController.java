package kr.ac.kopo.controller;

import java.util.List;

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
		
		String ad_id = "june";
		String ad_pwd = "1234";
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		
		//로그인 시도시 실행되는 코드
		if(id != null) {
			
		MemberVO member = mService.findMember(id);
		
		if(member.getIm_id().equals(ad_id) && member.getIm_password().equals(ad_pwd)) {
			session.setAttribute("admin", true);
		}
		
		if (member.getIm_id().equals(id) && member.getIm_password().equals(pwd)) {
			session.setAttribute("member", member);
		} else {
			request.setAttribute("loginFailed", true);
		}
		
		}
		return "/jsp/member/loginPage.jsp";
	}
}
