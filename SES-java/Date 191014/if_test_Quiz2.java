import java.util.Scanner;

class if_test_Quiz2
{
	public static void main(String[] args) 
	{
	/* 아르바이트 급여를 계산합니다.
		- 근무시간을 입력받습니다.
		- 50시간까지는 시간당 10000원,
		  50시간외의 초과시간은 10% 더 지급합니다.
	*/

		final int pay=10000;//final을 하면 값을 바꿀수 없다.(pay를 시간수당으로 역할변경하였다.)
							//Money등으로 임금을 저장할 수 있는 변수 만들것!
		int time;

		System.out.printf("아르바이트 급여를 계산하는 프로그램입니다.");
		System.out.println("근무시간을 입력하세요");
		Scanner input = new Scanner(System.in);
		time=input.nextInt();

		if(time > 50 )
		{
			pay= (int)((time-50)*10000*1.1 + 50*10000);
		}
		else
		{
			pay= time *10000;
		}


		//선생님의 경우 구별기준점을
		//"근무시간이 50시간이 넘는가"라는 것으로 나와 일치하였다.		
		/*
		int time;
		int money;
		
		final int pay = 10000;
		double night =1.1;
		//자주사용하고, 
		//변경할시 수정하느라 손이 많이 가는 경우
			
		final : 코드를 작성/수정하느라 값이 실수로 바뀔 것을 우려하여
				최초선언한 값 이후로 임의로 바뀌지않도록 못 박아두는 것.

		방법1 상수로 선언해놓고 사용하는 것이 좋아요
		방법2 변수로 선언해 놓기
		System.out.printf("근무시간 : %d \n", time);
		System.out.printf("알바급여 : %d \n", pay);
		
		
		if(time <= 50 )
		{
			pay= time *10000;
		}
		else{
			pay = (int)(50*10000 + (time-50)*10000*1.1);
			//1.1때문에 결과값이 double형이 된다.
			//그래서 (int)를 하여 결과값이 정수형으로 나오도록 하자.
		}
		
		*/




	}
}
