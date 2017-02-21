package domain;
import handler.CommandHandler;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Command implements CommandHandler{
	@Getter @Setter
	private String directory,action,page; /*recursive call을 위한것*/
	@Getter 
	private String view;
	public Command(String directory, String action, String page) { /*외부에서 받은것 생성자 오버로딩*/
		this.directory=directory;
		this.action=action;
		this.page=page;
		this.setView(); /*setView is 경로 setView를 보여준다*/
	}
	@Override
	public String process() {		
		return "";
	}
	
	public void setView(){
		this.view="/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp"; /*경로*/
	}

}
