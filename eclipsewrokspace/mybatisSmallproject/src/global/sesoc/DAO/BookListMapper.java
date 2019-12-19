package global.sesoc.DAO;


import java.util.ArrayList;
import java.util.HashMap;

import global.sesoc.VO.BookListVO;

public interface BookListMapper {
	public int insertBook(BookListVO vo);
	public ArrayList<BookListVO> showBook();
	public int deleteBook();
	public int updateBook();
	public ArrayList<BookListVO> searchBook(HashMap<String,Object> map);
	
}
