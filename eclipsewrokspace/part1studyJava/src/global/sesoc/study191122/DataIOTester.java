package global.sesoc.study191122;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataIOTester {
	public static void main(String[] args) {
		ObjectOutputStream 	obOutStream=null;
		
		Data d1 = new Data("ȫ�浿",20,"���ֽ�");
		Data d2 = new Data("��浿",30,"�����");		
		Data d3 = new Data("�ڱ浿",40,"�λ��");		
		
		
		//���Ϸ� ����ϴ� ��Ʈ���� �����մϴ�.
		try {
			obOutStream = new ObjectOutputStream(new FileOutputStream("data.dat"));
			obOutStream.writeObject(d1);
			System.out.println(d1);
			obOutStream.writeObject(d2);
			obOutStream.writeObject(d3);
			System.out.println("data.dat �����Ϸ�");
			//��Ʈ���� �ݽ��ϴ�.
			obOutStream.close();
		} catch(IOException error) {
			error.printStackTrace();
		}
		
	}
}
