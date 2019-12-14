package global.sesoc.oop.classStudent;

//사용자 정의 자료형(Value Object)인 class Student를 테스트하기 위해 만든 클래스입니다.
//class Student는 단순한 자료보관정도의 성격이기에 
//테스트 실행을 할 수 없기에 테스트를 위한 클래스가 생성하게 되었다.

//아직은 처음인 관계로 하나의 폴더내에 위치합니다.
//즉, StudentTest.java도 Student.java 모두 
//같은 위치에 저장되어 있다는 것이다.


class StudentTest 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		Student s2 = new Student();

		s.name = "홍길동";
		s.kor = 100;
		s.eng=90;
		s.math = 80;

		s2.name = "안숙향";
		s2.kor = 77;
		s2.eng=100;
		s2.math = 86;


		System.out.println("===================================");
		System.out.println(s);
		//가리키고 있는 주소값만 나온다.
		//정 출력을 원한다면 상속을 익혀야 합니다.

		System.out.println("===================================");
		System.out.println("//출력방법1) 일일이 출력하는 프린트문을 작성한다.(#매우 불편하지)");
		//출력방법1) 일일이 출력하는 프린트문을 작성한다.(#매우 불편하지)
		System.out.println("");
		System.out.println(s.name );//가리키고 있는 주소값만 나온다.
		System.out.println(s.kor);//가리키고 있는 주소값만 나온다.
		System.out.println(s.eng);//가리키고 있는 주소값만 나온다.
		System.out.println(s.math);//가리키고 있는 주소값만 나온다.

		//출력방법2) class Student에서 미리 만들어 제공하는
		//출력메소드 printST를 활용하는 경우(#인스턴트 요리같군!)
		System.out.println("===================================");
		System.out.println("class Student에서 제공하는 printST() 메소드를 활용할 경우");
		 s.printST();//
 
		 s2.printST();//
	}
}
