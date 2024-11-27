package kr.ac.kopo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.vo.MemberVO;

public class RegistController implements Controller {

	MemberService mService;
	
	public RegistController() {
		this.mService = new MemberService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		String email_id = request.getParameter("email_id");
		String email_domain = request.getParameter("email_domain");
		String basic_addr = request.getParameter("basic_addr");
		String detail_addr = request.getParameter("detail_addr");
		MemberVO member = new MemberVO(id, name, pwd, email_id, email_domain, basic_addr, detail_addr);
		
		System.out.println(id);
		
		mService.registMember(member);
		
		return "/jsp/member/regist.jsp";
	}
}
