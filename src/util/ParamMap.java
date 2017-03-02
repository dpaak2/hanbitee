package util;

import javax.servlet.http.HttpServletRequest;

public class ParamMap { /*check box를 할때 쓰는것 db에 [,] 빼고 값만 들어간다*/
	public static String getValues(HttpServletRequest request,String name){/*request는 servelet의 구조 servelet request로 불러와야 한다*/
		String rs="";
		String[] values=(String[])request.getParameterMap().get(name); 
		//StringBuffer buff /*임시값*/= new StringBuffer(); /*fetch다음에는 MBR연산해서 buffer에 담는다 return 해서 다시 memory로 할당한다 */
		for(String s:values){
			rs=s+",";
		}
		//System.out.println("버퍼에 담긴 내용"+buff);
	    rs=rs.substring(0,rs.length()-1);
		return rs;
	}
}
