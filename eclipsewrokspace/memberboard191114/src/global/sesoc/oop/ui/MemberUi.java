package global.sesoc.oop.ui;
//package END--------------------------------------------------------
import java.util.Scanner;
//import global.sesoc.oop.vo.BoardSetGet;
import global.sesoc.oop.service.BoardManager;
import global.sesoc.oop.service.BoardManagerImplements;
//import END--------------------------------------------------------
public class MemberUi {
	Scanner keyIn = new Scanner(System.in);
	int menuSelect;
	
	
	
	public MemberUi() {
	BoardManager boardToMember = new BoardManagerImplements();
//	MemberUi uiProcess = new MemberUi();
	menuPrint();
	}

	
	
	public void menuPrint()
	{
		//System.out.println("test menuPrint");
		while(true) 
		{
		  System.out.print("������ ����� ��ȣ �Է��ϼ��� : ");
		  menuSelect=keyIn.nextInt();
		  keyIn.nextLine();
		  
		  switch (menuSelect) {
		  case 0 : System.out.println("���α׷� ����");
		  		   return;
		  }
		}
			
	}
	
	public void addMember() 
	{}
	
	public void viewAllMember() 
	{}
	
	public void searchMember() 
	{}
	
	
	
	
	
}
