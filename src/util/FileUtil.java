package util;
import java.util.*;
import java.io.*;
public class FileUtil {
	public static void main(String[] args) { 
		Scanner s= new Scanner(System.in);
		File file=new File("C:\\Users\\hb2007\\eclipse\\jee-neon\\eclipse\\test.txt");
		try {
			BufferedWriter writer =new BufferedWriter(new FileWriter(file,true)); //writer는 (new FileWriter(file,true))이 객체를 사용한다.- true를 주면 uphand가 된다
			BufferedReader reader=new BufferedReader(new FileReader(file));
			String msg="";
			while(true){
				System.out.println("[메뉴]0.종료 1.쓰기 2.읽기");
				switch(s.next()){
				case "0" : 
					writer.close();
					return;
				case "1": 
					System.out.println("메세지 입력");
					writer.write(s.next());
					writer.newLine();
					writer.flush(); /*물내리는것, 클로즈 개념 , 반드시 해주어야함*/
					break;
				case "2":
					System.out.println("메세지 보기");
					while ((msg=reader.readLine())!=null) {
						System.out.println(msg);
					}
					reader.close();
					break;
				
				}
			}
			
		} catch (Exception e) {//multi Exception쓰지 않음. /IOException e(multi exception)
			
			e.printStackTrace(); //죽은 이유를 쓰라고함 
		}
		
	}

}
