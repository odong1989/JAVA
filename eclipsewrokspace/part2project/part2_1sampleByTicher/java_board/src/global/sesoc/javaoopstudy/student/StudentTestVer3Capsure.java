package global.sesoc.javaoopstudy.student;

//����� ���� �ڷ���(Value Object)�� class Student�� �׽�Ʈ�ϱ� ���� ���� Ŭ�����Դϴ�.
//class Student�� �ܼ��� �ڷẸ�������� �����̱⿡ 
//�׽�Ʈ ������ �� �� ���⿡ �׽�Ʈ�� ���� Ŭ������ �����ϰ� �Ǿ���.

//������ ó���� ����� �ϳ��� �������� ��ġ�մϴ�.
//��, StudentTest.java�� Student.java ��� 
//���� ��ġ�� ����Ǿ� �ִٴ� ���̴�.


class StudentTestVer3Capsure
{
	public static void main(String[] args) 
	{
		StudentVer3Capsure s = new StudentVer3Capsure();
		StudentVer3Capsure s2 = new StudentVer3Capsure();

		/*
		//�� �̻� ����� �� ���� ����.
		s.name = "ȫ�浿";
		s.kor = 100;
		s.eng=90;
		s.math = 80;
		���������ڰ� private���� ����Ǿ��⿡ 
		�׽�ƮŬ���������� ���� �����ϴ� ���� �Ұ����մϴ�.
		*/
		

		s.setKor(94);
		s.setEng(65);
		s.setMat(100);
		System.out.println(s.getKor());

		int total = s.getTotal();
		System.out.println(total);
		double avg = s.getAvg();
		System.out.printf("%.2f\n",avg);
		String grade = s.getGrade();
		System.out.printf("s�л��� ����� \'%s\'�Դϴ�.\n",grade);

	}
}
/*

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
*/