package global.sesoc.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import global.sesoc.VO.BookListVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BookListDAO {
	private static SqlSessionFactory factory = Mybatisconfig.getSqlSessionFactory();

	public int insertBook(BookListVO vo) {
		SqlSession session =null;
		int saveReport =0;
		try {
			session = factory.openSession();								//DB�� ����.
			BookListMapper mapper = session.getMapper(BookListMapper.class);//������ �޼ҵ带 �����ִ� BookListMapper.class ��ȯ 
			mapper.insertBook(vo);
		}catch(Exception e){
			e.printStackTrace();
		}
		return saveReport;
	}
//	public ArrayList<BookListVO> showBook(){}
//	public int deleteBook() {}
//	public int updateBook() {}
//	public ArrayList<BookListVO> searchBook(){}
}
