//StudentŬ������ Ȱ���ϴ� ���α׷��� �ǰڴ�.
class StudentTest
{
	public static void main(String[] args) 
	{
		Student s1 =new Student();
		//s1.name = "ȫ�浿";
		//s1.kor = 100;
		//System.out.println(s1.kor);

		s1.setName("ȫ�浿");
		s1.printName();

		
		System.out.println(s1);
		//s1������ �ּҹ����� ������ �����ִ�.
		//������� ġ�� ������ȣ�� �˰� �� ������
		//�ʿ��� ����(s1.kor)�� �����Ÿ��� ã�� �Ͱ� ���� ���̴�.

		Student s2 = new Student();
		//s2.name = "��ö��";
		s2.getName();
		//System.out.println(s2);
		//s2.printName();

	}
}
