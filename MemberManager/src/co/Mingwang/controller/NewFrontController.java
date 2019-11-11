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
import co.Mingwang.command.board.BoardListCommand;
import co.Mingwang.command.board.BoardReadCommand;
import co.Mingwang.command.board.BoardWriteCommand;
import co.Mingwang.command.board.BoardWriteOkCommand;
import co.Mingwang.command.member.IdCheckCommand;
import co.Mingwang.command.member.LoginCommand;
import co.Mingwang.command.member.LoginOkCommand;
import co.Mingwang.command.member.LogoutCommand;
import co.Mingwang.command.member.MemberListCommand;
import co.Mingwang.command.member.NewMemberCommand;
import co.Mingwang.command.member.NewMemberOkCommand;
import co.Mingwang.command.notice.NoticeCommand;
import co.Mingwang.command.notice.NoticeInputCommand;
import co.Mingwang.command.notice.NoticeInputOkCommand;
import co.Mingwang.common.Command;

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
		cont.put("/newMember.do", new NewMemberCommand());
		cont.put("/idCheck.do", new  IdCheckCommand());
		cont.put("/newMemberOk.do", new NewMemberOkCommand());
		cont.put("/memberList.do", new MemberListCommand());
		cont.put("/notice.do", new NoticeCommand());
		cont.put("/noticeInput.do", new NoticeInputCommand());
		cont.put("/noticeInputOk.do", new NoticeInputOkCommand());
		cont.put("/boardList.do", new BoardListCommand());
		cont.put("/boardWrite.do", new BoardWriteCommand());
		cont.put("/boardWriteOk.do", new BoardWriteOkCommand());
		cont.put("/boardRead.do", new BoardReadCommand());
		
		
		
		
		
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
		System.out.println(path);
		
		Command commandImpl = cont.get(path);
		commandImpl.execute(request, response);	
	}

}
