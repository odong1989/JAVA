class OpTest1
//연산자 학습
{
	public static void main(String[] args) 
	{
		//1.산술연산자(책69~70페이지)
		//단항연산자
		int a,b,c;
		a=10;
		b=3;
		c=a+b;
		System.out.println("c = " + c);
			
		c = a+b*2;
		System.out.println("c = " + c);

		c = a%b;
		System.out.println("c = " + c);
		/*나머지 연산자(%)가 의외로 많이쓰인다.
		가령 짝수/홀수 구분시,
		5번마다 반복을 하려는 경우(=5로 나눌때 나머지가 없는 순간) 등
		의외로 많이쓰인다.*/

		a=c=0;
		System.out.println("a = " + a + ", c = " + c); //출력 : a=0, c=0

		++a;
		System.out.println("a = " + a + ", c = " + c);//출력 : a=1, c=0

		a++;
		System.out.println("a = " + a + ", c = " + c);//출력 : a=2, c=0

		c=++a;
		System.out.println("a = " + a + ", c = " + c);//출력 : a=3, c=3

		c=a++;
		System.out.println("a = " + a + ", c = " + c);//출력 : a=4, c=3
		//후위형 계산은 기존의 보유값을 활용하여 연산을 하고, 연산들이 종료된 후에야 후위연산이 진행된다.
		

		//-----산술연산자 종료-----//


		//-----관계연산자 시작-----
		a=2;
		b=3;

		boolean res;
		res = a>b;
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);

		res = a*6>10;
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);

		res = ((a*6)>10);//소괄호 안써도 동일함. 산술연산자(*)가 최우선이니까.
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);

		//[퀴즈] a가 짝수인가?			//힌트 : 나머지 연산자 활용
		res = a%2==0;
		System.out.println("a = "+ a +", res = " + res);


		//[퀴즈] a가 홀수인가?			//힌트 : 나머지 연산자 활용
		res = a%2==1;
		System.out.println("a = "+ a +", res = " + res);

		//[퀴즈] a가 3의 배수인가?			//힌트 : 나머지 연산자 활용
		res = a%3==0;
		System.out.print("a = "+ a +", res = " + res);
		res = b%3==0;
		System.out.println(" / b = "+ b +", res = " + res);

		//비교연산자 예제 끝--------------------------------

		//논리연산자 시작--------------------------------------

	
		//[퀴즈] a,b모두 양의 정수인가?(#여러가지 동시묻기 시작! #논리연산자(&&, ||)가 필요한 순간)
//		res = 0<a<10;//NG
		/*위의 질문은 좋은 질문이 아니다.
		왜냐하면 0<a만으로 이미 True/False결과가 나온다.
		True < 10 이렇게 된다는 애기인데 연산이 불가능하고 에러(bad operand types for binary operator '<')로 이어진다.

		컴퓨터는 아래와 같이 처리를 진행한다는 것이다.
		res = 0<a<10;
			= (0<a)<10
			= True < 10 //error

		*/
		System.out.println("논리연산자");//Good
		res = a>0 && b > 0;
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);

		//a또는 b중에 짝수가 있습니까?
		res = a%2 == 0 || b%2 ==0;
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);

		//a가 1~5의 범위내에 있습니까?
		res = a>1 && a<5;
		System.out.println("a = "+ a + ", res = " + res);

		//a가 1~5의 범위밖에 있습니까?
		res = !(a>1 && a<5); //not(!)을 붙이면 위의 질문을 그대로 활용이 편하게 가능하다.
							 //물론 "a<1 || a>5"라고 입력을 해도 된다. 	
		System.out.println("a = "+ a + ", res = " + res);

		//논리연산자 종료-----------------------


		//비트연산자 시작(책74)----------------------------	


		a=15;
		b=1;
		c=a&b;
		System.out.println(c);
		
		/*
		a = 1111
		b = 0001
		&(and)
		*/

		/*
		double aaa,bbb,ccc;
		aaa=15.625;
		bbb=1.125;
		ccc=aaa&bbb;
		System.out.println(ccc);

		정수에만 쓸 수 있다고 하여 확인위해 실시함.
		결론은 "소수점이하 double형은 비트연산이 작동하지 않는다."
		선생님 설명으로는 프로그래밍에서 쓸일이없어서라고.
		*/



		a=1;
		b=1;
		res = ++a > 0 && ++b>0;
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);


		a=-1;
		b=1;
		res = ++a > 0 && ++b>0;
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);
		/*	결론부터 말하자면 res는 false값이 나온다.
			(a = 0, b= 1, res = false)
			위의 결과를 보면 b는 ++b연산조차 실시하지 않았음을 알 수 있다.
			(#만약 b는 2가 될것이다라고 생각했다면 &&의 특성을 한번더 보자.)

			&&연산자는 시간을 아끼기 위해 비교하는 조건이 하나라도 삐끗하면 
			닥치고 False를 날린다.(#어차피 1개라도 no면 끝인건 맞으니까)
			연산자의 특성(&&는 하나라도 삐끗하면 false때림)을 이해 못했다면 
			되었다~, 말았다하는 상황을 맛보게 된다.
		*/

		a=-1;
		b=1;
		res = ++a > 0 || ++b>0;
		System.out.println("a = "+ a +", b= " + b + ", res = " + res);
		/*	결론부터 말하자면 res는 false값이 나온다.

			(a = 0, b= 1, res = false)

			&&연산자는 시간을 아끼기 위해 비교하는 조건이 하나라도 삐끗하면 
			닥치고 False를 날린다.(#어차피 1개라도 no면 끝인건 맞으니까)
			연산자의 특성(&&는 하나라도 삐끗하면 false때림)을 이해 못했다면 
			되었다~, 말았다하는 상황을 맛보게 된다.
		*/

		//---------------------------------------------------


		//비트 이동 연산자

		a=15;
		a= a>>2;
		System.out.println("a = "+ a );
		a=15;
		a= a>>>2;
		System.out.println("a = "+ a );
		a=15;
		a= a<<2;
		System.out.println("a = "+ a );





		//형변환 연습	
		byte aa,bb,cc;
		aa=100;
		bb=30;
		c=(int)aa+(int)bb;
//		cc=(int)aa+(int)bb;
/*연습에러
*/
		/*형변환을 활용시 주의사항
		  : 계산을 하는 연산변수들은 형변환을 적용하면 되지만
		    연산후 결과를 받고 저장하는 변수는 해당 자료형과 급이 같아야 한다
			같지 않으면 에러난다.
		*/
		System.out.println("cc = " + (int)c);


		


	}
}
