import java.util.Scanner;

class ArrayTest9_RE
{
	/*
		���Ǩ� �迭�� �����ϰ� �������� 5���� ���ڸ� �����ʽÿ�
		    (�������� : 1 ~ 15)
		���Ǩ����ڿ��� 1���� ���ڸ� �Է¹޽��ϴ�.
		���Ǩ����ڰ� �Է��� ���� 5���� ���������߿� �ִ��� Ȯ��
	*/

	public static void main(String[] args) 
	{
		int ar[];
		ar=new int[5];
		Scanner input = new Scanner(System.in);
		int input_user;

		//���� 5�� ���� �� ����	
		for (int i=0; i<ar.length ; i++ )
		{
			ar[i] = (int)(Math.random()*15)+1;
		}

		//������� ���ϴ� �� ����
		System.out.print("���ϴ� ���� �Է� : ");
		input_user = input.nextInt();
		
		for(int j=0; j<ar.length ; j++){
			if(ar[j] == input_user) 
			{
				System.out.println("ar[j] ="+ar[j] + "input_user" + input_user);
				break;
			}
		System.out.println("ar[j] =" + ar[j]);
		}

		
	}
}
