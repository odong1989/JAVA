package global.sesoc.java1.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, s = 0;
		
		try {
			while (true) {
				System.out.print("정수 입력 : ");
				n = scan.nextInt();
				if (n < 0) throw new InputMismatchException();
				s = s + n;
			}
			
		}
		catch (InputMismatchException ex) {
			
		}
		System.out.println("합계:" + s);
		
	}
}



