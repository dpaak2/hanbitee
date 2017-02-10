package Customercontroller;
import java.util.*;
import service.BoardService;
import serviceImpl.BoardServiceImpl;
import domain.ArticleBean;

//1.추가..주어진 BbsBean 값을 vec 에 추가하기
		// 1,James(id),Hello,2016-2-6 17:30
		// 2,Tom,Hi,2016-8-6 17:30
		// 3,Alex,Good Morning,2016-11-20 17:30
		// 4,Betty,I'm happy,2016-12-25 17:30
		// 5,John,Thank you,2017-2-6 17:30
		// 2.검색(1)..seq가 1인 글 검색, 
		// 해당 seq 가 있으면 내용을 보여주고
		// 없으면 해당글이 존재하지 않는다고 출력함
		// 3.검색(some)...
		// James 가 쓴 글 검색
		// 하나라도 없으면 해당글이 존재하지 않는다고 출력함
		// 4.전체 출력
		// 글이 하나도 없으면
		// 빈 게시판 이라고 출력함
		// 5.수정 (seq가 1인 글의 내용을 Good Bye)로 변경
		// 수정이 끝나면 바뀐 글내용 출력하기
		// 6.삭제 (seq가 인 글을 삭제)
		// 삭제가 끝나면 해당글이 없다고 출력함
public class BoardController2 {
	public static void main(String[] args) {
		ArrayList <ArticleBean> list =new ArrayList <ArticleBean>(); //초기화와, 용량정해주기
		  // 0.리스트 스펙보기
		/*System.out.println("CAPA: " +list.capacity());
		System.out.println("SIZE: " +list.size());*/
		 // 1.추가..주어진 BbsBean 값을 vec 에 추가하기
		// 1,James(id),Hello,2016-2-6 17:30
				// 2,Tom,Hi,2016-8-6 17:30
				// 3,Alex,Good Morning,2016-11-20 17:30
				// 4,Betty,I'm happy,2016-12-25 17:30
				// 5,John,Thank you,2017-2-6 17:30
		ArticleBean a= new ArticleBean();
		a.setSeq("1");
		a.setUid("James");
		a.setTitle("Hello");
		a.setRegdate("2016-2-6 17:30");
		list.add(a);
		a=new ArticleBean();
		
		a.setSeq("2");
		a.setUid("Tom");
		a.setTitle("Hi");
		a.setRegdate("2016-8-6 17:30");
		list.add(a);
		a=new ArticleBean();
		
		a.setSeq("3");
		a.setUid("Alex");
		a.setTitle("Good Morning");
		a.setRegdate("2016-8-6 17:30");
		list.add(a);
		a=new ArticleBean();
		
		a.setSeq("4");
		a.setUid("Betty");
		a.setTitle("I'm happy");
		a.setRegdate("2016-12-25 17:30");
		list.add(a);
		a=new ArticleBean();
		
		a.setSeq("5");
		a.setUid("Jhon");
		a.setTitle("Thank you");
		a.setRegdate("2017-2-6 17:30");
		list.add(a);
		a=new ArticleBean();
		System.out.println(list);
		
		a= new ArticleBean();
		a.setSeq("6");
		a.setUid("James"); //jamesrk 있는지 조사함 , 죽지 않고 계속 정장된다.
		a.setTitle("Good bye");
		a.setRegdate("2016-2-6 17:30");
		list.add(a);
		
		String s1="aaa";
		s1="bbb";
		//System.out.println(list);

		// 2-1.검색(1)..맨 마지막에 추가한 글 검색, 값이 있는곳에서 검색해야 하니깐 조건의 길이는 size ; 
		String result="";
		for(int i=0;i<list.size();i++){
			if("i".equals(list.size()-1)){
				result=list.get(i).toString();
				 /*// 정보를 가지고 오는것은 get(i);를 사용해야 한다 다양성을 위해서
				  *   result가 String 타입이니깐 .toString() 하여야한다.*/
				}
			}
		System.out.println(result);
		
		// 2-2.검색seq가 3인 글 검색
	/*	Iterator<ArticleBean> it= list.iterator();  //뒤지는 아이, shallow copy로 만든다 / get이 없다고 해서 getter가 아닌게 아니다.
		while(it.hasNext()){  //있는 놈 다 뒤져라 
		}*/
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
		
		// 삭제가 끝나면 해당글이 없다고 출력함
				
	}

}
