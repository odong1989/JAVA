/**
| 목표 : 회원이 가입하면 아래의 정보를 입력받고 출력예처럼 행할 수 있도록 하십시오.
| 
|
|
*/


public class Member{
//public class라고 꼭 기재하시오!!!
//public를 입력하지 않을 경우
//같은 패키지라고 해도 같은 폴더내에 없으면 사용이 불가하다!!!

	//1. 변수의 자료형 선언
	 private String name;
	 private String dateOfBirth;
	 private String bloodType;
	 private double height;
	 private double weight;


	//2. 생성자 설정(최소한 기본생성자는 설정)
		//2.1 기본생성자(이해도를 위해 출력기능을 임의로 넣었다)
		public Member()
		{
			System.out.println("기본생성자입니다. 이해를 위해서 출력포함했을 뿐.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}

		//2.2 임의생성자(총 2개 스타일)
		public Member(String name, String dateOfBirth)
		{
			System.out.println("2번째(임의1) 스타일 생성자입니다.");
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}
	


		public Member(String name, String dateOfBirth, double height, double weight, String bloodType)
		{
			 this.name = name;
			 this.dateOfBirth=dateOfBirth;
			 this.bloodType=bloodType;
			 this.height=height;
			 this.weight=weight;


			System.out.println("3번째(임의2) 스타일 생성자입니다.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}
	


}
