package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.DispathcerServlet;
import util.Separator;

@WebServlet("/home.do") /*directory*/
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Separator.init(request, response);
		Separator.init(request, response);
		switch (Separator.command.getAction()) {
		case "move": /*jsp에 action=move&... (...에 있는경로로 가라)*/
			DispathcerServlet.send(request, response);
			break;
		case "logout": 
			session.invalidate();
			System.out.println("complete logout");
			DispathcerServlet.send(request, response);
			break;
		default:
			break;
		}
	}

}
