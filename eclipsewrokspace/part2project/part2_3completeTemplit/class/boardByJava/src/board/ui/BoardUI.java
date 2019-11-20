package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.service.BoardManager;
import board.service.BoardManagerImpl;
import board.vo.Board;

/**
 * ����� ȭ�� 
 */
public class BoardUI {
	Scanner keyin = new Scanner(System.in);
	BoardManager manager = new BoardManagerImpl();
	//����Ŵ��� Ÿ�������� ���������� ��ü�� BoardManagerImpl�� �����Ҽ� �־��.
	//������ ����Ÿ���̶�� ������(���������� ����&���Ǵ� ��ü)�� �� ��ӹ��� �ֿ��� ��������.
	//�ٸ�, BoardManager manager�� new BoardManagerImpl();�� ������ ������ �޼ҵ�����ľ��� �� �����.
	//BoardManager manager�� �ڽ��� ���̵��� 4���� �޼ҵ�鸸 �˰� �ֽ��ϴ�.
	
	/**
	 * ������
	 */
	public BoardUI() {
		//BoardUI��ü�� ������ �� ���ѹݺ�.
		while (true) {
			int m = menuPrint();
			switch (m) {
				case 1: write(); break;
				case 2: list(); break;
				case 3: read(); break;
				case 4: delete(); break;
				case 5: search(); break;
				case 0: 
					System.out.println("* ���α׷��� �����մϴ�.");
					return;
			}
		}
	}
	
	/**
	 * �޴� ���, ��ȣ �Է¹ޱ�
	 * @return �Է¹��� ��ȣ
	 */
	public int menuPrint() {
		System.out.println("[ �Խ��� ]");
		System.out.println("1. �۾���");
		System.out.println("2. ��ü �ۺ���");
		System.out.println("3. ���б�");
		System.out.println("4. �ۻ���");
		System.out.println("5. �˻�");
		System.out.println("0. ����");
		System.out.print("* ���� > ");
		
		int num = 0;
		
		while (true) {
			num = keyin.nextInt();
			if (num < 0 || num > 5) {
				System.out.print("* �ٽ� �Է��ϼ��� > ");
				continue;
			}
			break;
		}
		return num;
	}
	
	/**
	 * 1.�۾���
	 */
	public void write() {
		System.out.println("[ �۾��� ]");
		//step1.��������
		int num;
		String id, title, contents;
		
		//step2.�� ���� �� ������ ����.
		System.out.print("��ȣ: ");
		num = keyin.nextInt();
		keyin.nextLine();		//Enter ����
		System.out.print("ID: ");
		id = keyin.nextLine();
		System.out.print("����: ");
		title = keyin.nextLine();
		System.out.print("����: ");
		contents = keyin.nextLine();
		
		//step3. Board.java(Board��Ű�� �Ҽ�/ȥ����...��.��)�ڹ��� �����ڸ� ���.
		Board b = new Board(num, id, title, contents);
	
		//step4. ���������� ����Ǿ����� Ȯ��.
		boolean check = manager.add(b);
		if (check) {
			System.out.println("����Ǿ����ϴ�.");
		}
		else {
			System.out.println("���� �����߽��ϴ�.");
		}
	}
	
	/**
	 * 2.��ü �ۺ���
	 */
	public void list() {
		System.out.println("[ ��ü �۸�� ]");
		ArrayList<Board> list = manager.listAll();
		
		for (Board b : list) {
			System.out.println(b);
		}
		System.out.println("�� " + list.size() + "���� ���� �ֽ��ϴ�.");
	}
	
	/**
	 * 3.���б�
	 */
	public void read() {
		System.out.println("[ ���б� ]");
		int n;
		Board b;
		
		System.out.print("�۹�ȣ �Է�: ");
		n = keyin.nextInt();
		
		b = manager.getBoard(n);
		if (b != null) {
			System.out.println("��ȣ : " + b.getNum());
			System.out.println("�ۼ��� : " + b.getId());
			System.out.println("���� : " + b.getTitle());
			System.out.println("���� : " + b.getContents());
		}
		else {
			System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
		}
	}
	
	/**
	 * 4.�ۻ���
	 */
	public void delete() {
		System.out.println("[ �ۻ��� ]");
		int n;
		
		System.out.print("�۹�ȣ �Է�: ");
		n = keyin.nextInt();
		
		if (manager.remove(n)) {
			System.out.println("�����Ǿ����ϴ�.");
		}
		else {
			System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
		}
	}
	
	/**
	 * 5.�۰˻�(�˻��� ����̸�/
	 */	
	public void search() {
		//Step1.���庯������(��˻����ϴ����� �ϴ� �˻����� �����ڷ���ü�� �־�� �Ѵ�.
		ArrayList<Board> list = manager.listAll();
	    int searchCount=0;		//�˻��� Ƚ�� ������ �뵵
	    
		//SearchType1.�۹�ȣ�� ã��
		int searchByNumber;
		Board targetBoard;
		
		System.out.print("�۹�ȣ �Է�: ");
		searchByNumber = keyin.nextInt();
		targetBoard = manager.getBoard(searchByNumber);
		
		for (Board targetBoard : list) {
			if (b != searchByNumber) 
			{
				System.out.println("��ȣ    : "+ targetBoard.getNum());
				System.out.println("�ۼ��� : "	+ targetBoard.getId());
				System.out.println("����    : "+ targetBoard.getTitle());
				System.out.println("����    : "+ targetBoard.getContents());
			}
			else {
			System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
			}
		}
		System.out.println("�� " + list.size() + "���� ���� �ֽ��ϴ�.");
		
		}
	
}