package global.sesoc.book.dao;

import java.util.ArrayList;
import java.util.HashMap;

import global.sesoc.book.vo.BookVO;

public interface BookMapper {
	public int addBook(BookVO book);
	public int deleteBook(int deleteBookNumber);
//	public ArrayList<BookVO> searchBook(BookVO book);//hash맵 통해 검색종류따라로 검색대응토록.
	public ArrayList<BookVO> searchBook(HashMap<String, Object> map);
	public ArrayList<BookVO> showAllBook();
	
}
