import java.util.Scanner;
/*
[목표] 사용자에게 입력할 숫자의 개숫를 묻고 배열을 생성하십시오.
[조건] 반복문으로 숫자를 입력받으십시오.
	  배열의 마지막 칸은 합계를 저장하는 용도로 사용하십시오.

	  결과를 출력하십시오.
*/
class ArrayTest3 
{
	public static void main(String[] args) 
	{
	//==================================================================================
		int ar[]=null;
		int index_num=0;
		int sum=0;

		Scanner input = new Scanner(System.in);

	//-------------------------------------------------------------------

		System.out.println("배열을 생성할 개수를 입력해주세요.");
		System.out.print("마지막 배열은 합계용이니 감안해서 기입하세요.");
		index_num = input.nextInt();


		ar = new int[index_num];


		System.out.println((index_num-1)+"개의 배열값을 입력받습니다.");
		for(int i=0; i < ar.length-1 ;i++)
		{
			System.out.print(i+"번째 배열의 값 : ");
			ar[i] = input.nextInt();		
			sum+= ar[i];
		}
		ar[index_num-1]=sum;


		System.out.println("입력결과 출력입니다.");
		for(int i=0;i<=ar.length;)
		{
			System.out.print(ar[i]);
			i++;
			if(i==ar.length-1)
			{
				System.out.print("=" + ar[i]);
				System.out.println("");
				break;
			}
			System.out.print("+");
		}
			

	}
}
