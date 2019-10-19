import java.util.Scanner;


class Optest3 
{
	public static void main(String[] args) 
	{
//버전1 - 일일이 변수를 다 만드는 경우 & 뺄쎔 통해서 머니차감처리.
/*
		int M_50000, M_10000, M_5000, M_1000, M_500, M_100, M_50, M_10;
		int money;	

		Scanner input = new Scanner(System.in);
		money = input.nextInt();

		M_50000 = money/50000;	
		money = money - (M_50000*50000);

		M_10000 = money/10000;	
		money = money - (M_10000*10000);

		M_5000 = money/5000;	
		money = money - (M_5000*5000);

		M_1000 = money/1000;	
		money = money - (M_1000*1000);

		M_500 = money/500;	
		money = money - (M_500*500);

		M_100 = money/100;	
		money = money - (M_100*100);

		M_50 = money/50;	
		money = money - (M_50*50);

		M_10 = money/10;	
		money = money - (M_10*10);

		System.out.println("필요한 50000원 장수 : "+ M_50000);
		System.out.println("필요한 10000원 장수 : "+ M_10000);
		System.out.println("필요한  5000원 장수 : "+ M_5000);
		System.out.println("필요한  1000원 장수 : "+ M_1000);
		System.out.println("필요한   500원 장수 : "+ M_500);
		System.out.println("필요한   100원 장수 : "+ M_100);
		System.out.println("필요한    50원 장수 : "+ M_50);
		System.out.println("필요한    10원 장수 : "+ M_10);
*/

//버전2 - 1개의 임시저장 변수로 한 계열씩 계산하는 경우.
/*
		int temp_print;
		int money;	

		Scanner input = new Scanner(System.in);
		money = input.nextInt();

		temp_print = money/50000;	
//		money = money - (temp_print*50000);
		money = money % 50000;
		System.out.println(money);
		System.out.println("필요한 50000원 장수 : "+ temp_print);

		temp_print = money/10000;	
//		money = money - (temp_print*10000);
		money = money % 10000;
		System.out.println("필요한 10000원 장수 : "+ temp_print);

		temp_print = money/5000;	
//		money = money - (temp_print*5000);
		money = money % 5000;
		System.out.println("필요한  5000원 장수 : "+ temp_print);

		temp_print = money/1000;	
//		money = money - (temp_print*1000);
		money = money % 1000;
		System.out.println("필요한  1000원 장수 : "+ temp_print);

		temp_print = money/500;	
//		money = money - (temp_print*500);
		money = money % 500;
		System.out.println("필요한   500원 장수 : "+ temp_print);

		temp_print = money/100;	
//		money = money - (temp_print*100);
		money = money % 100;
		System.out.println("필요한   100원 장수 : "+ temp_print);

		temp_print = money/50;	
//		money = money - (temp_print*50);
		money = money % 50;
		System.out.println("필요한    50원 장수 : "+ temp_print);

		temp_print = money/10;	
		money = money - (temp_print*10);
		money = money % 10;
		System.out.println("필요한    10원 장수 : "+ temp_print);
*/


//버전3 - 배열&반복문 활용(#혼자 연습해봄)

		int money;	
		int[] range={50000,10000,5000,1000,500,100,50,10};
		
		Scanner input = new Scanner(System.in);
		money = input.nextInt();


		for (int turn=0 ; turn<range.length ; turn++)
		{
		System.out.print("필요한"+range[turn] +"원 장수 : ");
		System.out.println(money / range[turn]);
		money=money % range[turn];	
		}
	}
}
