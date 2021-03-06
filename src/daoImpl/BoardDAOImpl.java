package daoImpl;

import constants.Database;
import dao.BoardDAO;
import domain.ArticleBean;
import enums.Vendor;
import factory.DatabaseFactory;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class BoardDAOImpl implements BoardDAO{
	public static BoardDAOImpl getInstance() {
		return new BoardDAOImpl();
	}
	@Override
	public int insertArticle(ArticleBean param) throws Exception {
		return DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement().executeUpdate(String.format("INSERT INTO Article(art_seq,id,title,content,regdate,read_count)VALUES(art_seq.nextval,'%s','%s','%s','%s','0')", param.getUid(),param.getTitle(),param.getContent(),new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
	}

	@Override
	public ArticleBean selectBySeq(ArticleBean param) throws Exception {
		ArticleBean temp=new ArticleBean();
		ResultSet rs=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement().executeQuery(String.format("SELECT art_seq,id,title,content,regdate,read_count FROM ARTICLE WHERE art_seq='%s'", param.getSeq()));
		if(rs.next()){
			temp.setSeq(rs.getString("art_seq"));
			temp.setUid(rs.getString("id"));
			temp.setTitle(rs.getString("title"));
			temp.setContent(rs.getString("content"));
			temp.setRegdate(rs.getString("regdate"));
			temp.setReadCount(rs.getString("read_count"));
		}else{
			temp=null;
		}
		return temp;
	}

	@Override
	public List<ArticleBean> selectByWord(String[] param) throws Exception {
		List<ArticleBean> list=new ArrayList<ArticleBean>();
		ArticleBean bean=null;
		String sql=String.format("SELECT art_seq,id,title,content,regdate,readCount"
				+ "FROM Article WHERE %S LIKE '%%'",param[0], param[1],param[2],param[3],param[4],param[5]);
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			bean.setSeq(rs.getString("art_seq"));
			bean.setUid(rs.getString("id"));
			bean.setTitle(rs.getString("title"));
			bean.setContent(rs.getString("content"));
			bean.setRegdate(rs.getString("regdate"));
		}
		
		return list;
	}

	@Override
	public List<ArticleBean> selectAll() throws Exception {
		List<ArticleBean> list=new ArrayList<ArticleBean>();
		ResultSet rs=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME,Database.PASSWORD)
				.getConnection().createStatement().executeQuery("SELECT art_seq,id,title,content,regdate,read_count FROM article");
		while(rs.next()){
			ArticleBean temp=new ArticleBean();
			temp.setSeq(rs.getString("art_seq"));
			temp.setUid(rs.getString("id"));
			temp.setTitle(rs.getString("title"));
			temp.setContent(rs.getString("content"));
			temp.setRegdate(rs.getString("regdate"));
			temp.setReadCount(rs.getString("read_count"));
			list.add(temp);
		}
		return list;
	}

	@Override
	public int update(ArticleBean param) throws Exception {
		int rs=0;
		String sql=String.format("UPDATE ", "");
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE, Database.USERNAME, Database.PASSWORD).getConnection().createStatement();
		rs=stmt.executeUpdate(sql);
		return rs;
	}

	@Override
	public int delete(ArticleBean param) throws Exception {
		return DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME,Database.PASSWORD).getConnection().createStatement().executeUpdate(String.format("DELETE FROM article WHERER art_seq='%s'",param.getSeq()));
	}

}