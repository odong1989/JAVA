package global.sesoc.study191119;

import java.io.FileOutputStream;
import java.io.IOException;

//���ϻ����ϱ� �����Դϴ�!
public class IOTest3 {
	public static void main(String[] args) {
		FileOutputStream outFile = null;
		String filename ="a.txt";
		
		try {
			//�����δ� �̷��� try���� ���� �ۼ��ϸ� �ȵǿ�!!
			outFile = new FileOutputStream(filename);
			//�ش�Ŭ������ �������� a.txt�� �����˴ϴ�.
			
			outFile.write(100);//�ƽ�Ű�ڵ��� 100�� ���ĺ� 'd'�� Ÿ���εȴ�. 100�� ����Ȱ� �´�
			outFile.write('A');//��ǻ�ʹ� 65�� �ν��ϰ� A���� �����Ѱ�.
			outFile.write('��');//'��'��� ' '�̶�� ����1ĭ�� ����.�Ѹ���� �����Ⱚ�� �Էµ� ��.
			
			outFile.close();//��Ʈ�� �ݱ�.
		}
		catch(IOException error) {
			error.printStackTrace();
		}
	}
}
