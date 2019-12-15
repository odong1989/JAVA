package global.sesoc.board.ui;

import java.util.ArrayList;
import java.util.Scanner;
import global.sesoc.board.dao.BoardDAO;
import global.sesoc.board.vo.BoardVO;

//
public class BoardUI {
	//1.���� ����
	Scanner scan = new Scanner(System.in);
	BoardDAO dao = new BoardDAO();
			
		
	//2.������
	//2.1 �⺻������
	public BoardUI(){
		//�ݺ������� �޴����, ��ȣ ���õ�
		int menu=printMainMenu();
		switch (menu) {
		case 1 : wirte(); 	break;
		case 2 : read();	break;
		case 3 : list();	break;
		case 0 : System.out.println("���α׷��� �����մϴ�."); 
				 return;
			
		}
	}		
	//[����ó���� �����˾Ƽ��ϼ���!!]
	
	//3. �� �޴��� ���� ��ɵ�(ȸ���߰�/����/����/������µ�,,,)
	//3.1 �޴�-��� �޼ҵ�
	public int printMainMenu(){
		int numMenu;
		System.out.println("[Board �Խ���]");
		System.out.println("1. �۾���");
		System.out.println("2. ���б�");	
		System.out.println("3. ��ü �۸��");	
		System.out.println("0. ����");	
		System.out.print("���� : ");	
		
	    numMenu = scan.nextInt();
		return numMenu;
	}
	
	//3.2 ȸ�� ���
	public void wirte(){
		//ID, ����, �۳����� �Է¹޾� BoardVO��ü�� �����Ͽ� DAO���� ����
		//(#�౸�� ġ�� �н��ϰ� ��!�� �����̶��)
		
		//�ܰ�1. �ڹٰ� ����ڿ��� �Է¹���.
		scan.nextLine(); //���ú���
		System.out.print("�ۼ���ID : ");
		String id = scan.nextLine();
		
		System.out.print("������ : ");
		String title = scan.nextLine();		
		
		System.out.print("�۳��� : ");		
		String contents = scan.nextLine();

		
		//SQL���� �������ֵ��� �ϱ����� BoardVO ����&�����͸� �н�! �Դϴ�
		BoardVO vo = new BoardVO();
		vo.setId(id);
		vo.setTitle(title);
		vo.setContents(contents);
				int cnt = dao.writeBoard(vo);
		if(cnt ==1) System.out.println("����Ǿ����ϴ�.");
		else System.out.println("�������");
	}

	public void read() {
		//���� �� ��ȣ�� �Է¹޾� DAO�� �����Ͽ�
		//�ش� �۹�ȣ�� �� ������ BoardVo��ü�� ���Ϲ޾� ���
		System.out.println("2. ���б�");	
		int textNum;
		BoardVO resultText = new BoardVO();
			
		//�ܰ�1. �ڹٰ� ����ڿ��� �Է¹���.
		scan.nextLine(); //���ú���
		System.out.print("�۹�ȣ : ");
		textNum = scan.nextInt();
	    scan.nextLine();		

	    resultText = dao.readBoard(textNum);
	
	    if(resultText == null){
	    	System.out.println("�ش��ȣ�� ���� �����ϴ�");
	    }
	    else {
			System.out.printf("num=%d, id=%s, title=%s, contents=%s, inputdate=%s,hits=%d,likes=%d \n",
					resultText.getNum(),
					resultText.getId(),								
					resultText.getTitle(),
					resultText.getContents(),								
					resultText.getInputdate(),								
					resultText.getHits(),								
					resultText.getLikes()		
		);	    	
	    }
	    	
	}//read END
	
	public void list() {
		//DAO�� ��û�Ͽ� ��ü �� ������ LIST�� ���Ϲ޾� ��� 
		ArrayList<BoardVO> BoardAll = dao.listBoard(); 

		for(int print=0;print<BoardAll.size();print++){
			System.out.printf("num=%d, id=%s, title=%s, contents=%s, inputdate=%s,hits=%d,likes=%d \n",
								BoardAll.get(print).getNum(),
								BoardAll.get(print).getId(),								
								BoardAll.get(print).getTitle(),
								BoardAll.get(print).getContents(),								
								BoardAll.get(print).getInputdate(),								
								BoardAll.get(print).getHits(),								
								BoardAll.get(print).getLikes()		
					);
		}
	}
	
}
	