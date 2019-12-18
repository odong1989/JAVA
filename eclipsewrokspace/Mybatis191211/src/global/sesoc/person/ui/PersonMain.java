package global.sesoc.person.ui;

import global.sesoc.person.dao.PersonDAO;
import global.sesoc.person.vo.Person;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PersonMain {

	public static void main(String[] args) {
		//UI�� �����ϹǷ� dao�� �ٷ� �����θ��� �˴ϴ�.
		//�ܰ�1. DB���� ó���� ����ϴ� Ŭ������ ��ü�� ����
		PersonDAO dao = new PersonDAO();
		//���̹�ƽ�� ��ü(sqlSessionFactory�� ���� �־�� �մϴ�.
		//������ �˻�,���� � �� �� �־�� ����.(����, DB���ø� ���ؼ� �ֱ��Դϴ�)
		//------------------------------------------------------------------------
		
		//�ܰ�2. DAO��ü�� �޼ҵ带 �̿��Ͽ� ������ ó��
		//�Է� / ���������� �۵����� ���� �׽��ÿ�
		Person pe;
		pe = new Person("��浿", 80);
		dao.insertPerson(pe);		
	}

}
