package study191115;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExTest3 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input=0; int sum=0;
		
		try {
			while(true){
			System.out.print("�������Է�!�ƴϸ� ����ó���� : ");

				input = scan.nextInt();//catch(Input..)��� ���ڵ��� �����ܿ��� �۵��Ѵ�.
				//if(input<0) break;//������ ��� �����ϵ��� �����Ͽ����ϴ�.
				if(input<0) throw new InputMismatchException();//���� ������ ������ ����ϱ� ���ؼ� ������ ������ ó���ϵ��� throw���� �մϴ�.	
				sum=sum + input;
			}
		}//try end
		//if(input<0) break;�� Ż���Ͽ������ϴ� ��ġ�Դϴ�.
		
		
		catch(InputMismatchException error) {
		//break���� ��� while���� �������Ա⿡
		// �ڿ������� catch�Ʒ��� �ڵ���� �۵��մϴ�.
		//(#���Ҿ�..�ڿ������� Ż���߾�)
			System.out.println("����ó�� InputMismatchException�� �۵��Ǿ����ϴ�.");
		}
		System.out.println("sum:"+sum);

		/*[?]�� ������ �ǹ̰� �ִ� �ǰ���?
		 * �ǹ̸� ���ٷ� �ϸ� "�Է¿��� + ���� ����"
		 * 
		 * <�����ǹ�1> : break���� Ȱ���ϴ� �������� ���μ����� ���´�...? 
		 * ExTest2�� ��� 
		 * Ż����1) catch���� break���� �����ϰų� 
		 * Ż����2) ���ǹ�if�� ���� ����0�� �Է½� Ż���Ѵ�.
		 * �̷����̾���.
		 * 
		 * ������ �̹� ������ 
		 * Ư¡1)try���� while���� ���մ�.
		 * Ư¡2)�߸��Է��ϴ� ������ catch���� ����ȴ�.
		 * 
		 * ��! break���� �������� �ڿ������� Ż���ϰ� �Ǵ°��� �ٽ�����Ʈ�� ���̴�!!
		 * 
		 * <�����ǹ�2> : ����ó���� �� �� ���������� �� �� �ְ� �Ѵ�.
		 * if(input<0) throw new InputMismatchException();
		 * �� ���Ͽ� �⺻������ ó���Ǵ� 
		 * */
	}
}
