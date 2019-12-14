package global.sesoc.java1.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExTest6 {
	public static void main(String[] args) {
		int n = 0;
		try {
			n = inputScore();
		} catch (ScoreException e) {
			e.printStackTrace();
		}
		System.out.println("점수는 " + n + "점입니다.");
	}
	
	public static int inputScore() throws ScoreException {
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		score = scan.nextInt();
		if (score < 0 || score > 100) throw new ScoreException();
		return score;
	}

}


