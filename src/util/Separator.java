package util;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Command;
import factory.CommandFactory;
public class Separator {
	public static CommandFactory factory=new CommandFactory();
	public static Command command;
	public static void init(/**/
			HttpServletRequest request, HttpServletResponse response){ /*두개를 쪼개는 역활*/
		String path=request.getServletPath(); /*request가 걸어온길 /patient.do*/
		System.out.println("===="+path); 
		/*	/patient.do?action=move&page=registerForm*/
		/*String directory=path.substring(0,path.indexOf("."));*/
		String directory=path.split("\\.")[0];/*path를 .을 기준으로 split 를 쳤을때 0번과 1번이 있는데 index0번의 값을 주겠다.*/
		String action=request.getParameter("action");/*action인 아이를 데려와 */
		String page=request.getParameter("page");
		command= factory.createCommand(directory, action, page);
	}
}
