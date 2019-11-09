class StringTest3AnotherStrings 
{
	public static void main(String[] args) 
	{
		String a= new String("abc");
		String b= new String("abc");
		StringBuffer c= new StringBuffer("abc");
		StringBuffer d= new StringBuffer("abc");

		System.out.println("String a       :" + a);
		System.out.println("String b       :" + b);
		System.out.println("StringBuffer c :" + c);
		System.out.println("StringBuffer d :" + d);

		a= a+"d";
		/*
		a= a+"d";
		String 경우 새로운 문자를 추가할 경우 기존의 주소번지를 버리고
		새로운 번지수를 링크한다.
		즉 a는 기존의 abc가 저장되어있던 100번지를 버리고
		abcd라는 새로운 문자열이 생성된 주소 500번지를 갖고 링크하게 된다. 
		
		*/
		
		
		c.append("d");
		System.out.println("a와 b의 주소는 같니?(a == b):" + a == b );
		//a는 주소를 가리키는 상태이다.
		//즉 "a의 주소와 b의 주소는 같니??"라고 묻는 것과 다를바가 없다.
		System.out.println("c와 d의 값은 같니?(c == d) :" + c == d);
		System.out.println(" :" + a.equals(b));
		System.out.println(" :"+c.equals(d));
		

	}
}
