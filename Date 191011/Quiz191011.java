
import java.util.Scanner;	
//UTF-8 설정.
/*과제목표 : ①3개의 과목을 입력받습니다.
			②합격/불합격여부를 판별합니다. 
			 [조건1] 합계 평균이 60점 이상일 것.
			 [조건2] 각 과목들이 40점 미만이 없을것(과락 있음)	
            ③ 합격/불합격 여부를 출력하여 알려줍니다.
*/

class Quiz191011 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int subject1,subject2,subject3;
		double avg;
		String result;

		System.out.println("과목1 성적입력 : ");
		subject1 = in.nextInt(); //
		System.out.println("과목2 성적입력 : ");
		subject2 = in.nextInt();
		System.out.println("과목3 성적입력 : ");
		subject3 = in.nextInt();
	
		avg= (subject1+subject2+subject3) /3.0 ; 

		//조건연산자를 활용한 계산(책78 참고)
		result = avg>60.0&& subject1>40 && subject2>40 && subject3>40 ? "합격입니다" :"불합격입니다." ;

		System.out.println(result);
	}
}
