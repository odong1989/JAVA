/*
	사용자가 입력한 숫자들의 합계를 구한다. 0이 입력되면 종료된다.
*/

import java.util.Scanner;

class WhileTest2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int input, sum;

		sum=0;

		System.out.println("계산기프로그램이 또왓쬬.이번엔 while문으로 구성되었지!");		
		System.out.println("이번도 무한히 계산하며 숫자0을 넣으면 종료되는 것은 동일해.");
		System.out.println("계산할 숫자를 입력해봐");
		
		input=scan.nextInt();


		//나의 방식
		while(input!=0){
		sum+=input;
		System.out.println("중간계산결과 : " + sum);

		System.out.println("새로 더할 값을 입력해주세요.");
		input=scan.nextInt();

		System.out.println("새로입력된값 : " + input);
		}

		System.out.println("합계 : " + sum);
	}
}
