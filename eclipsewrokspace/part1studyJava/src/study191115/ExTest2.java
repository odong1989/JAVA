package study191115;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest2 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n, s=0;
		
		while(true){
			System.out.print("정수입력 : ");
			try {
					n = scan.nextInt();
			}
			//예외처리: 숫자이외의 값이 입력된 경우
			catch(InputMismatchException error) {
		//	catch(exception error) {으로하여 처리해도 됩니다.		
				System.out.println("숫자값만 넣으세요ㅜ.ㅜ");	
				scan.nextLine();//버퍼에 엔터값이 남아있다. 이를 제거하기위해 호출함. 
				//만약 scan.nextLine();를 실시하지 않을 경우 새입력도 못하고 무한루프를 달리게된다...
				continue;
			}
			if (n==0)		
			{
			System.out.println("프로그램 종료");
			break;
			}
		}
		System.out.println("s:"+s);
	}
}
