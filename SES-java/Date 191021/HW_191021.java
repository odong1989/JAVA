import java.util.Scanner;
import java.lang.Math;

/* ���� 10���� �Է��Ͻʽÿ�.
	10
	25
	-4
	-22
	....
	(����)

	�հ� : 200
	��� : 20.0
	�ִ밪 : 100
	�ּҰ� : -22
	��հ� 10 �̻� ���̳��� �� : 10, -22
	

	[��ǥ] ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻʽÿ�.	
	[����] "��հ� 10 �̻� ���̳��� �� : 10, -22"��
	      �ݺ����� �ϳ� �� �����Ͽ� ������ Ȯ���Ͻʽÿ�.
		  (#���ϴ� �߰� ����ϸ� ��հ��� Ȯ���� �ƴϴ� �����ƴ� ������ �����̾�)
*/

class HW_191021
{
	public static void main(String[] args) 
	{

		//����----------------------------------------------------
		int ar[] = new int[10];
		int sum=0;
		double avg=0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Scanner input = new Scanner(System.in);
		//��������-------------------------------------------------------


		//for1 : �Է�10�� �ޱ�---------------------------------------------
		System.out.println("�� 10���� �Է¹޽��ϴ�. ������ ���ڸ� 10�� �Է��ϼ���.");
		for(int i=0; i < ar.length ; i++)
		{
			System.out.print((i+1)+"ȸ :");
			ar[i] = input.nextInt();
		}//for1 end
		System.out.println("");

		//for2 : �ִ밪, �ּҰ�, ��հ� ���(10�̻� ���̴� for3���� Ȯ��)-----------------
		for(int i =0; i<ar.length ; i++)
		{
			sum+=ar[i];

			if(ar[i]>max) max=ar[i];
			if(ar[i]<min) min=ar[i];
		}//for2 end
		    avg= sum / ar.length;
		
		System.out.println("�հ� : "+sum);
		System.out.printf("��� : %.1f \n",avg);
		System.out.println("�ִ� : "+max);
		System.out.println("�ּ� : "+min);


		//for3 : ��հ��� 10�̻� ���̳��� �� Ȯ��
		System.out.println("��հ����� ���̰� 10�̻��� ���ڵ��� �Ʒ��� �����ϴ�.");
		for(int i =0; i<ar.length ; i++)
		{
			if(10 < Math.abs( avg- Math.abs(ar[i]) ) )
			System.out.print( ar[i]+" " );			
		}//for3 end	
		System.out.println("");

	}
}
