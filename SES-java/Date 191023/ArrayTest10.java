import java.util.Scanner;

class ArrayTest10 
{
	public static void main(String[] args) 
	{
		String s[] ={"홍길동","김철수","이영희"};
		String name;
		double d;

		Scanner in = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		name = in.next();



		for(int x=0; x<s.length ; x++)
		{
//			if(name == s[x])
			if(name.equals(s[x]))
				{
					System.out.println( x+"번째에서 검색되었습니다.");
					break;
				}
		}
		System.out.println("검색결과가 없습니다");
	}
}

		/*
			String s[] ={"홍길동","김철수","이영희"};는 아래와 같다고 생각할 수 있다.

			s[배열의 주소를 갖고 있다.]----------link------->|[0번째]|[1번째]|[2번째]|
														  |
														 링크
														  |
														"홍길동" 

			String test = "abcd"는 
			test[배열의 주소를 갖고 있다.]----------link------->|"abcd"|

			배열도 객체의 일종입니다
			객체배열 : 주소값을 갖는 배열.
				어떤 주소를 가리키는 레퍼런스 변수라고 부른다.		
		
		
		*/