package co.Mingwang.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.Mingwang.command.IndexCommand;
import co.Mingwang.common.Command;

/**
 * Servlet implementation class FrontController
 */
@WebServlet(description = "메인컨트롤러", urlPatterns = { "/FrontController" })
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     HashMap<String, Command> cont = new HashMap<>(); 
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//cont에 url과 실행 Class를 정의하는 부분
		cont.put("/index.do", new IndexCommand()); //메인페이지 호출
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
		
		//요청한 url을 분석하여 실행하는 부분
		request.setCharacterEncoding("utf-8");
		System.out.println("YAA");
		String uri=request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());
		
		Command commandImpl = cont.get(path);
		commandImpl.execute(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
