package global.sesoc.board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.sesoc.board.vo.BoardVO;
//import global.sesoc.board.dao.MybatisConfig;
//import global.sesoc.board.dao.BoardMapper;

public class BoardDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	//SqlSessionFactory�� Ȱ���Ͽ� DB�� ���� ���� �� DB���� �������� �մϴ�.
	//MybatisConfig.getSqlSessionFactory(); �� ���� �����Ǿ����� ����� �����մϴ�.	
	//��ü���� ���� �����ϰ� ���ݴϴ�.
	
	public int writeBoard(BoardVO vo){
			SqlSession ss = null;
			
			int cnt=0; //�����Է¿��θ� �ڹٿ��� �Ǵ��ϵ��� ���� �����Ѵ�.
			try {
				ss = factory.openSession();
				BoardMapper mapper = ss.getMapper(BoardMapper.class);
				//PersonMapper.java��� �������̽��� �ʿ�!
				//�������̽��� ����, ��ü�� �����մϴ�.
				//�߻�޼��带 �Ҹ���,
				mapper.writeBoard(vo);
				//�ʿ������ �ִٸ� �̿��� �͵鵵 �θ���.
				ss.commit();//Ŀ�Ա��� �ؾ� save����� �����Ͱ� �����ϴ�.(ss.close()���� �ؾ� ��¥ ����������)
				cnt=1;//Ŀ�ԿϷ�� ���� '1'�����Ͽ� ������������ �˸� ��. 
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {//finally : ���ܰ� �߻��ϵ� �ʵ� ������ �ؾ��ϴ� ���׵��� �����մϴ�.
				if (ss != null) ss.close();//ss.close()�� �Ͽ� ������ ������ �����ٰ� �ؾ��մϴ�.
				//if (ss != null) ->������ ������ �����ϵ�, ������(null�̸�) �׳� �ݾƶ�.
			}
			return cnt;
	}

	//updateBoard������ Ȱ���Ѵ�.
	//������ ���� �ִ��� Ȯ���ϴ� �뵵�ε� ���� �ִ�
	//nullCheck��� ������ ����� ��������� �������.[������ ��� �Ȱ��� ����̶� ���ִ°� �ڵ尣�ῡ ���ٰ� ����]
	public ArrayList<BoardVO> readBoard(int num){
		SqlSession ss = null;	
		ArrayList<BoardVO> textSearch = new ArrayList<>(); 
			try {
				ss = factory.openSession();
				BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
				textSearch= mapper.readBoard(num);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {//finally : ���ܰ� �߻��ϵ� �ʵ� ������ �ؾ��ϴ� ���׵��� �����մϴ�.
				if (ss != null) ss.close();//ss.close()�� �Ͽ� ������ ������ �����ٰ� �ؾ��մϴ�.
				//if (ss != null) ->������ ������ �����ϵ�, ������(null�̸�) �׳� �ݾƶ�.
			}
			return textSearch;
	}


	
	public int deleteBoard(int deleteNum){
		SqlSession ss = null;	
		int cnt=0; //������� ó�����θ� �ڹٿ��� �Ǵ��ϵ��� ���� �����Ѵ�.
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
			//�������̽��� ����, ��ü�� �����մϴ�.
			//�߻�޼��带 �Ҹ���,
			mapper.deleteBoard(deleteNum);
			//�ʿ������ �ִٸ� �̿��� �͵鵵 �θ���.
			ss.commit();//Ŀ�Ա��� �ؾ� save����� �����Ͱ� �����ϴ�.(ss.close()���� �ؾ� ��¥ ����������)
			cnt=1;//Ŀ�ԿϷ�� ���� '1'�����Ͽ� ������������ �˸� ��. 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : ���ܰ� �߻��ϵ� �ʵ� ������ �ؾ��ϴ� ���׵��� �����մϴ�.
			if (ss != null) ss.close();//ss.close()�� �Ͽ� ������ ������ �����ٰ� �ؾ��մϴ�.
			//if (ss != null) ->������ ������ �����ϵ�, ������(null�̸�) �׳� �ݾƶ�.
		}
		return cnt;
	}
	
	//191217 �ۼ��� �κ� üũ�� 1���� ����.
	public int updateBoard(BoardVO updateBoard){
		SqlSession ss = null;	
		int result=0;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
			//�������̽��� ����, ��ü�� �����մϴ�.
			//�߻�޼��带 �Ҹ���,
		    mapper.updateBoard(updateBoard);
			//�ʿ������ �ִٸ� �̿��� �͵鵵 �θ���.
			ss.commit();//Ŀ�Ա��� �ؾ� save����� �����Ͱ� �����ϴ�.(ss.close()���� �ؾ� ��¥ ����������)
			result=1;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : ���ܰ� �߻��ϵ� �ʵ� ������ �ؾ��ϴ� ���׵��� �����մϴ�.
			if (ss != null) ss.close();//ss.close()�� �Ͽ� ������ ������ �����ٰ� �ؾ��մϴ�.
			//if (ss != null) ->������ ������ �����ϵ�, ������(null�̸�) �׳� �ݾƶ�.
		}
		return result;
	}
	
	
	public ArrayList<BoardVO> searchBoard(int type, String word){
		//�� 1���� �Ķ���ͷ� �������� ���� ������ �ʹٸ� map���� �����ϴ� 
		HashMap<String, Object> map = new HashMap<String, Object>();		
		//map�� |<key>|<value>|
		map.put("type", type);
		map.put("word", word);
		
		/*map�� ����
		 * |<key>|<value>|
		 * |type | value | 
		 * |-------------|
		 * |  1  | java  | //����(title)���� java�� ���� ������� �˻��ϼ���.     
		 * |-------------|
		 * */
		SqlSession ss = null;
		ArrayList<BoardVO> list = null;	
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
			//�������̽��� ����, ��ü�� �����մϴ�.
			//�߻�޼��带 �Ҹ���,
		    list = mapper.searchBoard(map);
			//�ʿ������ �ִٸ� �̿��� �͵鵵 �θ���.
			ss.commit();//Ŀ�Ա��� �ؾ� save����� �����Ͱ� �����ϴ�.(ss.close()���� �ؾ� ��¥ ����������)
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : ���ܰ� �߻��ϵ� �ʵ� ������ �ؾ��ϴ� ���׵��� �����մϴ�.
			if (ss != null) ss.close();//ss.close()�� �Ͽ� ������ ������ �����ٰ� �ؾ��մϴ�.
			//if (ss != null) ->������ ������ �����ϵ�, ������(null�̸�) �׳� �ݾƶ�.
		}
		return list;
		}
}
