import java.util.Scanner;

class if_test_Quiz2
{
	public static void main(String[] args) 
	{
	/* �Ƹ�����Ʈ �޿��� ����մϴ�.
		- �ٹ��ð��� �Է¹޽��ϴ�.
		- 50�ð������� �ð��� 10000��,
		  50�ð����� �ʰ��ð��� 10% �� �����մϴ�.
	*/

		final int pay=10000;//final�� �ϸ� ���� �ٲܼ� ����.(pay�� �ð��������� ���Һ����Ͽ���.)
							//Money������ �ӱ��� ������ �� �ִ� ���� �����!
		int time;

		System.out.printf("�Ƹ�����Ʈ �޿��� ����ϴ� ���α׷��Դϴ�.");
		System.out.println("�ٹ��ð��� �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		time=input.nextInt();

		if(time > 50 )
		{
			pay= (int)((time-50)*10000*1.1 + 50*10000);
		}
		else
		{
			pay= time *10000;
		}


		//�������� ��� ������������
		//"�ٹ��ð��� 50�ð��� �Ѵ°�"��� ������ ���� ��ġ�Ͽ���.		
		/*
		int time;
		int money;
		
		final int pay = 10000;
		double night =1.1;
		//���ֻ���ϰ�, 
		//�����ҽ� �����ϴ��� ���� ���� ���� ���
			
		final : �ڵ带 �ۼ�/�����ϴ��� ���� �Ǽ��� �ٲ� ���� ����Ͽ�
				���ʼ����� �� ���ķ� ���Ƿ� �ٲ����ʵ��� �� �ھƵδ� ��.

		���1 ����� �����س��� ����ϴ� ���� ���ƿ�
		���2 ������ ������ ����
		System.out.printf("�ٹ��ð� : %d \n", time);
		System.out.printf("�˹ٱ޿� : %d \n", pay);
		
		
		if(time <= 50 )
		{
			pay= time *10000;
		}
		else{
			pay = (int)(50*10000 + (time-50)*10000*1.1);
			//1.1������ ������� double���� �ȴ�.
			//�׷��� (int)�� �Ͽ� ������� ���������� �������� ����.
		}
		
		*/




	}
}
