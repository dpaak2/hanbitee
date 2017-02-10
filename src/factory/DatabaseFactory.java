package factory;

import java.sql.Driver;

import constants.Database;
import domain.DatabaseBean;
import enums.Vendor;

public class DatabaseFactory { //static으로 잡는다
	public static DatabaseBean createDatabase(
			Vendor vendor,String username,String password){
		String driver="";
		String url="";
		/*앞에서 결정해 주어야한다*/
		switch(vendor /*객체를 가져와야한다*/){
		case DB2 :
			driver=Database.DB2_DRIVER;
			url=Database.DB2_URL;
			break;
		case ORACLE  : 
			driver=Database.ORACLE_DRIVER;
			url=Database.ORACLE_URL;
			break;
		case MSSQL  :
			break;
		case MYSQL  :
			driver=Database.MYSQL_DRIVER;
			url=Database.MYSQL_URL;break;
		case MARIADB : break;
		default:break;
		}
		//return new DatabaseBean(driver,url,username,password); //databaseBean 목적은 
		DatabaseBean db=new DatabaseBean(driver,url,username,password); // db는 get connection을 가지고 있다. overloading
		return db;
	} //Eric 개발한것 

}
