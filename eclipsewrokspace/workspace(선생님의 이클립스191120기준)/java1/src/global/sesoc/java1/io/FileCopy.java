package global.sesoc.java1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//���� ����
public class FileCopy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filename1;
		String filename2;
		File file1;
		File file2;
		FileInputStream in = null;
		FileOutputStream out = null;
		int temp = 0;
		
		//���� ������ �̸��� ��θ� �Է¹��� (��: \Java\a.jpg )
		//������ ������ �ٽ� �Է¹���
		while (true) {
			System.out.print("���� ���ϸ� : ");
			filename1 = scan.nextLine();
			file1 = new File(filename1);
			if (file1.isFile()) break;
			System.out.println("������ �����ϴ�.");
		}
		
		//���纻 ������ �̸��� ��θ� �Է¹��� (��: .\a2.jpg )
		//������ ������ �ٽ� �Է¹���
		while (true) {
			System.out.print("���纻 ���ϸ� : ");
			filename2 = scan.nextLine();
			file2 = new File(filename2);
			if (!file2.isFile()) break;
			System.out.println("�̹� ������� ���ϸ��Դϴ�.");
		}
		
		//��,��� ��Ʈ������
		try {
			in = new FileInputStream(file1);
			out = new FileOutputStream(file2);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		//1 byte�� ����
		try {
			while ((temp = in.read()) != -1) {
				out.write(temp);
			}
			in.close();
			out.close();
			System.out.println(filename1 + " -> " + "���� �Ϸ�");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}




