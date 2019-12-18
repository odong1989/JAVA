package global.sesoc.board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.sesoc.board.vo.BoardVO;
//import global.sesoc.board.dao.MybatisConfig;
//import global.sesoc.board.dao.BoardMapper;

public class BoardDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	//SqlSessionFactory를 활용하여 DB의 저장 삭제 등 DB관련 관리들을 합니다.
	//MybatisConfig.getSqlSessionFactory(); 를 통해 생성되었으며 사용이 가능합니다.	
	//객체들을 열고 실행하게 해줍니다.
	
	public int writeBoard(BoardVO vo){
			SqlSession ss = null;
			
			int cnt=0; //정상입력여부를 자바에서 판단하도록 값을 전달한다.
			try {
				ss = factory.openSession();
				BoardMapper mapper = ss.getMapper(BoardMapper.class);
				//PersonMapper.java라는 인터페이스가 필요!
				//인터페이스를 구현, 객체를 생성합니다.
				//추상메서드를 불르고,
				mapper.writeBoard(vo);
				//필요사항이 있다면 이외의 것들도 부르고.
				ss.commit();//커밋까지 해야 save명령을 내린것과 같습니다.(ss.close()까지 해야 진짜 끝이지만요)
				cnt=1;//커밋완료시 값을 '1'리턴하여 정상저장임을 알릴 것. 
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {//finally : 예외가 발생하든 않든 무조건 해야하는 사항들을 기재합니다.
				if (ss != null) ss.close();//ss.close()를 하여 데이터 저장이 끝났다고 해야합니다.
				//if (ss != null) ->세션이 있으면 저장하되, 없으면(null이면) 그냥 닫아라.
			}
			return cnt;
	}

	//updateBoard에서도 활용한다.
	//사전에 글이 있는지 확인하는 용도로도 쓸수 있다
	//nullCheck라는 별도의 명령을 만들었지만 지운상태.[삭제할 당시 똑같은 명령이라 없애는게 코드간결에 좋다고 생각]
	public ArrayList<BoardVO> readBoard(int num){
		SqlSession ss = null;	
		ArrayList<BoardVO> textSearch = new ArrayList<>(); 
			try {
				ss = factory.openSession();
				BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java라는 인터페이스가 필요!
				textSearch= mapper.readBoard(num);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {//finally : 예외가 발생하든 않든 무조건 해야하는 사항들을 기재합니다.
				if (ss != null) ss.close();//ss.close()를 하여 데이터 저장이 끝났다고 해야합니다.
				//if (ss != null) ->세션이 있으면 저장하되, 없으면(null이면) 그냥 닫아라.
			}
			return textSearch;
	}


	
	public int deleteBoard(int deleteNum){
		SqlSession ss = null;	
		int cnt=0; //정상삭제 처리여부를 자바에서 판단하도록 값을 전달한다.
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java라는 인터페이스가 필요!
			//인터페이스를 구현, 객체를 생성합니다.
			//추상메서드를 불르고,
			mapper.deleteBoard(deleteNum);
			//필요사항이 있다면 이외의 것들도 부르고.
			ss.commit();//커밋까지 해야 save명령을 내린것과 같습니다.(ss.close()까지 해야 진짜 끝이지만요)
			cnt=1;//커밋완료시 값을 '1'리턴하여 정상저장임을 알릴 것. 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : 예외가 발생하든 않든 무조건 해야하는 사항들을 기재합니다.
			if (ss != null) ss.close();//ss.close()를 하여 데이터 저장이 끝났다고 해야합니다.
			//if (ss != null) ->세션이 있으면 저장하되, 없으면(null이면) 그냥 닫아라.
		}
		return cnt;
	}
	
	//191217 글수정 부분 체크로 1교시 시작.
	public int updateBoard(BoardVO updateBoard){
		SqlSession ss = null;	
		int result=0;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java라는 인터페이스가 필요!
			//인터페이스를 구현, 객체를 생성합니다.
			//추상메서드를 불르고,
		    mapper.updateBoard(updateBoard);
			//필요사항이 있다면 이외의 것들도 부르고.
			ss.commit();//커밋까지 해야 save명령을 내린것과 같습니다.(ss.close()까지 해야 진짜 끝이지만요)
			result=1;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : 예외가 발생하든 않든 무조건 해야하는 사항들을 기재합니다.
			if (ss != null) ss.close();//ss.close()를 하여 데이터 저장이 끝났다고 해야합니다.
			//if (ss != null) ->세션이 있으면 저장하되, 없으면(null이면) 그냥 닫아라.
		}
		return result;
	}
	
	
	public ArrayList<BoardVO> searchBoard(int type, String word){
		//단 1번의 파라미터로 여러개의 값을 보내고 싶다면 map형이 좋습니다 
		HashMap<String, Object> map = new HashMap<String, Object>();		
		//map의 |<key>|<value>|
		map.put("type", type);
		map.put("word", word);
		
		/*map의 내용
		 * |<key>|<value>|
		 * |type | value | 
		 * |-------------|
		 * |  1  | java  | //제목(title)에서 java가 들어가는 제목들을 검색하세요.     
		 * |-------------|
		 * */
		SqlSession ss = null;
		ArrayList<BoardVO> list = null;	
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java라는 인터페이스가 필요!
			//인터페이스를 구현, 객체를 생성합니다.
			//추상메서드를 불르고,
		    list = mapper.searchBoard(map);
			//필요사항이 있다면 이외의 것들도 부르고.
			ss.commit();//커밋까지 해야 save명령을 내린것과 같습니다.(ss.close()까지 해야 진짜 끝이지만요)
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : 예외가 발생하든 않든 무조건 해야하는 사항들을 기재합니다.
			if (ss != null) ss.close();//ss.close()를 하여 데이터 저장이 끝났다고 해야합니다.
			//if (ss != null) ->세션이 있으면 저장하되, 없으면(null이면) 그냥 닫아라.
		}
		return list;
		}
}
