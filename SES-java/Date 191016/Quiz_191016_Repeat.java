/*191016 ����-�ٽ� �ѹ� �Ⱥ��� ¥����

  ��ǥ : 22~122�������� �����ڵ� ���ڸ� ����ϼ���.
  ���� : (1)1�ٴ� 5���� ����ϼ���.
        (2)�ϳ��� ������ �ϳ��� ���Ҹ� �ϵ��� �ϼ���.
*/
class Quiz_191016_Repeat
{
	public static void main(String[] args) 
	{
		/*
		char count  : 1�ٴ� ��°����� ����.
					  5�� �Ǹ� �����ϵ��� �Ѵ�.

		char output	: ����� �����ڵ���� ��ȣ���̴�.	
		*/
		char count =0;
		for(char output=22; output<=122 ; output++)
		{
			if(count == 5 )
			{
			System.out.print("\n-----------------------------------------------\n");
			count=0;
			}
			System.out.printf("%3d",(int)output);
			System.out.print(" : " + output+" |");
			count++;
		}


	}
}