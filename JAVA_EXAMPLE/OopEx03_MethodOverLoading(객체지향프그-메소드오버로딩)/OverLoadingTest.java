/*
	코드출처 : SES자바책 148페이지
*/

public class OverLoadingTest{

	public int methodA(int a)
	{
		return a+10;
	}
	/*//아래의 코드는에러가 발생한다.
	  //오버로딩은 파라미터까지 같아서는 안되며,
	  //리턴형은 오버로딩의 구별에 도움이 되지 않는다.
	
	public double methodA(int a)
	{
		return a +12.5;
	}
	*/


	public double methodA(double a)
	{
		return a + 12.5;
	}


	public static void main(String[] args)
	{
		OverLoadingTest over = new OverLoadingTest();
		System.out.println("오버로딩 int형 [over.methodA(10)] 호출결과 : " + over.methodA(10));
		System.out.println("오버로딩 double형 [over.methodA(12.5)] 호출결과 : " + over.methodA(12.5));
	}

}