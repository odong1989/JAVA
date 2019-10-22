
import java.util.Scanner;

//단을 입력받아 구구단 출력 (for문)
public class Gugudan1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;	

		//단 입력
		System.out.print("단 입력 : ");
		a = input.nextInt();
		
		for (b = 1; b <= 9; b++) {
			System.out.println(a + "*" + b + "=" + a * b);
		}
	}

}
