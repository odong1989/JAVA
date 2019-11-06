/**
|ㅡㅡㅡ문서화 구간ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ|
| [1장] 프로그램 목표 및 실시조건  				  										    	    |
|	 																				    	|
| 1.프로그램목표 : 주민번호를 입력받으면 입력받은 주민번호의 생일, 나이, 성별을 출력합니다.                         |
| 2.실행할 사항 : 입력시 조건, 출력시 조건 2종류로 나뉘며 상세내역은 아래와 같다.                               |
| 2.1 입력시 준수사항																			|
|     (1) 주민번호 14자리를                                                                     |
|     (2) 예외입력(이상한 입력)은 아래와 같이 규정한다.                                                 |
|         예외입력1-입력문자열의 길이가 14자리가 아닌 경우                                               |
|         예외입력2-주민번호의 규격(123456-1234567)을 맞추지 않은경우                                   |             
|         예외입력3-숫자이외의 값들을 입력한 경우.(중간의 '-'제외)								        |
|                                                                                           |
| 2.2 출력시 준수사항																			|
|     (1) 아래와 같이 출력을 하도록 한다.															|
|     [출력 예] 90년 01월 01일생 29세 남자입니다.													|
|	 																				    	|
|	 																				    	|
|  ---------------------------------------------------------------------------------------  |
| [2장] 프로그램의 구성(코딩) 																		|
|																							|
| 1.클래스																					|
| 1.1 import하는 클래스																			|
|  (1)import java.util.Scanner	: 사용자의 입력수신												|
|  (2)import java.util.Calendar : 날짜 확인목적													|
| 1.2 직접제작하는 클래스			 																|
|  (1)SocialSecurityNumberCheck.java : 주민번호입력체크(정상입력확인) 메소드 보유						|
|  (2)LeapYearCheck.java			 : 윤년체크메소드											|
|  (3)DdayCountAndOutput.java		 : Dday출력메소드 											|
|																							|
| 2.활용하는 메소드																				|
|  : 생략.(각 메소드의 호출부분에서 설명하는것으로 대체한다.)												|
|																							|
| 3.변수설명																					|
|  : 생략.(각 메소드의 시작부분에서 설명하는것으로 대체한다.)												|
|																							|
|ㅡㅡㅡ문서화 구간종료ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ|
*/
import java.util.Scanner;
import java.util.Calendar;

class BirthdayOutputBySocialSecurityNumberDevide
{
	public static void main(String[] args) 
	{
		int[] birthData={0, 0, 0, 0, 0};
				  //출생 년/ 월/ 일/ 성/ Dday(살아온날)
		/*int birthData[] : 입력자의 출생정보를 저장하기 위한 배열이다.
							타클래스의 메소드들에게 처리를 위임하면서 
							2개이상의 값 리턴받기가 어려워졌고,
							이에따라 처리하는 메소드가 처리중에 값을 수정해주는 방식으로 하였다.
		*/

		person = new SocialSecurityNumberCheck();
		System.out.println("주민번호 활용한 출생일 및 성별 해설프로그램입니다.");


	String inputSSN=null; //SSN : 주민번호(SocialSecurityNumber)의 약어. 문자열로 입력받은 후 숫자값으로 변환.	
	Scanner in = new Scanner(System.in);
	Calendar cal = Calendar.getInstance(); //주민번호의 출생일 정상입력 확인용	
	Calendar toDay = Calendar.getInstance();	   //d-day계산용(오늘날짜)	
	Calendar dDay = Calendar.getInstance(); //d-day계산용(생일기입)
	int now_year=cal.get(Calendar.YEAR);

	int DdayLife=0;//출생일 이후 살아온 날짜 카운트
	

	int birth_year=0;	//윤년확인위해 20xx식으로 년도를 4자리로 저장하는 변수.
	int birth_month=0;
	int birth_day=0;
	String sex="";		//주민번호로 남/여 성별 확인
	char check;			//예외입력3에서 숫자이외의 값이 입력되었는지 확인.	


	boolean ContinueFalg=true; //사용자의 입력이 정확해야 입력이 종료된다.	
//변수선언파트 끝------------------------------------------------------------------------------
		
		
		
		while(ContinueFalg)
		{
			System.out.println("주민등록번호를 입력해주세요. (예)123456-1234567  : ");
			inputSSN = in.next();
				
			//예외입력1 체크_글자수 14자 확인-----------------------------------------------
			if (inputSSN.length()!=14)//참일시 계속 예외입력2,3을 체크진행. 
			{	
				System.out.println("주민번호를 14자 입력해주세요(-포함)" );
				continue;
			}

			//예외입력2_체크 6번째 문자 위치에 '-'가 들어갔는지 확인.--------------------------------
			if (inputSSN.charAt(6)!= '-')
			{
				System.out.println(" '-'입력오류입니다." );
				continue;
			}
			//예외입력2_체크 6번째 문자 위치에 '-'가 들어갔는지 확인 END-------------------------------------------------
			
			//예외입력3_체크 숫자이외의 값 입력을 확인.(6번쨰 문자는 '-' 체크)-----------------------------------------		
			for(int point=0; point < inputSSN.length() ;point++)//예외입력 2,3 체크용 반복문
			{
				check=inputSSN.charAt(point);
				if( point!= 6 &&(check < 48 || check > 57))
				{// point!= 6 : 6번째 자리는 '-'이니 체크하지않도록 설정함.
					System.out.println("숫자이외의 값 감지. 다시 입력해주세요." );
				continue;
				}
			}
			//예외입력3_숫자이외의 값 입력을 확인 END------------------------------------------------------------		


			//남녀 구분
			switch (inputSSN.charAt(7))
			{
				/*            남자     /     여자 
				---------------------------------------------
				1800년대 출생 :    9     /      0
				---------------------------------------------
				1900년대 출생 :    1     /      2
				---------------------------------------------
				2000년대 출생 :    3     /      4
				*/
				//남자일 경우 : 9,1,3		
				case '9' : case '1' : case '3' :
				sex="남자";
				break; 				
					
				//여자일 경우 : 0,2,4		
				case '0' : case '2' : case '4' :
				sex="여자";
				break; 				
				
				default :System.out.println("예외입력입니다");			
			}//switch END

			ContinueFalg=false;
		}//while END

		//윤년체크
		//step1.출생년도를 4자리로 조정.
			birth_year = Integer.parseInt(inputSSN.substring(0,2));
			if(birth_year<=(now_year-2000))//주민번호는 '1999년'처럼 4자리로 나오지 않으므로 4자리로 맞추는 작업실시.
			{
				birth_year = Integer.parseInt("20"+inputSSN.substring(0,2));
			}
			else
			{
				birth_year = Integer.parseInt("19"+inputSSN.substring(0,2));
			}

			//6.step2.윤년여부 판결
			if((birth_year%4 == 0)&&((birth_year%100 != 0)||(birth_year%400 == 0)))
			{
				System.out.println(birth_year+"년 은/는 윤년입니다");
			}
			else 
			{
				System.out.println(birth_year+"년 은/는 윤년이 아닙니다.");
			}

			// 체크5_생일은 1~12월, 1~31일이어야 합니다. & 체크7_월별로 마지막날이 다릅니다. 확인실시
			//step1.주민번호의 출생 년/월/일을 각 변수에 저장.
			birth_month=Integer.parseInt(inputSSN.substring(2,4));
			birth_day=Integer.parseInt(inputSSN.substring(4,6));

			/*step2.Calendar형 변수 cal의 날짜를 주민번호의 년/월/일로 설정.
			  자동제공되는 Calendar를 활용하여 주민번호의 출생일이 정상입력되었는지 체크.
			*/
			cal.set(Calendar.YEAR, birth_year);
			cal.set(Calendar.MONTH, birth_month);
			cal.set(Calendar.DATE, birth_day);			

			//1~12월 여부 체크,
			if(birth_month<1 || birth_month>12)
			{
				System.out.println("입력오류입니다. 주민번호의 월 정보를 확인해주세요."); 
				System.exit(0);
			}//이어서 일 체크
			else if(birth_day>cal.getMaximum(Calendar.DAY_OF_MONTH))
			{
				System.out.println("입력오류입니다. 주민번호의 일 정보를 확인해주세요."); 
				System.exit(0);
			}


		/*
		출생 년/월/일 연령/성별 을 출력한다.
	    (예) 90년생 1월 1일생 29세 남자입니다.
		*/
		System.out.println(birth_year+"년생 "+birth_month+"월 "+birth_day+"일 "+(now_year-birth_year)+"세 "+sex+"입니다"); 

	}
}

