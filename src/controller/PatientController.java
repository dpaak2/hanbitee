package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.test.Bean1;

import domain.PatientBean;
import service.PatientService;
import serviceImpl.MemberServiceImplTest;
import serviceImpl.PatientServiceImpl;
import util.DispathcerServlet;
import util.Separator;

@WebServlet({"/patient.do"}) /*parameter안 에서 String 값을 받는다. url로 바뀐다,@webServlet = tomcat을 뜻함
							배열로 넘기면 여러가지를 선택하고 바꿀수있다.*/
							/*  String[] arr={"1","2"};*/
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;  /*masharling- because controller가 접속하니깐!*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PatientService service= PatientServiceImpl.getInstance();
		PatientBean bean=new PatientBean();
		Separator.init(request, response); /**/
		switch (Separator.command.getAction()) {/*class가 static method 호출, action을 불러옴*/
		case "move":
			/*System.out.println(request+ response+ Separator.command);*/
			DispathcerServlet.send(request, response);
			break;
		case"login": 
			String id =request.getParameter("id");
			String pw=request.getParameter("pw");
			System.out.println("DB가기전 아이디:"+id);
			System.out.println("DB가기전 비번:"+pw);
			bean.setPatID(id);
			try {
				PatientBean temp=service.login(bean);
				System.out.println("DB가기고 난 후 아이디:"+temp.getPatID());
				System.out.println("디비 다녀온 후 비번"+temp.getPatID());

				System.out.println();
				boolean flag=false;
				bean=service.login(bean);
				if(!bean.getPatID().equals("FAIL")&&bean.getPatPass().equals(pw)){
					if(temp.getPatPass().equals(pw)&&temp.getPatPass().equals(pw)){
						System.out.println("===로그인 성공====");
						DispathcerServlet.send(request, response);
					}
					
				}else{
					System.out.println("=====로그인 실패==");
					Separator.command.setPage("loginForm");
					System.out.println("가는 페이지 "+Separator.command.getPage());
					Separator.command.setView();
					DispathcerServlet.send(request, response);
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
		}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
