import java.util.Scanner;

class ForTest4
{
	public static void main(String[] args) 
	{
		int total=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("계산기입니다. 숫자를 입력해주세요");
		System.out.println("숫자는 총 5번을 입력받습니다.");

		for(int cnt=0;cnt<5;cnt++){			
		System.out.println((cnt+1)+"번째 숫자를 입력해주세요");
		total+=scan.nextInt();
		}

		System.out.println("합계 : "+total);
	}
}
