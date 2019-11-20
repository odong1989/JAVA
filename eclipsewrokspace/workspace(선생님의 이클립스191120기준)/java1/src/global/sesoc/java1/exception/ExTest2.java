package global.sesoc.java1.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, s = 0;
		
		while (true) {
			System.out.print("정수 입력 : ");
			try {
				n = scan.nextInt();
			}
			catch (InputMismatchException ex) {
				System.out.println("입력 오류. 다시 입력하세요.");
				scan.nextLine();
				continue;
			}
			if (n == 0) break;
			s = s + n;
		}
		System.out.println("합계:" + s);
		
	}
}
