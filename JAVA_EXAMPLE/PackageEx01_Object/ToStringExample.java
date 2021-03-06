//SES java Book 198~199page

public class ToStringExample{ 
	public static void main(String[] args) 
	{
		Member member = new Member("홍길동",25,"서울시");
		System.out.println(member);//member변수의 Member클래스-오버라이딩된 toString()가 작동합니다.
	}
}

class Member
{
	//변수선언
	String name;
	int age;
	String address;

	//생성자선언
	public Member(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Member(){}



	//toString 오버라이딩
	//toString을 오버라이딩 효과 : 프로그래머가 보여주고 싶은대로 결과문을 수정할 수 있다.
	@Override
	public String toString(){
		return "이름 : " + name + ", 나이 : " + age + ", 주소 : " +address;
	}
}
