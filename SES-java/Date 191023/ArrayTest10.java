import java.util.Scanner;

class ArrayTest10 
{
	public static void main(String[] args) 
	{
		String s[] ={"ȫ�浿","��ö��","�̿���"};
		String name;
		double d;

		Scanner in = new Scanner(System.in);
		System.out.print("�˻��� �̸� : ");
		name = in.next();



		for(int x=0; x<s.length ; x++)
		{
//			if(name == s[x])
			if(name.equals(s[x]))
				{
					System.out.println( x+"��°���� �˻��Ǿ����ϴ�.");
					break;
				}
		}
		System.out.println("�˻������ �����ϴ�");
	}
}

		/*
			String s[] ={"ȫ�浿","��ö��","�̿���"};�� �Ʒ��� ���ٰ� ������ �� �ִ�.

			s[�迭�� �ּҸ� ���� �ִ�.]----------link------->|[0��°]|[1��°]|[2��°]|
														  |
														 ��ũ
														  |
														"ȫ�浿" 

			String test = "abcd"�� 
			test[�迭�� �ּҸ� ���� �ִ�.]----------link------->|"abcd"|

			�迭�� ��ü�� �����Դϴ�
			��ü�迭 : �ּҰ��� ���� �迭.
				� �ּҸ� ����Ű�� ���۷��� ������� �θ���.		
		
		
		*/