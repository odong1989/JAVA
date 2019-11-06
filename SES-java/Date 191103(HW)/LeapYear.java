import java.util.Scanner;

class if_test_Quiz3 
{
	public static void main(String[] args) 
	{
		/*년도를 입력받앙 윤년/평년 출력합니다.
		1)4년마다 & 400년마다 윤년
		2)단, 100년마다는 평년입니다.
		*/

		Scanner input = new Scanner(System.in);
		int year = input.nextInt();


		System.out.println("윤년 여부를 확인할 년도를 입력하세요.");
		if(year %4 ==0 && year %100 !=0)
		{
			System.out.println(year+"은 윤년입니다.");	
		}			
		else if(year %400 ==0)//100년의 제약조건 걸려도 400년마다인 경우를 확인
		{
		System.out.println(year+"은 윤년입니다.");
		}
		else{
			System.out.println(year+"은 윤년이 아닙니다.");
		}

	
		//선생님의 경우
		//if(y%4==0 && y%100!=0 || y%400==0)
		//으로 간결하게 가심.
		//&&연산자가 ||연산자보다 1순위 높기에 ()괄호로 임의로 연산순위를 설정하지 않았다.
		//if((y%4==0 && y%100!=0) || y%400==0)
		//위처럼 하지 않으셨다는 애기.
	}
}
