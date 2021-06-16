package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.user.BoardListAction;
import action.user.UserAction;

@WebServlet("/")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String now_address = javax.servlet.http.HttpUtils.getRequestURL(request).toString();		
		String[] url = now_address.split("/");
		
		
//		http://localhost:8081/master/a/baeldung블로그의 코틀린 fuel 설명/https://www.baeldung.com/kotlin/fuel
		
		String master = url[3];
		
		for (int x=0; x < url.length; x++) {
			System.out.println(url[x]);
		}
		
		
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/index.jsp");
//		request.setAttribute("master", master);
//		rd.forward(request, response);
		
		
//		String cmd = request.getParameter("cmd");
//		
//		Action action = null;
//		
//		try {
//			
//			if (cmd.equals("user")) {
//				action = new UserAction();
//			}else if (cmd.equals("board")) {
//				action = new BoardListAction();
//			}
//			
//			action.excute(request, response);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
