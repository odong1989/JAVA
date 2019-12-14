package global.sesoc.java1.exception;

public class ScoreException extends Exception {

	public ScoreException() {
		super("점수는 0~100범위여야 합니다.");
	}

}
