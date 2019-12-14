package global.sesoc.java1.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest6 {

	public static void main(String[] args) {
		BufferedReader inFile = null;
		String filename = "\\Java\\product.txt";
		String line = null;
		
		//�ؽ�Ʈ ���� ����
		try {
			inFile = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(filename + " ���� ���� ����");
			return;
		} 
		
		//���� ������ �о String Ÿ������ ����
		try {
			while ((line = inFile.readLine()) != null) {
				//���� ������ ��ĭ �������� �и�
				String ar[] = line.split(" ");
				//��ǰ��� �ݾ�(�ܰ� * ����)�� ���
				int amount = Integer.parseInt(ar[1]) * Integer.parseInt(ar[2]);
				System.out.println("��ǰ��:" + ar[0] + " �ݾ�:" + amount);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��Ʈ�� �ݱ�	
		try {
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
