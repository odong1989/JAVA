//MemberArrayTaining 클래스를 활용하여 회원 5명 고객 정보 저장프로그램을 
//선생님이 직접 보여주는 피드백2
import java.util.Scanner;

class MemberArrayTainingTeacher2
{
	//[1]2명의 회원정보를 담을 배열 생성(#아직 각 배열칸마다 link(객체생성)된건 아니야!))
	MemberArrayTaining ar[] = new MemberArrayTaining[5];	
	Scanner scan = new Scanner(System.in);
	int countAr=0;

	public static void main(String[] args) 
	{
		MemberArrayTainingTeacher2 staticMethodExe = new MemberArrayTainingTeacher2();
		
		while(true){
			//메뉴 출력
			int menuNum =staticMethodExe.menuPrint();
			switch (menuNum)
			{
				case 1 : System.out.println("1. 입력 메뉴입니다.\n");
						 staticMethodExe.inputPersonMemberData();break;

				case 2 : System.out.println("2. 목록출력 메뉴입니다.\n");	
						 staticMethodExe.output();break;

				case 3 : System.out.println("3. 검색 메뉴입니다.\n");			
						 break;

				case 0 : System.out.println("0. 종료 메뉴입니다.\n"); return;
				default : System.out.println("메뉴번호의 숫자만 입력해주세요.\n");	break;
			}//swtitch END
		}//while END				

	}//main END


	//메뉴 출력 메소드
	public int menuPrint(){
		int input=0;
		System.out.println("[회원관리 프로그램]");			
		System.out.println("1. 등록");			
		System.out.println("2. 전체목록");			
		System.out.println("3. 검색");			
		System.out.println("0. 종료");			
		System.out.println("실행하실 메뉴의 번호 : ");			
		input=scan.nextInt();
		return input;
	}


	public void output()
	{
						
		for (int repeatOut =0; repeatOut < countAr ; repeatOut++)
		{
			if(countAr==0){
			System.out.println("저장된 사람이 없습니다.\n");
			break;}
		
			System.out.println("회원의 성명 : " + ar[repeatOut].getName());
			System.out.println("회원의 나이 : " + ar[repeatOut].getAge());
			System.out.println("회원의 생년일 : " + ar[repeatOut].getDateOfBirth());
			System.out.println("회원의 혈액형 : " + ar[repeatOut].getBloodType());
			System.out.println("회원의 키    : " + ar[repeatOut].getHeight()); 
			System.out.println("회원의 몸무게 : " + ar[repeatOut].getWeight());		
		}

	}



	public void inputPersonMemberData() 
	{
		//준비한 배열이 모두 찼을 경우 2배로 크기를 늘리시오.
//		if(countAr == ar.length)
//		{
//			MemberArrayTaining ar[] = new MemberArrayTaining[ar.length*2];
//		}

			//[2]배열들에게 객체를 link(객체생성하여 객체의 주소를 할당)
			ar[countAr]= new MemberArrayTaining();


			//[3]각 배열칸들에게 값을 입력.
			System.out.print("이름 입력 :");
			ar[countAr].setName(scan.next());

			System.out.print("출생일 입력 :");
			ar[countAr].setDateOfBirth(scan.next());
		
			System.out.print("혈액형 입력 :");
			ar[countAr].setBloodType(scan.next());

			//System.out.print("키 입력 :");
			//ar[countAr].getHeight(scan.nextDouble());

			//System.out.print("몸무게 입력 :");
			//ar[countAr].getWeight(scan.nextDouble());
			countAr++;
			System.out.println("등록완료");

	}



}//Class END