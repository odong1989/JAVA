
import java.util.Scanner;	

/*
   ������ǥ : ��3���� ������ �Է¹޽��ϴ�.
			���հ�/���հݿ��θ� �Ǻ��մϴ�. 
			 [����1] �հ� ����� 60�� �̻��� ��.
			 [����2] �� ������� 40�� �̸��� ������(���� ����)	
            �� �հ�/���հ� ���θ� ����Ͽ� �˷��ݴϴ�.
*/

class HomeWork_191011
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int subject1,subject2,subject3;
		double avg;
		String result;
	
		System.out.println("-------------------------------------------------------------");
		System.out.println("2019�� 10�� 11�� �����Դϴ�.");
		System.out.println("[��ǥ] 3���� ������ �Է¹ް� �հ�/���հݿ��θ� ����մϴ�."); 
		System.out.println("[����1] �հ� ����� 60�� �̻��̸� �հ����� ó���Ѵ�.");
		System.out.println("[����2] ��, �� ���� �� 40�� �̸��� ������ ���հ�ó���Ѵ�.(��������)");
		System.out.println("-------------------------------------------------------------");


		System.out.print("����1�� �����Է��� �Է����ּ��� : ");
		subject1 = in.nextInt(); //���ͽñ��� �Է��� ���� ���������� �Է�
		System.out.print("����2�� �����Է��� �Է����ּ��� : ");
		subject2 = in.nextInt();
		System.out.print("����3�� �����Է��� �Է����ּ��� : ");
		subject3 = in.nextInt();
	
		avg = (subject1+subject2+subject3) /3.0 ; 

		//���ǿ����ڸ� Ȱ���� ���(å78 ����)
		result = avg>60.0&& subject1>40 && subject2>40 && subject3>40 ? "�հ��Դϴ�" :"���հ��Դϴ�." ;


		System.out.printf("��ռ��� : %2.3f ", avg);

		/*
		(1) System.out.printf("��ռ��� : %2.3d ", avg);
		    ...�� ������ ������ �ǻ��ϸ� ������. �Ʒ��� ������ ����.

		Exception in thread "main" java.util.IllegalFormatPrecisionException: 3
        at java.util.Formatter$FormatSpecifier.checkInteger(Formatter.java:2984)
        at java.util.Formatter$FormatSpecifier.<init>(Formatter.java:2729)
        at java.util.Formatter.parse(Formatter.java:2560)
        at java.util.Formatter.format(Formatter.java:2501)
        at java.io.PrintStream.format(PrintStream.java:970)
        at java.io.PrintStream.printf(PrintStream.java:871)
        at HomeWork_191011.main(HomeWork_191011.java:41)
		
		(2)print, println���δ� 2.3f���� �Ұ�����.
		   ������ printf���� %2.3f�� ���������� ���.
		   
		   printf()�� �����ڸ� ���� ������ ���� ���� ���� �������� ��ȯ�Ͽ� ����� �� �ִ�.
		*/

		System.out.println(result);
	}
}
