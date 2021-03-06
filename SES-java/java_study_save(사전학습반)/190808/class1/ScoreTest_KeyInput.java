//키보드값 입력받기 순서1. Scanner 클래스를 import 한다.
import java.util.Scanner; 


class ScoreTest_KeyInput
{
	public static void main(String[] args) 
	{
/*		//참고용, 문자열 
		String cc;
		Scanner scan2 = new Scanner(System.in);
		//cc = scan2.next();	//공백이전의 문자들만 취급
		//cc = scan2.nextline();//공백이 있어도 모든 문자들 취급.
		System.out.println(cc);
*/

		//객체 생성
		int kor, eng, mat;//각 과목점수
		int tot;		  //총점
		double avg;		  //평균

		//키보드값 입력받기 순서2. Scanner 객체를 선언한다(# 캣치할 담당자 생성)
		Scanner scan = new Scanner(System.in);

		//키보드값 입력받기 순서3. 각 변수별로 값을 입력 받는다.
		//[주의]nextInt는 소수점 값을 받으면 바로 에러난다.
		//
		System.out.println("여러분들의 무서운 친구, 성적계산기입니다.");
		System.out.println("우선 국어 성적을 입력해주세요(소수점 제외)");
		System.out.print("국어성적(소수점제외) : ");
		kor = scan.nextInt();
		System.out.print("영어성적(소수점제외) : ");
		eng = scan.nextInt();
		System.out.print("수학성적(소수점제외) : ");
		mat = scan.nextInt();

		//여기서 계산
		tot= kor+eng+mat;
		/*방법1 : 나누는 숫자를 실수형으로 하여 자동으로 결과값도 실수형으로 만들어지게 하기. */	
//		avg = tot / 3.0; // tot / 3;으로 3.0이 아니라 3으로 나누면 double형처럼 소수점 이하를 감안않는다.
				    	 //소수점까지 정확한 계산 원하면 나누는 숫자에 3.0 식으로 붙이는 게 좋다.

		/*방법2 : 강제 형변환하기*/
		avg = (double)tot / 3;//강제형변환이다. 
							   //강제형변환은 작은형->큰형 , 큰형->작은형 이든 어떤 변환을 하든 상관없다.
		
		//계산 끝
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);

	}
}
