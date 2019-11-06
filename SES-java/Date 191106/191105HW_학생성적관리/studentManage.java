/*
[학생 성적 관리]
1. 등록
2. 전체학생성적 출력
3. 검색
4. 종료
- 등록은 학생이름, 국/영/수 점ㅅ를 입력받아 배열에 저장(Student class사용하세요)
- 출력은 학생이름, 국/영/수 점수, 총점,평균 석차를 출력합니다.
- 검색은 학생이름을 입력받아 같은 이름의 학생정보를 출력합니다.
*/
import java.util.Scanner;

class studentManage{

	Scanner input = new Scanner(System.in);
	Student studentArray[] = new Student[5];
	int selectarrayCell=0;	

	public static void main(String[] args) 
	{
		int selectMenu=0;
		studentManage managerMan = new studentManage();

		while(true)
		{
			selectMenu = managerMan.menuPrint();
			switch (selectMenu)
			{
			case 1 : managerMan.addStudent();
						//학생추가
					 break;	
			case 2 : managerMan.viewStudent();	//학생목록 출력(버블정렬까지 실시)
					 break;	
			case 3 : managerMan.search();		//학생검색
					 break;	
			case 4 : System.out.println("프로그램이 종료됩니다.");
					 return;
			
			}//switch END
				System.out.println("Hello World!");
		}
	}//main END

	//[3]메소드(main 제외)------------------------------------------------------
	/*studentManage의 메소드들은 
	  (1) main문의 메뉴출력(menuPrint)
	  (2) Student studentArray[]의 배열의 값을 입력
	  (3) 출력
	  (4) 본 프로그램 종료
	  이 것들만 해당하며 직접적적으로 값을 갖는 것은 옶다(끽해야 switch의 메뉴 선택용 숫자1,2,3,0
	*/

		public int menuPrint()
	{
		int menuValue=0;
		boolean flag=true;
		System.out.println("");
		System.out.println("[학생성적관리프로그램]");
		System.out.println("1. 학생성적 등록");
		System.out.println("2. 전체학생들 성적출력");
		System.out.println("3. 검색");			
		System.out.println("4. 종료");

		System.out.print("실시할 명령의 숫자를 입력하세요 : ");

		while (flag)
		{
		menuValue = input.nextInt();
			if(menuValue<1 || menuValue>4){
				System.out.println("1~4까지만 입력해주세요");
			continue;	
			}
		flag=false;		
		}
		return menuValue;
	}


	public void addStudent()
	{
		System.out.println("");
		System.out.println("1번 - 학생추가 ");
		studentArray[selectarrayCell] = new Student();
		System.out.println( (selectarrayCell+1) +"번 학생의 정보가 입력됩니다 ");			
		System.out.print("학생의 이름을 입력해주세요. : ");
		studentArray[selectarrayCell].setName(input.next());
		System.out.print("국어성적을 입력해주세요. : ");
		studentArray[selectarrayCell].setKor(input.nextInt());
		System.out.print("영어성적을 입력해주세요. : ");
		studentArray[selectarrayCell].setEng(input.nextInt());
		System.out.print("수학성적을 입력해주세요. : ");
		studentArray[selectarrayCell].setMath(input.nextInt());			

		System.out.println("정상입력되었습니다.");
		selectarrayCell++;
		System.out.println("selectarrayCell : "+selectarrayCell);
	}

	public void viewStudent()
	{
		System.out.println("selectarrayCell : "+selectarrayCell);
		
		if(selectarrayCell==0)
		{
			System.out.println("입력된 사항이 없습니다.");
			return;
		}	

		
		System.out.printf(" 이름  국어  영어  수학   총점   평균   석차  \n");
		sortBubble();
		for (int view=0; view < selectarrayCell ; view++)
		{

			System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
								studentArray[view].getName(),
								studentArray[view].getKor(),
								studentArray[view].getEng(),
								studentArray[view].getMath(),
								studentArray[view].getTotal(),
								studentArray[view].getAvg()				
			);
		}
		System.out.println("출력완료");
	}//viewStudent END


	public void search(){
		int searchCount=0;
		String SerchName="";
		System.out.println("검색입니다.");
		System.out.print("검색할 사람 : ");
		SerchName=input.next();	
		System.out.printf("이름 국어 영어 수학 총점 평균 석차 \n");
		for(int searchLine=0; searchLine > selectarrayCell ;searchLine++ )
		{
			if(SerchName.equals(studentArray[searchLine].getName()))
			{
                                 //이름  국어   영어  수학  총점  평균   
				System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
									studentArray[searchLine].getName(),
									studentArray[searchLine].getKor(),
									studentArray[searchLine].getEng(),
									studentArray[searchLine].getMath(),
									studentArray[searchLine].getTotal(),
									studentArray[searchLine].getAvg()				
								);
				searchCount++;
			}
		}
	System.out.printf("총 %d건이 조회되었습니다 \n",searchCount);
	}


	public void sortBubble(){
		Student temp = new Student();
		boolean flag;

		//현재 상태 출력
		System.out.println("버블정렬전 입력상태입니다.");
		for (int print=0; print < selectarrayCell; print++)
		{
							 //이름  국어   영어  수학  총점  평균   
			System.out.printf(" %4s\t  %3d\t  %3d\t  %3d\t  %3d\t  %2.2f\t  \n",
								studentArray[print].getName(),
								studentArray[print].getKor(),
								studentArray[print].getEng(),
								studentArray[print].getMath(),
								studentArray[print].getTotal(),
								studentArray[print].getAvg()				
										);					
		}
				
		System.out.println("");
		
		
		
		//값 교환
		//Benchmark : 기준점
		for (int Benchmark=selectarrayCell; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : 비교점, 기준점과 비교를 위해 기준점이외의 나머지 배열들을 선택.
			//System.out.println("Benchmark : "+Benchmark);
			
			flag=true; //지나갔나 안지나갔나 확인용.
			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(studentArray[Comparison].getTotal() < studentArray[Comparison+1].getTotal())
				{
					temp=studentArray[Comparison];
					studentArray[Comparison]=studentArray[Comparison+1];
					studentArray[Comparison+1]=temp;

					flag=false; //지나갔나 안지나갔나 확인용.

				/*

										 //이름  국어   영어  수학  총점  평균   
						System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
											temp.getName(),
											temp.getKor(),
											temp.getEng(),
											temp.getMath(),
											temp.getTotal(),
											temp.getAvg()				
										);						

					//개인적으로 변경과정을 확인위한 중간체크용 출력반복문입니다.(진행에 영향없음)-----------------------------------
						for (int print=0; print <studentArray.length; print++)
					{
										 //이름  국어   영어  수학  총점  평균   
						System.out.printf(" 버블정렬 내에서 정렬중입니다.      \n");
						System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
											studentArray[print].getName(),
											studentArray[print].getKor(),
											studentArray[print].getEng(),
											studentArray[print].getMath(),
											studentArray[print].getTotal(),
											studentArray[print].getAvg()				
										);						
					}		
					System.out.println("");
					*/
					//개인적으로 변경과정을 확인위한 중간체크용 출력반복문입니다.(진행에 영향없음)-----------------------------------

				}//if end
			}//Comparison end 
			//flag가 true이면 더이상 정렬을 할 필요가 없으니 이만 종료한다.
			//flag가 flase이면 아직은 정렬을 해야 한다는 의미이니 계속진행하라를 결정한다.
			if(flag) break;

			
			System.out.println("");
		}//interchangeSort end

		//변경된 상태 출력
		for (int print=0; print <selectarrayCell; print++)
		{
						System.out.printf(" 버블정렬 내에서 변경된 사항입니다.      \n");
						System.out.printf(" %4s\t  %3d\t  %3d\t  %3d\t  %3d\t  %2.2f\t  \n",
											studentArray[print].getName(),
											studentArray[print].getKor(),
											studentArray[print].getEng(),
											studentArray[print].getMath(),
											studentArray[print].getTotal(),
											studentArray[print].getAvg()				
										);	
		}		
		System.out.println("버블정렬 종료");
		System.out.println("");
	}




}
