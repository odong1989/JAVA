class TypeTest2
{
	public static void main(String[] args) 
	{
		//스텝1. 변수선언(상품가격, 구입개수저장)
		int price;	//가격
		int ea;			//개수
		int total_price;	//결과값 저장


		price = 3500;
		ea = 5;

		//스텝2. 계산
		total_price = price * ea;

		//스텝3. 결과출력
		//출력방법1 - 난 일일이 개행하겄다!(#only println)
		System.out.println("내실 총 금액은 ");
		System.out.println(total_price+"원 입니다.");

		//출력방법2 - 이러든 저러든 한줄!(print&println)
		System.out.print("내실 총 금액은 ");
		System.out.println(total_price+"원 입니다.");

		//출력방법3 - 난 한큐에 갈거다(+ 통한 이어붙이기)
		System.out.println("내실 총 금액은 "+total_price+"원 입니다.");

//2교시 끝----


//3교시 시작------
		//3교시는 참조자료형(57페이지 - 객체,배열,enum등..) 설명

		char ch = 'A'; //기본자료형
		String s ="A"; //참조자료형(레퍼런스 데이터형)

		// 1  : 숫자값 1이다. 
		//'1' : 유니코드로 49를 갖는다.
		//"1" : 1이 위치한 주소값을 갖는다.

		System.out.println(1 + 1);
		System.out.println(1 + '1');
		System.out.println("1");
		System.out.println(1 + "1");
		System.out.println(1 + "1" +'1');
		System.out.println(1 + '1' + "1");


		System.out.println("----------------------------");


		System.out.println(1 + 1);
		System.out.println(1 + ch);
		System.out.println(s);
		System.out.println(1 + s);
		System.out.println(1 + s +ch);
		System.out.println(1 + ch + s);
	}
}
