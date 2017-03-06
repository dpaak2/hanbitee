package command;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.CommandHandler;

public class MoveCommand extends Command implements CommandHandler {
    public MoveCommand(String directory, String action, String page) {
    	super.directory=directory;
		super.action=action;
		super.page=page;
		super.pageNO=pageNO;
		super.setView();
	}

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
