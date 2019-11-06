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
		System.out.println("n!(팩토리얼) 계산기입니다. ");
		System.out.println("시작값을 입력해주세요.");
		Value_Start=scan.nextInt();

		System.out.println("종료값을 입력해주세요.");
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

		System.out.println("시작값 : " + Value_Start + "종료값 :"+Value_End;);
		System.out.println("Total : "+Total);
	}
}
