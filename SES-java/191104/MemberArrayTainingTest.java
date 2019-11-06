import java.util.Scanner;

class MemberArrayTainingTest
{
		public static void main(String[] args) 
	{
		//[1]5명의 회원정보를 담을 배열 생성

		Scanner input = new Scanner(System.in);
		int MemArrayLength=5;//과제는 5명이지만 시간상 2명으로 우선진행
		String tempSt;
		Double tempDb;

		MemberArrayTaining MemArray[];
		MemArray = new MemberArrayTaining[MemArrayLength];

		//[2]키보드로 반복문을 이용하여 5명의 회원정보를 입력받는다.
		for (int create =0 ; create< MemArrayLength ; create++)
		{
			MemArray[create]=new MemberArrayTaining();
		}
		
		for (int repeatIn =0; repeatIn < MemArrayLength ; repeatIn++)
		{
			tempSt = input.nextLine();
			System.out.print("회원의 이름을 입력하십시오. :");
			tempSt = input.nextLine();		
			MemArray[repeatIn].setName(tempSt);

			System.out.print("회원의 출생일을 입력하십시오. (950101식으로) :");
			tempSt= input.nextLine();		//	tempSt= input.nextLine();
			MemArray[repeatIn].setDateOfBirth(tempSt);

			System.out.print("회원의 혈액형을 입력하십시오. :");
			tempSt=input.nextLine();			//tempSt=input.nextLine();
			MemArray[repeatIn].setBloodType(tempSt);

			System.out.print("회원의 키를 입력하십시오. :");
			tempDb= input.nextDouble();			//tempDb= input.nextDouble();
			MemArray[repeatIn].setHeight(tempDb);

			System.out.print("회원의 몸무게를 입력하십시오. :");
			tempDb= input.nextDouble();		//	tempDb= input.nextDouble();
			MemArray[repeatIn].setWeight(tempDb);
			
			System.out.println("");
			System.out.println("");

		}

		//[3]아래와 같이 출력한다.
			/*
			김ㅇㅇ 28세 18.7 정상
			김ㅇㅇ 21세 33.7 비만
			김ㅇㅇ 28세 18.7 정상
			김ㅇㅇ 28세 18.7 정상
			김ㅇㅇ 28세 18.7 정상
			*/
		for (int repeatOut =0; repeatOut<MemArrayLength ; repeatOut++)
		{

			System.out.println("회원의 성명 : " + MemArray[repeatOut].getName());
			System.out.println("회원의 나이 : " + MemArray[repeatOut].getAge());
			System.out.println("회원 BMI점수 : " + MemArray[repeatOut].getBmi());
			System.out.println("회원의 BMI급 : " + MemArray[repeatOut].getBmi("GRADE"));
			System.out.println("회원의 생년일 : " + MemArray[repeatOut].getDateOfBirth());
			System.out.println("회원의 혈액형 : " + MemArray[repeatOut].getBloodType());

			System.out.println("회원의 키    : " + MemArray[repeatOut].getHeight()); 
			System.out.println("회원의 몸무게 : " + MemArray[repeatOut].getWeight());
			
			System.out.println("");		
			System.out.println("");
		}
		System.out.println("Hello World!");

	}
}
