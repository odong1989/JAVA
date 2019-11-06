import java.util.Scanner;

class IfTest 
{
	public static void main(String[] args) 
	{
		/*80점을 합격커트라인으로 하는 if문이다.*/
		//변수선언
		double score ;
		//Scanner 객체 생성
		Scanner scan_input = new Scanner(System.in);
		score = scan_input.nextInt(); 

		
		/*
		//style1 : 일일이 다른 조건들을 묻는 형식.(#1번에 1질문)
		if(score >100){
			System.out.println("입력오류입니다.");
		}
		else if(score < 0){
			System.out.println("입력오류입니다.");
		}
		else if(score >= 80) //true또는 false여부를 판결한다.
		{//결과가 true인 경우
		System.out.println("합격이네. 축하염!");		
		}
		
		else
		{//결과가 false인 경우
		System.out.println("불합격임. 담기회를");

		*/


		//style2 : 질문 1번에 여러사항을 묻는 유형.(#논리연산자활용)(#1타 2피)
		/*
		if(score >100 || score < 0){
			System.out.println("입력오류입니다.");
		}
		else if(score >= 80) //true또는 false여부를 판결한다.
		{//결과가 true인 경우
		System.out.println("합격이네. 축하염!");		
		}
		
		else{//결과가 false인 경우
			System.out.println("불합격임. 담기회를");
		}
		*/



		//style3 : 중첩질문

		if (score >=0 && score <=100)
		{
			if(score >=80){
				System.out.println("합격입니다");
			}
			else{
				System.out.println("불합격입니다.");
			}
		}
		else{
			System.out.println("입력오류입니다.");
		}


	}//main end
}//class end
