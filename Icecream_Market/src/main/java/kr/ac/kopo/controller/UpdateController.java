package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.MemberVO;

public class UpdateController implements Controller {
	
	MemberService mService;
	HttpSession session;
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		
		this.mService = new MemberService();
		this.session = request.getSession();
		
		MemberVO member = (MemberVO)session.getAttribute("member");
		
		member.setId(request.getParameter("id"));
		member.setName(request.getParameter("name"));
		member.setPassword(request.getParameter("password"));
		member.setEmail_id(request.getParameter("email_id"));
		member.setEmail_domain(request.getParameter("email_domain"));
		member.setBasic_addr(request.getParameter("basic_addr"));
		member.setDetail_addr(request.getParameter("detail_addr"));
		
		mService.updateMember(member);
		
		return "/jsp/member/update.jsp";
	}
}
