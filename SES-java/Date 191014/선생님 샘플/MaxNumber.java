import java.util.Scanner;

//3���� ������ �Է¹޾� ���� ū���� ��� (if��, ������)
public class MaxNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, max;
		
		System.out.print("ù ��° ���� �Է� : ");
		a = input.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		b = input.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		c = input.nextInt();
		
		max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		
		System.out.println(a + "," + b + "," + c + " �� ���� ū ���� " + max + "�Դϴ�.");
	}

}
