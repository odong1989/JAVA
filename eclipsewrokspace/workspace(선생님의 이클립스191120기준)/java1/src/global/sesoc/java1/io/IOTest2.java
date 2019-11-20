package global.sesoc.java1.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {
		FileReader inFile = null;
		File file = null;
		int n = 0;
		
		//�ؽ�Ʈ ������ ����Ű�� File��ü ����
		file = new File("\\Java\\text.txt");
		//�ش� ���ϰ� ����Ǵ� ��Ʈ�� FileReader ��ü ����
		try {
			inFile = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//���� �б�
		try {
			while ((n = inFile.read()) != -1) {
				System.out.print((char)n);
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		//��Ʈ�� �ݱ�
		try {
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
