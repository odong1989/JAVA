import java.util.Calendar;
/* static int parseInt(String s)   

*/

class APItest3Calendar
{
	public static void main(String[] args) 
	{
		//���ڿ��� ���ڷ�
		String a = "1234";
		//	System.out.println(a+1);				//��� : 12341���� ���´�. String�̴ϱ�. 
		System.out.println(Integer.parseInt(a)+1); //[NG���]��� : 12341���� ���´�. String�̴ϱ�. 
		

		//���ڸ� ���ڿ���
		int b = 100;
		System.out.println(b+1+2);				//103�� ��µȴ�.
		System.out.println(Integer.toString(b)+1+2); //10012���� ��µȴ�. b�� ���ڿ��� �̸��� �Ǳ⿡ ������ ��Ģ������ �ƴ� ���ڿ��� �ڿ� �ٱ�ó�� �� ���̴�.


		//��¥, �ð� ���� ����
		Calendar c =Calendar.getInstance(); //�� ������ �ð�����
		//new Calendar ������ ���� �� �����.
		//CalendarŬ������ getInstance���� ������ּ��� ��Ź�ؾ� �ϴ� ��������.
		//�ٵ� �̷� �� �ۿ� ���°� �ѹ� �ް� ������ �ð��� ����ȭ�� �ȵǴϱ�.
		
				
		System.out.println("=========================================================");
		//System.out.println("Calendar c : "+c);//��� ������ �Ʒ��� �ּ� ����. 
		/*
			��³����� �Ʒ��� ����.
			Calendar c : java.util.GregorianCalendar
						[time=1572316455381,
						areFieldsSet=true,
						areAllFieldsSet=true,
						lenient=true,
						zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
						offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],
						firstDayOfWeek=1,
						minimalDaysInFirstWeek=1,ERA=1,
						
						
						YEAR=2019,
						MONTH=9,	//10�������� -1�Ǿ� 9�� ������ �ִ�.
						
						WEEK_OF_YEAR=44, WEEK_OF_MONTH=5, 
						
						DAY_OF_MONTH=29, //���� ��û�ϰ� ���� ���� ���� ���´�.
					
						DAY_OF_YEAR=302,DAY_OF_WEEK=3, DAY_OF_WEEK_IN_MONTH=5,

						
						AM_PM=0,	//0 : ����, 1 : ����
						HOUR=11,		//�ð�
						HOUR_OF_DAY=11,//�ش����� �ð�?
						MINUTE=34,		//�ð�
						SECOND=15,MILLISECOND=381,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		*/

		//���ϴ� ������� : "2019�� 10�� 19�� ȭ���� ���� 11�� 30���Դϴ�."
		//��Ʈ : ������ ��� �迭�� ����Ͻʽÿ�.
		System.out.println(c.get(Calendar.YEAR)); //�⵵�� ���� �� �ֽ��ϴ�.
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//System.out.println(c.get(Calendar.Date));
		//System.out.println(c.get(Calendar.DAY_OF_WEEK));//Calendar.Date()�ᵵ �ȴٰ� �Ͻ�.
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));

		System.out.println("------------------------------------------------------------");
		String AMPM[]={"����","����"};//0:����, 1:����
		String day[]={" ","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};//0��°ĭ�� ���� ���߰��� �Ϻη� ��������.


		System.out.printf("������ %d�� %d�� %d�� %s %s %d�� %d�� �Դϴ�.\n",
						    c.get(Calendar.YEAR),
							c.get(Calendar.MONTH),
							c.get(Calendar.DAY_OF_MONTH),
							day[c.get(Calendar.DAY_OF_WEEK)],
							AMPM[c.get(Calendar.AM_PM)],
							c.get(Calendar.HOUR),
							c.get(Calendar.MINUTE));

	}
}