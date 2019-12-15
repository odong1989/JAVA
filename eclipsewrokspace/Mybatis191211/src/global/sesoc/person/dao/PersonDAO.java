package global.sesoc.person.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.sesoc.person.vo.Person;

/**
 * DB���� ó�� Ŭ����
 */
public class PersonDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	//SqlSessionFactory�� Ȱ���Ͽ� DB�� ���� ���� �� DB���� �������� �մϴ�.
	//MybatisConfig.getSqlSessionFactory(); �� ���� �����Ǿ����� ����� �����մϴ�.
	
	//ȸ������ ����
	public void insertPerson(Person p) {
		SqlSession ss = null;
		
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);//PersonMapper.java��� �������̽��� �ʿ�!
			//�������̽��� ����, ��ü�� �����մϴ�.
			//�߻�޼��带 �Ҹ���,
			mapper.insertPerson(p);
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
	}

	//��ȣ�� ���޹޾� ȸ������ ����
	public void deletePerson(int n) {
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			mapper.deletePerson(n);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
	}

}
