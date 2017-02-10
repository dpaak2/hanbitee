package serviceImpl;

import javax.swing.JOptionPane;
import java.util.*;
import domain.MemberBean;
import service.AdminService;
import service.MemberService;

public class AdminServiceImpl implements AdminService { //관리자는 member를 관리하여 주는곳 , 회원수 조회, 자료구조
	private Map<String,MemberBean> map;
	public AdminServiceImpl(){
		map=new HashMap <String,MemberBean>();  //생성자 초기화 작업
	}
	@Override
	public void resgist(MemberBean member) {
     	map.put(member.getId()/*key-ID를 유니크한 키값을 지정하고(특정위치-ex)강남역) */, member/*value-instance의 값은 id로 찾는다*/);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> list=this.memberlist(); //list로 리턴 받는다
		for(MemberBean m:list){     //확장형 for(int i=0;i<art.size();i++){}
			if(name.equals(m.getName())){
				list.add(m);
			}
		}
		return list;
	}
	
	@Override
	public MemberBean findById(String id) {
		/*List<MemberBean> list =new ArrayList<MemberBean>();
		MemberBean member=new MemberBean();
		list=this.list();
		for(MemberBean m:list){
			if(id.equals(m.getId())){
				member=m;
				break;
			}
		}
		return list;*/
		/*return(map.containsKey(id))?map.get(id):null;*/
		return map.get(id);
	}
	@Override
	public List<MemberBean> memberlist(){
		List<MemberBean> list=new ArrayList<MemberBean>();
		for(Map.Entry<String, MemberBean>e:map.entrySet()){
			list.add(e.getValue());
		}
		return list;
	}
	@Override
	public int count() {
		return map.size(); //몇개가 있는지를 반환해주는것 이다 그리고 이자체가 int값을 반는것이다.
	}
	@Override
	public void update(MemberBean member) {
		List<MemberBean> list=this.memberlist();
		for(MemberBean m:list){
			if(member.getId().equals(m.getId())){
				m.setName((member.getName().equals(""))?member.getName():member.getName());
				m.setPhone((member.getPhone().equals(""))?member.getPhone():member.getPhone());
				m.setEmail((member.getEmail().equals(""))?member.getEmail():member.getEmail());
			}
		}
	}
	@Override
	public void remove(String id) {
		MemberBean member=new MemberBean();
		List<MemberBean> list= new ArrayList<MemberBean>();
		map.remove(id);
	}
	@Override
	public Map<String, MemberBean> mapFindByName(String name) { //보관
		Map<String,MemberBean> temp=new HashMap<String,MemberBean>();
		for(Map.Entry<String, MemberBean> e:map.entrySet()){
			if(name.equals(e.getValue().getName())){
				temp.put(e.getKey(),e.getValue());
			}
		}
		
		return null;
	}
	@Override
	public List<String> keylist() { //key값 만 가지고 있다. 
		List<String> list=new ArrayList<String>();
		  for(Map.Entry<String,MemberBean>e: map.entrySet()){
			 list.add(e.getKey());
		 }
		return list;
	}
}
