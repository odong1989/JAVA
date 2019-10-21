import java.util.Scanner;
import java.lang.Math;

/* 정수 10개를 입력하십시오.
	10
	25
	-4
	-22
	....
	(생략)

	합계 : 200
	평균 : 20.0
	최대값 : 100
	최소값 : -22
	평균과 10 이상 차이나는 값 : 10, -22
	

	[목표] 위와 같이 출력하는 프로그램을 작성하십시오.	
	[조건] "평균과 10 이상 차이나는 값 : 10, -22"은
	      반복문을 하나 더 생성하여 돌려서 확인하십시오.
		  (#더하는 중간 겸사하면 평균값이 확정이 아니니 에러아닌 에러로 갈것이야)
*/

class HW_191021
{
	public static void main(String[] args) 
	{

		//선언----------------------------------------------------
		int ar[] = new int[10];
		int sum=0;
		double avg=0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Scanner input = new Scanner(System.in);
		//선언종료-------------------------------------------------------


		//for1 : 입력10개 받기---------------------------------------------
		System.out.println("값 10개를 입력받습니다. 정수형 숫자를 10번 입력하세요.");
		for(int i=0; i < ar.length ; i++)
		{
			System.out.print((i+1)+"회 :");
			ar[i] = input.nextInt();
		}//for1 end
		System.out.println("");

		//for2 : 최대값, 최소값, 평균값 계산(10이상 차이는 for3에서 확인)-----------------
		for(int i =0; i<ar.length ; i++)
		{
			sum+=ar[i];

			if(ar[i]>max) max=ar[i];
			if(ar[i]<min) min=ar[i];
		}//for2 end
		    avg= sum / ar.length;
		
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.1f \n",avg);
		System.out.println("최대 : "+max);
		System.out.println("최소 : "+min);


		//for3 : 평균값과 10이상 차이나는 지 확인
		System.out.println("평균값과의 차이가 10이상은 숫자들은 아래와 같습니다.");
		for(int i =0; i<ar.length ; i++)
		{
			if(10 < Math.abs( avg- Math.abs(ar[i]) ) )
			System.out.print( ar[i]+" " );			
		}//for3 end	
		System.out.println("");

	}
}
