package co.Mingwang.command.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.Mingwang.common.Command;
import co.Mingwang.dao.MemberDao;
import co.Mingwang.dto.MemberDto;

public class LoginOkCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberDto result = dao.loginCheck(id, pw);
		
		if(result == null) {
			response.sendRedirect("login.do");
		} else {
			HttpSession httpsession = request.getSession(); //자바 객체를 이용해서 session 객체(servlet session 객체)를 이용할때
			httpsession.setAttribute("id", id);
			httpsession.setAttribute("name", result.getName());
			httpsession.setAttribute("grant", result.getGrant());
			response.sendRedirect("index.do");
		}
	}
}
