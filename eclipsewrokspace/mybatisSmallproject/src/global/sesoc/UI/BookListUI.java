package global.sesoc.UI;
import global.sesoc.DAO.BookListDAO;
import global.sesoc.VO.BookListVO;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BookListUI {
	Scanner scan = new Scanner(System.in);
	BookListDAO dao = new BookListDAO();

	//2.������
	public BookListUI() {
		while(true) {
			int menu = menuPrint();
			switch(menu) {
			case 1 : insert(); break;
			case 2 : showList(); break;
			case 3 : delete(); break;
			case 4 : update(); break;
			case 5 : search(); break;
			case 0 : System.out.println("BookListUI ���α׷��� �����մϴ�."); return;
			}
		}	
	}
	
	
	//3.�޼ҵ�
	public int menuPrint(){
		int menuSelect = 0;
		System.out.println("[���� ����Ʈ]");
		System.out.println("1.���� �߰�");		
		System.out.println("2.���� ������ ");
		System.out.println("3.���� ����");		
		System.out.println("4.���� ����");		
		System.out.println("5.���� �˻�");
		System.out.println("0.���α׷� ����");		
		while(true){		
			try {
				System.out.print("�����Ͻ� ��ȣ :");		
				menuSelect = scan.nextInt();
				scan.nextLine();
				if(menuSelect>=0 && menuSelect<=5) {
					System.out.println("�Էµȼ��� :"+menuSelect);		
					break;
				}
				else{
					System.out.println("0~5�� �Է����ּ���.");							
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
		System.out.println("1.���� �߰�");		
		
		
		System.out.print("�߰��� ������ : ");		
		bookName=scan.nextLine();
		voInsert.setBookName(bookName);
		
		System.out.print("������ ����(����å,����å,pdf��) : ");		
		bookFormat=scan.nextLine();
		voInsert.setBookFormat(bookFormat);

		System.out.print("������ �о�: ");		
		bookKinds=scan.nextLine();
		voInsert.setBookKinds(bookKinds);
		
		dao.insertBook(voInsert);
	}
	public void showList(){
		System.out.println("2.���� ������ ");
	}
	public void delete(){
		System.out.println("3.���� ����");			
	}
	public void update(){
		System.out.println("4.���� ����");		
	}
	public void search(){
		System.out.println("5.���� �˻�");
	}

	
	
	
}
