package service;
import domain.MemberBean;
public interface AdminService2 {
	//create
	 public void resgist(MemberBean member);
	 //read
	 public MemberBean[]/*객체를 여러개 받는 방법*/ findByName(String name);
	 public MemberBean findById(String id);
	 public MemberBean[] list(); //회원들을 다 볼수있는것
	 public int count();
	 //update
	 public void changeRank(MemberBean member);
	 //delete
	 public void remove(String id);
	 //util
	 //validation
	 public boolean exist(String keyword);
	 public int countByName(String name);
}
