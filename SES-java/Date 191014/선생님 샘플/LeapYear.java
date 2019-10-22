import java.util.Scanner;

//년도 입력받아 윤년 판별 (if, 연산자)
public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		
		System.out.print("년도를 입력하세요 : ");
		year = input.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		}
		else {
			System.out.println(year + "년은 평년입니다.");
		}
	}

}
