package global.sesoc.oop.classMember;

class MemberTestBMI
{
	public static void main(String[] args) 
	{
		MemberBMI memb001 = new MemberBMI();//모든 멤버변수가 null 또는0.0으로 초기화
		MemberBMI memb002 = new MemberBMI("홍길동","010101");//이름과 생년월일만 초기화
		MemberBMI memb003 = new MemberBMI("김철수","991111",161.0,56.0,"AB");//모든 변수 초기화


		memb003.setHeight(155.5); //객체에 저장된 키 정보를 수정하시오.
		System.out.println("memb003 NAME : "+ memb003.getName());	//객체에 저장된 이름 읽기.
//		System.out.println("memb003 AGE : "+ memb003.getAge());		//나이 읽기
		System.out.println("memb003 BMI : "+ memb003.getBmi());		//BMI지수. 19.5처럼 실수형으로 리턴.
		System.out.println("memb003 BMI : "+ memb003.getBmi("GRADE"));//BMI지수대신에 저체중, 비만등으로 알려주세요.
	}
}
