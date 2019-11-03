//Student클래스를 활용하는 프로그램이 되겠다.
class StudentTest
{
	public static void main(String[] args) 
	{
		Student s1 =new Student();
		//s1.name = "홍길동";
		//s1.kor = 100;
		//System.out.println(s1.kor);

		s1.setName("홍길동");
		s1.printName();

		
		System.out.println(s1);
		//s1변수는 주소번지수 정보만 갖고있다.
		//사람으로 치면 도서번호만 알고 간 다음에
		//필요한 서적(s1.kor)을 뒤적거리며 찾는 것과 같은 것이다.

		Student s2 = new Student();
		//s2.name = "김철수";
		s2.getName();
		//System.out.println(s2);
		//s2.printName();

	}
}
