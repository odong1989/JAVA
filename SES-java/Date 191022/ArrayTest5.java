class ArrayTest5 
{
	public static void main(String[] args) 
	{
		//������1
		int a[]=new int[10];
		//int�� ������ 10���� �ܼ��� ���� �Ͱ� ����.
		//������ �迭�� �����ϸ� 0���� �ʱ�ȭ�� �ڵ����� �ȴ�. ������!

		//������2
		int b[];
		b= new int[10];



		for(int i=0;i<a.length;i++)
		{
			//i�� Ȱ���Ͽ� ����� �Է��ϴ� ����� ���ų�
			a[i]=(i+1)*10;
			System.out.println(a[i]);
		}
		System.out.println("");


		int n=0;
		for(int i=0;i<a.length;i++)
		{
			n+=10;
			//������� ����� ������ �����Ͽ� Ȱ���ϴ� ��ȵ� �ִ�.
			//������ �����Ͽ� i�� Ȱ���ϴ°� ���Ҽ��� ������
			//���߿� ���α׷��� �������� ���ٸ� �̷��� ���ҵ��� ������ �����°� �������� �־�.
			//��
			a[i]=n;
			System.out.println(a[i]);
		}
		System.out.println("");



		//random�޼ҵ� ����
			System.out.println( Math.random() );		      //��¹��� : 0.0 <= x < 1.0
			System.out.println( (int)(Math.random()*10));     //��¹��� : 0~9
			System.out.println( (int)(Math.random()*10)+1);   //��¹��� : 1~10, 0�� ��¿�ġ ������ +1�ǽ�.
			System.out.println( (int) (Math.random()*10+1)*10 ); //��¹��� : 10~100
		System.out.println("");

		//0~100�� ������ ������ ������ �迭�� �����մϴ�.
		for(int i =0; i<b.length ; i++)
		{
			b[i]=(int)(Math.random()*100); //��¹��� : 0~100			
		 //b[i]=(int)(Math.random()*101); //�������� ���
			System.out.println(b[i]);

		}
		System.out.println("");

		//Ȯ�ο� / �ڽ��� ���� ������ �ڽ��� ������ ������� ��������
		//Ȯ���� �ϰ� �ʹٸ� 1000�� ���� �����Ͽ� ������ ���� �͵� ����̴�.
		for(int i =0; i<1000 ; i++)
		{
			System.out.println((int)(Math.random()*100));

		}
		System.out.println("");

		System.out.println("�ֻ���-------------------");
		//�ֻ����� 5�� ������ ������ ���ڵ��� ����ϴ� ���
		int random_temp=0;
		for(int i =0; i<5 ;)
		{
			random_temp=(int)(Math.random()*10);
			if ( 0 < random_temp && random_temp < 7)
			{
				System.out.println(random_temp);
				i++;
			}
		}
		System.out.println("");

		//�ڿϾ� ���
		for(int i =0; i<5 ;i++)
		{
			System.out.println((int)(Math.random()*6)+1);
			//���� +1�� ������ ��Ȥ 0�� ���´�
		}
		System.out.println("");


	}
}