package view;

import javax.swing.JOptionPane;

import Customercontroller.AdminController;
import Customercontroller.CustomerController;
import enums.Butt;
import enums.IndexButt;
public class Index {
	public static void main(String[]args){
	IndexButt[] ibArr={IndexButt.EXIT,IndexButt.USER,IndexButt.ADMIN};
	IndexButt select =(IndexButt)JOptionPane.showInputDialog(
			null, //frame
			"INDEX PAGE", //frame title
			"SELECT INDEX MENU", //order
			JOptionPane.QUESTION_MESSAGE, //type
			null, //icon
			ibArr,//Array of choices
			ibArr[1]);//default;
			switch (select){
			case EXIT :return;
			case USER:
				new CustomerController().start();
				break;
			case ADMIN:
				new AdminController().start();
				break;
			}
		
		}
	
	}

