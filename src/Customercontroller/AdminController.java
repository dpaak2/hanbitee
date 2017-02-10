package Customercontroller;

import java.util.*;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AdminService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.AdminServiceImpl;
import enums.Butt;

public class AdminController {
	public void start(){
		  MemberBean member=null;
	      AdminService service=new AdminServiceImpl();
			String ssn="";
			String uid="";
			int i=0;
			Butt[] buttons= {Butt.CLOSE,Butt.MEM_ADD,Butt.FIND_BY_ID
					,Butt.FIND_BY_NAME,Butt.LIST,Butt.RANK,Butt.DELETE};
			while(true){
			Butt select =(Butt)JOptionPane.showInputDialog(
					null, //frame
					"ADMIN PAGE", //frame title
					"SELECT ADMIN MENU", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons,//Array of choices
					buttons[1]);//default;
		
				/*int flag=(s.nextInt())*/
				switch(select){
				case CLOSE: return; //enum으로 정리하고 static을 점유하지 않음, 이렇게 하면 실수가 적어짐
				case MEM_ADD:
					member =new MemberBean();
					String[] strArr=JOptionPane.showInputDialog("ID,이름").split(",");
					member.setId(strArr[0]);
					member.setName(strArr[1]);
					service.resgist(member);
					/*String[] adminInfoArr=adminInfo.split(",");
					member.setName(JOptionPane.showInputDialog(adminInfoArr[0]));
					member.setPassword(JOptionPane.showInputDialog(adminInfoArr[1]));
					member.setEmail(JOptionPane.showInputDialog(adminInfoArr[2]));
					member.setPhone(JOptionPane.showInputDialog(adminInfoArr[3]));
					*/
					JOptionPane.showMessageDialog(null,service.count()+"명 등록됨");
					//현재 회원수는 3명입니다.
					break;
				case FIND_BY_ID:
					String keyword= JOptionPane.showInputDialog("ID를 입력하세요.");
					if(keyword.equals(service.mapFindByName(keyword))){
						JOptionPane.showMessageDialog(null,service.findById(keyword).toString());
					}else{
						JOptionPane.showMessageDialog(null,"존재하지 않는 ID입니다.");
					}
					break;
				case FIND_BY_NAME:
					String name= JOptionPane.showInputDialog("이름을 입력하세요.");
					if(name.equals(service.mapFindByName(name))){
						JOptionPane.showMessageDialog(null,service.findByName(name).toString());
					}else{
						JOptionPane.showMessageDialog(null,"존재하지 않는 이름 입니다.");
					}
					break;
		
				case LIST: //회원이 없습니다. 
					if(service.count()==0){
						JOptionPane.showMessageDialog(null,"존재하지 않는 ID입니다.");
					}else{
						JOptionPane.showMessageDialog(null, service.memberlist().toString());
					}
					break;
				case RANK:
					member =new MemberBean();
					member.setId(JOptionPane.showInputDialog("ID?"));
					member.setName(JOptionPane.showInputDialog("NAME?"));
					member.setPhone(JOptionPane.showInputDialog("PHONE?"));
					member.setEmail(JOptionPane.showInputDialog("EMAIL?"));
					service.update(member);
					break;
				case DELETE:
					String remove= JOptionPane.showInputDialog("삭제할 ID를 입력하여 주세요.");
					service.remove(remove);
					JOptionPane.showMessageDialog(null, "삭제가 성공되었습니다.");
					break;
			   }
			}
		}
}