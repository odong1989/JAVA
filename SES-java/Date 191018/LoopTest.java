import java.util.Scanner;


class LoopTest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int s = 0;


		//���� 5�� �Է¹޾� �հ豸�ϱ�
/*
		System.out.println("�Էµ� �� 5������ ������ �ǽ��մϴ�.");
		for(int i=0;i<5;i++)
		{
		System.out.println((i+1)+"��° ���� �Է����ּ���.");
		n=scan.nextInt();
		s+=n;
		}
		System.out.println("�հ� : "+ s);
*/
		
		//���� �ݺ��Է¹޾� �հ�. 0�Է��ϸ� ����
		/*�̹� ��쿡�� while��, �װ͵� ���ѹݺ�while(true)�� ��︰��.
		  �ֳ��ϸ� ����ڵ鸶�� ���� �������� �� �� ����.
		  ��� �������(0�� �Է�)�� �� �� ������ �̸� �������� �����.
		*/
		/*
		System.out.println("����ʴ� �����Դϴ�. ���Ḧ ���Ͻø� 0�� �Է��ϼ���.");
		while(true)
		{
		System.out.println((i+1)+"��° ���� �Է����ּ���.");
		n=scan.nextInt();

		if(n ==0) break;
		s+=n;
		}
		System.out.println("�հ� : "+ s);
		*/

		//���� �ݺ��Է¹޾� �հ�. �̹����� do{}while���̴�.

		System.out.println("����ʴ� �����Դϴ�. ���Ḧ ���Ͻø� 0�� �Է��ϼ���.");
		do{
		System.out.println("���� �Է����ּ���.");
		n=scan.nextInt();

		if(n ==0) break;
		s+=n;
		
		System.out.println("�հ� : "+ s);	
		
		}while(true);
		
	

	}
}