package co.Mingwang.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.Mingwang.common.Command;

public class LogoutCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpsession = request.getSession();
		String id = (String) httpsession.getAttribute("id");
		request.removeAttribute("id");
		request.removeAttribute("grant");
		request.setAttribute("id", id);
		String path = "view/logOut.jsp";
		if(httpsession != null) {
			httpsession.invalidate();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
