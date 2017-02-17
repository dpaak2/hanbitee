package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do") /*url로 바뀐다*/
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;  /*masharling- because controller가 접속하니깐!*/
  
    public MemberController() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==========서블릿 진입성공==========");
		RequestDispatcher rd= request.getRequestDispatcher("/jsp/cutomer/patLoginForm.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
