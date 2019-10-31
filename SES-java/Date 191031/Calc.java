/**
Calc 클래스 정의											|요구하는 정의사항들을 위해
- Calc 클래스 정의를 위해 실시해야 할 조건들입니다.					|실시한 사항은 아래와 같습니다.
----------------------------------------------------------------------------------------------------------------------
[조건1] 멤버 변수로 int형 배열을 가집니다.						|[조건1] private int array[] = new int[10]; 로 구현.
[조건2] 아래의 기능들을 구현해주십시오.							|
[조건2.1] 배열을 전달받아 멤버변수에 대입하는 메소드					|[조건2.1] public void setArray(int[] arIn) 메소드로 구현.
[조건2.2] 배열의 원소 개수를 리턴하는 메소드						|[조건2.2] public int count()	메소드로 구현.
[조건2.3] 배열 내의 모든 값의 합계를 리턴하는 메소드					|[조건2.3] public int sum() 메소드로 구현.
[조건2.4] int형 정수 하나를 전달받아 모든 원소에 더하기 하는 메소드		|[조건2.4]
[조건2.5] 정수 2개를 전달받아 a의 b승을 구하여 리턴하는 메소드			|[조건2.5]
========================================================================================
*/

public class Calc
{//public = "소환술처럼 어디서 부르시든 저를 쓰실수 있습니다"
	 private int array[] = new int[10]; //[조건1] 달성.
	//private = "마이프레셔스니까 나만 건들거임. 대신 행정적요구(메소드) 하면 처리는 해줄게."


	//[조건2.1] 배열을 전달받아 멤버변수에 대입하는 메소드
	public void setArray(int[] arIn)
	{
			array=arIn;//새로 입력되는 배열로 단숨에 뒤짚어 씌운다.
	}
		

	//[조건2.2] 배열의 원소 개수를 리턴하는 메소드	
	public int count()
	{
			return array.length;
	}


	//[조건2.3] 배열 내의 모든 값의 합계를 리턴하는 메소드	
	public int sum()
	{		
		int sumResult=0;
		for (int cntAr=0 ; cntAr<array.length ; cntAr++)
		{
			sumResult+=array[cntAr];
		}
			return sumResult;
	}

	//[조건2.4] int형 정수 하나를 전달받아 모든 원소에 더하기 하는 메소드	
	public void sumAll(int value)
	{
		System.out.println("sumAll메소드(입력값 모두에게 더하기) 결과입니다.");

		for (int cntAr=0 ; cntAr<array.length ; cntAr++)
		{
			array[cntAr]+=value;
			System.out.printf("%d번째 칸의 값 : %d \n",cntAr,array[cntAr]);
		}	
		return;
	}


	//[조건2.5] 정수 2개를 전달받아 a의 b승을 구하여 리턴하는 메소드	
	public int power(int Base, int Indices)
	{ //Base : 밑수
	  //Indices : 지수
	    int resultPower=1;

		for (int cntAr=0 ; cntAr<Indices ; cntAr++)
		{
			resultPower=resultPower*Base;
		}	
		return resultPower;
	}


}
