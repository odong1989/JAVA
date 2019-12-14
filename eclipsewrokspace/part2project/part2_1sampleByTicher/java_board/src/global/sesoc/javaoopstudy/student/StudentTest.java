package global.sesoc.javaoopstudy.student;

//����� ���� �ڷ���(Value Object)�� class Student�� �׽�Ʈ�ϱ� ���� ���� Ŭ�����Դϴ�.
//class Student�� �ܼ��� �ڷẸ�������� �����̱⿡ 
//�׽�Ʈ ������ �� �� ���⿡ �׽�Ʈ�� ���� Ŭ������ �����ϰ� �Ǿ���.

//������ ó���� ����� �ϳ��� �������� ��ġ�մϴ�.
//��, StudentTest.java�� Student.java ��� 
//���� ��ġ�� ����Ǿ� �ִٴ� ���̴�.


class StudentTest 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		Student s2 = new Student();

		s.name = "ȫ�浿";
		s.kor = 100;
		s.eng=90;
		s.math = 80;

		s2.name = "�ȼ���";
		s2.kor = 77;
		s2.eng=100;
		s2.math = 86;


		System.out.println("===================================");
		System.out.println(s);
		//����Ű�� �ִ� �ּҰ��� ���´�.
		//�� ����� ���Ѵٸ� ����� ������ �մϴ�.

		System.out.println("===================================");
		System.out.println("//��¹��1) ������ ����ϴ� ����Ʈ���� �ۼ��Ѵ�.(#�ſ� ��������)");
		//��¹��1) ������ ����ϴ� ����Ʈ���� �ۼ��Ѵ�.(#�ſ� ��������)
		System.out.println("");
		System.out.println(s.name );//����Ű�� �ִ� �ּҰ��� ���´�.
		System.out.println(s.kor);//����Ű�� �ִ� �ּҰ��� ���´�.
		System.out.println(s.eng);//����Ű�� �ִ� �ּҰ��� ���´�.
		System.out.println(s.math);//����Ű�� �ִ� �ּҰ��� ���´�.

		//��¹��2) class Student���� �̸� ����� �����ϴ�
		//��¸޼ҵ� printST�� Ȱ���ϴ� ���(#�ν���Ʈ �丮����!)
		System.out.println("===================================");
		System.out.println("class Student���� �����ϴ� printST() �޼ҵ带 Ȱ���� ���");
		 s.printST();//
 
		 s2.printST();//
	}
}
