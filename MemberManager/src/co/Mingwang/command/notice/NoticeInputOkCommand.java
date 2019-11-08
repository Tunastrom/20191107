package co.Mingwang.command.notice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.common.Command;
import co.Mingwang.dao.NoticeDao;
import co.Mingwang.dto.NoticeDto;

public class NoticeInputOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeDao dao = new NoticeDao();
		NoticeDto dto = new NoticeDto();
		dto.setnTitle(request.getParameter("title"));
		dto.setnContent(request.getParameter("content"));
		int n = dao.insert(dto);
		String path="view/noticeInputOk.jsp";
		request.setAttribute("result", n);
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}
