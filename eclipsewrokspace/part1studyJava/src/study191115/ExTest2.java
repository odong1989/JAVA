package study191115;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n, s=0;
		
		while(true){
			System.out.print("�����Է� : ");
			try {
					n = scan.nextInt();
			}
			//����ó��: �����̿��� ���� �Էµ� ���
			catch(InputMismatchException error) {
		//	catch(exception error) {�����Ͽ� ó���ص� �˴ϴ�.		
				System.out.println("���ڰ��� ���������.��");	
				scan.nextLine();//���ۿ� ���Ͱ��� �����ִ�. �̸� �����ϱ����� ȣ����. 
				//���� scan.nextLine();�� �ǽ����� ���� ��� ���Էµ� ���ϰ� ���ѷ����� �޸��Եȴ�...
				continue;
			}
			if (n==0)		
			{
			System.out.println("���α׷� ����");
			break;
			}
		}
		System.out.println("s:"+s);
	}
}
