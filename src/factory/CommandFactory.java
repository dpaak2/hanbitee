package factory;

import command.Command;
import command.ListCommand;
import command.MoveCommand;
import lombok.Data;
import command.MoveCommand;

public class CommandFactory {
	public static Command createCommand(String directory, String action, String page) {
		Command cmd = null;
		switch (action) {
		case "move":
			cmd = new MoveCommand(directory, action, page);
			break;
			default:
			break;
		}
		return cmd;
	}
	public static Command createCommand(String directory, String action, String page,String pageNO) {
		Command cmd = null;
		switch (action) {
		case "list":
			cmd = new ListCommand(directory, action, page,pageNO);
			break;
			default:
			break;
		}
		if(cmd==null){
			System.out.println("CommandFactory null check:"+directory+ action+page+pageNO);
		}else{
			System.out.println("not null"+directory+ action+page+pageNO);
		}
		return cmd;
	}
}
