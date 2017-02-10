package Customercontroller;
import java.util.*;

import javax.swing.JOptionPane;
import service.BoardService;
import serviceImpl.BoardServiceImpl;
import domain.ArticleBean;
import enums.BoardButt;

public class BoardController {
	public static void main(String[] args) {
		ArrayList <ArticleBean> list =new ArrayList <ArticleBean>(); 
		ArticleBean a= new ArticleBean();
		BoardService service =new BoardServiceImpl();
		BoardButt[] buttons= {BoardButt.EXIT,BoardButt.ADD,BoardButt.FIND_ONE,
				BoardButt.FIND_SOME, BoardButt.LIST, BoardButt.UPDATE, BoardButt.DELETE
				};
		BoardButt key=(BoardButt)JOptionPane.showInputDialog(null, 
				"BOARD PAGE",
				"SELECT BOARD MENU",
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[1]);
		while(true){
			switch(key){
			case EXIT: return;
			case ADD:
				a= new ArticleBean();
				String[] strArr=JOptionPane.showInputDialog("등록번호,ID,제목,내용").split(",");
				a.setSeq(strArr[0]);
				a.setUid(strArr[1]);
				a.setTitle(strArr[2]);
				a.setRegdate(strArr[3]);
				list.add(a);
				JOptionPane.showMessageDialog(null, a.toString());
				break;
			case FIND_ONE:
				break;
			case FIND_SOME:
				
				break;
			case LIST:
				
				break;
			case UPDATE:
				
				break;
			case DELETE:
				
				break;
			}
		}

	/*String result="";
	 * 	for(int i=0;i<list.size();i++){
			if("i".equals(list.size()-1)){
				result=list.get(i).toString();
				 // 정보를 가지고 오는것은 get(i);를 사용해야 한다 다양성을 위해서
				  *   result가 String 타입이니깐 .toString() 하여야한다.
				}
			}
		System.out.println(result);
		
		// 2-2.검색seq가 3인 글 검색
		Iterator<ArticleBean> it= list.iterator();  //뒤지는 아이, shallow copy로 만든다 / get이 없다고 해서 getter가 아닌게 아니다.
		while(it.hasNext()){  //있는 놈 다 뒤져라 
		}
		Set<ArticleBean> set = new HashSet<ArticleBean>(); // index가 필요없을때 꺼내서 가져올때 쓴다.
		for(int i=0;i<list.size();i++){
			if("3".equals(list.get(i))){
				result=list.get(i).toString();
			}
		}
		System.out.println(result);

		// 3.검색(some)...James 가 쓴 글 검색
		set = new HashSet<ArticleBean>(); // index가 필요없을때 꺼내서 가져올때 쓴다.
		for(int i=0;i<list.size();i++){
			if("1".equals(list.get(i))){
				result=list.get(i).toString();
			}
		}
		System.out.println(result);

		// 4.전체 출력
		System.out.println(list);

		// 5.수정 (seq가 1인 글의 내용을 Good Bye)로 변경
	
		set= new HashSet<ArticleBean>();
		for(int i=0;i<list.size();i++){
			if("1".equals(list.get(i))){
			list.get(i).setTitle("Good bye");
			}
		}
		System.out.println();

		// 수정이 끝나면 바뀐 글내용 출력하기

		// 6.삭제 (seq가 인 글을 삭제)
		Iterator <ArticleBean>it=list.iterator(); //iterator 너 가서 조건에 맞는 아이 지워  
		while(it.hasNext()){
			if(it.next().getSeq().equals("3")){
				it.remove();
				break;
			}
		}
		*/
		// 삭제가 끝나면 해당글이 없다고 출력함
				
	}

}
