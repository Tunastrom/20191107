package co.Mingwang.command.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.common.Command;
import co.Mingwang.dao.BoardDao;
import co.Mingwang.dto.BoardDto;

public class BoardListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDto dto = new BoardDto();
		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> list = dao.select(0);
		
		request.setAttribute("list", list);
		String path="view/boardList.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
