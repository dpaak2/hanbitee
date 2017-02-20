package util;
import daoImpl.PatientDAOImpl;
import domain.PatientBean;
public class DaoTest {
	public static void main(String[] args) {
		PatientBean member= new PatientBean();;
		try {
			member = PatientDAOImpl.getInstance().selectById("hong");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	System.out.printf("회원이름: %s" ,member.getName());*/
	}
}
