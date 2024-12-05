package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.MemberVO;

public class DeleteController implements Controller {
	
	MemberService mService;
	HttpSession session;
	
	public DeleteController() {
		this.mService = new MemberService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		this.session = request.getSession();
		MemberVO member = (MemberVO)session.getAttribute("member");
		String id = member.getId();
		
		mService.removeMember(id);
		session.removeAttribute("member");
		
		return "/jsp/member/delete.jsp";
	}
}
