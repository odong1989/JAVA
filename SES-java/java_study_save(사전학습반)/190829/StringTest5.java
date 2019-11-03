import java.util.Scanner;
import java.util.Calendar;

class StringTest5 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String year;

		System.out.print("태어난 해 : ");
		year = in.nextLine();	//(ex) "2000"

		/*
		인터넷에서 사용자가 입력하는 값들,
		윈도우 내에서 처리되는 값들도 모두 스트링으로 입력되기 때문이다.
		
		즉, 이런 문자열로 입력되면 if문, 대소비교등은 에러가 나기 매우 쉽다.
		*/

		//정상입력확인 및 경고문 출력
		//1.글자수 4자리인지 확인
//		year.length();
		
		//2.나이 확인
		int y = Integer.parseInt(year);

		Calendar c = Calendar.getInstance();
		int a = c.get(Calendar.YEAR);
		int b = c.get(Calendar.MONTH);
		//getInstance()메소드는 월이 현재달보다 -1 되어 나온다.
		//지금 2019년08월29일인데 Month값이 7로 나온다는 애기다. 

		System.out.println(a+"년"+(b+1)+"월");

		int age = a - y;

		//계산하기
		System.out.println("나이 : "+age);





	}
}
