package dao;

import domain.DoctorBean;
import domain.PatientBean;

public interface DoctorDAO  {
	 public int insert(DoctorBean doctor)throws Exception; //회원가입
	 public DoctorBean selectById(String id)throws Exception; //아이디 찾는것
	 public int update(DoctorBean doctor)throws Exception; //회원정보 변경, query문으로 주로 작성
	 public int delete(DoctorBean doctor)throws Exception; //탈퇴

}
