import java.util.Scanner;

class if_test_Quiz3 
{
	public static void main(String[] args) 
	{
		/*�⵵�� �Է¹޾� ����/��� ����մϴ�.
		1)4�⸶�� & 400�⸶�� ����
		2)��, 100�⸶�ٴ� ����Դϴ�.
		*/

		Scanner input = new Scanner(System.in);
		int year = input.nextInt();


		System.out.println("���� ���θ� Ȯ���� �⵵�� �Է��ϼ���.");
		if(year %4 ==0 && year %100 !=0)
		{
			System.out.println(year+"�� �����Դϴ�.");	
		}			
		else if(year %400 ==0)//100���� �������� �ɷ��� 400�⸶���� ��츦 Ȯ��
		{
		System.out.println(year+"�� �����Դϴ�.");
		}
		else{
			System.out.println(year+"�� ������ �ƴմϴ�.");
		}

	
		//�������� ���
		//if(y%4==0 && y%100!=0 || y%400==0)
		//���� �����ϰ� ����.
		//&&�����ڰ� ||�����ں��� 1���� ���⿡ ()��ȣ�� ���Ƿ� ��������� �������� �ʾҴ�.
		//if((y%4==0 && y%100!=0) || y%400==0)
		//��ó�� ���� �����̴ٴ� �ֱ�.
	}
}