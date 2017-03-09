package dao;
import java.util.*;

import domain.ArticleBean;


public interface BoardDAO {
	public int insertArticle(ArticleBean param) throws Exception;
	public  ArticleBean selectBySeq(ArticleBean param)throws Exception;
	public List<ArticleBean> selectByWord(String[]param)throws Exception;
	public List <ArticleBean> selectAll(int[]pageArr);
	public int update(ArticleBean param)throws Exception;
	public int delete(ArticleBean param)throws Exception;
	public int count();
}
