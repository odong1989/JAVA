package global.sesoc.book.dao;

import global.sesoc.book.vo.BookVO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BookDAO {
	//step2
	private SqlSessionFactory factory = MybatisConfig.getsqlsessionFactory();
	
	
	public BookDAO() {
		super();
	}
	
	public int addBook(BookVO book) {
		System.out.println(book);
		SqlSession ss=null;
		int result=0;
		try {
			ss=factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			result= mapper.addBook(book);
			ss.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteBook(int deleteBookNumber){
		SqlSession ss=null;
		int result=0;
		try {
			ss=factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			result= mapper.deleteBook(deleteBookNumber);
			ss.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<BookVO> showAllBook(){
		SqlSession ss=null;
		ArrayList<BookVO> result= new ArrayList<>();
		try {
			ss=factory.openSession();
			BookMapper mapper = ss.getMapper(BookMapper.class);
			result= mapper.showAllBook();
			ss.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;		
	}
}
