import java.util.Scanner;

class Quest_191018_Q4
{
	public static void main(String[] args) 
	{
		//[1]선언구간----------------------------------------------------
		int number;			//키보드 입력값 input의 저장.
		int cnt_over3=0;	//3의배수 개수 카운트
		int cnt_over7=0;	//7의배수 개수 카운트


		System.out.println("1부터 입력한 숫자까지의 3의 배수 또는 7의 배수 개수를 계산합니다.");
		System.out.print("값 입력 : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt() ;//키보드 입력
		//[1]선언구간 종료------------------------------------------------

		
		for(int i=1; i<=number; i++)
		{
			if(i%3==0)
			{
				cnt_over3++;
			}
			if(i%7==0)//else if 사용시 21처럼 3,7배수 모두 허용하는 숫자 카운트 못할 수 있음.
			{
				cnt_over7++;
			}
		}//for end 

		System.out.println(" 입력한 숫자 : "+number);
		System.out.println("3의배수 개수 : "+cnt_over3);
		System.out.println("7의배수 개수 : "+cnt_over7);		
	}
}
