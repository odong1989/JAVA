import java.util.Scanner;

public class BasicTest3 {

	public static void main(String[] args) {
		Scanner in;
		int a, b, c;
		double avg;
		boolean result;

		in = new Scanner(System.in);

		System.out.print("����1 : " );
		a = in.nextInt();
		System.out.print("����2 : " );
		b = in.nextInt();
		System.out.print("����3 : " );
		c = in.nextInt();

		avg = (a + b + c ) / 3.0;
		result = avg >= 60.0 && a >= 40 && b >= 40 && c >= 40;

		System.out.println("��� : " + avg);
		System.out.println( result ? "�հ�":"���հ�");
	}
}
