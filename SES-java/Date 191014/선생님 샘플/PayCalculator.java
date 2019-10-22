import java.util.Scanner;

//아르바이트 급여 계산하기
//50시간까지는 시간당 10000원. 초과 근무 시간은 10% 더.
public class PayCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hourlyPay = 10000;
		int time;
		int pay = 0;

		System.out.print("근무 시간 : ");
		time = in.nextInt();
		
		if (time <= 50) {
			pay = time * hourlyPay;
		}
		else {
			pay = (int)(50 * hourlyPay + (time - 50) * hourlyPay * 1.1);
		}
		
		System.out.println("급여 : " + pay);
	}

}
