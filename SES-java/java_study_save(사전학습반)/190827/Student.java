//사용자가 정의하는 새로운 자료형이다.
//스트링형 2개, 인트형 3개를 묶는 사용자가에게 맞춤형 자료형을 만들어 보자

//즉, "새로운 자료형의 정의"가 되겠다.
class Student
{
	//학생 1명의 정보를 담는 자료형을 만드는게 목표이다.
	//1.속성정의(field, 멤버변수)
	//접근지정자(
	private String num; 
	private String name; // String num, name; 으로 선언해도 되지만, 위처럼 각줄로 하면 주석을 달수 있기에 따로하기를 권장한다고 하심.

	private int kor,eng, math ; //이렇게 선언해도 되지만 주석을 통할 설명에 제약이 생길수도 있다.


	//2.기능정의
	public void setName(String n){
		name = n ;
	}

	public String getName(){
		return name;
	}

	void printName(){
		System.out.println("이름: " + name);
	}




	//[여담] 메인은 사용하지 않는다. 어디까지나 활용가능하도록 클래스정의만하는 것이니까.

}
