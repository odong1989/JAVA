/*
	���� �Է� : 5
	1~5������ �հ� : 15
*/
import java.util.Scanner;


class  ForTest6
{
	public static void main(String[] args) 
	{
		//�ܼ��� 1���� �Է��� �������� �����ϴ� ���
		/*
		Scanner scan = new Scanner(System.in);
		int total=0;
		int temp=0;

		System.out.print("�Է��ϴ� �������� �հ�ǽõ˴ϴ�.\n�����Է� : ");
		temp=scan.nextInt();

		for(int cnt=0;cnt<=temp;cnt++) total+=cnt;
		

		System.out.println("1����"+temp+"������ �հ��� : "+total);
		*/

		int Value_Start, Value_End, Temp=0;
		int total=0;
		Scanner scan= new Scanner(System.in);

		System.out.print("���۰� �Է� : ");
		Value_Start=scan.nextInt();
		System.out.print("���ᰪ �Է� : ");
		Value_End=scan.nextInt();

		if(Value_Start > Value_End){
		Temp=Value_Start;
		Value_Start = Value_End;
		Value_End = Temp;
		Temp=0;
		}//if end

		for(int cnt=Value_Start; cnt<=Value_End ; cnt++) total+=cnt;
		

		System.out.println(Value_Start+"����"+Value_End+"������ �հ��� : "+total);

	}
}
