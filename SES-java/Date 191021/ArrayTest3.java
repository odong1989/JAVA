import java.util.Scanner;
/*
[��ǥ] ����ڿ��� �Է��� ������ ������ ���� �迭�� �����Ͻʽÿ�.
[����] �ݺ������� ���ڸ� �Է¹����ʽÿ�.
	  �迭�� ������ ĭ�� �հ踦 �����ϴ� �뵵�� ����Ͻʽÿ�.

	  ����� ����Ͻʽÿ�.
*/
class ArrayTest3 
{
	public static void main(String[] args) 
	{
	//==================================================================================
		int ar[]=null;
		int index_num=0;
		int sum=0;

		Scanner input = new Scanner(System.in);

	//-------------------------------------------------------------------

		System.out.println("�迭�� ������ ������ �Է����ּ���.");
		System.out.print("������ �迭�� �հ���̴� �����ؼ� �����ϼ���.");
		index_num = input.nextInt();


		ar = new int[index_num];


		System.out.println((index_num-1)+"���� �迭���� �Է¹޽��ϴ�.");
		for(int i=0; i < ar.length-1 ;i++)
		{
			System.out.print(i+"��° �迭�� �� : ");
			ar[i] = input.nextInt();		
			sum+= ar[i];
		}
		ar[index_num-1]=sum;


		System.out.println("�Է°�� ����Դϴ�.");
		for(int i=0;i<=ar.length;)
		{
			System.out.print(ar[i]);
			i++;
			if(i==ar.length-1)
			{
				System.out.print("=" + ar[i]);
				System.out.println("");
				break;
			}
			System.out.print("+");
		}
			

	}
}
