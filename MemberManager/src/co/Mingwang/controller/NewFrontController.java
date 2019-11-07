package co.Mingwang.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.command.IndexCommand;
import co.Mingwang.command.member.LoginOkCommand;
import co.Mingwang.command.member.LogoutCommand;
import co.Mingwang.common.Command;
import co.Mingwang.common.LoginCommand;

/**
 * Servlet implementation class NewFrontController
 */
@WebServlet("/NewFrontController")
public class NewFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HashMap<String, Command> cont = new HashMap<>(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		cont.put("/index.do", new IndexCommand());
		cont.put("/login.do", new LoginCommand());
		cont.put("/loginOk.do", new LoginOkCommand());
		cont.put("/logout.do", new LogoutCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//실행할 Class객체를 찾아주는 부분
		//hashMap의 키값인 문자열 ".xxxxx"를 만드는 과정
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());
		
		Command commandImpl = cont.get(path);
		commandImpl.execute(request, response);	
	}

}
