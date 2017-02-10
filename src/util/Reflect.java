package util;
import java.lang.reflect.*;
import java.util.*;
import domain.DatabaseBean;
public class Reflect {
	public static void main(String[] args) {
		String databaseBean="";
		
		try {
			/*Class.forName("DatabaseBean");
			property는 접수되지 않았지만 set의 개념을 가지고 있다- setter의 기능을 가지고있다, 값을 받아주는것 */
			Class klass= Class.forName("DatabaseBean");//getter 
			Method[] arr= klass.getDeclaredMethods();
			Set <String> set=new HashSet<String>();
			for(Method s: arr){
				set.add(s.getName());
			}
			System.out.println(set.toString());
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
