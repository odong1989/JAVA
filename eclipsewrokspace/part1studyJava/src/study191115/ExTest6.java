package study191115;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExTest6 {
	public static void main(String[] args){
		int n=0;
		try {
		n = inputScore();
		}
		catch(ScoreException error) {
			System.out.println("inputScore()메소드에서 에러발생-값이 0~100이외이다 ");
		}
		//public static int inputScore()에서 "throws ScoreException"가 추가되었다.
		//그래서 inputScore();도 예외처리를 해줘야 작동하게 되었다.
		
		System.out.println("점수는"+n+"점입니다.");
	}
	
	public static int inputScore() throws ScoreException{
		int score=0;
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수입력 : ");
		score = scan.nextInt();
		
		//에러체크-사용자 정의에러체크(0~100점이내 입력 맞는기?)
		if(score <0 || score > 100)throw new ScoreException();
		//throw new ScoreException();
		// : 자신을 호출한 에러상급자에게 떠넘기기 시전이랄까.
		
		return score;
		}
		//에러체크-자바문법적 에러를 체크한다-숫자이외의 키가 입력되었을 경우.
		catch(InputMismatchException error) {
			System.out.println("숫자외의 값 입력되었따. ");
		}
		//사용자가 정의하는 예외를 체크합니다.
		//[예1]0~100이외의 값이 입력됬다던가,
		//[예2]
		
		return score;
		
	}
}
