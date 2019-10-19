/*
퀴즈 2.정수형의 사칙연산 계산기
[실행 예]
정수 1 : (사용자입력) 10
정수 2 : (사용자입력) 3
연산자를 선택하세요
1 : 덧셈(+), 2:뺄셈, 3:곱하기 4.나누기
(사용자 입력) 4

10 / 3 = 3

[오류조건]
조건1 연산자 선택시 1,2,3,4만 입력 허용할 것
조건2 0으로 나누기시 에러처리 할 것
*/

import java.util.Scanner;

class Quiz_2_191015
{
	public static void main(String[] args) 
	{
		final int number1, number2;
		Scanner input = new Scanner(System.in);

		System.out.println("사칙연산 계산기입니다.");
		System.out.print("첫째 값 입력 : ");
		number1 = input.nextInt();
		System.out.print("두번째 값을 입력 : ");
		number2 = input.nextInt();
		
		System.out.println("연산을 선택하세요");		
		System.out.println("1:덧셈, 2:뺄셈, 3:곱하기 4:나누기");

		switch (input.next())
		{
		case "1" : 
			System.out.println("덧셈을 실시합니다.");
			System.out.print(number1 + "+" + number2 + "= ");		
  			System.out.println(number1+number2);
			break;

		case "2" :
			System.out.println("뺄셈을 실시합니다.");		
			System.out.print(number1 + "-" + number2 + "= ");
			System.out.println(number1-number2);
			break;

		case "3" :
			System.out.println("곱을 실시합니다.");		
			System.out.print(number1 + "*" + number2 + "= ");
			System.out.println(number1*number2);
			break;

		case "4" :
			if(number1 == 0 || number2 == 0)
			{
				System.out.println("0이 있어서 실행불가합니다.");		
				return;
			}
			System.out.println("나누기 실시합니다. 결과 : ");		
			System.out.print(number1 + "/" + number2 + "= ");
			System.out.println((double)number1/number2);
			break;			

		default :
			System.out.println("1,2,3,4만 입력해주세요. 종료됩니다.");		
		return;
		}

	}
}
