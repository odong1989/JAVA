package global.sesoc.board.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import global.sesoc.board.dao.BoardDAO;
import global.sesoc.board.dao.BoardMapper;
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
			while(true) {
			int menu=printMainMenu();
			switch (menu) {
			case 1 : wirte(); 	break;
			case 2 : read();	break;
			case 3 : list();	break;
			case 4 : delete();  break;
			case 5 : update();  break;
			case 6 : search();  break; //�ܾ �Է¹޾� �ܾ ���Ե� ���� �˻��ϴ� ��.
			case 0 : System.out.println("���α׷��� �����մϴ�."); 
					 return;
			}
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
		System.out.println("3. <���> ��ü �۸��");	
		System.out.println("4. ����");	
		System.out.println("5. �ۼ���(ID�� ����Ұ�)");
		System.out.println("6. �˻�");		
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
		System.out.println("��ü �б⸦ ���Ұ�� 0�� �Է��Ͽ��ּ���");	
		int textNum;
		ArrayList<BoardVO> resultText = new ArrayList<>();
			
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
			for(int print=0;print<resultText.size();print++){
				System.out.printf("num=%d, id=%s, title=%s, contents=%s, inputdate=%s,hits=%d,likes=%d \n",
									resultText.get(print).getNum(),
									resultText.get(print).getId(),								
									resultText.get(print).getTitle(),
									resultText.get(print).getContents(),								
									resultText.get(print).getInputdate(),								
									resultText.get(print).getHits(),								
									resultText.get(print).getLikes()		
								);    	
			}
	    }
	    	
	}//read END
	
	public void list() {
	
	}//list() END
	
	//�� ����
	public void delete(){ 
		//�����̿��� ���� ������ ����ó���� ó������ϼ���.
		//�ð������ ����ó���� ����.(#����ó���ϴ� �ǹ�)
		
		System.out.print("������ �۹�ȣ : ");
		int n = scan.nextInt();
		
		int cnt = dao.deleteBoard(n);
		if( cnt == 0 ) {
			System.out.println("�ش�Ǵ� ��ȣ�� ���� �����ϴ�.");
		}
		else
			System.out.println("�����Ǿ����ϴ�.");			
	}
	
	
	public void update(){
		BoardVO vo = new BoardVO();

		System.out.print("������ �۹�ȣ : ");		
		int num = scan.nextInt();
		scan.nextLine(); //���ú���
		
		if (dao.readBoard(num) != null){
			System.out.println(num+"���� ���� �������� Ȯ���Ͽ����ϴ�.");

			vo.setNum(num);
			System.out.print("������ : ");
			String title = scan.nextLine();		
			//�ƹ��Է¾��� enter �ǽ��� ��� ������ ���ϴ�(SQL ������ Not Null�̶�...)
			//�׷��� ����SQL�� Ȱ���Ͽ� �ҽ����� ���̸鼭 �پ��� �Էµ鿡 �����ϰ� �������ִ� ���� �����ϴ�.
			//�ڹٿ��� if������ �ص� �Ǳ� ������ �ڵ尡 ������� ������� ����ϴ�.
			System.out.print("�۳��� : ");		
			String contents = scan.nextLine();
			
			vo.setNum(num);
			vo.setTitle(title);
			vo.setContents(contents);
			
			dao.updateBoard(vo);
			System.out.println("�����Ǿ����ϴ�.");
		}
		else //������ ���� ���ٰ� Ȯ�ε� ���
	  	  System.out.println("��� ���� �����ϴ�.");
	}
	
	public void search(){
		//�ܾ �Է¹޾� ���Ե� ���� �˻��մϴ�.
		System.out.print("�˻����(1-����, 2-����) : ");
		int type  = scan.nextInt();
		scan.nextLine();
		System.out.print("�˻��� : ");
		String word = scan.nextLine();

		ArrayList<BoardVO> list = dao.searchBoard(type,word);
		//mybatis�� 1ȸ�� 1���� �Ķ���͹ۿ� ���شٴ� �� ����.
		//�׷��� map�� �ڷ������� �����ϰԵ˴ϴ�.
		
		if(list == null || list.size() ==0){
			System.out.println("�˻������ �����ϴ�");		
		}
		else {
			//��� �ݺ������� ���
			for(int print=0;print<list.size();print++){
				System.out.printf("num=%d, id=%s, title=%s, contents=%s, inputdate=%s,hits=%d,likes=%d \n",
									list.get(print).getNum(),
									list.get(print).getId(),								
									list.get(print).getTitle(),
									list.get(print).getContents(),								
									list.get(print).getInputdate(),								
									list.get(print).getHits(),								
									list.get(print).getLikes()		
								 );    				
			}
		}
	}
}
	