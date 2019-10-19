
import java.util.Scanner;

class IfTest1
{

	public static void main(String[] args) 
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int value = Input.nextInt();

	

	/*1) 단순 if문(1개의 if문만 쓰이는, else/elseif도 안쓰는) 예제*/
		if (value<0)
		{
			System.out.println("음수입니다.");
		}
		System.out.println("if문과는 관계없으며 단순if문은 끝입니다.");

	/*2) if문 1개 + else 쓰는 예제*/
		if (value<0)
		{
			System.out.println("음수입니다.");
		}
		else
		{
		System.out.println("else는 if가 'no!'한 시점에서 확정임.");		
		}
		System.out.println("if&else 문과는 관계없으며 단순if문은 끝입니다.");		

	/*3) if문 1개+ else if문 1개 + else 1개 (#3갈래길)*/
		if(value<0)
		{
			System.out.println("음수입니다.");
		}
		else if(value==0)
		{
		System.out.println("else if는 자신만의 조건으로 재보지.");		
		}
		else
		{
		System.out.println("else는 다 아니면 걍 확정이여.");		
		}		
		System.out.println("if&else 문과는 관계없으며 if문 1개+ else if문 1개 + else 1개 (#3갈래길)는 끝입니다.");				
	

	}
}
