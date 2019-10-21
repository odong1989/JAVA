class ArrayTest1 
{
	public static void main(String[] args) 
	{

		//배열의 선언
		int i = 0;				//변수 1개를 선언
		int ar[] = new int[5];	//new int[5];  : int형 변수를 5개를 한꺼번에 선언한 것과 같다
		//ar[] : = 오른쪽에 있는 배열을 가리킨다는 의미입니다.
		//ar[]은 배열값을 직접 갖는게 아니라, 'new int[5]'의 번지수만 저장하고 있으며 필요시 		
		//자신이 갖고 있던 주소값에 따라 로드하여 실행하는 것이다.
		//정확히 말하자면 ar[]은 '배열의 인덱스'를 저장하고 있는 것이다.



		System.out.println(i);
		System.out.println(ar);			//별의미가 없다. 배열의 주소값만 아는데 이거로는 쓸모없음.
		System.out.println(ar.length);	//ar이 가리키는 배열의 길이를 확인하는 것.

		for(int x=0 ; x<ar.length ; x++)
		//추천사항 : 반복문의 조건식으로 배열의 칸수만큼(ar.length)을 설정하는 것이 제일 좋다.
		//		   숫자를 직접 기입하는 것은 오타와 다양한 입력들을 대응하기에 좋지 않다.
		{
		System.out.println(ar[x]);		
		}

		/*
		System.out.println(ar[5]);은 실행하면 에러가 발생된다.
		칸이 5개인 것은 맞지만 0,1,2,3,4식으로 0부터 시작하기에 5번은 없는 것.
		(#은근히 자주속는 훼이크)

		참고로 위와 같은 실수를 할시 표기되는 에러는 아래와 같다.
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at ArrayTest1.main(ArrayTest1.java:18)
		*/

	
		//버려진 객체
		int ar[] = new int[10];	
		/*ar[]에게 새로운 배열 int[10]의 주소를 주었다.
		  기존의 new int[5]은 "버려진 객체"라고 부른다.(#기억해주는 이 없으니 버려진거지)
		  new int[5]는 시스템에서 자동으로 삭제하므로 개발자가 신경쓸 필요는 없다.
		*/
	
	}
}
