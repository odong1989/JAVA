import java.util.Scanner;

class Quest_191018_Q4
{
	public static void main(String[] args) 
	{
		//[1]���𱸰�----------------------------------------------------
		int number;			//Ű���� �Է°� input�� ����.
		int cnt_over3=0;	//3�ǹ�� ���� ī��Ʈ
		int cnt_over7=0;	//7�ǹ�� ���� ī��Ʈ


		System.out.println("1���� �Է��� ���ڱ����� 3�� ��� �Ǵ� 7�� ��� ������ ����մϴ�.");
		System.out.print("�� �Է� : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt() ;//Ű���� �Է�
		//[1]���𱸰� ����------------------------------------------------

		
		for(int i=1; i<=number; i++)
		{
			if(i%3==0)
			{
				cnt_over3++;
			}
			if(i%7==0)//else if ���� 21ó�� 3,7��� ��� ����ϴ� ���� ī��Ʈ ���� �� ����.
			{
				cnt_over7++;
			}
		}//for end 

		System.out.println(" �Է��� ���� : "+number);
		System.out.println("3�ǹ�� ���� : "+cnt_over3);
		System.out.println("7�ǹ�� ���� : "+cnt_over7);		
	}
}
