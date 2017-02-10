package dao;
import java.sql.*;
import java.util.*;
import constants.Database;
import domain.DatabaseBean;
import domain.MemberBean;
import enums.Vendor;
import factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO {
	public static MemberDAOImpl getInstance() {
		return new MemberDAOImpl();
	} /*Singleton pattern-어떤 아이디로 로그인한 녀석이 주인공 이렇게 하면 로그아웃하고 다시 로그인하여도 같은아이다 */

	@Override
	public void insert(MemberBean member)throws Exception{
		DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeUpdate(String.format("INSERT INTO Member(id,name,ssn,email,phone,password,profileImg,rank) values(", member.getId(),member.getName(),member.getSsn(),member.getEmail(),member.getPhone(),member.getPassword(),member.getProfileImg(),member.getRank()));
	}

	@Override
	public MemberBean selectById(String id) throws Exception {
		MemberBean member=new MemberBean();
		String sql= String.format("select * from member where id= %s", id); /*무조건 sql을 준다*/
			Statement  stmt= DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()){ //set이지만 if문을 쓴다 if는 break를 쓴거와 같다.
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name")); //type에는 뭐가 들어있는지 모르니깐 String 준다
				member.setSsn(rs.getString("ssn"));
				member.setPassword(rs.getString("password"));
				member.setProfileImg("profileImg");
				member.setPhone(rs.getString("phone"));
				member.setEmail(rs.getString("email"));
				member.setRank(rs.getString("rank"));
				
			}
		return member;
	}

	@Override
	public boolean login(MemberBean member)throws Exception {
		
		String sql=String.format("select password from MEMBER where id= %s and %s",member.getId(),member.getPassword());
			Statement stmt= DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()){
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
			}
		return false;
	}

	@Override
	public void update(MemberBean member)throws Exception {
		String sql=String.format("UPDATE Member SET id='%s',"
				+ ",name='%s'"
				+ ",ssn='%s'"
				+ ",email='%s',"
				+ "phone='%S',"
				+ "password=%s,"
				+ "profileImg=%s,"
				+ "rank=%s))",member.getId());
			Statement stmt= DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
			stmt.executeUpdate(sql);
	}

	@Override
	public void delete(MemberBean member)throws Exception {
		String sql= String.format("%s", "");
			Statement stmt= DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
			stmt.executeUpdate(sql);
	}

}
