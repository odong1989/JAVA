package study191115;

public class ScoreException extends Exception {
	//super();//상위클래스Exception의 기본생성자를 호출하고프면super();를 쓰세요. 
	public ScoreException() {
		System.out.println("점수는 0~100범위여야 합니다.");
	}
}
