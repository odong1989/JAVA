package textEdit05HW.ui;
import java.util.Scanner;

public class TextEditUI {
	Scanner scan = new Scanner(System.in);
	int selectMenu;

	public TextEditUI() {
menuPrint();
//		swtich (){
//		case 1 : makeFile();
//				 break;
//		case 2 : readFile();
//				 break;
//		case 0 : System.out.println("UI프로그램을 종료합니다.");
//				 return null;
//		default : //예외처리 기입해보자
//		}
	}

	public int menuPrint()
	{
		while(true){
			System.out.println("[메모장]");
			System.out.println("1. 파일 만들기");
			System.out.println("2. 파일 읽기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			selectMenu = scan.nextInt();
			scan.nextLine();
			if(0 < selectMenu || selectMenu>2)
			{
				System.out.print("메뉴선택은 0,1,2 숫자만 입력해주세요");
			}else{
				return 	selectMenu;
			}
		}
	}

//	public void menuPrint()
//	System.out.println("1. 파일 만들기입니다.");
}
