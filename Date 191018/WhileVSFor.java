import java.util.Scanner;


class WhileVSFor 
{
	public static void main(String[] args) 
	{
		int b=0;
		int sum=0;

		while(b<=100)
		{
			if( b%2 ==1 ) sum=sum+b;
			b++;
		}
		System.out.println("1~100���� Ȧ���� �� : "+sum);

	/*
       (5��) 1 0 0 0 0         
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1
		//19.10.17 for�� Ȱ���� ���� �߿���
		System.out.println("5��");
		for(int i=0;i<5;i++)
		{
			for(int j =0;j<5;j++)
			{
			System.out.printf("%2d", i == j ? 1 : 0);
			//if���Ӹ� switch���� ������ �־��.
			//�������� 10000, 1000, 100, 10, 1������ ����Ͻ� ��ʵ� �ִٰ�...�Ѵ�.
			//bit������ 0,1����ϴ� ��ʵ� ����...
			}
			System.out.println("");
		}
		System.out.println("------------------------");
	*/

	int x=0,y=0;
	
	while(x<5)
	{
		while(y<5)
		{
			if(x==y)
			{
				System.out.print("1 ");
			}
			else
			{
				System.out.print("0 ");
			}
			y++;
		}
		System.out.println("");
		x++;
		y=0; 
	}

	System.out.println("");
	System.out.println("");


	/*
		(ex1)
		*
		**
		***
		****
		*****
	*/

	x=0;y=0;
	
	while(x<5)
	{
		while(y<5)
		{
			if(x>=y) System.out.print("1 ");
			y++;
		}
		System.out.println("");
		x++;
		y=0; 
	}
	System.out.println("");

	
	//�������� �ʴ�(���ѷ���)�� ��쵵 for�� ���ұ�?
	/*
		//while������ �ۼ��� ���.
		System.out.println("����ʴ� �����Դϴ�. ���Ḧ ���Ͻø� 0�� �Է��ϼ���.");
		do{
		System.out.println("���� �Է����ּ���.");
		n=scan.nextInt();

		if(n ==0) break;
		s+=n;
		
		System.out.println("�հ� : "+ s);	
		
		}while(true);
	*/
	
	/*
	//���ѹݺ� - for�� ����
	Scanner scan = new Scanner(System.in);
	int n;
	int s = 0;
	int cnt=0;

	System.out.println("����ʴ� ���� for�������Դϴ�. ���Ḧ ���Ͻø� 0�� �Է��ϼ���.");
	System.out.println("���� �Է����ּ���.");
	for(;cnt<Integer.MAX_VALUE;cnt++)
	{
		n=scan.nextInt();
		if(n ==0) break;
		s+=n;
		System.out.println("�հ� : "+ s);			
	}
	*/
//for�� ������/�����ǹ�(do{}while)�� �ϱ� ���Ѱ�? ���ϱ�
/*do{}while�� ����/���� �ҽ��� �����ϴ�.	*/


	Scanner scan = new Scanner(System.in);
	int n;
	int s = 0;
	int cnt=0;

	System.out.println("����ʴ� ���� for�������Դϴ�. ���Ḧ ���Ͻø� 0�� �Է��ϼ���.");
	System.out.println("���� �Է����ּ���.");
	
	for(;cnt<Integer.MAX_VALUE;cnt++)
	{
		n=scan.nextInt();
		if(n ==0) break;
		s+=n;
		System.out.println("�հ� : "+ s);			
	}

	}
}
