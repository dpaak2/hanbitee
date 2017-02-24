package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import constants.Board;
import domain.ArticleBean;
import service.BoardService;
import serviceImpl.BoardServiceImpl;
import util.DispathcerServlet;
import util.Separator;

@WebServlet("/board.do")
public class BoardConttoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		Separator.init(request, response);
		switch (Separator.command.getAction()) {
		case "move":
			System.out.println("check"+request+ response+Separator.command);
			DispathcerServlet.send(request, response);
			break;
			default:
			break;
		}
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
