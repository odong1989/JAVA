import java.util.Scanner;

class ArrayTest2
{
	public static void main(String[] args) 
	{
		//�迭 ������1 : ����&��ü�ּ� �������ÿ� �ϱ�(#��ҿ� �� �ϴ� ���)	
		int b[] = 	new int[0];

		//�迭 ������2 : �� �迭���� ����, �� ��ü�ּ� ����
		int a[]=null; //�迭�� ���� �������ϰ� ���� a[]�� �ִ� ����.
		a = new int[10]; //���߿� ��ü�� �ּҸ� �˷��ִ� ���


		//�Ʒ��� ���׵��� �ǽ��ϱ� ���� �������� ����		
		Scanner input = new Scanner(System.in);
		int sum=0;



		//======================================================================================================================		
		//10���� ������ �Է¹޾� a�迭�� �� ����(�ε���)�� �����Ͻʽÿ�.
		for(int i =0; i <a.length ; i++)
		{
			System.out.print(i+"��° �迭�ε����� ���� ���� �Է��ϼ���.");
			a[i] = input.nextInt();
		}
		System.out.println("");


		//�Է¹��� 10���� ������ ����Ͻʽÿ�.
		System.out.println("�迭�ε����� �Էµ� ���� �Ʒ��� �����ϴ�.");
		for(int i =0; i <a.length ; i++)
		{
			System.out.println(i+"��° �迭�ε����� �� : " + a[i]);
		}
		System.out.println("");


		//�Է¹��� 10���� ������ ����Ͻʽÿ�.
		//part1. �� �迭���� �Է��� ���� ���� �� �� +��ȣ ����
		System.out.println("������ ������ & �հ�� �Ʒ��� �����ϴ�.");
		for(int i =0; i <a.length ;)
		{
			System.out.print(a[i]);
			i++;
			if(i > a.length) break;
			System.out.print("+");
		}

		//part2. sum������ �迭���� ������ �հ踦 ����
		for(int i =0; i <a.length ;i++)
		{
			sum+=a[i];
		}		
		System.out.println(sum);


		/*�������� ��� �Ʒ��� ���� ó��.
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+"+");
			sum+=a[i];
		}	
			System.out.println("="+sum)
		//���ϰ� ������ ���߸� ������ �������� ����.
		*/

		//======================================================================================================================

	}
}
