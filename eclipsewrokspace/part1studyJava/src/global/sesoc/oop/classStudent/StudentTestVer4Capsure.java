package global.sesoc.oop.classStudent;

//����� ���� �ڷ���(Value Object)�� class Student�� �׽�Ʈ�ϱ� ���� ���� Ŭ�����Դϴ�.
//class Student�� �ܼ��� �ڷẸ�������� �����̱⿡ 
//�׽�Ʈ ������ �� �� ���⿡ �׽�Ʈ�� ���� Ŭ������ �����ϰ� �Ǿ���.

//������ ó���� ����� �ϳ��� �������� ��ġ�մϴ�.
//��, StudentTest.java�� Student.java ��� 
//���� ��ġ�� ����Ǿ� �ִٴ� ���̴�.


class StudentTestVer4Capsure
{
	public static void main(String[] args) 
	{
		StudentVer4Capsure s = new StudentVer4Capsure();
		StudentVer4Capsure s2 = new StudentVer4Capsure("ȫ�浿");
		StudentVer4Capsure s3 = new StudentVer4Capsure(60,40,90);
		StudentVer4Capsure s4 = new StudentVer4Capsure("���ٿ�",100,94,77);

		//Ȯ�ο� ���
		System.out.println("�����ε��� ����� ����Ǿ��� Ȯ���սô�.");
		s.printST();
		System.out.println("");
		s2.printST();
		System.out.println("");
		s3.printST();		
		System.out.println("");
		s4.printST();
		System.out.println("");

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