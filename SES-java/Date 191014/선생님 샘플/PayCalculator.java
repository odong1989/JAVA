import java.util.Scanner;

//�Ƹ�����Ʈ �޿� ����ϱ�
//50�ð������� �ð��� 10000��. �ʰ� �ٹ� �ð��� 10% ��.
public class PayCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hourlyPay = 10000;
		int time;
		int pay = 0;

		System.out.print("�ٹ� �ð� : ");
		time = in.nextInt();
		
		if (time <= 50) {
			pay = time * hourlyPay;
		}
		else {
			pay = (int)(50 * hourlyPay + (time - 50) * hourlyPay * 1.1);
		}
		
		System.out.println("�޿� : " + pay);
	}

}
