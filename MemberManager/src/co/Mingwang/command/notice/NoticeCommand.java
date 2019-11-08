package co.Mingwang.command.notice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.common.Command;
import co.Mingwang.dao.NoticeDao;
import co.Mingwang.dto.NoticeDto;

public class NoticeCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<NoticeDto> list = new ArrayList<>();
		NoticeDao dao = new NoticeDao();
		list = dao.select(); //전체리스트가져오기
		
		request.setAttribute("list", list);
		String path="view/notice.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}
