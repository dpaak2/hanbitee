package dao;
import java.sql.*;
import java.util.*;
import constants.Database;
import domain.DatabaseBean;
import domain.MemberBean;
import enums.Vendor;
import factory.DatabaseFactory;

public class MemberDAOImpl2 implements MemberDAO {
	private  String result, sql;
	private	Statement stmt ; //dao에서 db로 보낼때 필요한것!! 
	private Connection connection;  //C S R 이 결정되면 생성자에서 초기화 시켜준다.
	private ResultSet set;
	
	public MemberDAOImpl2(){ //default 생성자 ,default constructor
		/*2.DatabaseFactory dbfactory= new DatabaseFactory();
		3.*아직 완성되지 않음 DatabaseFactory dbfactory= DatabaseBean createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD);
		DatabaseBean data2=dbfactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD);
		1.DatabaseBean data=new DatabaseBean(Database.ORACLE_DRIVER,Database.ORACLE_URL,Database.USERNAME,
				Database.PASSWORD);
		connection=data2.getConnection(); -factory pattern 과정*/
		
		try {	
			DatabaseBean db=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD);
			connection=db.getConnection();
			
			stmt=connection.createStatement(); //sql문을 전송할수있는 statement 객체를 생성한다.
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void insert(MemberBean member) {
		
	}

	@Override
	public MemberBean selectById(String id) {
		MemberBean member=new MemberBean();
		
	    try {
	         /*sql="SELECT * FROM member WHERE id ='"+id+"'";*/
	         set = stmt.executeQuery(String.format("SELECT * FROM member WHERE id ='%s'",id));
			while(set.next()){ //memberBean의 setName은 set.getString (DB의 name이다)
				member.setName(set.getString("name"));//NAME= DB의 ATTRIBUTE  
			}
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public boolean login(MemberBean pw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

}
