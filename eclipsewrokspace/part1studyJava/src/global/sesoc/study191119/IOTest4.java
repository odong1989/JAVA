package global.sesoc.study191119;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest4 {
	public static void main(String[] args) {
	//step1.��������
	FileWriter makeFile = null;
	String filename="makeByFileWriter.txt";
	
		try {
			makeFile = new FileWriter(filename);
			//makeFile.write("100A��");//���� �ǽ��� ��� �ƿ�String���� �������� 100�� ���ĺ� d�� �νľȵ�.
			makeFile.write(100);
			makeFile.write('A');
			makeFile.write('��');
			makeFile.close();
			System.out.println("makeByFileWriter.txt ������ ��������Ǿ����ϴ�.");
		}
		catch(IOException error) {
			error.printStackTrace(); 
		}
	}

}
