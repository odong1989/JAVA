package tutorial2;

public class tutorial2Main {

	//상수설정. 
	final static double PI = 3.14;
	final static int INT_MAX = 2147483647; //int형이 가질 수 있는 최대한의 값.
	
	//final : 절대 바뀔 수 없다는 상수라는 의미. 
	
	public static void main(String[] args) {
		//UDEMY 자바기초프로그래밍 2강 나동빈 
		
		//변수 설정 및 출력 
		int intType =100;
		double doubleType = 150.5;
		String stringType = "나동빈";
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		
		// 상수 설정 및 출력 
		int r =10 ;
		System.out.println(r*r* PI);
		
		//오버플로우 
		System.out.println(INT_MAX);
		System.out.println(INT_MAX+1);//오버플로우되면 -가 붙으면서 가장 낮은 값이 되어 버린다.
		
		
		//가장 기초적인 사칙연산 예제.
		int a =1; 
		int b =2;
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("axb="+(a*b));
		System.out.println("a/b="+(a/b));
		
	}

}
