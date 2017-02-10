/*package serviceImpl;

import javax.swing.JOptionPane;

import domain.MemberBean;
import service.AdminService2;
import service.MemberService;


public class AdminServiceImpl2 implements AdminService2 { //관리자는 member를 관리하여 주는곳 , 회원수 조회, 자료구조
	*//**
	 * DML
	 * CRUD
	 * CREATE :INSERT
	 * READ : SELECT
	 * UPDATE: UPDATE
	 * DELETE: DELETE
	 * BIZ LOGIC짜고 있는것
	 * *//*
	private MemberBean member;
	private MemberBean[] arr;
	private int count; //이 세가지 들이 무조건 필요한다 자료구조  
	public AdminServiceImpl2(){
		member= new MemberBean();
		count= 0;
		arr= new MemberBean[count];  //초기화 작업
	}

	@Override
	public void resgist(MemberBean member) {
		//회원 정보를 입력한후 배열에 저장하기
		if(count == arr.length){
			MemberBean[] temp= new MemberBean[count+10];
			System.arraycopy(arr, 0, temp, 0, count);
			arr =temp;
		}
			arr[count]=member;
			count++; 아래의 것과 같다
		arr[count++]=member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		MemberBean[] list =new MemberBean[countByName(name)];
		//쓸때없이 여러층을 만들면 안됨,똑같은 이름 받은 아이들을 저장하여주려고 만듬
		for(int i=0;i<count;i++){
			if(name.equals(arr[i].getName())){
				list[i]=arr[i];
			}
		}
		return list;
	}

	public int countByName(String name) {
		int nameCount= 0;       //findByName을 위한 카운트
		for(int i=0;i<count;i++){
			if(name.equals(arr[i].getName())){
				nameCount++;
			}
		}
		return nameCount;
	}
	@Override
	public MemberBean findById(String id) {
		MemberBean member=new MemberBean(); //제일 먼저 할일
		for(int i=0;i<count;i++){
			if(id.equals(arr[i].getUid())){
				show information
				member=arr[i];
				break;
			}
		}
		return member;
	}

	@Override
	public MemberBean[] list() {
		// 전체목록 출력
		if(arr.length==0){
			member.setName("회원이 존재하지 않습니다.");
			arr= new MemberBean[count()];
			arr[0]=member;
		}
		arr=new MemberBean[0];
		return arr;
	}

	@Override
	public int count() {
		return count;
	}
	@Override
	public void remove (String id) {
		MemberBean remove=new MemberBean();
		for(int i=0;i<count;i++){
			if(id.equals(arr[i].getUid())){
				arr[i]=arr[count-1]; // 받으 i의 값을 배열의 마지막의 것과 바꾼다 if) arr[i]=arr[count+1]은 덮어쓰는것은 아예없애는것 
				arr[count-1]=null; // 마지막 배열이 null이 되어야 한다
				count--;
				break;
			}
		}
	}

	@Override
	public void changeRank(MemberBean member) {
		MemberBean rank =new MemberBean();
		//로그인한 상태 validation이미 끝난상태
		for(int i=0;i<count;i++){
			if(member.getUid().equals(arr[i].getUid())){
				//관리자가 사용자의 rank를 바꾸는 algorithm
				arr[i].setRank(member.getRank());
			} // else를 할필요가 없다 , 이미 id가 있는 상태이기 때문
		}
	}

	@Override
	public boolean exist(String keyword) { //boolean type은 무조건 branch를 준다
		boolean check=false;
		for(int i=0;i<count;i++){
			if(keyword.equals(arr[i].getUid())){
				check=true;
				break;
			}
		}
		return false;
	
	}

}
*/