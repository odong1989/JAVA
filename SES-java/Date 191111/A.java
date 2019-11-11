//1.퍼블릭 클래스는 1개만 들어갈수 있ㅅ어요!
//2.본 자바 파일의 명은 퍼블릭클래스의 이름으로 해야 합나디.
//3.자바 파일이 1개이지만 클래스 파일은 3개가 생성되지요!
//  (#왼쪽의 폴더를 봐요)

//연계실행 파일 : InheritTest.java
class A 
{
	public int num = 1;
	//Constructors
	public A(){ System.out.println("A클래스의 생성자입니다."); }

	//Method
	public void print() { System.out.println("A클래스의 메소드입니다."); }
}

class B extends A{
	public B(){ System.out.println("B클래스의 생성자입니다."); }
	public void bMethod(){ System.out.println("B클래스의 bMethod() 메소드입니다."); }

	//오버라이딩(상속받은 것을 다시 정의하는 것)이 실시되었다.
	public int num = 2;
	public void print(){ System.out.println("B클래스의 print() 메소드입니다. 오버라이딩이 적용되었습죠."); }
}

class C extends A{ 
	public int num = 3;
	public C(){ System.out.println("C클래스의 생성자입니다."); }
	public void cMethod(){ System.out.println("C클래스의 cMethod() 메소드입니다."); }

}