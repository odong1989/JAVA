package global.sesoc.board.dao;

import java.util.ArrayList;

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

	public BoardVO readBoard(int num){
		SqlSession ss = null;	
		BoardVO textSearch = new BoardVO(); 
			try {
				ss = factory.openSession();
				BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
				textSearch = mapper.readBoard(num);
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

	public ArrayList<BoardVO> listBoard(){
		SqlSession ss = null;
		ArrayList<BoardVO> boardAllList = new ArrayList<>();
		
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
			boardAllList = mapper.listBoard();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {//finally : ���ܰ� �߻��ϵ� �ʵ� ������ �ؾ��ϴ� ���׵��� �����մϴ�.
			if (ss != null) ss.close();//ss.close()�� �Ͽ� ������ ������ �����ٰ� �ؾ��մϴ�.
			//if (ss != null) ->������ ������ �����ϵ�, ������(null�̸�) �׳� �ݾƶ�.
		}
		return boardAllList;		
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
	public BoardVO nullCheck(int numCheckBoard){
		SqlSession ss = null;	
		BoardVO nullCheckVO=null;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
			nullCheckVO = mapper.nullCheck(numCheckBoard);
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
		return nullCheckVO;	
	}	
	
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
}
