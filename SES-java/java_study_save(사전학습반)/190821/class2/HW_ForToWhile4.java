import java.util.Scanner;

class HW_ForToWhile4
{
	public static void main(String[] args) 
	{
		/*
		import java.util.Scanner;

		class ForTest5
		{
			public static void main(String[] args) 
			{
				Scanner scan = new Scanner(System.in);
				int temp=0;
				int total=0;

				System.out.println("계산기입니다. 숫자를 입력해주세요");
				System.out.println("입력횟수는 제한 없으며 0을 입력받으면 종료됩니다.");

				for( ; ; ){			
					temp=scan.nextInt();
					System.out.println("입력값 : " + temp);

			
					if(temp==0){
						System.out.println("0 입력이 확인되었습니다. 종료합니다.");
						break;
					}//if end

					total+=temp;
					System.out.println("현재합계 : "+total);

				}//for end
				System.out.println("최종합계 : "+total);
			}
		}
		*/
		
		
		Scanner scan = new Scanner(System.in);
		int temp=0;
		int total=0;

		System.out.println("계산기입니다. 숫자를 입력해주세요");
		System.out.println("입력횟수는 제한 없으며 0을 입력받으면 종료됩니다.");

		while(true){			
			temp=scan.nextInt();
			System.out.println("입력값 : " + temp);

	
			if(temp==0){
				System.out.println("0 입력이 확인되었습니다. 종료합니다.");
				break;
			}//if end

			total+=temp;
			System.out.println("현재합계 : "+total);

		}//for end
		System.out.println("최종합계 : "+total);
	}
}


