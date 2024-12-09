package kr.ac.kopo.controller;

import java.util.List; 

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.vo.BoardVO;

public class BoardListController implements Controller {
	
	BoardService service;
	
	public BoardListController() {
		this.service = new BoardService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<BoardVO> list = service.SelectAll();
		request.setAttribute("boardList", list);
		
		return "/jsp/board/list.jsp";
	}

}
