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
			System.out.println("inputScore()�޼ҵ忡�� �����߻�-���� 0~100�̿��̴� ");
		}
		//public static int inputScore()���� "throws ScoreException"�� �߰��Ǿ���.
		//�׷��� inputScore();�� ����ó���� ����� �۵��ϰ� �Ǿ���.
		
		System.out.println("������"+n+"���Դϴ�.");
	}
	
	public static int inputScore() throws ScoreException{
		int score=0;
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է� : ");
		score = scan.nextInt();
		
		//����üũ-����� ���ǿ���üũ(0~100���̳� �Է� �´±�?)
		if(score <0 || score > 100)throw new ScoreException();
		//throw new ScoreException();
		// : �ڽ��� ȣ���� ��������ڿ��� ���ѱ�� �����̶���.
		
		return score;
		}
		//����üũ-�ڹٹ����� ������ üũ�Ѵ�-�����̿��� Ű�� �ԷµǾ��� ���.
		catch(InputMismatchException error) {
			System.out.println("���ڿ��� �� �ԷµǾ���. ");
		}
		//����ڰ� �����ϴ� ���ܸ� üũ�մϴ�.
		//[��1]0~100�̿��� ���� �Է�ٴ���,
		//[��2]
		
		return score;
		
	}
}
