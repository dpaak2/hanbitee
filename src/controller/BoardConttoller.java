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
import java.util.*;

@WebServlet("/board.do")
public class BoardConttoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		Separator.init(request, response);
		ArticleBean bean=new ArticleBean(); 
		BoardService service= BoardServiceImpl.getIsntance();
		System.out.println("게시판 서블릿");
		List<ArticleBean> list=new ArrayList<>();
		switch (Separator.command.getAction()) {
		case "move":
			System.out.println("check"+request+ response+ Separator.command);
			DispathcerServlet.send(request, response);
			break;
		case"list":
			System.out.println("보드리스트 진입"+request+response);
		
			
			try {
			list=service.list();
				int rowCount=5;
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		/*	int card=service.count();*/
			request.setAttribute("count", list.size());
			request.setAttribute("list", list);
		/*	int pageCount=(card%rowCount==0)?card /rowCount:(card /rowCount)+1;*/
			DispathcerServlet.send(request, response);
			break;
		case "detail": 
			System.out.println("check"+request+ response+ Separator.command);
			String seq=request.getParameter("seq");
			bean.setSeq(seq);
			try {
				bean =service.findOne(bean);
				request.setAttribute("article", bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DispathcerServlet.send(request, response);
		  break;
		}
	}

}
