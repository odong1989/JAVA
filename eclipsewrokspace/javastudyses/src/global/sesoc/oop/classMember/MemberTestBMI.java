package global.sesoc.oop.classMember;

class MemberTestBMI
{
	public static void main(String[] args) 
	{
		MemberBMI memb001 = new MemberBMI();//��� ��������� null �Ǵ�0.0���� �ʱ�ȭ
		MemberBMI memb002 = new MemberBMI("ȫ�浿","010101");//�̸��� ������ϸ� �ʱ�ȭ
		MemberBMI memb003 = new MemberBMI("��ö��","991111",161.0,56.0,"AB");//��� ���� �ʱ�ȭ


		memb003.setHeight(155.5); //��ü�� ����� Ű ������ �����Ͻÿ�.
		System.out.println("memb003 NAME : "+ memb003.getName());	//��ü�� ����� �̸� �б�.
//		System.out.println("memb003 AGE : "+ memb003.getAge());		//���� �б�
		System.out.println("memb003 BMI : "+ memb003.getBmi());		//BMI����. 19.5ó�� �Ǽ������� ����.
		System.out.println("memb003 BMI : "+ memb003.getBmi("GRADE"));//BMI������ſ� ��ü��, �񸸵����� �˷��ּ���.
	}
}
