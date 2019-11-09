class ObjectTest extends Object
{
	public static void main(String[] args) 
	{
		//Object 클래스---------------------------------------------------
		ObjectTest t = new ObjectTest();
		System.out.println(t.toString());
		System.out.println(t.equals(t));
		/*
		우리가 아무런 내용도 실시하지 않았음에도 바로 로드하여 사용할 수 있는 이유는
		Object(java.lang패키지소속)클래스에게 상속(extends)받았기 때문이다.
		맘에 안든다면 튜닝(오버라이딩)을 하면 된다.
		*/

	}
}
