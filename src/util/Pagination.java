package util;
import lombok.Data;
import lombok.Getter;
@Data
public class Pagination {
	@Getter
	private int rowCount,pageNO,pageStart,pageEnd,count,pageCount,blockSize,blockCount
	,blockStart,prevBlock,nextBlock,blockEnd;
	public void setPageCount() {
		if(count%rowCount==0){
			pageCount=count/rowCount;
		}else{
			pageCount=count/rowCount+1;
		}
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
		
	}
	public void setPageNO(String pageNO) {
		this.pageNO = Integer.parseInt(pageNO);
	}
	public void setPageStart() {
		this.pageStart = (pageNO-1)*rowCount+1;
	}
	public void setPageEnd() {
		this.pageEnd =pageNO*rowCount;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}
	public void setBlockCount() {
		this.blockCount = pageCount/blockSize;
	}
	public void setBlockStart() {
		this.blockStart =pageNO-((pageNO-1)%blockSize);
	}
	public void setPrevBlock() {
		this.prevBlock = blockStart-blockSize;
	}
	public void setNextBlock() {
		this.nextBlock = pageStart+blockSize;
	}
	public void setBlockEnd() {
		if((blockStart+rowCount-1) <pageCount){
			blockEnd=blockStart+blockSize-1;
		}else{
			blockEnd=pageCount;
		}
	}
	public Integer [] getAttribute(){
		Integer []arr={count,
				pageCount,pageNO,pageStart,pageEnd,
				blockStart,blockEnd
				,prevBlock,nextBlock};
		return arr;
	}
}
