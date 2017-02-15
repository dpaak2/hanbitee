package util;
import daoImpl.MemberDAOImpl;
import domain.MemberBean;
public class DaoTest {
	public static void main(String[] args) {
		MemberBean member= new MemberBean();;
		try {
			member = MemberDAOImpl.getInstance().selectById("hong");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("회원이름: %s" ,member.getName());
	}
}
