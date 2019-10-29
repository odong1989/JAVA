/**
====문서화 구간 시작==================================================================
1.본 클래스 설명
 : 빙고게임입니다. 1개의 직선을 완성하면 승리합니다.
   2명의 플레이어가 있습니다.

2.import하는 클래스
①import java.util.Scanner;
(이하없음)

3.메소드(함수) 설명
①void DrawSquare() : 빙고게임의 사각형 틀 및 숫자를 배치합니다.(10월24일 과제를 참고함.)

4. 변수설명(main 메소드만)
//① int player1LineValue
  : 플레이어1이 그린 배열의 

//② int player2LineValue 
  :

//③ Scanner input
  :

//④ int turnLimit
  :

//⑤ int field[]
  : 3*3의 사각형에 숫자를 출력한다.

//⑥ 
  :

====문서화 구간 종료==================================================================
*/

import java.util.Scanner;

class PJ_BingoGame
{
	public static void main(String[] args) 
	{
		//[1]변수선언시작-------------------------------------------------
		String field[]={"1","2","3","4","5","6","7","8","9"};			//5
		int gameLimit=field.length;					//4	
		int victoryCondition[]={6,12,15,18,24};		//6

		
		Scanner input = new Scanner(System.in);		//3
		int inputValue=Integer.MIN_VALUE;
		int player[]={0,0};	//1
		int flagTurn=0;	//0: 플레이어1(X)차례, 1: 플레이어2차례(O)
		//[1]변수선언종료--------------------------------------------------
		




		//[2]빙고게임 시작 for
		for (int turnCount=1 ; turnCount <= gameLimit ; turnCount++)
		{
			DrawSquare(field); //빙고게임 필드 3*3 및 숫자 배치출력
			

			//step0.플레이어 선택------------------------------------------
			System.out.printf("턴 : %d \n",turnCount);
			System.out.printf("플레이어 %d의 차례입니다.",flagTurn+1);

			//step0.플레이어 선택------------------------------------------


			//step1.플레이어의 값입력--------------------------------------------------------
			System.out.print("선택할 값을 입력하세요 : ");				
			inputValue=input.nextInt();

			//step1.플레이어의 값입력--------------------------------------------------------



			//step2.플레이어의 입력값 선택중복(중복입력) 체크---------------------------------------
			//		중복이 확인될경우 해당차수-처리하여 다시 입력받을 수 있도록 할것.			
			if(field[inputValue-1] == "X" || field[inputValue-1] == "O")
			{
				System.out.println("이미 선택된 값입니다. 다시 선택해주세요.");
				turnCount--; //카운트 증가처리를 막음으로써 중복선택이 턴카운트되는 오류를 삭제.
				continue;
			}	
			//step2.플레이어의 입력값 선택중복(중복입력) 체크 종료---------------------------------------
		
			//[신규!]step4.선택된 숫자는 O/X으로 표기하기 시작--------------------------------------------
			else
			{
			switch (flagTurn)
			{
			case 0 : field[inputValue-1]="X";			
					 player[flagTurn]+=inputValue;
	  				 System.out.printf("<확인용>플레이어%d의 보유값 : %d\n",flagTurn+1,player[flagTurn]);
					 break;
			case 1 : field[inputValue-1]="O";			
					 player[flagTurn]+=inputValue;
	  				 System.out.printf("<확인용>플레이어%d의 보유값 : %d\n",flagTurn+1,player[flagTurn]);
					 break;
			default : System.out.println("예상외의 에러발생입니다.");
					 break;
			}
			}
			//[신규!]step4.선택된 숫자는 O/X으로 표기하기 종료--------------------------------------------



			//step3.플레이어의 승리여부 확인---------------------------------------------------
			//		승리조건이 되는 victoryCondition배열의 값과 동일한 경우 승리로 판정한다.
				for(int victoryCheck=0; victoryCheck < victoryCondition.length; victoryCheck++)
				{
					if(player[flagTurn] == victoryCondition[victoryCheck])
					{
						DrawSquare(field); //빙고게임 필드 3*3 및 숫자 배치출력
						System.out.printf("플레이어 %d이/가 승리하였습니다.",flagTurn+1);
						System.out.println("게임을 종료합니다.");
						return;
					}
				}//승리확인 for 종료

				flagTurn=(flagTurn+1)%2; //증감후 나머지 연산하여 0,1으로 플레이어턴 결정

			//step3.플레이어의 승리여부 확인 종료---------------------------------------------------
		
		}//빙고게임 시작 for end

			
			
	}//main method end

	




//Method-DrawSquare======================================================================================================
//사각형과 숫자를 그리는 메소드. main메소드가 너무 복잡해져서 DrawSquare라는 별도의 메소드로 분할하였다.
	public static void DrawSquare(String[] field) 
	{
		int arraySellector=0;//사각형 생성 반복문으로는 적절한 숫자 생성을 할 수 없다.		

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
					System.out.printf("%s",field[arraySellector]);
					arraySellector++;	
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
	}// DrowSquare() method END

//Method-DrawSquare======================================================================================================


}//class class PJ_BingoGame END
