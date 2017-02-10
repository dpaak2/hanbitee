package domain;

import java.sql.Connection; // API =connection은 interface이다 interface는 객체를 생성할수없다. 
import java.sql.DriverManager; 

import constants.Database;

public class DatabaseBean {
	private String driver, url, username, password;
	private Connection connection;

	public DatabaseBean(String driver, String url, String username, String password) {
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	public Connection getConnection() {
		Connection c=null;
		/*Connection c =new Connection(); 처음에 method를 접한경우 이걸 먼저 치고 */
		/*error 뜨는 경우가 있다.error를 해결한다 
		 * why error?
		첫번째는  overloading 생성자 parameter 있는경우.. 
		두번째는  type이 맞지 않는다. Connection은 이 자체가 interface이기 때문에 객체를 생성할수 없다.
		생성자 overloading default 제거 되어있냐??
		3.deco pattern -객체로 던졌냐?*/
		try{
			Class.forName(Database.ORACLE_DRIVER);
			connection=DriverManager.getConnection(Database.ORACLE_URL,Database.USERNAME,Database.PASSWORD); //중복되서 사용되고
        }catch(Exception e){
        	e.printStackTrace();
        }
		return connection; //conenction으로 리턴해주네!
	}

}
