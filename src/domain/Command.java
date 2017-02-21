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
		if(directory.equals("/home")){ /*directory 가 home이면 */
			System.out.println("확인하세요"+"/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp"); 
			/*경로의 이름을 common에서 home으로 바꿔준다*/
			this.view="/WEB-INF/jsp/common/"+this.page+".jsp";/*directory가 common으로 되게 fix를 해준다 */
		}else{
			this.view="/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp";
		}
		/*()?:;*//*경로*/
	}

}