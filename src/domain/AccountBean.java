package domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.swing.JOptionPane;

import util.RandomGenerator;

public class AccountBean implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String uid, accountType, createDate, money ,accountNo;
	protected int createAccountNo;
	public AccountBean(){}   //over loading 
	public void setAccountNo(String accountNo) {
		this.accountNo=accountNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setMoney(String money) {
	 this.money=money;
	}

	public String getMoney() {
		return money;
	}


	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}
	
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public String getAccountType() {
		return accountType;
	}
    public void setCreateDate(String creatDate){
    	this.createDate=creatDate;
    }
    public String getCreateDate(){
    	return createDate;
    }

	@Override
	public String toString() {
		return String.format("%d [%s] %s %s ￦ %d"
				,accountNo
				,accountType
				,uid,createDate,money
				);
	}
}
