//StudentŬ������ Ȱ���ϴ� ���α׷��� �ǰڴ�.
class StudentTest_2
{
	public static void main(String[] args) 
	{
		Student_2 s1 =new Student_2();
		//s1.name = "ȫ�浿";
		//s1.kor = 100;
		//System.out.println(s1.kor);

		s1.setName("ȫ�浿");
		s1.printName();
		s1.setKor(-100);
		s1.setKor(90);

		System.out.println(s1);
		//s1������ �ּҹ����� ������ �����ִ�.
		//������� ġ�� ������ȣ�� �˰� �� ������
		//�ʿ��� ����(s1.kor)�� �����Ÿ��� ã�� �Ͱ� ���� ���̴�.

		Student_2 s2 = new Student_2();
		//s2.name = "��ö��";
		s2.getName();
		//System.out.println(s2);
		//s2.printName();
		s2.setScore(70,80,85);
		double avg = s2.getAverage();
		System.out.println(avg);

	}
}
