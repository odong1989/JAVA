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
//		case 0 : System.out.println("UI���α׷��� �����մϴ�.");
//				 return null;
//		default : //����ó�� �����غ���
//		}
	}

	public int menuPrint()
	{
		while(true){
			System.out.println("[�޸���]");
			System.out.println("1. ���� �����");
			System.out.println("2. ���� �б�");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			selectMenu = scan.nextInt();
			scan.nextLine();
			if(0 < selectMenu || selectMenu>2)
			{
				System.out.print("�޴������� 0,1,2 ���ڸ� �Է����ּ���");
			}else{
				return 	selectMenu;
			}
		}
	}

//	public void menuPrint()
//	System.out.println("1. ���� ������Դϴ�.");
}
