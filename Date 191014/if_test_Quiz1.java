import java.util.Scanner;

class if_test_Quiz1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,max;
		
		System.out.println("�Է��ϴ� 3���� �� �߿��� ���� ū �� ����ϱ�");
		System.out.println("a�� �Է�");
		a=input.nextInt();
		System.out.println("b�� �Է�");
		b=input.nextInt();
		System.out.println("c�� �Է�");
		c=input.nextInt();

		//������ ���
		if(a>b) max=a;
		else max=b;
		
		if(c>max) max = c ;
	
		
		/*�������� ��� �ʱ�ȭ�� max���������� �����Ͽ� ���Ѵ�.

		  �Ʒ��� ���� ����� ���ϴ� ������ ������ ������ ���� ��� 
		  ��ó�� �������� ������ �񱳵Ǵ� ������ �򰥸��� �Ǳ� ���� ����.

		  max ���� �ʱ�ȭ �Ҷ��� 
		   max = 0; ���ٴ� 
		   max = interger.MIN_VALUE;
		  �� ����. 
		  
		  �Է°� 3�� ��� ������ max=0 �ʱⰪ�� ������ ���Ѵ�.
		  (#�����Ͻ� �� ������ ������ ��Ұ� �� �� �ִ�.)
		*/

		/*
		max = integer.MIN_VALUE;
		// max = 0;���� �ϸ� �����鸸 �Է½� �񱳰� �ȵǾ� ������ ������ ����.
		//int���� 
		if(max < a){
			max = a;
		}
		if(max < b){
			max = b;
		}
		if(max < c){
			max = c;
		}
		*/
		System.out.println("max value : "+max );



	}
}