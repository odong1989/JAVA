import java.util.Scanner;

//Ű����� �����ڿ� ����2���� �Է¹޾� ��� (if��, switch��, ������)
public class Calculator1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, op, res = 0;
		String strOp = "";
		
		System.out.print("����1 : ");
		num1 = input.nextInt();
		System.out.print("����2 : ");
		num2 = input.nextInt();
		System.out.print("������ (1:+ 2:- 3:* 4:/) : ");
		op = input.nextInt();
		
		switch (op) {
		case 1 : 
			res = num1 + num2; 
			strOp = " + ";
			break;
		case 2 : 
			res = num1 - num2; 
			strOp = " - ";
			break;
		case 3 : 
			res = num1 * num2; 
			strOp = " * ";
			break;
		case 4 : 
			if (num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				return;
			}
			res = num1 / num2; 
			strOp = " / ";
			break;
			
		default : 
			System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
			return;
		}
		
		System.out.println(num1 + strOp + num2 + " = " + res);
	}
}
