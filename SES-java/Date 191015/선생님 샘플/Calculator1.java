import java.util.Scanner;

//키보드로 연산자와 정수2개를 입력받아 계산 (if문, switch문, 연산자)
public class Calculator1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, op, res = 0;
		String strOp = "";
		
		System.out.print("정수1 : ");
		num1 = input.nextInt();
		System.out.print("정수2 : ");
		num2 = input.nextInt();
		System.out.print("연산자 (1:+ 2:- 3:* 4:/) : ");
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
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			res = num1 / num2; 
			strOp = " / ";
			break;
			
		default : 
			System.out.println("연산자를 잘못 입력했습니다.");
			return;
		}
		
		System.out.println(num1 + strOp + num2 + " = " + res);
	}
}
