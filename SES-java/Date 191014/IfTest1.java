
import java.util.Scanner;

class IfTest1
{

	public static void main(String[] args) 
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int value = Input.nextInt();

	

	/*1) �ܼ� if��(1���� if���� ���̴�, else/elseif�� �Ⱦ���) ����*/
		if (value<0)
		{
			System.out.println("�����Դϴ�.");
		}
		System.out.println("if������ ��������� �ܼ�if���� ���Դϴ�.");

	/*2) if�� 1�� + else ���� ����*/
		if (value<0)
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
		System.out.println("else�� if�� 'no!'�� �������� Ȯ����.");		
		}
		System.out.println("if&else ������ ��������� �ܼ�if���� ���Դϴ�.");		

	/*3) if�� 1��+ else if�� 1�� + else 1�� (#3������)*/
		if(value<0)
		{
			System.out.println("�����Դϴ�.");
		}
		else if(value==0)
		{
		System.out.println("else if�� �ڽŸ��� �������� �纸��.");		
		}
		else
		{
		System.out.println("else�� �� �ƴϸ� �� Ȯ���̿�.");		
		}		
		System.out.println("if&else ������ ��������� if�� 1��+ else if�� 1�� + else 1�� (#3������)�� ���Դϴ�.");				
	

	}
}
