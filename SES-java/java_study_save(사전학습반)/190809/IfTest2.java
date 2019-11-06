//문제 : 키보드로 점수를 입력받아 수/우/미/양/가를 판별(100점 만점) 
import java.util.Scanner;

class IfTest2
{
	public static void main(String[] args) 
	{
		/*
		100이하~90이상 수
		90미만~80이상  우
		80미만~70이상  미
		70미만~60이상  양
		60미만~0점    가
		.*/
	
		//변수선언
		double score ;
		//Scanner 객체 생성
		Scanner scan_input = new Scanner(System.in);
		score = scan_input.nextInt(); 
		

		//style3 : 중첩질문
		
		if ( score >=0 && score <=100 ){ //입력오류 확인
			if(score <=100 && score >=90){//수
				System.out.println("수 입니다");
			}
			else if(score >=80 && score <90){ //우 
				System.out.println("우 입니다.");
			}
		    else if( score >=70 && score <80 ){ //미 
				System.out.println("미 입니다.");
			}
			else if( score >=60 && score <70 ){ //양 
				System.out.println("양 입니다.");
			}
			else{//가
				System.out.println("가 입니다.");
			}
		}//입력오류&성적출력 if end

		else{
			System.out.println("입력오류입니다.");
		}


	}//main end
}//class end
