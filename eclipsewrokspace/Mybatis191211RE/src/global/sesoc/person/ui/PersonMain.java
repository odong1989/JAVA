package global.sesoc.person.ui;

import global.sesoc.person.dao.PersonDAO;

import java.util.Scanner;
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
		//Person pe;
		//pe = new Person("���缮", 45);
		//dao.insertPerson(pe);		
		
		/*19-12-12�� ������ ���� 12��11���� �������� �ּ����� ó��.
		//19.12.11 ����SQL�� �߰��غ��ô�.
		//[���1] ������ ���� �Է�ó�� ������ ������ ä���༭ VO��ü�� �����ش�.
		//[���2] �迭�� ���Ͽ� ����
		Person pe;	//�� ������ �������� ��Ƽ� �������� pe��ü �����Ͽ� ���� ��� ����.
		pe = new Person();
		pe.setNum(42);  //�Ǽ��� SQL�⺻�����Ǵ� ���� ��ȣ 1,2,3���� �����߽��ϴ�;;
		pe.setAge(20); //num�� 42������ �ؾ� ���缮���� ���̰� 20���� �ٲ�ϴ�.
		int n = dao.updatePerson(pe);//DAOŬ�������� �޼ҵ带 ������ �մϴ�.
	
		//int n�� Ȱ���Ͽ�
		//dao.updatePerson(pe);���� ���Ϲ��� ������ ���� ���� Ȱ���Ͽ� �����������
		
		if(n != 0){
			System.out.println("�����Ǿ����ϴ�.");
		}
		else{
			System.out.println("�ش�ȸ���� �����ϴ�.");			
		}
		*/
		
		//19-12-12 ȸ��1�� ���� ����� ���� ȭ���� �����غ��ô�.
		//DAO��ü�� �޼ҵ带 �̿��Ͽ� �����͸� ó���մϴ�.
		Scanner scan = new Scanner(System.in);
		int searchNum;
		//�ܰ�1.�˻��� ȸ���� ��ȣ�� �Է¹޴´�.
		System.out.println("�˻��� ȸ���� ��ȣ�� �Է����ּ��� : ");
		searchNum = scan.nextInt();
		scan.nextLine();//���ÿ� ���� ���Ͱ� ������

		//�˻��Ѵ�
		
		dao.selectPerson(searchNum);
		
		//�˻������ ������ "�ش� ��ȣ�� ȸ���� �����ϴ�."��� ���
		//����� ������ "��ȣ :1   �̸� : ȫ�浿 ���� : 20 "�������� ����Ͻʽÿ�.
		
		
		
	}

}
