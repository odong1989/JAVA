import java.util.Scanner;

//�⵵ �Է¹޾� ���� �Ǻ� (if, ������)
public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		year = input.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "���� �����Դϴ�.");
		}
		else {
			System.out.println(year + "���� ����Դϴ�.");
		}
	}

}
