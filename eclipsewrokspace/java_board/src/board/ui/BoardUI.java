package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.service.BoardManager;
import board.service.BoardManagerImpl;
import board.vo.Board;

/**
 * 사용자 화면 
 */
public class BoardUI {
	Scanner keyin = new Scanner(System.in);
	BoardManager manager = new BoardManagerImpl();
	//보드매니저 타입이지만 같은종류의 객체인 BoardManagerImpl를 생성할수 있어요.
	//좌측이 상위타입이라면 오른쪽(실질적으로 생성&사용되는 객체)은 그 상속받은 애여도 상관없어요.
	//다만, BoardManager manager는 new BoardManagerImpl();이 별도로 생성한 메소드들은파악할 수 없어요.
	//BoardManager manager는 자신이 가이드준 4개의 메소드들만 알고 있습니다.
	
	/**
	 * 생성자
	 */
	public BoardUI() {
		//BoardUI객체가 생성될 때 무한반복.
		while (true) {
			int m = menuPrint();
			switch (m) {
				case 1: write(); break;
				case 2: list(); break;
				case 3: read(); break;
				case 4: delete(); break;
				case 0: 
					System.out.println("* 프로그램을 종료합니다.");
					return;
			}
		}
	}
	
	/**
	 * 메뉴 출력, 번호 입력받기
	 * @return 입력받은 번호
	 */
	public int menuPrint() {
		System.out.println("[ 게시판 ]");
		System.out.println("1. 글쓰기");
		System.out.println("2. 전체 글보기");
		System.out.println("3. 글읽기");
		System.out.println("4. 글삭제");
		System.out.println("0. 종료");
		System.out.print("* 선택 > ");
		
		int num = 0;
		
		while (true) {
			num = keyin.nextInt();
			if (num < 0 || num > 4) {
				System.out.print("* 다시 입력하세요 > ");
				continue;
			}
			break;
		}
		return num;
	}
	
	/**
	 * 글쓰기
	 */
	public void write() {
		System.out.println("[ 글쓰기 ]");
		int num;
		String id, title, contents;
		
		System.out.print("번호: ");
		num = keyin.nextInt();
		keyin.nextLine();		//Enter 제거
		System.out.print("ID: ");
		id = keyin.nextLine();
		System.out.print("제목: ");
		title = keyin.nextLine();
		System.out.print("내용: ");
		contents = keyin.nextLine();
		
		Board b = new Board(num, id, title, contents);
		boolean check = manager.add(b);
		if (check) {
			System.out.println("저장되었습니다.");
		}
		else {
			System.out.println("저장 실패했습니다.");
		}
	}
	
	/**
	 * 전체 글보기
	 */
	public void list() {
		System.out.println("[ 전체 글목록 ]");
		ArrayList<Board> list = manager.listAll();
		
		for (Board b : list) {
			System.out.println(b);
		}
		System.out.println("총 " + list.size() + "건의 글이 있습니다.");
	}
	
	/**
	 * 글읽기
	 */
	public void read() {
		System.out.println("[ 글읽기 ]");
		int n;
		Board b;
		
		System.out.print("글번호 입력: ");
		n = keyin.nextInt();
		
		b = manager.getBoard(n);
		if (b != null) {
			System.out.println("번호 : " + b.getNum());
			System.out.println("작성자 : " + b.getId());
			System.out.println("제목 : " + b.getTitle());
			System.out.println("내용 : " + b.getContents());
		}
		else {
			System.out.println("해당 번호의 글이 없습니다.");
		}
	}
	
	/**
	 * 글삭제
	 */
	public void delete() {
		System.out.println("[ 글삭제 ]");
		int n;
		
		System.out.print("글번호 입력: ");
		n = keyin.nextInt();
		
		if (manager.remove(n)) {
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("해당 번호의 글이 없습니다.");
		}
	}
}
