import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarClass
{
	public static void main(String[] args) 
	{
		Calendar cal = new GregorianCalendar();
		String day=null;
	
		System.out.println(cal.get(Calendar.YEAR) + "��");
		System.out.println(cal.get(Calendar.MONTH)+1+"��");//���� 0���� �����մϴ�. �׷��� 1�� �����ְ� �˴ϴ�.
		System.out.println(cal.get(Calendar.DATE) + "��");

		System.out.println(cal.get(Calendar.HOUR) + "��");
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");

		
		switch(cal.get(Calendar.DAY_OF_WEEK)){
			case Calendar.MONDAY	: day = "������"; break;
			case Calendar.TUESDAY	: day = "ȭ����"; break;
			case Calendar.WEDNESDAY : day = "������"; break;
			case Calendar.THURSDAY	: day = "�����"; break;		
			case Calendar.FRIDAY	: day = "�ݿ���"; break;
			case Calendar.SATURDAY	: day = "�����"; break;		
			case Calendar.SUNDAY	: day = "�Ͽ���"; break;			
		}
		
		System.out.println(day+"�Դϴ�.");
	}
}
