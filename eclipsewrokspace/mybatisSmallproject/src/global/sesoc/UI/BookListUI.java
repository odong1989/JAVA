package global.sesoc.UI;
import global.sesoc.DAO.BookListDAO;
import global.sesoc.VO.BookListVO;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BookListUI {
	Scanner scan = new Scanner(System.in);
	BookListDAO dao = new BookListDAO();

	//2.생성자
	public BookListUI() {
		while(true) {
			int menu = menuPrint();
			switch(menu) {
			case 1 : insert(); break;
			case 2 : showList(); break;
			case 3 : delete(); break;
			case 4 : update(); break;
			case 5 : search(); break;
			case 0 : System.out.println("BookListUI 프로그램을 종료합니다."); return;
			}
		}	
	}
	
	
	//3.메소드
	public int menuPrint(){
		int menuSelect = 0;
		System.out.println("[서적 리스트]");
		System.out.println("1.서적 추가");		
		System.out.println("2.서적 목록출력 ");
		System.out.println("3.서적 삭제");		
		System.out.println("4.서적 수정");		
		System.out.println("5.서적 검색");
		System.out.println("0.프로그램 종료");		
		while(true){		
			try {
				System.out.print("선택하실 번호 :");		
				menuSelect = scan.nextInt();
				scan.nextLine();
				if(menuSelect>=0 && menuSelect<=5) {
					System.out.println("입력된숫자 :"+menuSelect);		
					break;
				}
				else{
					System.out.println("0~5만 입력해주세요.");							
				}
			}//try end
			catch(InputMismatchException eMismatch) {
				eMismatch.printStackTrace();
			}
		}//while END
		return menuSelect;
	}

	public void insert(){
		BookListVO voInsert = new BookListVO();
		String bookName;
		String bookFormat;
		String bookKinds;
		System.out.println("1.서적 추가");		
		
		
		System.out.print("추가할 서적명 : ");		
		bookName=scan.nextLine();
		voInsert.setBookName(bookName);
		
		System.out.print("서적의 포맷(종이책,전자책,pdf중) : ");		
		bookFormat=scan.nextLine();
		voInsert.setBookFormat(bookFormat);

		System.out.print("서적의 분야: ");		
		bookKinds=scan.nextLine();
		voInsert.setBookKinds(bookKinds);
		
		dao.insertBook(voInsert);
	}
	public void showList(){
		System.out.println("2.서적 목록출력 ");
	}
	public void delete(){
		System.out.println("3.서적 삭제");			
	}
	public void update(){
		System.out.println("4.서적 수정");		
	}
	public void search(){
		System.out.println("5.서적 검색");
	}

	
	
	
}
