/*
	정수 입력 : 5
	1~5까지의 합계 : 15
*/
import java.util.Scanner;


class  ForTest6
{
	public static void main(String[] args) 
	{
		//단순히 1부터 입력한 값까지를 연산하는 경우
		/*
		Scanner scan = new Scanner(System.in);
		int total=0;
		int temp=0;

		System.out.print("입력하는 정수까지 합계실시됩니다.\n정수입력 : ");
		temp=scan.nextInt();

		for(int cnt=0;cnt<=temp;cnt++) total+=cnt;
		

		System.out.println("1부터"+temp+"까지의 합계결과 : "+total);
		*/

		int Value_Start, Value_End, Temp=0;
		int total=0;
		Scanner scan= new Scanner(System.in);

		System.out.print("시작값 입력 : ");
		Value_Start=scan.nextInt();
		System.out.print("종료값 입력 : ");
		Value_End=scan.nextInt();

		if(Value_Start > Value_End){
		Temp=Value_Start;
		Value_Start = Value_End;
		Value_End = Temp;
		Temp=0;
		}//if end

		for(int cnt=Value_Start; cnt<=Value_End ; cnt++) total+=cnt;
		

		System.out.println(Value_Start+"부터"+Value_End+"까지의 합계결과 : "+total);

	}
}
