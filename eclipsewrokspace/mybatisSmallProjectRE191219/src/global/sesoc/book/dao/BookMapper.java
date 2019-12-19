package global.sesoc.book.dao;

import java.util.ArrayList;
import global.sesoc.book.vo.BookVO;

public interface BookMapper {
	public int addBook(BookVO book);
	public int deleteBook(int deleteBookNumber);
	public ArrayList<BookVO> searchBook(BookVO book);
	public ArrayList<BookVO> showAllBook();
}
