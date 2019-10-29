//면접시 스트링관련 정리를 보고 싶다면 이걸보라!!!
class StringTest1
{
	public static void main(String[] args) 
	{
		String a;	//초기화를 하지 않아서 에러나는 경우
		String b=null;//오류는 아니다. 가리킬 스트링 객체가 없는 상태이다. 가리킬 얘가 있다면 
		String c="abc"; //
		String d="abc"; //c가 가리키는 abc객체를 가리키게 된다. 파이썬처럼 데이터를 아끼기위해 같은 얘를 가리키게 한 듯하다.
		String e=new String("abc");
		String f=new String("abc");

		
//		System.out.println(a);//변수 선언을 하지 않아서 에러나는 경우
		System.out.println(b);
		
		//c,d,e,f가 가리키는 번지수가 같은지를 확인한다.
		//[★주의★]검색처럼 입력된 문자열이 같은지를 확인하려하면 .equals를 쓰도록 하자.
		System.out.println(c==d);
		System.out.println(e==f);

		//c와f의 문자열이 같은지를 확인한다.
		//[★주의★]가리키는 번지수가 같은지 알고 싶다면 c==f식으로 '=='기호를 사용하자.
		System.out.println(c.equals(f));
		boolean x = c.equals(f);
		System.out.println( c.length() );	
		

		//NullPointerException 에러-----------------------------------------------------------
//		System.out.println( b.length() );	
		//NullPointerException : 객체가 안 만들어져 있어서(new), 즉 가리키는 주소가 없는 경우에 발생된다. 
		//					     컴파일시에는 에러로 안나오는 이유는 힙영역의 문제이기에 컴파일러가 신경쓰지 않는 것.
		//[에러원문] Exception in thread "main" java.lang.NullPointerException at StringTest1.main(StringTest1.java:27)
		//NullPointerException 에러-----------------------------------------------------------
	
		//배열의 .length String의 .length의 차이점 
		//  배열의 경우 .length으로 소괄호를 사용하지 않는다.
		//String 경우 .length()으로 소괄호를 사용한다!
		//별거 아닌데 은근히 헷갈리고 시험문제로 낚기 차~암! 좋다!!!

		a="abcABCabcABC";
		System.out.println( a.charAt(1) );	
		System.out.println( a.indexOf('c') );//[결과]2를 리턴한다. c의 좌표는 0부터 시작해서 2이다.	
		System.out.println( a.indexOf('d') );//[결과]-1를 리턴한다. 못 찾았을 경우 -1을 리턴합니다.
		System.out.println( a.indexOf('c',3) );//c를 검색한다. 단, 3번째 칸부터 시작한다.
		System.out.println( a.indexOf("cccc") );
		System.out.println( a.lastIndexOf('A') );
//		System.out.println( a.substring('6') );
			

		a="Abc";
		System.out.println( a.lastIndexOf("abc") );
		System.out.println( a.valueOf("AB") );
		System.out.println( a. endsWith("c") ); //"c"로 끝나는가?
		System.out.println( a. toUpperCase());	//문자열 내의 "b"를 모두 "B"로 변경하세요.
		System.out.println("");
		System.out.println( a.compareTo("abc") );//

		System.out.println("");
		a="abcde";
		System.out.println( a.compareTo("abc") );//글자수가 2자리차이난다(=글자가 2개 부족하다) 라는 의미를 갖는다.
		System.out.println("");

		a="010-1234-5678";
		String array[] = a.split("-");
		for (int i=0;i<array.length ; i++)
		{
			System.out.println(array[i] );
		}
	}
}
