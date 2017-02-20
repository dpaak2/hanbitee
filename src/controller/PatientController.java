package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/patient/loginForm.do","/patient/registerForm.do"}) /*parameter안 에서 String 값을 받는다. url로 바뀐다,@webServlet = tomcat을 뜻함
							배열로 넘기면 여러가지를 선택하고 바꿀수있다.*/
							/*  String[] arr={"1","2"};*/
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;  /*masharling- because controller가 접속하니깐!*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	System.out.println("==========서블릿 진입성공==========");
		String path=request.getServletPath();
		System.out.println("리퀘스트 객체가 걸어온 길"+path);*/
		
		String action[]= getAction(request.getServletPath());
		switch (action[1]) {
		case "loginForm":
			System.out.println(action[0]+action[1]+action[2]);
			request.getRequestDispatcher(action[0]+action[1]+action[2]).forward(request, response);
			break;
		case"registerForm":
			System.out.println("registerForm: "+action[0]+action[1]+action[2]);
			request.getRequestDispatcher(action[0]+action[1]+action[2]).forward(request, response);
			break;

		default:
			break;
		}
		}
	private String[] getAction(String path) throws ServletException, IOException{
		String [] action=new String [3];
		String[] arr1=path.split("\\.");
		String []arr2= arr1[0].split("/");
	/*배열의[0]/[1]patient/[2]loginForm.do*/
		//split 으로 patient,loginForm 을 분리시켜서 아래에 담으세요
		
		action[0]="/WEB-INF/jsp/"+arr2[1]+"/";/*patient*/
		action[1]=arr2[2]; /*loginForm*/
		action[2]=".jsp";
	
		
	
		return action;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
