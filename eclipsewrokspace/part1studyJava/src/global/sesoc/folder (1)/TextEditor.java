package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//����ڰ� �Է��� �������� �ؽ�Ʈ ���� �����
public class TextEditor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filename = null;
		File file = null;
		BufferedWriter out = null;
		String text = null;
		int num = 0;
		
		//���ϸ� �Է¹޾� File��ü ����. �ִ� �̸��̸� �ٽ� �Է¹���
		while (true) {
			System.out.print("���ϸ� : ");
			filename = scan.nextLine();
			file = new File(filename + ".txt");
			if (!file.isFile()) break;
			System.out.println("�̹� ������� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
		}
		
		//��½�Ʈ������
		try {
			out = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			System.out.println("���� ���� �� ����");
		}
		
		//�ݺ������� ���� �Է¹޾� ���� ����
		//�Է¾��� ����ġ�� �ݺ� ����
		//��Ʈ�� �ݰ� ���α׷� ����
		try {
			System.out.println("������ �Է��ϼ���. ����� ���ο� �࿡�� ����");
			while (true) {
				System.out.print(++num + ": ");
				text = scan.nextLine();
				if (text.equals("")) break;
				out.write(text);		//�Է��� ���� ����
				out.newLine();			//�� �ٲ�
			}
			out.close();
			System.out.println(file.getName() + " ������ ����Ǿ����ϴ�.");
		}
		catch (IOException e) {
			System.out.println("���� ���� �� ���� �߻�");
		}
	}
}

/*
���ϸ� : abc
������ �Է��ϼ���. ����� ���ο� �࿡�� ����
�����ٶ�
abcd

abc.txt������ ����Ǿ����ϴ�.
*/













