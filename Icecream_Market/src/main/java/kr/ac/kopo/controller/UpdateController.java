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
		
		member.setIm_id(request.getParameter("id"));
		member.setIm_name(request.getParameter("name"));
		member.setIm_password(request.getParameter("password"));
		member.setIm_email_id(request.getParameter("email_id"));
		member.setIm_email_domain(request.getParameter("email_domain"));
		member.setIm_basic_addr(request.getParameter("basic_addr"));
		member.setIm_detail_addr(request.getParameter("detail_addr"));
		
		mService.updateMember(member);
		
		return "/jsp/member/update.jsp";
	}
}
