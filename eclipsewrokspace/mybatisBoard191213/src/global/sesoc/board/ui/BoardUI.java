package global.sesoc.board.ui;

import java.util.ArrayList;
import java.util.Scanner;
import global.sesoc.board.dao.BoardDAO;
import global.sesoc.board.vo.BoardVO;

//
public class BoardUI {
	//1.변수 정의
	Scanner scan = new Scanner(System.in);
	BoardDAO dao = new BoardDAO();
			
		
	//2.생성자
	//2.1 기본생성자
	public BoardUI(){
		//반복문으로 메뉴출력, 번호 선택등
		int menu=printMainMenu();
		switch (menu) {
		case 1 : wirte(); 	break;
		case 2 : read();	break;
		case 3 : list();	break;
		case 0 : System.out.println("프로그램을 종료합니다."); 
				 return;
			
		}
	}		
	//[예외처리는 직접알아서하세요!!]
	
	//3. 각 메뉴에 따른 기능들(회원추가/수정/삭제/전부출력등,,,)
	//3.1 메뉴-출력 메소드
	public int printMainMenu(){
		int numMenu;
		System.out.println("[Board 게시판]");
		System.out.println("1. 글쓰기");
		System.out.println("2. 글읽기");	
		System.out.println("3. 전체 글목록");	
		System.out.println("0. 종료");	
		System.out.print("선택 : ");	
		
	    numMenu = scan.nextInt();
		return numMenu;
	}
	
	//3.2 회원 출력
	public void wirte(){
		//ID, 제목, 글내용을 입력받아 BoardVO객체를 생성하여 DAO에게 전달
		//(#축구로 치면 패스하고 끝!인 역할이랄까나)
		
		//단계1. 자바가 사용자에게 입력받음.
		scan.nextLine(); //스택비우기
		System.out.print("작성자ID : ");
		String id = scan.nextLine();
		
		System.out.print("글제목 : ");
		String title = scan.nextLine();		
		
		System.out.print("글내용 : ");		
		String contents = scan.nextLine();

		
		//SQL에게 보낼수있도록 하기위해 BoardVO 생성&데이터를 패스! 입니다
		BoardVO vo = new BoardVO();
		vo.setId(id);
		vo.setTitle(title);
		vo.setContents(contents);
				int cnt = dao.writeBoard(vo);
		if(cnt ==1) System.out.println("저장되었습니다.");
		else System.out.println("저장실패");
	}

	public void read() {
		//읽을 글 번호를 입력받아 DAO로 전달하여
		//해당 글번호의 글 정보를 BoardVo객체로 리턴받아 출력
		System.out.println("2. 글읽기");	
		int textNum;
		BoardVO resultText = new BoardVO();
			
		//단계1. 자바가 사용자에게 입력받음.
		scan.nextLine(); //스택비우기
		System.out.print("글번호 : ");
		textNum = scan.nextInt();
	    scan.nextLine();		

	    resultText = dao.readBoard(textNum);
	
	    if(resultText == null){
	    	System.out.println("해당번호의 글이 없습니다");
	    }
	    else {
			System.out.printf("num=%d, id=%s, title=%s, contents=%s, inputdate=%s,hits=%d,likes=%d \n",
					resultText.getNum(),
					resultText.getId(),								
					resultText.getTitle(),
					resultText.getContents(),								
					resultText.getInputdate(),								
					resultText.getHits(),								
					resultText.getLikes()		
		);	    	
	    }
	    	
	}//read END
	
	public void list() {
		//DAO로 요청하여 전체 글 정보를 LIST로 리턴받아 출력 
		ArrayList<BoardVO> BoardAll = dao.listBoard(); 

		for(int print=0;print<BoardAll.size();print++){
			System.out.printf("num=%d, id=%s, title=%s, contents=%s, inputdate=%s,hits=%d,likes=%d \n",
								BoardAll.get(print).getNum(),
								BoardAll.get(print).getId(),								
								BoardAll.get(print).getTitle(),
								BoardAll.get(print).getContents(),								
								BoardAll.get(print).getInputdate(),								
								BoardAll.get(print).getHits(),								
								BoardAll.get(print).getLikes()		
					);
		}
	}
	
}
	