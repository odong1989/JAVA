import java.util.Scanner;

class Grade 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		int point = input.nextInt();

		if( 0>point || point>100)
		{
		System.out.println("입력오류. 다시 입력하세요");
		}
		else if( point<=100 &&point>=90){	//선생님의 경우 point>=90식으로 하나의 조건만 넣어서 비교하였다. 
		System.out.println("수");
		}
		else if( point<=90 &&point>=80){
		System.out.println("우");
		}
		else if( point<=80 &&point>=70){
		System.out.println("미");
		}
		else if( point<=70 &&point>=60){
		System.out.println("양");
		}
		else{
		System.out.println("가");
		}

		System.out.println("프로그램 종료입니다.");


//깜짝 궁금! - 그냥 다 if로 하면?
//정답 : 수우미양가 다나오는 수가 있다.(#별개의 5개 질문에 답하는 꼴이라)
/*
		if( 0>point || point>100)
		{
		System.out.println("입력오류. 다시 입력하세요");
		}
		if( point<=100 &&point>=90){
		System.out.println("수");
		}
		if( point<=90 &&point>=80){
		System.out.println("우");
		}
		if( point<=80 &&point>=70){
		System.out.println("미");
		}
		if( point<=70 &&point>=60){
		System.out.println("양");
		}
		else{
		System.out.println("가");
		}
*/
	}
}
