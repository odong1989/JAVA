import java.util.Scanner;
import java.util.Calendar;

class StringTest5 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String year;

		System.out.print("�¾ �� : ");
		year = in.nextLine();	//(ex) "2000"

		/*
		���ͳݿ��� ����ڰ� �Է��ϴ� ����,
		������ ������ ó���Ǵ� ���鵵 ��� ��Ʈ������ �ԷµǱ� �����̴�.
		
		��, �̷� ���ڿ��� �ԷµǸ� if��, ��Һ񱳵��� ������ ���� �ſ� ����.
		*/

		//�����Է�Ȯ�� �� ��� ���
		//1.���ڼ� 4�ڸ����� Ȯ��
//		year.length();
		
		//2.���� Ȯ��
		int y = Integer.parseInt(year);

		Calendar c = Calendar.getInstance();
		int a = c.get(Calendar.YEAR);
		int b = c.get(Calendar.MONTH);
		//getInstance()�޼ҵ�� ���� ����޺��� -1 �Ǿ� ���´�.
		//���� 2019��08��29���ε� Month���� 7�� ���´ٴ� �ֱ��. 

		System.out.println(a+"��"+(b+1)+"��");

		int age = a - y;

		//����ϱ�
		System.out.println("���� : "+age);





	}
}
