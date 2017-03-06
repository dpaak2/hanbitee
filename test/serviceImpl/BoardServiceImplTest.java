package serviceImpl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import domain.ArticleBean;

public class BoardServiceImplTest {

/*	@Test @Ignore
	public void testAddArticle() throws Exception{
		BoardServiceImpl service =BoardServiceImpl.getIsntance();
		
		assertTrue(service.addArticle(param)>0);
	}
*/
	@Test 
	public void testFindOne() throws Exception{
		BoardServiceImpl service =BoardServiceImpl.getIsntance();
		ArticleBean bean=new ArticleBean();
		bean.setSeq("6");
		assertTrue(service.findOne(bean).getUid().equals("kim"));
	}

	@Test @Ignore
	public void testFindSome() throws Exception{
		BoardServiceImpl service =BoardServiceImpl.getIsntance();
		String [] arr=new String [2];
		arr[0]="title"; /*column값*/
		arr[1]="안"; /*value 값*/
		List<ArticleBean> list=new ArrayList<ArticleBean>();
		list=service.findSome(arr);
		
		assertTrue(list.get(0).getUid().equals("hong"));

	}

	/*@Test
	public void testList()throws Exception {
		BoardServiceImpl service= BoardServiceImpl.getIsntance();
		List<ArticleBean> list=new ArrayList<ArticleBean>();
		list=service.list(pageArr);
		assertTrue(list.size()>0);
		}*/

	@Test 
	public void testUpdate()throws Exception {
		BoardServiceImpl service= BoardServiceImpl.getIsntance();
		ArticleBean bean= new ArticleBean();
		bean.setUid("kim");
		bean.setTitle("잘지냈니?");
		bean.setContent("보고싶다");
		assertTrue(service.update(bean)>0);
		
	
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
