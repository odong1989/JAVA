import java.util.Scanner;

class if_test_Quiz1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,max;
		System.out.println("a�� �Է�");
		a=input.nextInt();
		System.out.println("b�� �Է�");
		b=input.nextInt();
		System.out.println("c�� �Է�");
		c=input.nextInt();

		if(a>b) max=a;
		else max=b;
		
		if(c>max) max =c;

		System.out.println("max value : "+max );



	}
}
