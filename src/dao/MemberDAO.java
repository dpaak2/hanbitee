package dao;

import domain.MemberBean;

public interface MemberDAO  {
	 public void insert(MemberBean member)throws Exception; //회원가입
	 public MemberBean selectById(String id)throws Exception; //아이디 찾는것
	 public void update(MemberBean member)throws Exception; //회원정보 변경, query문으로 주로 작성
	 public void delete(MemberBean member)throws Exception; //탈퇴

}
