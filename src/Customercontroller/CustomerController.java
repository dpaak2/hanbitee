package Customercontroller;
import java.util.Scanner;
import javax.swing.*;
import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import constants.Bank;
import serviceImpl.AccountServiceImpl;
public class CustomerController {
	@SuppressWarnings("null")
	public void start(){
	Scanner s=new Scanner(System.in);
	  MemberBean member=null;
      AccountBean account=null;
      service.AccountService service=new AccountServiceImpl();
		String ssn="";
		String uid="";
		while(true){
			/*int flag=(s.nextInt())*/
			switch(JOptionPane.showInputDialog("0.종료,1.회원등록,2.통장개설,3.입금,4.출금,5.조회,6.해지")){
			case "0": return;
			case "1":
				member =new MemberBean();	
				while(true){ 	
					ssn=JOptionPane.showInputDialog("주민번호: ");
					char ch = ssn.charAt(7);
					if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
						/*System.out.println("다시 입력하세요");*/
						JOptionPane.showMessageDialog(null, "다시 입력하세요");
					}else{
						break;
					}
				}
				member.setSsn(ssn);
				member.setId(JOptionPane.showInputDialog("아이디:"));
				member.setName(JOptionPane.showInputDialog("이름:"));			
				/*System.out.println(member.getName()+"("+member.calcGender(gender)+")");*/
				JOptionPane.showMessageDialog(null, member.getName()+"님 회원 등록되었습니다.");
				
				break;
			case "2":
				
				while(true){
					uid=JOptionPane.showInputDialog("아이디: ");
								
					if(member.getId().equals(uid)){
						break;
					}
				}
				int accountNo=0;//6자리 랜덤숫자
				String date ="";//오늘 날짜
				String name="";
				int money=0;
				String accountType="저축예금";
				account=service.createAccount(uid, accountType, money);
				JOptionPane.showMessageDialog(null,account.toString());
				/*[한빛뱅크] 123456 
				 * 예금종류:저축예금 송상훈님 
				 * 가입일:2016년12월14일
				 * 잔액:￦0 */				
				break;
			case "3": //입금
				service.deposit(Integer.parseInt(JOptionPane.showInputDialog("입금할 금액의 액수를 입력하여 주세요.")));
				JOptionPane.showMessageDialog(null, account.getMoney()+"원 이 입금되었습니다.");
				break;
			case "4": //출금
				JOptionPane.showMessageDialog(null,
						service.withdraw(Integer.parseInt(
								JOptionPane.showInputDialog("출금할 금액의 액수를 입력하여 주세요 "))));
						
				break;
			case "5":
				JOptionPane.showMessageDialog(null,"잔여 금액은"+account.getMoney()+"입니다");
				break;
			case "6":break;
			}
		}
	}
}
