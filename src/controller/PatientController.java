package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.taglibs.standard.lang.jstl.test.Bean1;

import domain.PatientBean;
import service.PatientService;
import serviceImpl.MemberServiceImplTest;
import serviceImpl.PatientServiceImpl;
import util.DispathcerServlet;
import util.ParamMap;
import util.Separator;

@WebServlet({"/patient.do"}) /*parameter안 에서 String 값을 받는다. url로 바뀐다,@webServlet = tomcat을 뜻함
							배열로 넘기면 여러가지를 선택하고 바꿀수있다.*/
							/*  String[] arr={"1","2"};*/
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;  /*masharling(의미없는 숫자값?)- because controller가 접속하니깐!*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session= request.getSession(); 
		PatientService service= PatientServiceImpl.getInstance();
		PatientBean bean=new PatientBean();
		Separator.init(request, response);
		switch (Separator.command.getAction()) {/*class가 static method 호출, action을 불러옴*/
		case "move":
			DispathcerServlet.send(request, response);
			System.out.println("path check:"+request+ response+ Separator.command);
			break;
		case"mypage": 
			String birth=service.getBirth(service.getSession().getPatJumin());
			System.out.println("생년월일:"+birth);
			request.setAttribute("birth", birth);
			String age=service.getAge(service.getSession().getPatJumin());
			request.setAttribute("age", age);
			System.out.println("request age"+request.getAttribute("age"));
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
				bean=service.login(bean);
				if(!bean.getPatID().equals("FAIL")&&bean.getPatPass().equals(pw)){
					if(temp.getPatPass().equals(pw)&&temp.getPatPass().equals(pw)){
						System.out.println("===로그인 성공====");
						session.setAttribute("user", temp); /*key의 value 인 map구조이기 때문에(temp에 모든값을 가지고 있다)*/
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
		case "register":
			String patId=request.getParameter("id"); /*parameter안에는 jsp에 있는 이름이랑 같아야 하고 */
			String docId=request.getParameter("docId");
			String nurId=request.getParameter("nurId");
			String email=request.getParameter("email");
			String name=request.getParameter("name");
			String addr=request.getParameter("addr");
			String password=request.getParameter("password");
			String year=request.getParameter("year");
			String month=request.getParameter("month");
			String date=request.getParameter("date");
			String telecom=request.getParameter("telecom");
			String phoneNo1=request.getParameter("phoneNo1");
			String phoneNo2=request.getParameter("phoneNo2");
			String phoneNo3=request.getParameter("phoneNo3");
			String gender=request.getParameter("gender");
			String job=ParamMap.getValues(request, "job"); /*이름이 중요한게 아니라 소스를 보고 logic을 이해해야 한다 static으로 만들었기 떄문에 class로 바로 줄수 있다*/
			ArrayList<String> list=new ArrayList<>(); /*확인용 debugging */
			list.add(patId);
			list.add(docId);
			list.add(nurId);
			list.add(email);
			list.add(password);
			list.add(name);
			list.add(year);
			list.add(month);
			list.add(date);
			list.add(telecom);
			list.add(phoneNo1+"-"+phoneNo2+"-"+phoneNo3);
			list.add(gender);
			list.add(job);
			System.out.println(list);
			String temp=(gender.equals("male"))?"1":"2";
			month=(date.length()==1)?"0"+month:month;
			String patJumin=year.substring(2, 4)+month+date+"-"+temp;
			bean.setPatID(patId);
			bean.setDocID(docId);
			bean.setNurID(nurId);
			bean.setPatName(name);
			bean.setPatAddr(addr);
			bean.setPatEmail(email);
			bean.setPatPass(password);
			bean.setPatGen(gender);
			bean.setPatJumin(patJumin);
			bean.setPatJob(job);
			bean.setPatPhone(phoneNo1+phoneNo2+phoneNo3);
			try {

				int rs= service.join(bean);
				if(service.join(bean)==1){
					System.out.println("=====회원가입 성공=="); /*성공일때는 set page,set view가 필요없다*/
					DispathcerServlet.send(request, response); /*캔트백 이 이렇게 하자고 함 */
				}else{
					System.out.println("=====회원가입 실패==");
					Separator.command.setPage("registerForm"); /*실패하면 가게 되는 page*/
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
