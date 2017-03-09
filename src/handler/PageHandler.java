package handler;
import java.util.HashMap;
import java.util.Map;

import util.Pagination;
public class PageHandler implements Orderable{
	Map<?, ?> map;
	public PageHandler(){
		map=new HashMap<>();
		}

	public Integer[] getAttribute(){
		Pagination page=new Pagination();
		String pageNO=(String) map.get("pageNO");
		String count=(String) map.get("count");
		page.setBlockSize(5);
		page.setRowCount(5);
		page.setCount(Integer.parseInt(count));
		page.setPageNO(pageNO);
		page.setPageStart();
		page.setPageEnd();
		page.setPageCount();
		page.setBlockCount();
		page.setBlockStart();
		page.setPrevBlock();
		page.setNextBlock();
		page.setBlockEnd();
		return page.getAttribute();
	}
	@Override
	public void process(Map<?, ?> map) {
		this.map=map;
	}
	
	
}
