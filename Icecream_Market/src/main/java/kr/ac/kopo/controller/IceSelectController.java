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
		
		String[] tempArr = request.getParameterValues("ice");
		String[] iceArr = new String[tempArr.length];
		for (int i = 0; i < tempArr.length; i++) {
			if(tempArr[i] != null) {
				iceArr[i] = tempArr[i]; 
			}
		}
		
		System.out.println(iceArr[0]);
		System.out.println(iceArr[1]);
		
		return "/jsp/icecream/iceSelect.jsp";
	}
}
