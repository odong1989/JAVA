//사용자의 키보드 입력을 받는 코드입니다.
//잘 보관하고 에버노트 템플릿처럼 불러와서 복붙등으로 사용하세요


import java.util.Scanner;	
//Scanner라는 클래스가 java.util이라는 곳에 있다고 알려주는 것.


class KeyIn 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//Scanner in : 스캐너 변수의 이름. KeyIn클래스의 main메소드 내에서만 활동가능하다.
		//System.in : System 클래스 내부에 in이라는 변수를 선택.

		int a,b,c;

		System.out.println("정수 입력 : ");
		a = in.nextInt();
		//nextInt() 사용자가 타자를 입력해 줄때까지(엔터칠 때까지) 대기한다.
		System.out.println("정수 입력 : ");
		b = in.nextInt();

		c=a+b;
		System.out.println(c);
	}
}
