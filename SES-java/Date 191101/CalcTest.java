//Calc클래스의 객체를 만들어사용(테스트)하는 클래스입니다.

class CalcTest
{
	public static void main(String[] args) 
	{
		/*
		Calc calTest = new Calc();
		int a[] = {1,2,3,4,5};
		calTest.setArray(a);
		System.out.println();

		int cnt = calTest.count();
		System.out.println("개수 : "+ cnt );

		int sum = calTest.sum();
		System.out.println("합계 : " + sum);


		calTest.sumAll(100);
		System.out.println("거듭제곱 결과 : " + calTest.power(2,3) );	
		*/


		/*
		public static int power(int Base, int Indices)
		으로 클래스 변수로 선언되는 경우에는 
		Calc calTest = new Calc();처럼 선언을 하지 않아도 바로 사용할 수 있다.
		마치 Integer.MAX_VALUE;처럼 쓸 수 있게 설정된 경우라는 것이다.
		*/
		System.out.println("거듭제곱 결과 : " + Calc.power(10,5) );
		System.out.println("클래스 변수로 선언한 경우에도 작동하는 것은 동일하다.\n대신에 new 객체를 생성하여 사용할 필요가 없다는 점이다.");

	}
}
