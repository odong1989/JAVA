class OpTest2 //단항연산자 연습예제
{
	public static void main(String[] args) 
	{
		int a,b,c;
		a=0;
		b=0;

		++a;
		System.out.println("a : " + a); //1
		
		a++;
		System.out.println("a : " + a); //2

		c= ++a; //전위형 단항연산자 : (#내가 2빠다!)
		System.out.println("c : " + c); //3
		
		c=a++; //후위형 단항연산자 : 모든 것이 계산된 후에 뒷북치듯 단항연산
		       //(#모두 연산된 후에 마지막 나#꼴지형)
		System.out.println("c : " + c); //3
		System.out.println("c : " + c); //3

	}
}
