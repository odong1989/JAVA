//SES java Book 198~199page

public class ToStringExample{ 
	public static void main(String[] args) 
	{
		Member member = new Member("ȫ�浿",25,"�����");
		System.out.println(member);//member������ MemberŬ����-�������̵��� toString()�� �۵��մϴ�.
	}
}

class Member
{
	//��������
	String name;
	int age;
	String address;

	//�����ڼ���
	public Member(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Member(){}



	//toString �������̵�
	//toString�� �������̵� ȿ�� : ���α׷��Ӱ� �����ְ� ������� ������� ������ �� �ִ�.
	@Override
	public String toString(){
		return "�̸� : " + name + ", ���� : " + age + ", �ּ� : " +address;
	}
}