import java.util.Scanner;

class ForTest4
{
	public static void main(String[] args) 
	{
		int total=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Դϴ�. ���ڸ� �Է����ּ���");
		System.out.println("���ڴ� �� 5���� �Է¹޽��ϴ�.");

		for(int cnt=0;cnt<5;cnt++){			
		System.out.println((cnt+1)+"��° ���ڸ� �Է����ּ���");
		total+=scan.nextInt();
		}

		System.out.println("�հ� : "+total);
	}
}
