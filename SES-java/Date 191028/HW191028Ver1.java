import java.util.Scanner;

class HW191028Ver1 
{
	public static void main(String[] args) 
	{
		String id=null; //주민등록번호이다. 입력받는 것으로 합니다. 이건 예제보여주느라 한거임.
		Scanner input = new Scanner(System.in);
		boolean flag=true;
			
		while(flag)
		{
			id=input.next();


			if(id.length()==14)
			{	
				 System.out.print(id.substring(0,2)+"년 "); 
				 System.out.print(id.substring(2,4)+"월 "); 
				 System.out.print(id.substring(4,6)+"일생 ");
				 
				switch (id.substring(7,8))
				{
					//남자일 경우 : 9,1,3		
					case "9" :
					case "1" :
					case "3" : System.out.println("남자입니다.");
							 break; 				
					//여자일 경우 : 0,2,4		
					case "0" :
					case "2" :
					case "4" : System.out.println("여자입니다.");
							 break; 				
					default :System.out.println("예외입력입니다");
							
				}
				

				 flag=false;
			}
			else
			{
				System.out.println("-포함하여 14글자 입력해주세요");				
			}
		}

		
		//입력이 14글자가 아니면 종료하세요.(-포함)
		//다음의 정보를 출력하세요.
		//90년 01월 01일생 남자입니다.

		/*
			확인할 사항은
			1) 14글자 정상입력
			2) 출생 숫자의 6자리를 2개씩 나눠서 보고,  
		*/

	}
}
