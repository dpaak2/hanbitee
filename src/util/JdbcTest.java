package util;
import java.sql.*;
import constants.Database;
public class JdbcTest {
	public static void main(String[] args) {
		try {
			Class.forName(Database.ORACLE_DRIVER); //setter ,생성자에 들어가야한다
			Connection /*필드에 박고 */connection= DriverManager.getConnection(
					Database.ORACLE_URL,
					Database.USERNAME,
					Database.PASSWORD //초기화 생성자로 들어가야 한다.
					);
		Statement stmt= connection.createStatement();
			String sql="SELECT*FROM Member WHERE id='hong'",result="";
			ResultSet set=stmt.executeQuery(sql); //excutequery =select 문을 전송
			while(set.next()){
				result= set.getString("name"); //sql문에서 가지고 온것
			}
			System.out.println("회원이름 "+result);
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
	}

}
