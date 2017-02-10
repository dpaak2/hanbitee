package serviceImpl;

import domain.AccountBean;
import service.AccountService;
import util.RandomGenerator;

import java.util.Calendar;

import constants.Account;

public class AccountServiceImpl implements AccountService {
	AccountBean[] list;
	public AccountServiceImpl(){
		list =new AccountBean[10000]; //사람 몸안에 넣는것과 같다 //은행의 기능
	}
	
	@Override
	public boolean checkMoney(int money) {
		return money>=0;
	}
	@Override
	public String deposit(int money) {

		String result=Account.DEPOSIT_FIAL;
		if(checkMoney(money)){
			list[0].setMoney(list[0].getMoney()+money);
			result=Account.DEPOSIT_SUCCESS;
			}
		return result;
	}

	@Override
	public String withdraw(int money) {
		//출금 로직
		String result=Account.WITHDRAW_FAIL;
		if(checkMoney((Integer.parseInt(list[0].getMoney())-money))){
			list[0].setMoney(String.valueOf(Integer.parseInt(list[0].getMoney())-money));
			result=Account.WITHDRAW_SUCCESS;
		}
		return result;
		
	}

	@Override
	public AccountBean createAccount(String uid, String accountType, int money) {
		AccountBean account= new AccountBean();
		account.setAccountNo(String.valueOf((RandomGenerator.getRandomNum(100000, 999999))));
		account.setCreateDate(Calendar.getInstance().get(Calendar.YEAR)+"년"
				+Calendar.getInstance().get(Calendar.MONTH)+1+"월"
				+Calendar.getInstance().get(Calendar.DATE) +"일"
				);
		account.setUid(uid);;
		account.setAccountType(accountType);
		account.setMoney (String.valueOf((money)));
		list[0]=account;
		return account;
	}

	@Override
	public AccountBean findByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void drop(String accoutnNo) {
		// TODO Auto-generated method stub
		
	}

}
