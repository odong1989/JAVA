import java.util.Scanner;

class APItest1WebID
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		String email;

		System.out.print("�̸��� �Է� : ");
		email = scan.next();//.next() : ��ĭ���� String���ڿ��� �޽��ϴ�.
			

		//�̸����� ����Ͻÿ�.
		System.out.println(email);
	
		 //���ڿ� ���̸� ����Ͻÿ�.
		System.out.println(email.length());


		//�̸������ ����� Ȯ��('@'1���� '.(��);1�� ���ԵǾ� �ִ����� Ȯ���Ͻÿ�.

		//---------------------------------------------------------------------------------------------
		//ID�� ������ּ���.[��Ʈ]ã�� ���ڰ� ���� �� -1�� ���ϵ˴ϴ�.
		if(email.indexOf('@')!=-1 &&email.indexOf('.') != -1)
		System.out.println("�̸��� �ּҰ� �����ԷµǾ����ϴ�.");
		else 
		System.out.println("�߸��� �ּ��Դϴ�.");

		//�����Բ��� �Ͻ� ��Ÿ��(3�����̵����)
		System.out.println(email.contains("@")&& email.contains("."));
		//---------------------------------------------------------------------------------------------

		//ID�� ������ּ���.
		System.out.println(email.substring(0,email.indexOf('@')));		
		//�����Բ��� �Ͻ� ��Ÿ��(4�����̵����)
		String s[] = email.split("@");	//split(�Է��� ���ڸ� �������� ������ ó��)�� ���� s�迭�� ������״�.(�� String������ �����Ϸ� �ϸ� ������. �迭�� �϶��..)
		System.out.println(s[0]);		

	}
}
