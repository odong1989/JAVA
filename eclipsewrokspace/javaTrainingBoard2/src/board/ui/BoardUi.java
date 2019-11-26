package board.ui;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import board.service.BoardManagerImpl;
import board.vo.Board;


//사용자 화면담당 클래스
public class BoardUi {
	//1.변수선언 - 여기에 선언시 모든 메소드, 객체에서 사용할 수 있습니다.
	Scanner scanInput = new Scanner(System.in);
	BoardManagerImpl manager = new BoardManagerImpl();//BoardManagerImpl() 생성자는 준비할게 많아요!
	
	//2.생성자선언
	public BoardUi(){
		//BoardMain 클래스에서 생성하면 반복문이 실행한다.
		//아래의 반복문이 종료되면 main()메소드로 리턴되어 프로그램이 종료된다.
		while(true) {
		int menuNumber = menuPrint();
		switch (menuNumber) {
			case 1 : write(); break;
			case 2 : list(); break;
			case 3 : read(); break;		
			case 4 : delete(); break;		
			case 0 : end(); return;		
		}
		}//while END

	}
	//3.1 메소드선언(오리지널)
	/*오리지널 메소드 종류
	 * 1.menuPrint() : 메뉴목록 출력
	 * 2.   
	 */
	
	/* 1.menuPrint()의 메뉴목록 출력은 아래와 같다.
	 * [게시판]
	 * 1. 글쓰기
	 * 2. 전체 글보기
	 * 3. 글번호로 읽기
	 * 4. 삭제
	 * 0. 종료
	 * 
	 * <비고> 위의 메뉴를 출력한 후 분기를 위한 입력까지 받든, 
	 * 		 ui의 while에서 받아서 실시하든 상관없다.
	 * 		 다만 코드의 간결성등을 생각하면 메소드에서 하는게 좋지.
	 */
	public int menuPrint(){
		int numberMenu;
		System.out.println("[게시판]");
		System.out.println("1. 글쓰기");
		System.out.println("2. 전체 글보기");
		System.out.println("3. 글번호로 읽기");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		
		while(true) {
			try {
				System.out.print("\n선택할 메뉴 : ");
				numberMenu = scanInput.nextInt();
				scanInput.nextLine();
			}//Try END
			catch(InputMismatchException error) {
				System.out.println("숫자만 입력해 주십시오.");
				scanInput.nextLine();//여기서 버퍼안비우면 무조건 무한루프가더라...
				continue;
			}
			if( 0>numberMenu || numberMenu>4 ){					
				//0,1,2,3,4	-> 0 > numberMenu, numberMenu > 4
				System.out.print("0~4의 입력만 해주세요.");
				continue;
			}
			break;	
		}//whileEND
		return numberMenu;
	}//menuPrint() END-------------------------------------------------------
	
	
	//글저장
	 public void write(){
	 //System.out.println("[test] write()메소드 실행 ");
	 //글을 저장하기 위해서는 사용자의 입력을 받아야 한다.
	 //1.1변수선언 사용자의 입력 수신
		 int num;		 //1)글번호
		 String name;	 //2)작성자이름
		 String title; 	 //3)글제목
		 String contents; //4)글내용
	 //1.2변수선언-생성된 board데이터 저장 및 넘기기용
		 Board bo;
		 boolean saveCheck;//정상생성여부 체크

		 System.out.println("메뉴1. 글쓰기 입니다."); 
	//step2.입력수신(feat.예외처리)	 
		 try {
			 System.out.print("글번호: ");
			 num = scanInput.nextInt();
			 scanInput.nextLine();
		 	}//Try END
		catch(InputMismatchException error) {
			 System.out.println("숫자만 해주세요.");		
			 return;
			 }
		 System.out.println("작성자이름 : ");
		 name = scanInput.nextLine();
		 
		 System.out.println("글제목 : ");
		 title = scanInput.nextLine();

		 System.out.println("글내용 : ");
		 contents = scanInput.nextLine();

	//step3.Board 변수 생성하여 board자료형 저장  
		 bo = new Board(num, name, title, contents);
		 
	//step4.manager(BoardManagerImpl)에게 데이터 저장요청 
		saveCheck = manager.add(bo);
		manager.saveFile();
		if(saveCheck) {
			//TRUE
			System.out.println("저장되었습니다.");
		}
		else{//FALSE
			System.out.println("저장 실패.");
		}
		 
	}// write() END-------------------------------------------------------
	 
	 
	 //모든 글 보기
	 public void list(){
//		 System.out.println("[test] list()메소드 실행 ");
		 ArrayList<Board> list =  manager.listAll();
		 if(list.size() == 0 )
		 {
			 System.out.println("출력할 글이 없습니다");
		 }
		 for (int i=0 ; i< list.size();i++){

			 System.out.printf("글번호:%d, 작성자:%s, 글제목:%s, 글내용:%s \n"
					 			,list.get(i).getNum()
					 			,list.get(i).getName()					 			
					 			,list.get(i).getTitle()					 
					 			,list.get(i).getContents());
		 }
	 }
	 
	 
	 //글 읽기
	 public void read(){
		 int numberOfText;
		 Board searchText;
		 
		 System.out.println("3. 글번호로 읽기  입니다.");		 
		 System.out.print("찾으시는 글의 번호 : ");		 
		 numberOfText = scanInput.nextInt();
		 scanInput.nextLine();
		 
		 searchText = manager.getBoard(numberOfText);
		 if(searchText == null ){
			 System.out.println("찾으시는 글은 없습니다.");
		 }
		 else {
			 System.out.printf("글번호:%d, 작성자:%s, 글제목:%s, 글내용:%s \n"
			 			,searchText.getNum()
			 			,searchText.getName()					 			
			 			,searchText.getTitle()					 
			 			,searchText.getContents());		 
		 }
		 
	 }	
	 
	 //글 삭제하기
	 public void delete(){
		 boolean checkRomove;
		 int numberDeleteText;
		 System.out.println("4. 삭제");		 
		 System.out.print("삭제를 원하는 글의 번호 : ");		 
		 numberDeleteText = scanInput.nextInt();
		 scanInput.nextLine();
		 checkRomove = manager.remove(numberDeleteText);
		 if(checkRomove) {
			 System.out.println(numberDeleteText+"번째 글이 삭제되었습니다.");		 
			 System.out.println("삭제 후 글의 목록은 아래와 같습니다.");		 
			 list();			 
		 }
		 else{
			 System.out.println("삭제실시사항 없습니다.(사유 : 해당번호의 글 없음)");		 
			 System.out.println("현재 저장된 글의 목록은 아래와 같습니다.");		 
			 list(); 
		 }

	 }	
	 
	 //UI생성자 종료
	 public void end(){
		 //System.out.println("[test] end()메소드 실행 ");
		 manager.saveFile();

	 }
	
	//3.2 메소드선언(오버라이딩)

}
