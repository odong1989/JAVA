package study191113;

import java.util.Scanner;
import java.util.ArrayList;

public class BoardTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(new Board(1,"aaa","������1","�۳���1"));
		list.add(new Board(2,"aaa","������2","�۳���2"));
		list.add(new Board(3,"aaa","������3","�۳���3"));
		
		System.out.println(list);
		System.out.print("���� �� ��ȣ : ");
		int n = scan.nextInt();
		//�ش� ��ȣ�� �� �ϳ��� ȭ�鿡 ����ϼ���.(�Ʒ��� �������� ������)
		boolean check = true;
		for(int i =0; i<list.size();i++)
		{
			Board b = list.get(i);
			if(n== b.getPostNumber()) {
				System.out.println(b);
				check=false;
			}
		}
		if(check) System.out.println("�ش��ȣ�� ���� �����ϴ�.");
		
	}
}
