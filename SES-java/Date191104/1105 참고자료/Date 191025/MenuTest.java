/*
[프로그램 제목]

1. 입력
2. 수정
3. 삭제
4. 출력
0. 종료

번호선택 > 숫자입력수신 > switch문을 통해 각 번호 행동 비교
(다했거나, 중도포기시) 첫화면으로 다시리턴(0입력될때까지 프로그램은 끝나지않아 친구)

(#왠지 삼국지영걸전의 첫시작화면같은데..?)


목표 : 주소록 프로그램
이름, 전화번호,
새로운 사람이름을 계속 입력받으려면 1번
수정하려면 2번
3번은 삭제
4번은 전체목록보기

*/

import java.util.Scanner;

class MenuTest 
{
	public static void main(String[] args) 
	{
		//미리 준비해야하는 객체생성 및 변수선언을 실시합니다. 
		Scanner scan = new Scanner(System.in);

		int menuNum;
		String names[]=new String[10];	//10명까지의 이름을 저장할 수 있는 배열.
										//null : 어떤 객체도 가리키지 않는 상태를 의미합니다.
		int cnt=0;//names[]의 배열칸 선택을 위한 변수.		


		//프로그램 전체를 무한반복
		while(true)//무한반복 시켜도 언젠가는 끝나게 만든다.
		{
			//메뉴 출력
			System.out.println("1. 입력");
			System.out.println("2. 수정");	
			System.out.println("3. 삭제");			
			System.out.println("4. 출력");
			System.out.println("0. 종료");			

			//메뉴번호 입력받음
			System.out.print("실행하실 메뉴의 번호 : ");			
			menuNum = scan.nextInt();


			//입력한 번호에 따라 분기
			switch (menuNum)
			{
			case 1 : System.out.println("1. 입력 메뉴입니다.\n");
			 		 System.out.print("이름을 입력해 주세요. : ");
					 names[cnt] = scan.next();
					 cnt++;
					 break;

			case 2 : System.out.println("2. 수정 메뉴입니다.\n");	
					 break;

			case 3 : System.out.println("3. 삭제 메뉴입니다.\n");			
					 break;

			case 4 : System.out.println("4. 출력 메뉴입니다.\n");
					if(cnt==0)
						{
							System.out.println("저장된 사람이 없습니다.\n");
							break;
						}
					
					 for(int i=0 ; i<=cnt ;i++)
					 {

						System.out.printf("%d : %s \n",i,names[i]);						
					 }
					 break;

			case 0 : System.out.println("0. 종료 메뉴입니다.\n");
					 return;

			default : System.out.println("메뉴번호의 숫자만 입력해주세요.\n");		
					 break;
					 //내생각은 continue; 인데? 좀 다를려나?
			}//switch end
			
			
			
			//0을 입력하면 프로그램 자체 종료.
		}
		//프로그램의 끝
	}

}
