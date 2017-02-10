package serviceImpl;

import java.util.*;
import domain.ArticleBean;
import service.BoardService;

public class BoardServiceImpl implements BoardService{
	private ArrayList<ArticleBean> list;
	@Override
	public void addArticle(ArticleBean param) {
		list=new ArrayList <ArticleBean>();
	}

	@Override
	public ArticleBean findOne(ArticleBean param) {
		ArticleBean article = new ArticleBean();
		
		return article;
	}

	@Override
	public List <ArticleBean> findSome(ArticleBean param) {
		ArrayList<ArticleBean> list = new ArrayList <ArticleBean>();
		for(int i=0;i<list.size();i++){
			if(param.getUid().equals(list.get(i).getUid())){
			}
		}
		return list;
	}

	@Override
	public List <ArticleBean> list() {
		return list;
	}

	@Override
	public void update(ArticleBean param) {
		for(ArticleBean art:list){
			/*String a=*/
			if(param.getSeq().equals(art.getSeq())){
				art.setUid((param.getUid().equals(""))?art.getUid():param.getUid());
				art.setTitle((param.getTitle().equals(""))?art.getTitle():param.getTitle());
				break;
			}
		}
	}

	@Override
	public void delete(ArticleBean param) {
		Iterator<ArticleBean> it =list.iterator();
		while(it.hasNext()){
			if(it.next().getSeq().equals(param.getSeq())){
				it.remove();
			}
		}
		
	}

}
