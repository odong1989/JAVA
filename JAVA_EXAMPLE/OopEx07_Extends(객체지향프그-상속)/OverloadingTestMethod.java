public class OverloadingTestMethod
{
	/*오버로딩 메소드의 특징
	1)메서드 이름이 같다.
	2)argument List가 다르다(개수/타입/순서)
	3)[주의!] 반환되는 데이터타입은 오버로딩메소드와는 관계가 없다
	4)[주의!] 상속과 관련이 없다
	*/
	public int methodA(int a){
		return a+10;
	}

	public int methodA(int a, int b){
		return a+b;
	}

	public double methodA(double a){
	//반환되는 데이터타입은 메서드오버로딩에 관계없습니다.
		return a+12.5;
	}

	public static void main(String[] args) 
	{
		OverloadingTestMethod over = new OverloadingTestMethod();
		System.out.println(over.methodA(10));
	}
}
