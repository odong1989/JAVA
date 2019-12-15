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
	}//���� ��
	
	//��ȣ�� ���޹޾� ȸ������ ����
	public int updatePerson(Person p) {//updatePerson����� xml�� ���ǵǾ� �ֽ��ϴ�
		int cnt=0;
		//1.�������� ���ϴ�.
		SqlSession ss = null;
		//����ó��try
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class); 
			//getMapper�� SqlSessionŬ����(���̹�Ƽ�� �Ҽ�)���� ���δ�.
			cnt = mapper.updatePerson(p);//��� �ڵ尡 ���������� ������ ����(0�̸� "�Ϸ�"-1�̸� "����"������ ���ϰ���������)
			ss.commit();
		}
		//����ó��catch
		catch(Exception e) {
			e.printStackTrace();
		}
		//������ �޼��� �ҷ��� ����
		finally {
			if(ss != null) ss.close();
		}
		//������Ʈ Ŀ��
		return cnt;
	}//updatePerson END
		
		//19-12-12 1����-ȸ�� 1���� ���� ��¹� �߰�
		//DAO������ ��ü������ ������ �����մϴ�.
		//update���� ���� �����ؼ� �����ؼ� �ణ�� ����.
		public Person selectPerson(int n){
			SqlSession ss = null;
			Person p =null;
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class); 
				//getMapper�� SqlSessionŬ����(���̹�Ƽ�� �Ҽ�)���� ���δ�.
				p = mapper.selectPerson(n);//�ش��� ������ NULL�� ���ϵ˴ϴ�.
				ss.commit();
			}
			//����ó��catch
			catch(Exception e) {
				e.printStackTrace();
			}
			//������ �޼��� �ҷ��� ����
			finally {
				if(ss != null) ss.close();
			}
			//������Ʈ Ŀ��
			return p;		
			}//selectPerson END
		
		
		//19-12-12 2����-�̸��� ���� �˻��Դϴ�.
		//[Ű���� : �κа˻�, n���� ����� ���Ϲ���]
		public ArrayList<Person> selectPersonByname(String name){
			ArrayList<Person> resultNames = new ArrayList<>();
			SqlSession ss = null;
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class); 
				resultNames = mapper.selectPersonByname(name);
				ss.commit();
			}
			//����ó��catch
			catch(Exception e) {
				e.printStackTrace();
			}
			//������ �޼��� �ҷ��� ����
			finally {
				if(ss != null) ss.close();
			}
			//������Ʈ Ŀ��
			return resultNames;		
			}//selectPerson END

		public ArrayList<Person> ShowAllPerson(){
			ArrayList<Person> resultNames = new ArrayList<>();
			SqlSession ss = null;
			try {
				ss = factory.openSession();
				PersonMapper mapper = ss.getMapper(PersonMapper.class); 
				resultNames = mapper.ShowAllPerson();
				//ss.commit();
			}
			//����ó��catch
			catch(Exception e) {
				e.printStackTrace();
			}
			//������ �޼��� �ҷ��� ����
			finally {
				if(ss != null) ss.close();
			}
			//������Ʈ Ŀ��
			return resultNames;		
			}//ShowAllPerson END			

		
}//public class PersonDAO END
