import java.util.Scanner;

class HW_feedback_191011
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
//Scanner in : Scanner ��ü�� �����Ѵٴ� �ǹ��Դϴ�.
//new Scanner(System.in); : Scanner(���۷��� ����)�� �����ϰ�   

		int a,b,c;		//�޸𸮸� �Ƴ��ٸ� Byte, char������ ���� �͵� ����̴�. ���� ������ ������ ����ؾ� ������.
		double avg;		//��հ��� �Ҽ������� ������ ��, �޸𸮹��� �ƴ��̻��� ����� ���°� ����.
		boolean result; //�հ�/���հ����� �� �� �ϳ��θ� ���� ����.

		System.out.print("����1 �Է� : ");
		a=in.nextInt();

		System.out.print("����2 �Է� : ");
		b=in.nextInt();

		System.out.print("����3 �Է� : ");
		c=in.nextInt();

	    avg = (a+b+c) / 3.0 ; //������ ���� �Ǵ� ������ ���ڰ� �Ǽ����̸� ������� �Ǽ���(63.33����)�� �ȴ�.
		result = avg>=60.0 && a>=40 && b>=40 && c>=40;

		System.out.println("��� : " + avg);
		System.out.println(result ? "�հ�":"���հ�");//��� ���� ���ǿ����� Ȱ������ ��/���� �� �� �ϳ��� ��µȴ�.


	}
}
