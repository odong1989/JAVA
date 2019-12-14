package study191115;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExTest3 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int input=0; int sum=0;
		
		try {
			while(true){
			System.out.print("정수만입력!아니면 종료처리감 : ");

				input = scan.nextInt();//catch(Input..)경우 문자등의 정수외에만 작동한다.
				//if(input<0) break;//음수일 경우 종료하도록 설정하였습니다.
				if(input<0) throw new InputMismatchException();//저는 음수도 에러로 취급하길 원해서 음수도 에러로 처리하도록 throw으로 합니다.	
				sum=sum + input;
			}
		}//try end
		//if(input<0) break;가 탈출하여도착하는 위치입니다.
		
		
		catch(InputMismatchException error) {
		//break문이 없어도 while에서 빠져나왔기에
		// 자연스럽게 catch아래의 코드들이 작동합니다.
		//(#좋았어..자연스럽게 탈출했어)
			System.out.println("예외처리 InputMismatchException가 작동되었습니다.");
		}
		System.out.println("sum:"+sum);

		/*[?]이 예제가 의미가 있는 건가요?
		 * 의미를 한줄로 하면 "입력오류 + 논리적 오류"
		 * 
		 * <세부의미1> : break등을 활용하는 어지러운 프로세스를 막는다...? 
		 * ExTest2의 경우 
		 * 탈출방법1) catch에서 break등을 선언하거나 
		 * 탈출방법2) 조건문if를 통해 숫자0이 입력시 탈출한다.
		 * 이런식이었다.
		 * 
		 * 하지만 이번 예제는 
		 * 특징1)try문이 while문을 감쌌다.
		 * 특징2)잘못입력하는 시점에 catch문이 실행된다.
		 * 
		 * 즉! break문이 없음에도 자연스럽게 탈출하게 되는것이 핵심포인트인 것이다!!
		 * 
		 * <세부의미2> : 예외처리를 좀 더 구조적으로 할 수 있게 한다.
		 * if(input<0) throw new InputMismatchException();
		 * 을 통하여 기본적으로 처리되는 
		 * */
	}
}
