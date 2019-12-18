package sesoc.global.dao;
import sesoc.global.vo.boardVO;

public interface boardMapper {
	public int 					insertBoard(board vo); 
	public ArrayList<board vo>  showBoard(int boardNum);
}
