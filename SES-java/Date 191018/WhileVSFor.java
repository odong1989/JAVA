import java.util.Scanner;


class WhileVSFor 
{
	public static void main(String[] args) 
	{
		int b=0;
		int sum=0;

		while(b<=100)
		{
			if( b%2 ==1 ) sum=sum+b;
			b++;
		}
		System.out.println("1~100까지 홀수의 합 : "+sum);

	/*
       (5번) 1 0 0 0 0         
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1
		//19.10.17 for문 활용한 예제 중에서
		System.out.println("5번");
		for(int i=0;i<5;i++)
		{
			for(int j =0;j<5;j++)
			{
			System.out.printf("%2d", i == j ? 1 : 0);
			//if문뿐만 switch문을 쓸수도 있어요.
			//여담으로 10000, 1000, 100, 10, 1식으로 출력하신 사례도 있다고...한다.
			//bit형으로 0,1출력하는 사례도 있음...
			}
			System.out.println("");
		}
		System.out.println("------------------------");
	*/

	int x=0,y=0;
	
	while(x<5)
	{
		while(y<5)
		{
			if(x==y)
			{
				System.out.print("1 ");
			}
			else
			{
				System.out.print("0 ");
			}
			y++;
		}
		System.out.println("");
		x++;
		y=0; 
	}

	System.out.println("");
	System.out.println("");


	/*
		(ex1)
		*
		**
		***
		****
		*****
	*/

	x=0;y=0;
	
	while(x<5)
	{
		while(y<5)
		{
			if(x>=y) System.out.print("1 ");
			y++;
		}
		System.out.println("");
		x++;
		y=0; 
	}
	System.out.println("");

	
	//종료하지 않는(무한루프)의 경우도 for이 편할까?
	/*
		//while문으로 작성한 경우.
		System.out.println("종료않는 계산기입니다. 종료를 원하시면 0을 입력하세요.");
		do{
		System.out.println("값을 입력해주세요.");
		n=scan.nextInt();

		if(n ==0) break;
		s+=n;
		
		System.out.println("합계 : "+ s);	
		
		}while(true);
	*/
	
	/*
	//무한반복 - for문 버전
	Scanner scan = new Scanner(System.in);
	int n;
	int s = 0;
	int cnt=0;

	System.out.println("종료않는 계산기 for문버전입니다. 종료를 원하시면 0을 입력하세요.");
	System.out.println("값을 입력해주세요.");
	for(;cnt<Integer.MAX_VALUE;cnt++)
	{
		n=scan.nextInt();
		if(n ==0) break;
		s+=n;
		System.out.println("합계 : "+ s);			
	}
	*/
//for은 선실행/후조건문(do{}while)을 하기 편한가? 비교하기
/*do{}while문 생략/위의 소스와 동일하다.	*/


	Scanner scan = new Scanner(System.in);
	int n;
	int s = 0;
	int cnt=0;

	System.out.println("종료않는 계산기 for문버전입니다. 종료를 원하시면 0을 입력하세요.");
	System.out.println("값을 입력해주세요.");
	
	for(;cnt<Integer.MAX_VALUE;cnt++)
	{
		n=scan.nextInt();
		if(n ==0) break;
		s+=n;
		System.out.println("합계 : "+ s);			
	}

	}
}
