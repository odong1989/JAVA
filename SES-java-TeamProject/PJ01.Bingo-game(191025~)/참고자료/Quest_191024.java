class Quest_191024
{

		/*
		목표 : 아래의 9개의 문자형태의 숫자들을 
			  3*3의 사각형틀을 만든다음에 한개씩 넣어서 출력되도록 하세요

		조건 : 변수는 char ch1= '1';만을 활용하여 만드십시오.
		힌트 : 'a'+i식으로 하면 유니코드 배치따라 b,c,d.. 식으로 할 수 있습니다.

		조건1은 아래처럼 무식하게 9개 일일이 만드지 말란이야기임.
		char ch1= '1';char ch2= '2';char ch3= '3';
		char ch4= '4';char ch5= '5';char ch6= '6';
		char ch7= '7';char ch8= '8';char ch9= '9';
		*/

/*출력할 예상모습
┌───────┬───────┬───────┐
│   1   │   2   │   3   │
├───────┼───────┼───────┤
│   4   │   5   │   6   │
├───────┼───────┼───────┤
│   7   │   8   │   9   │
└───────┴───────┴───────┘
*/

/*
		//반복문 구성위한 구성분석.
		char ch1='1';
		System.out.print("┌───────┬───────┬───────┐\n");	//맨위라인(바로출력)
		System.out.print("│   ");							//1,4,7
		System.out.print("   │   ");						//1~2,2~3,4~5,5~6,7~8,8~9	
		System.out.print("   │");							//3,6,9		
		System.out.print("├───────┼───────┼───────┤");		//3우측 출력후, 6우측 출력후,9우측 출력후		
		System.out.print("└───────┴───────┴───────┘");		//9우측까지 출력후		
		System.out.print("");				
		System.out.print("");		
*/
	public static void main(String[] args) 
	{
		char ch='1';

		
		for (int i=0; i<3; i++)//가로라인(숫자출력않는 부분만) 출력
		{
			switch (i)
			{
			case 0 : System.out.print("┌───────┬───────┬───────┐\n");	//맨위라인(바로출력)
					 break;
			case 1 : System.out.print("├───────┼───────┼───────┤\n");		//3우측 출력후, 6우측 출력후,9우측 출력후		
				     break;
			case 2 : System.out.print("├───────┼───────┼───────┤\n");		//3우측 출력후, 6우측 출력후,9우측 출력후		
					 break;
			default : System.out.print("정의되지않은 에러가 발생되었습니다.\n");
					  break;
			}
			
						
			for(int j=0; j<7 ;j++)// 촘ㄱ와 |자형 칸막이 생성 
			{

				if(j%2==1)
				{
					System.out.printf("%s",ch);
					ch++;	
				}

				switch (j)
				{
				case 0 : System.out.print("│   ");			//1,4,7의 왼쪽 벽
						 break;
				case 2:  System.out.print("   │   ");		//1~2, 4~5, 7~8 사이의 벽 |	
						 break;
				case 4:  System.out.print("   │   ");		//2~3, 5~6, 8~9 사이의 벽 |	
						 break;
				case 6:  System.out.print("   │\n");			//3,6,9의 우측 벽		
						 break;
				default : System.out.print("");
						  break;
				}
			}
		}
		System.out.print("└───────┴───────┴───────┘\n");		//9우측까지 출력후		

	}
}
