import java.util.Scanner;

class ArrayTest9 
{
	public static void main(String[] args) 
	{
		/*
			���Ǩ� �迭�� �����ϰ� �������� 5���� ���ڸ� �����ʽÿ�
			    (�������� : 1 ~ 15)
			���Ǩ����ڿ��� 1���� ���ڸ� �Է¹޽��ϴ�.
			���Ǩ����ڰ� �Է��� ���� 5���� ���������߿� �ִ��� Ȯ��
		*/
//===================================================================

	int input_save=0;
	Scanner input = new Scanner(System.in);
	int ar[];	
	ar = new int[5];

	System.out.print(" 1~15�� ���ϴ� ���� �Է�: ");
	input_save = input.nextInt();


	//����5�� ���� �� �迭 ����
	for (int i=0; i<ar.length ;i++ )
	{
		ar[i]=(int)(Math.random()*15)+1;
	}

	
	for(int j =0; j<ar.length ; j++)
	{
		if(ar[j] == input_save)
		{
			System.out.println(" �����մϴ�! ��÷�Դϴ�!");
			break;
		}
		System.out.print(ar[j] + " ");
	}


//---------------------------------------------------------------




	}
}