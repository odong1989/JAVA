class ForTest2 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1; i<=10; i++){
			sum=sum+i;
		}

		System.out.println("1~10 �հ� : " + sum);

		sum=0;
		//int sum=0;�ϸ� �Ȱ��� ���������� �� ���� �ǹǷ� ������ ó���ȴ�. 
		//Ȥ�ö� �����ϰ� �ؼ� �β��β� ���� ���� -_-)+
		for(int i=1; i<=100; i++){
			sum=sum+i;
		}

		System.out.println("1~100 �հ� : " + sum);	
	

		//���� ���
		//������1~100 �߿��� Ȧ���� �հ�
		//������~100 �߿��� 3�� ����̰ų� 5�� ����� ���� �հ�
		//��������� �������� �հ踦 ���Ѵ�. �̶� �հ谡 4000�� �Ѵ� ������ ���ڴ�?


		//������1~100 �߿��� Ȧ���� �հ�
		sum=0;
		for(int i=1; i<=100;i++){
			if(i%2 == 1)
			{
				continue;
			}
			sum=sum+i;
		}
		System.out.println("1~100�� Ȧ������ �հ� : " + sum);	
		//�������� ���� : I+=2;���� ������ IF�� �� �ʿ䰡 �����µ� �ƽ���.



		//������~100 �߿��� 3�� ����̰ų� 5�� ����� ���� �հ�
		sum=0;
		System.out.print("üũ�� 3,5�ǹ�� :  ");
		for(int i=1; i<=100;i++){
			if(i%3 == 0 || i%5 == 0 )
//			if(i%3 != 0 && i%5 != 0 )���� ���ǽ��� �ص� �ȴ�.
			{
			sum=sum+i;
			System.out.print(i+" ");
			}
		}
			System.out.println("1~100�� 3�̳� 5�� ������� �հ� : " + sum);	


		//�������� ����2��Ǯ��
		/*
		sum=0;
		System.out.print("üũ�� 3,5�ǹ�� :  ");
		for(int i=1; i<=100;i++){
			if(i%3 != 0 && i%5 != 0 )//�ᱹ�� ���� ���ǽ��̴�.
			{
			continue;
			}
			sum=sum+i;
			System.out.print(i+" ");
		}
			System.out.println("1~100�� 3�̳� 5�� ������� �հ� : " + sum);			
		*/

		
		//��������� �������� �հ踦 ���Ѵ�. �̶� �հ谡 4000�� �Ѵ� ������ ���ڴ�?
		sum=0;

		for(int i=1; i<=100;i++){
			sum=sum+i;
			if(sum>=4000)
			{
				System.out.println("4000�� �Ѵ� ������ sum �� : " + sum);
				System.out.println("�հ谡 4000�� �Ѵ� ���� �հ迡 ����� ���� :" +i );	
				break;
			}
			//������Ȯ�ο�
			//System.out.print("i :" + i + " ");
			//System.out.println("sum :" + sum + " ");
		}


		//������ ���� ����3	
		sum=0;
		int i_out=1;
		for(; sum<=4000 ; i_out++){
			sum=sum+i;
		}
		System.out.println("1~" + i +"������ �հ� : " + sum);
		//�ϴ� ������ �����Ű�� ����! ���� ��쿡�� while���� �� ���� ���δٰ� �մϴ�.
		/*�١١١١�
		  ���� �ľ��� �������� for�ݺ��� �ڵ��� ����
   	  	  �������� ��� for�� ���Ǻκ��� �ϳ��� if��ó�� Ȱ���ϰ� �ִٴ� ���̴�.
		  ��

		*/



	}
}