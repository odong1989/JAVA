import java.util.Scanner;

class HW_feedback_191011
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
//Scanner in : Scanner 객체를 생성한다는 의미입니다.
//new Scanner(System.in); : Scanner(래퍼런스 변수)를 생성하고   

		int a,b,c;		//메모리를 아낀다면 Byte, char형등을 쓰는 것도 방안이다. 물론 계산시의 오류도 대비해야 겠지만.
		double avg;		//평균값은 소수점까지 나오는 점, 메모리문제 아닌이상은 더블로 쓰는게 낫다.
		boolean result; //합격/불합격으로 둘 중 하나로만 갖기 때문.

		System.out.print("과목1 입력 : ");
		a=in.nextInt();

		System.out.print("과목2 입력 : ");
		b=in.nextInt();

		System.out.print("과목3 입력 : ");
		c=in.nextInt();

	    avg = (a+b+c) / 3.0 ; //나뉘는 숫자 또는 나누는 숫자가 실수형이면 계산결과도 실수형(63.33같은)이 된다.
		result = avg>=60.0 && a>=40 && b>=40 && c>=40;

		System.out.println("평균 : " + avg);
		System.out.println(result ? "합격":"불합격");//출력 전에 조건연산자 활용계산의 참/거짓 둘 중 하나만 출력된다.


	}
}
