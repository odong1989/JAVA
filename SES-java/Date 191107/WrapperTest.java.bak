class WrapperTest
{
	public static void main(String[] args) 
	{
		//wrapper 클래스(책218페이지)---------------------------------------------------
		int a = 10;
		Integer b = new Integer(10);
		String c = "10";

		//출력해서 보면 값은 10으로 같지만 속내용은 다르다.
		System.out.println("a : " + a );
		System.out.println("b : " + b );
		System.out.println("c : " + c );
		//위와 같은 출력으로는 실상을 알 수 없다.

		System.out.println("int a + int a                       : " +( a + a) );
		System.out.println("int a + String c                    : " + (a + c) );
		System.out.println("int a + Integer b                   : " + (a + b) );		
		System.out.println("int a + Integer b.intValue()        : " + (a + b.intValue()) );		
		System.out.println("int a + \"\" + Integer b            : " + (a + "" + b) );				
		System.out.println("Integer.toString(a) +  b.toString() : " +(Integer.toString(a) + b.toString()) );		

		

		Integer x = new Integer(100);
		Integer y = new Integer(100);
		
		System.out.println(x>y);
		System.out.println(x==y);
		//x와 y에게는 주소값이 저장되어 있는 상태입니다. x는 100번지를, y는 200번지를 갖는 식이죠.
		//그래서 숫자값 100으로 같은데도 두번째에서 거짓이라고 뜨는겁니다.

		System.out.println(x.compareTo(100));
		//객체가 갖고 있는 값을 비교하기 위해서는
		//compareTo()메소드를 사용하여 실시합니다.
		System.out.println("객체끼리의 부등호 연산은 최근에서야 되었습니다(예전에는 안됨)");





		/*
	   	|    스택 영역  |      힙 영역        |
		|-------------|-------------------|-
 	 a  |    숫자값  10     |       없음         | 자신의 명의(a)으로 값을 직접 보관한다.
		|
		b  주소값 500  --(링크)--> 10          | Integer 객체로 값이 힙에 저장되고 b는 링크하여 사용한다.        
		
		c  주소값 1000  --(링크)--> "10"        | String 객체로 

		채팅프로그램등 네트워크등에서 자료를 받을 때 String형등으로 입력을 받는 경우가 다양하다.
		그래서 우리가 입력형태를 이렇게 따지는 이유죠.
		*/
		//String e = (String) e //이것은 에러로 처리됩니다. 이런식으로 처리할 수 없어요.


		/*맨위에서의 선언
		int a = 10;
		Integer b = new Integer(10);
		String c = "10";
		*/

		//예1 : int(기본자료형)을 Integer(Wrapper객체)로 변환
		Integer d =new Integer(a); 
		//예3 : String->Warpper객체
		Integer f =new Integer(c);
		


		//예2 : int(기본자료형)을 String로 변환
		String e = Integer.toString(a);
		//예6 : Warpper객체 - >String 으로 변환
		String i = b.toString();		



		//예5 : Warpper객체 -> 기본자료형
		int h = b.intValue();
		//예4 : String->기본자료형 으로 변환
		int g =  Integer.parseInt(c);
		



	}
}
