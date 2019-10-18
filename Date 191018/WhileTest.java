class WhileTest 
{
	public static void main(String[] args) 
	{
		//for, while, do-while 3가지 종류의 반복문으로 헬로월드 5번씩 출력.
		//실제상황시에는 for문으로 해버리죠.
		//왜냐면 목적이 5번씩 출력=횟수출력 이니까.
		int i;


		//for : 횟수 반복문.
		//		초기값, 조건식, 증감식을 통해 정해진 횟수만큼 반복한다.
		for(i=0; i<5;i++)
		{//초기값,조건식,증감식
			System.out.println("HelloWorld!! - for" + i);
		}
		System.out.println(" ");
		i=0;

		
		//while : 선조건 반복
		//		  FM정석같은 친구. 조건부터 따지는 정석같은 친구 ㅡ_ㅡ
		while(i<5)
		{
			System.out.println("HelloWorld!! - while" + i);
			i++;
		}
		System.out.println(" ");
		i=0;
	
	
		//do{}while : 
		//			  조건이 맞지 않는다 할지라도 
		//제대로 입력을 받는지 알수 없는, 경우의 수가 많을 때 사용하기 좋다.
		//사용자의 입력을 일단 받고
		//사용자가 입력을 잘 못 했을 경우 피드백(ex-다시 입력해주세요)같은 
		//경우를 할 때 좋다.
		do{
			System.out.println("HelloWorld!! - Do{}while" + i);
			i++;
		}while(i<5);
		System.out.println(" ");
		i =0;

		/*이외의 이야기
		  : while, do{}while을 사용할 때 무조건 실행시키고 싶다면
		    while(true)으로 while의 조건식 입력을 TRUE으로 하면된다.
		    C언어처럼 while(1)으로 하면 boolean값이 아니라고 에러난다.
		*/

		//while : 선조건 반복
		//		  FM정석같은 친구. 조건부터 따지는 정석같은 친구 ㅡ_ㅡ
		while(true)
		{
			System.out.println("HelloWorld!! - while(ever repeat)" + i);
			if(i>=4) break;			
			i++;
		}
		System.out.println(" ");
		i=0;

		//중첩된 while문

		int a,b;
		a=0;

		while(a<5){
			b=0;
			while(b<5){
				System.out.print(b + " ");
				b++;
			}
			System.out.println();
			a++;
		}
	
	}
}
