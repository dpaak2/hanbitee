package service;

import domain.PatientBean;

public interface PatientService {
	 public int join(PatientBean patient) throws Exception; //회원가입
	 public PatientBean findById(String id) throws Exception ; //아이디 찾는것
	 public PatientBean login(PatientBean patient)throws Exception; //로그인
	 public PatientBean logout() throws Exception; //로그아웃
	 public int change(PatientBean patient)throws Exception; //회원정보 변경
	 public int remove(PatientBean patient)throws Exception; //탈퇴

}
