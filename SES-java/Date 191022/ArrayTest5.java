class ArrayTest5 
{
	public static void main(String[] args) 
	{
		//선언방법1
		int a[]=new int[10];
		//int형 변수를 10개를 단숨에 만든 것과 같다.
		//참고로 배열은 생성하면 0으로 초기화가 자동으로 된다. 괜찮군!

		//선언방법2
		int b[];
		b= new int[10];



		for(int i=0;i<a.length;i++)
		{
			//i를 활용하여 계산후 입력하는 방식을 쓰거나
			a[i]=(i+1)*10;
			System.out.println(a[i]);
		}
		System.out.println("");


		int n=0;
		for(int i=0;i<a.length;i++)
		{
			n+=10;
			//값계산을 담당할 변수를 생성하여 활용하는 방안도 있다.
			//지금은 간단하여 i를 활용하는게 편할수도 있지만
			//나중에 프로그램이 복잡해져 간다면 이렇게 역할들을 세세히 나누는게 나을수도 있어.
			//어
			a[i]=n;
			System.out.println(a[i]);
		}
		System.out.println("");



		//random메소드 연습
			System.out.println( Math.random() );		      //출력범위 : 0.0 <= x < 1.0
			System.out.println( (int)(Math.random()*10));     //출력범위 : 0~9
			System.out.println( (int)(Math.random()*10)+1);   //출력범위 : 1~10, 0을 출력원치 않으니 +1실시.
			System.out.println( (int) (Math.random()*10+1)*10 ); //출력범위 : 10~100
		System.out.println("");

		//0~100점 사이의 무작위 점수를 배열에 저장합니다.
		for(int i =0; i<b.length ; i++)
		{
			b[i]=(int)(Math.random()*100); //출력범위 : 0~100			
		 //b[i]=(int)(Math.random()*101); //선생님의 경우
			System.out.println(b[i]);

		}
		System.out.println("");

		//확인용 / 자신이 만든 랜덤이 자신이 생각한 범위대로 나오는지
		//확인을 하고 싶다면 1000개 정도 생성하여 패턴을 보는 것도 방법이다.
		for(int i =0; i<1000 ; i++)
		{
			System.out.println((int)(Math.random()*100));

		}
		System.out.println("");

		System.out.println("주사위-------------------");
		//주사위를 5번 굴리고 나오는 숫자들을 출력하는 경우
		int random_temp=0;
		for(int i =0; i<5 ;)
		{
			random_temp=(int)(Math.random()*10);
			if ( 0 < random_temp && random_temp < 7)
			{
				System.out.println(random_temp);
				i++;
			}
		}
		System.out.println("");

		//박완씨 경우
		for(int i =0; i<5 ;i++)
		{
			System.out.println((int)(Math.random()*6)+1);
			//끝에 +1을 않을시 간혹 0이 나온다
		}
		System.out.println("");


	}
}
