/*
	
*/

import java.util.Scanner;
class ForTest7 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int Value_Start, Value_End;
		int Temp=0, Total=1;
		System.out.println("n!(���丮��) �����Դϴ�. ");
		System.out.println("���۰��� �Է����ּ���.");
		Value_Start=scan.nextInt();

		System.out.println("���ᰪ�� �Է����ּ���.");
		Value_End = scan.nextInt();

		if (Value_Start > Value_End)
		{
			Temp=Value_Start;
			Value_Start = Value_End;
			Value_End = Temp;
			Temp=0;
		}

		for(int count=Value_Start;count<=Value_End;count++){
			Total*=count;
		}

		System.out.println("���۰� : " + Value_Start + "���ᰪ :"+Value_End;);
		System.out.println("Total : "+Total);
	}
}
