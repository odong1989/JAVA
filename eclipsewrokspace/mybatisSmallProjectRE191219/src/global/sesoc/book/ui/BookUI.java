package global.sesoc.book.ui;
import java.util.ArrayList;
import java.util.Scanner;
import global.sesoc.book.dao.BookDAO;
import global.sesoc.book.vo.BookVO;

public class BookUI {
	Scanner scan =new Scanner(System.in);
	BookDAO dao = new BookDAO(); 
	public BookUI() {
		while(true) {
			int menuNum;
			menuNum= menuPrint();
			switch(menuNum) {
			case 1 : bookAdd(); break;
			case 2 : deleteBook(); break;
			case 3 : searchBook(); break;
			case 4 : showAll(); break;
			case 0 : System.out.println("0.종료");		
					 return;
			}		
		}
	}
	
	public int menuPrint(){
		int menuSelect;	
		System.out.println("[책관리 UI]");
		System.out.println("1.책 추가");		
		System.out.println("2.책 삭제");		
		System.out.println("3.책 검색");		
		System.out.println("4.책 모두 출력");
		System.out.println("0.종료");		
		while(true) {
			System.out.print("실시할 메뉴번호 : ");		
			menuSelect=scan.nextInt();
			scan.nextLine();
		try {
			if(menuSelect>=0 && menuSelect<=4) {
				return menuSelect;
			}
			else {
				System.out.print("0~4이내만 입력해주세요.");							
			}
		}	
		catch(Exception e) {
			e.printStackTrace();
			}
		}//while end
		
		}
	
	public void bookAdd(){
		String bookName   = null;
		String bookFormat = null;
		String bookKinds = null;
		int    booksells  = 0;
		System.out.println("1.책 추가");				
		try {
			System.out.print("책 이름 : ");					
			bookName =scan.nextLine();
			System.out.print("책 포맷(종이/전자) : ");					
			bookFormat =scan.nextLine();
			System.out.print("책 종류 : ");					
			bookKinds =scan.nextLine();		
			System.out.print("책 판매량 : ");					
			booksells =scan.nextInt();
			scan.nextLine();			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		BookVO vo = new BookVO();

		vo.setBookName(bookName);
		vo.setBookFormat(bookFormat);
		vo.setSells(booksells);
		vo.setBookKinds(bookKinds);
		
		int result = dao.addBook(vo);
		if(result ==0)
		{
			System.out.print("저장오류");								
		}
		else if(result ==1)
		{
			System.out.print("저장완료");								
		}
	}
	
	public void deleteBook(){
		int    deleteBookNumber  = 0;
		System.out.println("2.책 삭제");				
		try {
			System.out.print("삭제할 책 번호 : ");					
			deleteBookNumber =scan.nextInt();
			scan.nextLine();			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		int result = dao.deleteBook(deleteBookNumber);
		if(result ==0)
		{
			System.out.print("삭제오류");								
		}
		else if(result ==1)
		{
			System.out.print("삭제완료");								
		}
	}	

	public void searchBook(){
		ArrayList<BookVO>  result = new ArrayList<>();
		int searchType =0;
		String searchText= null;
		
		System.out.print("3.책 검색");	
		try {
			System.out.println("1. 책 번호");	
			System.out.println("2. 책 이름");	
			System.out.print("어떤 방식으로 검색? :");
			searchType =scan.nextInt();
			scan.nextLine();	
			if(searchType==2) {
				System.out.print("검색할 책 이름  : ");	
				searchText =scan.nextLine();
				result = dao.searchBook(searchType,searchText);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
		if(result.size()==0 ){
			System.out.print("검색결과가 없습니다");								
		}
		else {
			for(int print=0;print<result.size();print++){
				System.out.println(result.get(print));
			}
		}
	}
	
	public void showAll(){
		System.out.println("4.책 모두 출력");
		ArrayList<BookVO> list = dao.showAllBook();
		for(int print=0;print<list.size();print++){
			System.out.println(list.get(print));
		}
	}
}
