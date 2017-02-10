/*package Customercontroller;

import java.util.Scanner;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AdminService2;
import serviceImpl.AccountServiceImpl;
import serviceImpl.AdminServiceImpl2;

public class AdminController2 {
	public void start(){
		  MemberBean member=null;
	      AdminService2 service=new AdminServiceImpl2();
			String ssn="";
			String uid="";
			int i=0;
			while(true){
				int flag=(s.nextInt())
				switch(JOptionPane.showInputDialog("0.종료,1.회원등록,2.ID검색,3.이름 검색,4.목록 조회,5.등급조정,6.삭제")){
				case "0": return;
				case "1":
					member =new MemberBean();
					String[] strArr=JOptionPane.showInputDialog("ID,이름").split(",");
					member.setUid(strArr[0]);
					member.setName(strArr[1]);
					service.resgist(member);
					String[] adminInfoArr=adminInfo.split(",");
					member.setName(JOptionPane.showInputDialog(adminInfoArr[0]));
					member.setPassword(JOptionPane.showInputDialog(adminInfoArr[1]));
					member.setEmail(JOptionPane.showInputDialog(adminInfoArr[2]));
					member.setPhone(JOptionPane.showInputDialog(adminInfoArr[3]));
					
					JOptionPane.showMessageDialog(null,service.count()+"명 등록됨");
					//현재 회원수는 3명입니다.
					break;
				case "2":
					String keyword= JOptionPane.showInputDialog("ID를 입력하세요.");
					if(service.exist(keyword)){
						JOptionPane.showMessageDialog(null,service.findById(keyword).toString());
					}else{
						JOptionPane.showMessageDialog(null,"존재하지 않는 ID입니다.");
					}
				
					JOptionPane.showMessageDialog(null,
							service.findById(JOptionPane.showInputDialog("ID를 입력하세요")).toString());
						
					break;
				case "3":
					String result=JOptionPane.showInputDialog("이름을 입력하세요.");
					if(service.exist(result)){
						MemberBean[] list=service.findByName(result);
						for(i=0;i<service.count();i++){
							JOptionPane.showMessageDialog(null, service.findByName(result).toString());
							break;
						}
					}else{
						JOptionPane.showMessageDialog(null,"존재하지 않는 이름 입니다.");
					}
					
					break;
				case "4": //회원이 없습니다. 
					if(service.count()==0){
						JOptionPane.showMessageDialog(null,"존재하지 않는 회원입니다."); // 유호성 check
					}else{
						MemberBean[] arr=service.list();
						String result2="";
						for(i=0;i<service.count();i++){
							 result2+= arr[i].toString()+"\n";
						}
						JOptionPane.showMessageDialog(null,result2);
					}
					
					 MemberBean[] arr =service.list();
					service =new AdminServiceImpl();
					JOptionPane.showMessageDialog(null,arr[0].getName());
					 //회원 배열 불러와야함 
				
					break;
				case "5":
					String temp2=JOptionPane.showInputDialog("ID,Rank?");
					String[]tempArr=temp2.split(",");
					member.setUid(tempArr[0]);
					member.setRank(tempArr[1]);
					service.changeRank(member);
					break;
				case "6":
					String remove= JOptionPane.showInputDialog("삭제할 ID를 입력하여 주세요.");
					service.remove(remove);
					JOptionPane.showMessageDialog(null, "삭제가 성공되었습니다.");
					break;
			   }
			}
		}

}
*/