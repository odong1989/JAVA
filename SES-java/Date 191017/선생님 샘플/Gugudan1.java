
import java.util.Scanner;

//���� �Է¹޾� ������ ��� (for��)
public class Gugudan1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;	

		//�� �Է�
		System.out.print("�� �Է� : ");
		a = input.nextInt();
		
		for (b = 1; b <= 9; b++) {
			System.out.println(a + "*" + b + "=" + a * b);
		}
	}

}
