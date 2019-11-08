package co.Mingwang.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.common.Command;
import co.Mingwang.dao.MemberDao;
import co.Mingwang.dto.MemberDto;

public class IdCheckCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nid = request.getParameter("nid");
		MemberDao dao = new MemberDao();
		MemberDto dto = new MemberDto();
		dto = dao.select(nid);
		boolean distinct;
		if(dto.getId() == null) {
			distinct = true;
		} else {
			distinct = false;
		}
		request.setAttribute("nid", nid);
		request.setAttribute("distinct", distinct);
		String path = "view/idCheck.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	
	}

}
