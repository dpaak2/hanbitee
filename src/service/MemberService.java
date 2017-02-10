package service;

import domain.MemberBean;

public interface MemberService {
	 public void join(MemberBean member) throws Exception; //회원가입
	 public MemberBean findById(String id) throws Exception ; //아이디 찾는것
	 public boolean login(MemberBean member)throws Exception; //로그인
	 public void change(MemberBean member)throws Exception; //회원정보 변경
	 public void remove(MemberBean member)throws Exception; //탈퇴

}
