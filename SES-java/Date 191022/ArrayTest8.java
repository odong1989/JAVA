import java.util.Scanner;

class ArrayTest8 
{
		//[1]����ڿ��� ��, ���� �Է¹޴´�
		//(��) 5��10���� ��� 
		// => 5, 10

		//[2] �Է��Ͻ� ��¥�� 00��° �Դϴ�.
		//(��) 2��3���� 34��°�� ���Դϴ�.

		//��� : ������ ������ �ּ���.
		//		������ ��� 29�Ϸ� �ݿ��ϴ� ����� ���Խ����ֽʽÿ�.	
		//		10��22�� �����ÿ��� �⵵�� 2019������ ����������,
		//		���ľ��۽ÿ��� �⵵�� �Է¹޵��� �� ���Դϴ�.

	public static void main(String[] args) 
	{
		final int year= 2020;	
		int days[] ={31,28,31,30,31,30,31,31,30,31,30,31}; //�� �������� ��¥��

		int day_total=0;
		int day=0;
		int month=0;
		Scanner input= new Scanner(System.in);
		
		System.out.print("���� �Է����ּ��� : ");
		month=input.nextInt();

		System.out.print("���� �Է����ּ��� : ");
		day=input.nextInt();
		
		/*
		���� ���
		������ ��� 2���� days[1]=29���� ���ڸ� �����Ѵ�.
		(�⺻���� 28��/���� �ƴҰ�츦 �������� ��)
		*/

		if(year%4==0){
			if(year%100!=0 || year%400==0)
			{
				System.out.printf("%d���� �����Դϴ�.(2���� 29�� ����)\n",year);
				days[1]=29;
				System.out.println("2�� : " +days[1]);
			}
		}
		else System.out.printf("%d���� ������ �ƴմϴ�.(2���� 28�� ����)\n",year);



		for(int i=0 ; i<month-1 ; i++)
		{
			day_total +=days[i];
		}
		day_total += day;

		System.out.printf("%d�� %d���� %d° �Ǵ� ���Դϴ�.", month, day, day_total);

	}
}