/*
���� 2.�������� ��Ģ���� ����
[���� ��]
���� 1 : (������Է�) 10
���� 2 : (������Է�) 3
�����ڸ� �����ϼ���
1 : ����(+), 2:����, 3:���ϱ� 4.������
(����� �Է�) 4

10 / 3 = 3

[��������]
����1 ������ ���ý� 1,2,3,4�� �Է� ����� ��
����2 0���� ������� ����ó�� �� ��
*/

import java.util.Scanner;

class Quiz_2_191015
{
	public static void main(String[] args) 
	{
		final int number1, number2;
		Scanner input = new Scanner(System.in);

		System.out.println("��Ģ���� �����Դϴ�.");
		System.out.print("ù° �� �Է� : ");
		number1 = input.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		number2 = input.nextInt();
		
		System.out.println("������ �����ϼ���");		
		System.out.println("1:����, 2:����, 3:���ϱ� 4:������");

		switch (input.next())
		{
		case "1" : 
			System.out.println("������ �ǽ��մϴ�.");
			System.out.print(number1 + "+" + number2 + "= ");		
  			System.out.println(number1+number2);
			break;

		case "2" :
			System.out.println("������ �ǽ��մϴ�.");		
			System.out.print(number1 + "-" + number2 + "= ");
			System.out.println(number1-number2);
			break;

		case "3" :
			System.out.println("���� �ǽ��մϴ�.");		
			System.out.print(number1 + "*" + number2 + "= ");
			System.out.println(number1*number2);
			break;

		case "4" :
			if(number1 == 0 || number2 == 0)
			{
				System.out.println("0�� �־ ����Ұ��մϴ�.");		
				return;
			}
			System.out.println("������ �ǽ��մϴ�. ��� : ");		
			System.out.print(number1 + "/" + number2 + "= ");
			System.out.println((double)number1/number2);
			break;			

		default :
			System.out.println("1,2,3,4�� �Է����ּ���. ����˴ϴ�.");		
		return;
		}

	}
}
