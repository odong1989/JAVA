	class  OpTest
{
	public static void main(String[] args) 
	{
		int a, b, c;

		a= 10;
		b= 3;
		c = a+ b;
		System.out.println(c);

		c= a/b;
		System.out.println(c);

		//c= a / 3.0;//연산은 자동으로 형의 변환이 이루어지지만 
		  			     //대입은 자동으로 형의 변환이 안된다.
					     //그냥 실수형의 기본인 DOUBLE형 변수를 하나 선언하는 식이 낫다.
		
		double d;
		d = a / 3.0;
		System.out.println(d);

		c = a % 3;			  
		System.out.println(c);

	}
}
	