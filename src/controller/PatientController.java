package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DispathcerServlet;
import util.Separator;

@WebServlet({"/patient.do"}) /*parameter안 에서 String 값을 받는다. url로 바뀐다,@webServlet = tomcat을 뜻함
							배열로 넘기면 여러가지를 선택하고 바꿀수있다.*/
							/*  String[] arr={"1","2"};*/
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;  /*masharling- because controller가 접속하니깐!*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Separator.init(request, response); /**/
		switch (Separator.command.getAction()) {/*class가 static method 호출, action을 불러옴*/
		case "move":
			/*System.out.println(request+ response+ Separator.command);*/
			DispathcerServlet.send(request, response);
		
			break;
		default:
			break;
		}
		}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
