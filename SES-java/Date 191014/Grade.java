import java.util.Scanner;

class Grade 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		int point = input.nextInt();

		if( 0>point || point>100)
		{
		System.out.println("�Է¿���. �ٽ� �Է��ϼ���");
		}
		else if( point<=100 &&point>=90){	//�������� ��� point>=90������ �ϳ��� ���Ǹ� �־ ���Ͽ���. 
		System.out.println("��");
		}
		else if( point<=90 &&point>=80){
		System.out.println("��");
		}
		else if( point<=80 &&point>=70){
		System.out.println("��");
		}
		else if( point<=70 &&point>=60){
		System.out.println("��");
		}
		else{
		System.out.println("��");
		}

		System.out.println("���α׷� �����Դϴ�.");


//��¦ �ñ�! - �׳� �� if�� �ϸ�?
//���� : ����̾簡 �ٳ����� ���� �ִ�.(#������ 5�� ������ ���ϴ� ���̶�)
/*
		if( 0>point || point>100)
		{
		System.out.println("�Է¿���. �ٽ� �Է��ϼ���");
		}
		if( point<=100 &&point>=90){
		System.out.println("��");
		}
		if( point<=90 &&point>=80){
		System.out.println("��");
		}
		if( point<=80 &&point>=70){
		System.out.println("��");
		}
		if( point<=70 &&point>=60){
		System.out.println("��");
		}
		else{
		System.out.println("��");
		}
*/
	}
}