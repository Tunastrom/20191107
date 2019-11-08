package co.Mingwang.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.common.Command;
import co.Mingwang.dao.MemberDao;
import co.Mingwang.dto.MemberDto;

public class NewMemberOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		MemberDto dto = new MemberDto();
		dto.setId(request.getParameter("id"));
		dto.setPassword(request.getParameter("pw"));
		dto.setName(request.getParameter("name"));
		dto.setAddr(request.getParameter("addr"));
		String tel = request.getParameter("fTel")+request.getParameter("mTel")+request.getParameter("lTel");
		dto.setTel(tel);
		int n = dao.insert(dto);
		String id = request.getParameter("id");
		request.setAttribute("result", n);
		request.setAttribute("id", id);
		String path="view/newMemberResult.jsp";
		RequestDispatcher dispatcher= request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}
