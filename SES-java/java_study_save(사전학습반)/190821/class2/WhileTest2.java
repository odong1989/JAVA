/*
	����ڰ� �Է��� ���ڵ��� �հ踦 ���Ѵ�. 0�� �ԷµǸ� ����ȴ�.
*/

import java.util.Scanner;

class WhileTest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int input, sum;

		sum=0;

		System.out.println("�������α׷��� �ǿӧc.�̹��� while������ �����Ǿ���!");		
		System.out.println("�̹��� ������ ����ϸ� ����0�� ������ ����Ǵ� ���� ������.");
		System.out.println("����� ���ڸ� �Է��غ�");
		
		input=scan.nextInt();


		//���� ���
		while(input!=0){
		sum+=input;
		System.out.println("�߰������ : " + sum);

		System.out.println("���� ���� ���� �Է����ּ���.");
		input=scan.nextInt();

		System.out.println("�����ԷµȰ� : " + input);
		}

		System.out.println("�հ� : " + sum);
	}
}
