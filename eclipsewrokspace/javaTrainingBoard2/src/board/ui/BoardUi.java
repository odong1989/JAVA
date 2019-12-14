package board.ui;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import board.service.BoardManagerImpl;
import board.vo.Board;


//����� ȭ���� Ŭ����
public class BoardUi {
	//1.�������� - ���⿡ ����� ��� �޼ҵ�, ��ü���� ����� �� �ֽ��ϴ�.
	Scanner scanInput = new Scanner(System.in);
	BoardManagerImpl manager = new BoardManagerImpl();//BoardManagerImpl() �����ڴ� �غ��Ұ� ���ƿ�!
	
	//2.�����ڼ���
	public BoardUi(){
		//BoardMain Ŭ�������� �����ϸ� �ݺ����� �����Ѵ�.
		//�Ʒ��� �ݺ����� ����Ǹ� main()�޼ҵ�� ���ϵǾ� ���α׷��� ����ȴ�.
		while(true) {
		int menuNumber = menuPrint();
		switch (menuNumber) {
			case 1 : write(); break;
			case 2 : list(); break;
			case 3 : read(); break;		
			case 4 : delete(); break;		
			case 0 : end(); return;		
		}
		}//while END

	}
	//3.1 �޼ҵ弱��(��������)
	/*�������� �޼ҵ� ����
	 * 1.menuPrint() : �޴���� ���
	 * 2.   
	 */
	
	/* 1.menuPrint()�� �޴���� ����� �Ʒ��� ����.
	 * [�Խ���]
	 * 1. �۾���
	 * 2. ��ü �ۺ���
	 * 3. �۹�ȣ�� �б�
	 * 4. ����
	 * 0. ����
	 * 
	 * <���> ���� �޴��� ����� �� �б⸦ ���� �Է±��� �޵�, 
	 * 		 ui�� while���� �޾Ƽ� �ǽ��ϵ� �������.
	 * 		 �ٸ� �ڵ��� ���Ἲ���� �����ϸ� �޼ҵ忡�� �ϴ°� ����.
	 */
	public int menuPrint(){
		int numberMenu;
		System.out.println("[�Խ���]");
		System.out.println("1. �۾���");
		System.out.println("2. ��ü �ۺ���");
		System.out.println("3. �۹�ȣ�� �б�");
		System.out.println("4. ����");
		System.out.println("0. ����");
		
		while(true) {
			try {
				System.out.print("\n������ �޴� : ");
				numberMenu = scanInput.nextInt();
				scanInput.nextLine();
			}//Try END
			catch(InputMismatchException error) {
				System.out.println("���ڸ� �Է��� �ֽʽÿ�.");
				scanInput.nextLine();//���⼭ ���۾Ⱥ��� ������ ���ѷ���������...
				continue;
			}
			if( 0>numberMenu || numberMenu>4 ){					
				//0,1,2,3,4	-> 0 > numberMenu, numberMenu > 4
				System.out.print("0~4�� �Է¸� ���ּ���.");
				continue;
			}
			break;	
		}//whileEND
		return numberMenu;
	}//menuPrint() END-------------------------------------------------------
	
	
	//������
	 public void write(){
	 //System.out.println("[test] write()�޼ҵ� ���� ");
	 //���� �����ϱ� ���ؼ��� ������� �Է��� �޾ƾ� �Ѵ�.
	 //1.1�������� ������� �Է� ����
		 int num;		 //1)�۹�ȣ
		 String name;	 //2)�ۼ����̸�
		 String title; 	 //3)������
		 String contents; //4)�۳���
	 //1.2��������-������ board������ ���� �� �ѱ���
		 Board bo;
		 boolean saveCheck;//����������� üũ

		 System.out.println("�޴�1. �۾��� �Դϴ�."); 
	//step2.�Է¼���(feat.����ó��)	 
		 try {
			 System.out.print("�۹�ȣ: ");
			 num = scanInput.nextInt();
			 scanInput.nextLine();
		 	}//Try END
		catch(InputMismatchException error) {
			 System.out.println("���ڸ� ���ּ���.");		
			 return;
			 }
		 System.out.println("�ۼ����̸� : ");
		 name = scanInput.nextLine();
		 
		 System.out.println("������ : ");
		 title = scanInput.nextLine();

		 System.out.println("�۳��� : ");
		 contents = scanInput.nextLine();

	//step3.Board ���� �����Ͽ� board�ڷ��� ����  
		 bo = new Board(num, name, title, contents);
		 
	//step4.manager(BoardManagerImpl)���� ������ �����û 
		saveCheck = manager.add(bo);
		manager.saveFile();
		if(saveCheck) {
			//TRUE
			System.out.println("����Ǿ����ϴ�.");
		}
		else{//FALSE
			System.out.println("���� ����.");
		}
		 
	}// write() END-------------------------------------------------------
	 
	 
	 //��� �� ����
	 public void list(){
//		 System.out.println("[test] list()�޼ҵ� ���� ");
		 ArrayList<Board> list =  manager.listAll();
		 if(list.size() == 0 )
		 {
			 System.out.println("����� ���� �����ϴ�");
		 }
		 for (int i=0 ; i< list.size();i++){

			 System.out.printf("�۹�ȣ:%d, �ۼ���:%s, ������:%s, �۳���:%s \n"
					 			,list.get(i).getNum()
					 			,list.get(i).getName()					 			
					 			,list.get(i).getTitle()					 
					 			,list.get(i).getContents());
		 }
	 }
	 
	 
	 //�� �б�
	 public void read(){
		 int numberOfText;
		 Board searchText;
		 
		 System.out.println("3. �۹�ȣ�� �б�  �Դϴ�.");		 
		 System.out.print("ã���ô� ���� ��ȣ : ");		 
		 numberOfText = scanInput.nextInt();
		 scanInput.nextLine();
		 
		 searchText = manager.getBoard(numberOfText);
		 if(searchText == null ){
			 System.out.println("ã���ô� ���� �����ϴ�.");
		 }
		 else {
			 System.out.printf("�۹�ȣ:%d, �ۼ���:%s, ������:%s, �۳���:%s \n"
			 			,searchText.getNum()
			 			,searchText.getName()					 			
			 			,searchText.getTitle()					 
			 			,searchText.getContents());		 
		 }
		 
	 }	
	 
	 //�� �����ϱ�
	 public void delete(){
		 boolean checkRomove;
		 int numberDeleteText;
		 System.out.println("4. ����");		 
		 System.out.print("������ ���ϴ� ���� ��ȣ : ");		 
		 numberDeleteText = scanInput.nextInt();
		 scanInput.nextLine();
		 checkRomove = manager.remove(numberDeleteText);
		 if(checkRomove) {
			 System.out.println(numberDeleteText+"��° ���� �����Ǿ����ϴ�.");		 
			 System.out.println("���� �� ���� ����� �Ʒ��� �����ϴ�.");		 
			 list();			 
		 }
		 else{
			 System.out.println("�����ǽû��� �����ϴ�.(���� : �ش��ȣ�� �� ����)");		 
			 System.out.println("���� ����� ���� ����� �Ʒ��� �����ϴ�.");		 
			 list(); 
		 }

	 }	
	 
	 //UI������ ����
	 public void end(){
		 //System.out.println("[test] end()�޼ҵ� ���� ");
		 manager.saveFile();

	 }
	
	//3.2 �޼ҵ弱��(�������̵�)

}
