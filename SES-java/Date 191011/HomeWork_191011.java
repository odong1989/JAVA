
import java.util.Scanner;	

/*
   과제목표 : ①3개의 과목을 입력받습니다.
			②합격/불합격여부를 판별합니다. 
			 [조건1] 합계 평균이 60점 이상일 것.
			 [조건2] 각 과목들이 40점 미만이 없을것(과락 있음)	
            ③ 합격/불합격 여부를 출력하여 알려줍니다.
*/

class HomeWork_191011
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int subject1,subject2,subject3;
		double avg;
		String result;
	
		System.out.println("-------------------------------------------------------------");
		System.out.println("2019년 10월 11일 과제입니다.");
		System.out.println("[목표] 3개의 과목을 입력받고 합격/불합격여부를 출력합니다."); 
		System.out.println("[조건1] 합계 평균이 60점 이상이면 합격으로 처리한다.");
		System.out.println("[조건2] 단, 각 과목 중 40점 미만이 있을시 불합격처리한다.(과락적용)");
		System.out.println("-------------------------------------------------------------");


		System.out.print("과목1의 성적입력을 입력해주세요 : ");
		subject1 = in.nextInt(); //엔터시까지 입력한 값을 정수값으로 입력
		System.out.print("과목2의 성적입력을 입력해주세요 : ");
		subject2 = in.nextInt();
		System.out.print("과목3의 성적입력을 입력해주세요 : ");
		subject3 = in.nextInt();
	
		avg = (subject1+subject2+subject3) /3.0 ; 

		//조건연산자를 활용한 계산(책78 참고)
		result = avg>60.0&& subject1>40 && subject2>40 && subject3>40 ? "합격입니다" :"불합격입니다." ;


		System.out.printf("평균성적 : %2.3f ", avg);

		/*
		(1) System.out.printf("평균성적 : %2.3d ", avg);
		    ...이 맞을거 같은데 실상하면 에러남. 아래는 에러의 내용.

		Exception in thread "main" java.util.IllegalFormatPrecisionException: 3
        at java.util.Formatter$FormatSpecifier.checkInteger(Formatter.java:2984)
        at java.util.Formatter$FormatSpecifier.<init>(Formatter.java:2729)
        at java.util.Formatter.parse(Formatter.java:2560)
        at java.util.Formatter.format(Formatter.java:2501)
        at java.io.PrintStream.format(PrintStream.java:970)
        at java.io.PrintStream.printf(PrintStream.java:871)
        at HomeWork_191011.main(HomeWork_191011.java:41)
		
		(2)print, println으로는 2.3f등이 불가능함.
		   오로지 printf만이 %2.3f를 정상적으로 출력.
		   
		   printf()는 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력할 수 있다.
		*/

		System.out.println(result);
	}
}
