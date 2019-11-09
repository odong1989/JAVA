import java.util.Random;
import java.util.Date;
import java.util.Calendar;


class MethTest //책222페이지
{
	public static void main(String[] args) 
	{

		//error//Math m = new Math();
		//static 메서드이기에 공용이다! 객체안에 값과 기능들을 일일이 개별적으로 갖는 건데
		//다 정해진 값들인데 뭐하려 메모리낭비하려고 객체를 만들고 난리를 치나?
		//그래서 걍 기능들만 만들어 둔거.

		//Integer i =new Integer();
		//private라서 직접 손 못대개 할려고 이렇게 했다.
		//연습시 사용한 Student클래스 예제의 경우 학생의 이름, 점수라는 중요정보가 있고 이를 
		//각 개인마다의 중요정보로 저장하기 위해 선어낳ㄴ 것이다.

		double a = Math.pow(2,10);
		System.out.println(" a 2^10: "+a);
	     a = Math.pow(0.5,2);
		System.out.println(" a 0.5^2: "+a);
	
		System.out.println(" 3.5에서 무조건 올림 Math.ceil() : "+Math.ceil(3.5));		//올림	
		System.out.println(" 3.5에서 무조건 내림 Math.floor() : "+Math.floor(3.5));		//내림
		System.out.println(" 3.5에서 반올림을 함 Math.round() : "+Math.round(3.5));		//반올림	

		System.out.println(" 2의 거듭제곱근 Math.sqrt() : "+Math.sqrt(2));		//제곱근
		
		System.out.println(" -2 절대값 Math.abs() : "+Math.abs(-2));		//절대값

		System.out.println(" 2랑 3중에서 큰값은? Math.max() : "+Math.max(2,3));		//큰값주세요.
		System.out.println(" 2랑 3중에서 작은값? Math.min() : "+Math.min(2,3));		//작은값을 주세쇼


		//랜덤클래스---------------------------------------------------------------------
		//자주 잊는 사실인데, 랜덤은 import를 해줘야 한다!!
		//import java.util.Random;
		Random r = new Random();
		int i = r.nextInt(100);
		System.out.println(i);//0~100사이의 정수


		//날짜 관련 클래스---------------------------------------------------------------
		Date d = new Date();				//현재 시간정보 포함
		Calendar c = Calendar.getInstance();//현재 시간정보 포함.
		/*Calendar형 클래스변수를 생성해야 하는데 생성자로 생성을 못하게 막아두었다.
		  그래서 대신 생성을 해주는 getInstance()메소드에게 부탁하여 우회생성하는 방식을 택하게 된다.
		*/

		System.out.println(" Date d : "+ d);		//큰값주세요.
		System.out.println(" Calendar c : "+c);		//작은값을 주세쇼
	
	
	}
}
