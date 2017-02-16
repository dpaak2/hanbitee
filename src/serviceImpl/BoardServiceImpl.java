package serviceImpl;

import java.util.*;

import dao.BoardDAO;
import daoImpl.BoardDAOImpl;
import domain.ArticleBean;
import service.BoardService;

public class BoardServiceImpl implements BoardService{
	private static BoardServiceImpl instance = new BoardServiceImpl();

	public static BoardServiceImpl getIsntance() { /*
													 * getter/setter 생성하고 setter는
													 * 지움
													 */
		return instance;
	}

	BoardDAO dao;
	private BoardServiceImpl() {
		dao = BoardDAOImpl.getInstance();
	}

	@Override
	public int addArticle(ArticleBean param)throws Exception  {
		int rs=0;
		rs=dao.insertArticle(param);
		return rs;
	}

	@Override
	public ArticleBean findOne(ArticleBean param)throws Exception  {
		ArticleBean article = new ArticleBean();
		
		return article;
	}

	@Override
	public List <ArticleBean> findSome(String[] param) throws Exception {
		List <ArticleBean> list = new ArrayList <ArticleBean>();
		list=BoardDAOImpl.getInstance().selectByWord(param);
	
		return list;
	}

	@Override
	public List <ArticleBean> list() throws Exception {
		List<ArticleBean> list=new ArrayList<ArticleBean>();
		list=BoardDAOImpl.getInstance().selectAll();
		return list;
	}

	@Override
	public int update(ArticleBean param)throws Exception  {
		int rs=0;
		rs=dao.update(param);
	/*	for(ArticleBean art:list){
			String a=
			if(param.getSeq().equals(art.getSeq())){
				art.setUid((param.getUid().equals(""))?art.getUid():param.getUid());
				art.setTitle((param.getTitle().equals(""))?art.getTitle():param.getTitle());
				break;
			}
		}*/
		return rs;
	}

	@Override
	public int delete(ArticleBean param)throws Exception {
		int rs=0;
		rs=dao.delete(param);
		return rs;
	}

}
