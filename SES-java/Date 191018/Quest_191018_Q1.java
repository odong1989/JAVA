//����1. ������ �Է¹޾� 1���� �� �������� �հ踦 ���ϼ���
import java.util.Scanner;

class Quest_191018_Q1 
{
	public static void main(String[] args) 
	{
		int total=0;
		int number=0;
		Scanner input = new Scanner(System.in);

		System.out.println("����1-������ �Է¹޾� \n 1���� �� �������� �հ踦 ���ϼ��� �Դϴ�.");
		System.out.println("�������� �Է��ϼ���");

		number = input.nextInt();
		for(int n=0; n<=number; n++)
		{
			total+=n;
		}

		System.out.println("1���� " + number+" ������ ���� : " + total);

	}
}