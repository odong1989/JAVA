import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarClass
{
	public static void main(String[] args) 
	{
		Calendar cal = new GregorianCalendar();
		String day=null;
	
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+1+"월");//월은 0부터 시작합니다. 그래서 1을 더해주게 됩니다.
		System.out.println(cal.get(Calendar.DATE) + "일");

		System.out.println(cal.get(Calendar.HOUR) + "시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");

		
		switch(cal.get(Calendar.DAY_OF_WEEK)){
			case Calendar.MONDAY	: day = "월요일"; break;
			case Calendar.TUESDAY	: day = "화요일"; break;
			case Calendar.WEDNESDAY : day = "수요일"; break;
			case Calendar.THURSDAY	: day = "목요일"; break;		
			case Calendar.FRIDAY	: day = "금요일"; break;
			case Calendar.SATURDAY	: day = "토요일"; break;		
			case Calendar.SUNDAY	: day = "일요일"; break;			
		}
		
		System.out.println(day+"입니다.");
	}
}
