package dao;

import domain.PatientBean;

public interface PatientDAO  {
	 public int insert(PatientBean patient)throws Exception; //회원가입
	 public PatientBean selectById(String id)throws Exception; //아이디 찾는것
	 public int update(PatientBean patient)throws Exception; //회원정보 변경, query문으로 주로 작성
	 public int delete(PatientBean patient)throws Exception; //탈퇴

}
