package service;
import domain.MemberBean;
import java.util.*;
public interface AdminService {
	//create
	 public void resgist(MemberBean member); //map 에 담음-> map은 database로 된다.
	 //read
	 public MemberBean findById(String id); //조회는 list로 만듬 데이터 전달은 sequance로 던짐
	 public List<MemberBean> findByName(String name);/*객체를 여러개 받는 방법 하나만 찾는것은 list 로 받지 않고 객체로 받는다*/ 
	 public Map<String,MemberBean> mapFindByName(String name);
	 public List<MemberBean> memberlist();  //sequance 개념이 필요 
	 public List<String> keylist();
	 public int count();
	 //update
	 public void update(MemberBean member);
	 //delete
	 public void remove(String id);

}
