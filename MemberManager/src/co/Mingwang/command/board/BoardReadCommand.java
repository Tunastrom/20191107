package co.Mingwang.command.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.common.Command;
import co.Mingwang.dao.BoardDao;
import co.Mingwang.dto.BoardDto;

public class BoardReadCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		ArrayList<BoardDto> list = dao.select(id);
		
		
		
		request.setAttribute("list", list);
//		request.setAttribute("id", id);
		String path="view/boardRead.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
