class StringTest 
{
	public static void main(String[] args) 
	{
		String s = "Java 자바";
		          //0123456 순으로 글자들은 위치값을 갖는다.(공백도 카운팅한다) 
	//원래는 String s = new String("Java 자바"); 라고 선언하여
	//new를 활용해야 하지만 생략해도 되도록 String클래스에 정의되어 있다.

		System.out.println(s);

		char ch = s.charAt(3);
		System.out.println(ch);

		int t1 = s.indexOf('v');
		System.out.println(t1);
		int t2 = s.indexOf("v");
		System.out.println(t2);
		//'v' : 기본 자료형이다(2바이트)
		//"v" : 객체이다.
		// v  


		int n = s.length();
		System.out.println("글자수 : "+n);

		String s2 = s.substring(0,4); //0부터 4번 전까지.
		//substring(int beginIndex, int endIndex)
		System.out.println(s2);


		String s3 = s.substring(5); //5번부터 끝까지.
		//substring(int beginIndex)
		System.out.println(s3);


		s="ja";
		s=s+"va";
		System.out.println( s );
		System.out.println( s == "java" );//주소비교(Not Good!)
		//false라는 결과를 얻는다.
		//이유는 같은 주소를 가리키냐는 질문이다.(즉, 값이 저장된 주소를 통해 비교를 한다는 것이다)
		//자바는 s와 java의 주소값을 비교하여 "다르다!"라는 판결을 내린 것이다.

		System.out.println( s.equals("java") ); //내용비교(Good!)
		//true라는 결과를 얻게 된다.
		//equals를 사용함으로서 내용이 "s의 저장값이 'java'가 맞는가?"라는
		//사용자가 원하는 질문이 실시되었고
		//내용이 java임을 확인, 동일하기에 TRUE라는 결과가 나왔다.
		//결론 : 문자열의 내용을 확인하려면 반드시 .equals() 메소드를 통하여 내용을 비교하자
	
		//.equals() 메소드는 영대소문자를 구분하여 가끔 불편하다면
		System.out.println( s.equalsIgnoreCase("java") ); //equalsIgnoreCase() 메소드로 대소문자 구별을 않도록 하면 된다.
		System.out.println( s.startWith("ja") ); 
		System.out.println( s.endsWith("va") ); 

		/*
			웹사이트 등을 만들 때 메소드를 많이 씁니다.
			api를 많이 알수록 좋죠
		*/
	}
}
