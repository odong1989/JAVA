/*191016 퀴즈

  목표 : 22~122번까지의 유니코드 문자를 출력하세요.
  조건 : (1)1줄당 5개씩 출력하세요.
        (2)하나의 변수는 하나의 역할만 하도록 하세요.
*/


class Quiz_191016_unicode_chart
{
	public static void main(String[] args) 
	{

		//나의 방식
		System.out.println("나의 방식대로 출력해본 경우(개행없음)");
		for(char count=22; count<=122; count++)
		{
			//if
			System.out.print((int)count + " : ");//	
			System.out.println(count);// 
		}

		//선생님 방식 - 할일을 여러개 시키는 경우 예제(#추천하지는 않는 방식)
		System.out.println("선생님의 출력해본 경우(추천않는방식이다. 여러가지 일을 시키니)");
		for (int ch=22; ch<=122 ; ch++)
		{
			System.out.print(ch + " : " + (char)ch + "\t");
			if(ch % 5 == 1)
			{
			System.out.println();
			}
			//각자 할일은 따로 따로 시키는 게 나아요.
			//이처럼 ch가 여러가지 임무를 맡아서 하게되면
			//ch의 변동에 따라 소스코드의 여러 부분을 수정해야 하고 
			//여기서 에러발생 또는 수정의 시간이 늘어나기 쉽습니다.
		}


		//선생님 방식2 변수들의 역할을 1변수당 1개의 임무만 맡기는 방식
		System.out.println("선생님의 출력해본 경우(변수들의 역할을 1변수당 1개의 임무만 맡기는 방식)");
		int cnt = 0 ;
		for (int ch=22; ch<=122 ; ch++)
		{
			System.out.print(ch + " : " + (char)ch + "\t");
			cnt++;
			if(cnt % 5 == 0)
			{
			System.out.println();
			}
			//ch 역할 : 출력할 코드에만 신경쓴다 22번, 23번... 식으로 출력할 것만 신경쓴다.
			//cnt 역할 : 출력이 5개가 되었는지, 개행할 시점인지만 카운트한다.
		}	
		System.out.println("\n\n\n");

		cnt = 0 ;
		for (int ch=0; ch<=100 ; ch++)
		{
			System.out.print(ch + " : " + (char)ch + "\t");
			cnt++;
			if(cnt % 5 == 0)
			{
			System.out.println();
			//10~14경우 출력이 조금 이상하지만 정상이다.
			//
			}
			//ch 역할 : 
			//cnt 역할 : 출력이 5개가 되었는지, 개행할 시점인지만 카운트
		}		

	
	}
}
