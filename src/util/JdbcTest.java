package util;
import java.sql.*;
import constants.Database;
import domain.DatabaseBean;
public class JdbcTest {
	public String getName(){
		String rs="";
		try {
			Class.forName(Database.ORACLE_DRIVER); //setter ,생성자에 들어가야한다
			Connection /*필드에 박고 */connection= DriverManager.getConnection(
					Database.ORACLE_URL,
					Database.USERNAME,
					Database.PASSWORD //초기화 생성자로 들어가야 한다.
					);
		Statement stmt= connection.createStatement();
			String sql="SELECT*FROM Member WHERE id='hong'";
			ResultSet set=stmt.executeQuery(sql); //excutequery =select 문을 전송
			while(set.next()){
				rs= set.getString("name"); //sql문에서 가지고 온것
			}
			
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		return rs;
	}
	

}
