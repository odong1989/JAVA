//������� Ű���� �Է��� �޴� �ڵ��Դϴ�.
//�� �����ϰ� ������Ʈ ���ø�ó�� �ҷ��ͼ� ���ٵ����� ����ϼ���


import java.util.Scanner;	
//Scanner��� Ŭ������ java.util�̶�� ���� �ִٰ� �˷��ִ� ��.


class KeyIn 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//Scanner in : ��ĳ�� ������ �̸�. KeyInŬ������ main�޼ҵ� �������� Ȱ�������ϴ�.
		//System.in : System Ŭ���� ���ο� in�̶�� ������ ����.

		int a,b,c;

		System.out.println("���� �Է� : ");
		a = in.nextInt();
		//nextInt() ����ڰ� Ÿ�ڸ� �Է��� �ٶ�����(����ĥ ������) ����Ѵ�.
		System.out.println("���� �Է� : ");
		b = in.nextInt();

		c=a+b;
		System.out.println(c);
	}
}
