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
			case 0 : System.out.println("0.����");		
					 return;
			}		
		}
	}
	
	public int menuPrint(){
		int menuSelect;	
		System.out.println("[å���� UI]");
		System.out.println("1.å �߰�");		
		System.out.println("2.å ����");		
		System.out.println("3.å �˻�");		
		System.out.println("4.å ��� ���");
		System.out.println("0.����");		
		while(true) {
			System.out.print("�ǽ��� �޴���ȣ : ");		
			menuSelect=scan.nextInt();
			scan.nextLine();
		try {
			if(menuSelect>=0 && menuSelect<=4) {
				return menuSelect;
			}
			else {
				System.out.print("0~4�̳��� �Է����ּ���.");							
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
		System.out.println("1.å �߰�");				
		try {
			System.out.print("å �̸� : ");					
			bookName =scan.nextLine();
			System.out.print("å ����(����/����) : ");					
			bookFormat =scan.nextLine();
			System.out.print("å ���� : ");					
			bookKinds =scan.nextLine();		
			System.out.print("å �Ǹŷ� : ");					
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
			System.out.print("�������");								
		}
		else if(result ==1)
		{
			System.out.print("����Ϸ�");								
		}
	}
	
	public void deleteBook(){
		int    deleteBookNumber  = 0;
		System.out.println("2.å ����");				
		try {
			System.out.print("������ å ��ȣ : ");					
			deleteBookNumber =scan.nextInt();
			scan.nextLine();			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		int result = dao.deleteBook(deleteBookNumber);
		if(result ==0)
		{
			System.out.print("��������");								
		}
		else if(result ==1)
		{
			System.out.print("�����Ϸ�");								
		}
	}	

	public void searchBook(){
		ArrayList<BookVO>  result = new ArrayList<>();
		int searchType =0;
		String searchText= null;
		
		System.out.print("3.å �˻�");	
		try {
			System.out.println("1. å ��ȣ");	
			System.out.println("2. å �̸�");	
			System.out.print("� ������� �˻�? :");
			searchType =scan.nextInt();
			scan.nextLine();	
			if(searchType==2) {
				System.out.print("�˻��� å �̸�  : ");	
				searchText =scan.nextLine();
				result = dao.searchBook(searchType,searchText);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
		if(result.size()==0 ){
			System.out.print("�˻������ �����ϴ�");								
		}
		else {
			for(int print=0;print<result.size();print++){
				System.out.println(result.get(print));
			}
		}
	}
	
	public void showAll(){
		System.out.println("4.å ��� ���");
		ArrayList<BookVO> list = dao.showAllBook();
		for(int print=0;print<list.size();print++){
			System.out.println(list.get(print));
		}
	}
}
