class WhileTest 
{
	public static void main(String[] args) 
	{
		//for, while, do-while 3���� ������ �ݺ������� ��ο��� 5���� ���.
		//������Ȳ�ÿ��� for������ �ع�����.
		//�ֳĸ� ������ 5���� ���=Ƚ����� �̴ϱ�.
		int i;


		//for : Ƚ�� �ݺ���.
		//		�ʱⰪ, ���ǽ�, �������� ���� ������ Ƚ����ŭ �ݺ��Ѵ�.
		for(i=0; i<5;i++)
		{//�ʱⰪ,���ǽ�,������
			System.out.println("HelloWorld!! - for" + i);
		}
		System.out.println(" ");
		i=0;

		
		//while : ������ �ݺ�
		//		  FM�������� ģ��. ���Ǻ��� ������ �������� ģ�� ��_��
		while(i<5)
		{
			System.out.println("HelloWorld!! - while" + i);
			i++;
		}
		System.out.println(" ");
		i=0;
	
	
		//do{}while : 
		//			  ������ ���� �ʴ´� ������ 
		//����� �Է��� �޴��� �˼� ����, ����� ���� ���� �� ����ϱ� ����.
		//������� �Է��� �ϴ� �ް�
		//����ڰ� �Է��� �� �� ���� ��� �ǵ��(ex-�ٽ� �Է����ּ���)���� 
		//��츦 �� �� ����.
		do{
			System.out.println("HelloWorld!! - Do{}while" + i);
			i++;
		}while(i<5);
		System.out.println(" ");
		i =0;

		/*�̿��� �̾߱�
		  : while, do{}while�� ����� �� ������ �����Ű�� �ʹٸ�
		    while(true)���� while�� ���ǽ� �Է��� TRUE���� �ϸ�ȴ�.
		    C���ó�� while(1)���� �ϸ� boolean���� �ƴ϶�� ��������.
		*/

		//while : ������ �ݺ�
		//		  FM�������� ģ��. ���Ǻ��� ������ �������� ģ�� ��_��
		while(true)
		{
			System.out.println("HelloWorld!! - while(ever repeat)" + i);
			if(i>=4) break;			
			i++;
		}
		System.out.println(" ");
		i=0;

		//��ø�� while��

		int a,b;
		a=0;

		while(a<5){
			b=0;
			while(b<5){
				System.out.print(b + " ");
				b++;
			}
			System.out.println();
			a++;
		}
	
	}
}
