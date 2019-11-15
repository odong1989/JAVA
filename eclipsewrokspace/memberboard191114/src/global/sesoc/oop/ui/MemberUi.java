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

	
	//menu관련 명령메소드-------------------------------------------------------------
	public void menuPrint()
	{
		//System.out.println("test menuPrint");
		while(true) 
		{
		  System.out.print("실행할 명령의 번호 입력하세요 : ");
		  menuSelect=keyIn.nextInt();
		  keyIn.nextLine();
		  
		  if(menuSelect!=1 ||menuSelect!=2|| menuSelect!=3 ||menuSelect!=0)
		  {
			  System.out.println("1,2,3,0중에서만 입력주세요.");
			  continue;
		  }
		  switch (menuSelect) {
		  case 1 : addMember(); break;
		  case 2 : viewAllMember(); break;
		  case 3 : searchMember(); break;
		  case 0 : System.out.println("프로그램 종료");
		  		   return;
		  default : System.out.println("1,2,3,0중에서만 입력주세요.");
		  }
		}
			
	}
	
	public void addMember() 
	{
		//  System.out.println("addMember");
		
	}
	
	public void viewAllMember() 
	{
		 // System.out.println("viewAllMember");			
	}
	
	public void searchMember() 
	{
		//  System.out.println("searchMember");			
	}
	
	
	
	
	
}






