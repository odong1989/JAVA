import java.util.Scanner;
/*
����3.�Է¹��� ������ n!�� ���ϼ���
[����] 1~100 �̳��� ���� ���˴ϴ�.(�̿��� ������ �ٽ� �Է¹޵��� �����Ͻʽÿ�)

<���� ��>
�����Է� : 500
1~100�� ���� �Է��ϼ���
�����Է� : 5
5! = 120
*/
//��Ȳ : 20���ĺ��� �Է��ϸ� ����� 0 ������ �������� �߻��ȴ�.
//������ ���� : 15�� �Ѿ���ص� int���� �����ϱ� �����
//	 	     �������� ���� �ִ��� Ȯ���ҷ��� �Ϻη� �̷��� �ϼ̴ٰ�.

class Quest_191018_Q3
{
	public static void main(String[] args) 
	{
		double number=0;
		double factorial=1;
		Scanner input = new Scanner(System.in);


		System.out.println("����3.�Է¹��� ������ n!�� ���ϼ��� �Դϴ�.");
		System.out.println("[����] 1~100 �̳��� ���� ���˴ϴ�. \n (�̿��� ������ �ٽ� �Է¹޵��� �����Ͻʽÿ�)");
		number = input.nextInt();

		do{
			if(number <= 0 || number> 100)
			{
				System.out.println("1~100�̳��� ���ڸ� �Է����ּ���");
			}
			else
			{		
				for(int i=1; i<=number ; i++)	
				{
					factorial = factorial*i;
				}
				
				break;
			}

		//1~100���� �� �Է½� �ٽ� �Է��ϵ��� �޴� ����.
		number = input.nextInt();
		}while(true);

		System.out.println(number + "! = " + factorial);


	}
}
