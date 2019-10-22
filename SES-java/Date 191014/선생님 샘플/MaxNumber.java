import java.util.Scanner;

//3개의 정수를 입력받아 가장 큰수를 출력 (if문, 연산자)
public class MaxNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, max;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = input.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		b = input.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		c = input.nextInt();
		
		max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		
		System.out.println(a + "," + b + "," + c + " 중 가장 큰 수는 " + max + "입니다.");
	}

}
