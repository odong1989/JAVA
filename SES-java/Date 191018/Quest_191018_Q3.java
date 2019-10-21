import java.util.Scanner;
/*
과제3.입력받은 숫자의 n!를 구하세요
[조건] 1~100 이내의 값만 허용됩니다.(이외의 값들은 다시 입력받도록 설정하십시오)

<실행 예>
정수입력 : 500
1~100의 수를 입력하세요
정수입력 : 5
5! = 120
*/
//현황 : 20이후부터 입력하면 계산이 0 나오는 에러들이 발생된다.
//선생님 말씀 : 15만 넘어가려해도 int형이 감당하기 힘들며
//	 	     더블형을 쓸수 있는지 확인할려고 일부러 이렇게 하셨다고.

class Quest_191018_Q3
{
	public static void main(String[] args) 
	{
		double number=0;
		double factorial=1;
		Scanner input = new Scanner(System.in);


		System.out.println("과제3.입력받은 숫자의 n!를 구하세요 입니다.");
		System.out.println("[조건] 1~100 이내의 값만 허용됩니다. \n (이외의 값들은 다시 입력받도록 설정하십시오)");
		number = input.nextInt();

		do{
			if(number <= 0 || number> 100)
			{
				System.out.println("1~100이내의 숫자만 입력해주세요");
			}
			else
			{		
				for(int i=1; i<=number ; i++)	
				{
					factorial = factorial*i;
				}
				
				break;
			}

		//1~100외의 값 입력시 다시 입력하도록 받는 구간.
		number = input.nextInt();
		}while(true);

		System.out.println(number + "! = " + factorial);


	}
}
