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
public class BoardContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		Separator.init(request, response);
		ArticleBean bean=new ArticleBean(); 
		BoardService service= BoardServiceImpl.getIsntance();
		System.out.println("게시판 서블릿");
		List<ArticleBean> list=new ArrayList<>();
		switch (Separator.command.getAction()){
		case "move":
			System.out.println("check"+request+ response+ Separator.command);
			DispathcerServlet.send(request, response);
			break;
		case"list":
			System.out.println("보드리스트 진입"+request+response);
			String strPageNO=request.getParameter("pageNO");
			System.out.println("화면에서 넘어온PAGE NO:"+strPageNO);
			int rowCount=5;
			int pageNO=Integer.parseInt(strPageNO);
			int pageStart=(pageNO-1)*rowCount+1;
			int pageEnd=pageNO*rowCount;
			int [] pageArr={pageStart,pageEnd};
			int count=0;
			try {
				list=service.list(pageArr);
				count=service.count();
			} catch (Exception e) {
				e.printStackTrace();
			}
			int pageCount=0;
			if(count%rowCount==0){
				pageCount=count/rowCount;
			}else{
				pageCount=count/rowCount+1;
			}
			
			/*int block= count/rowCount;*/
			int blockSize=5;
			int blockCount=pageCount/blockSize;
			int blockStart=pageNO-((pageNO-1)%blockSize);
			int prevBlock=blockStart-blockSize;
			int nextBlock=pageStart+blockSize;
			int blockEnd=0;
			blockEnd=blockCount;
			System.out.println("블록이 항상 참이다:"+(blockStart+rowCount-1));
			System.out.println("페이지 카운트:"+pageCount);
			if((blockStart+rowCount-1) <pageCount){
				blockEnd=blockStart+blockSize-1;
			}else{
				blockEnd=pageCount;
			}
			request.setAttribute("count", count);
			request.setAttribute("list", list);
			request.setAttribute("pageStart", pageStart);
			request.setAttribute("pageEnd", pageEnd);
			request.setAttribute("blockStart", blockStart);
			request.setAttribute("blockEnd", blockEnd);
			request.setAttribute("prevBlock", prevBlock);
			request.setAttribute("nextBlock", nextBlock);
			request.setAttribute("pageNO", pageNO);
		  /*  pageStart= pageStart+rowCount;*/
		
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
				e.printStackTrace();
			}
			DispathcerServlet.send(request, response);
		  break;
		}
	}

}
