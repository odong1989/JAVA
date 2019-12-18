package global.sesoc.person.vo;
import global.sesoc.person.dao.PersonDAO;
import global.sesoc.person.vo.Person;
/**
 * ���� ������ ������ VO Ŭ����
 */
public class Person {
	//1. ��������
	private int num;					//�Ϸù�ȣ
	private String name;				//�̸�
	private int age;					//����
	
	//2.   ������
	//2.1. �⺻������(�Ƚ�Ծ �������ؾ��մϴ�! �⺻�����ڰ� ������ ���̹�ƽ���� ��ü�� ������ϴ�!!)
	public Person() {
	}
	
	//2.2. ������(�̸�,���� �Է½�)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//2.3 ������(��ȣ,�̸�,����)
	public Person(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
}
