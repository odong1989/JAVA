import java.util.Scanner;
/*
10��15�� ����1 : ȯ�� ����
	1. ȯ���� ȭ�� �����Ҽ� �ֵ��� �� ��.(1 : �޷�, 2: ��ȭ ,3:����)
	2. ȯ���� �Ҽ��� �������� �������� �ϼ���
	3. ȯ���� �Է��� �ݾ��� ��ȭ�� �մϴ�.
	4. �Ʒ��� ���������� �����ϼ���.(#�Ʒ������ش�� ���α׷� ��������ó��)
       [�������� �ش�� ó�����]return; �� ���� �������Ḧ �����ϼ���.
       [��������] ��ݾ��� 1 �̻����� �մϴ�.(����, 0 �Ͻ� ������ ����Ѵ�.)         
               ��ȯ���� ���� 1,2,3 ���� �����Է¸� ����� ��.
*/

class Quiz_1_191015
{
	public static void main(String[] args) 
	{
		double WON;
		final double USD=1183.20; //1�޷��� ��ȭ����(19.10.15����)
		final double EUR=1304.79; //1���δ� ��ȭ����(19.10.15����)
		final double JYP=10.92;	   //1���� ��ȭ����(100���� �ƴ�!)(19.10.15����)
			  double exchange;
		Scanner input =new Scanner(System.in);
		System.out.println("ȯ���� ����Ͻ� �ݾ��� �Է��ϼ���(���� : ��)");
		WON = input.nextDouble();

		System.out.println("ȯ���Ͻ� ȭ�� �����ϼ���.");
		System.out.println("1:�޷�($), 2:��(��), 3:����(��)");

		switch (input.next())
		{
		case "1" : 
			exchange= WON / USD;
			System.out.print("ȯ���Ǵ� �ݾ� : ");
			System.out.printf("%.3f",exchange);
			System.out.println("$(�޷�)�Դϴ�.");			
			break;

		case "2" : 
			exchange= WON / JYP;
			System.out.print("ȯ���Ǵ� �ݾ� : ");
			System.out.printf("%.3f",exchange);
			System.out.println("��(��)�Դϴ�.");			
			break;
			
		case "3" : 
			exchange= WON / EUR;
			System.out.print("ȯ���Ǵ� �ݾ� : ");
			System.out.printf("%.3f",exchange);
			System.out.println("��(����)�Դϴ�.");			
			break;

		default :
			System.out.println("�߸��� �Է��Դϴ�. �����մϴ�");
			return;
		}

	}
}