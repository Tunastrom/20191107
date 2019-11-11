package co.Mingwang.command.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.common.Command;
import co.Mingwang.dao.BoardDao;
import co.Mingwang.dto.BoardDto;

public class BoardWriteOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		dto.setWriter(request.getParameter("name"));
		dto.setTitle(request.getParameter("title"));
		dto.setContents(request.getParameter("content"));
		dto.setUserId(request.getParameter("userid"));
		int n = dao.insert(dto);
		String path;
		if(n == 0) {
			path="boardWrite.do";
		} else {
			path="boardRead.do";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
