/*
	출처 : SES자바 책 155페이지
*/

class ConstructorBasicStyleTest
{
	public static void main(String[] args) 
	{
		/*
			ConstructorBasicStyle에서 생성자를 정의하지 않아도 생성자를 할 수 있다.
			자바에서 자체적&암묵적으로 제공한다.(단, 생성자가 1개도 없어야 한다.)
		*/
		ConstructorBasicStyle mc = new ConstructorBasicStyle();

		//명시적으로 초기화 않을시 각 데이터의 기본값으로 초기화된다.
		System.out.println("age is : "+mc.age);
		System.out.println("name is : "+mc.name);
		System.out.println("Male is : "+mc.isMale);
		/*
			
		*/
	}
}
