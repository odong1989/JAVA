package global.sesoc.study191122;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataIOTester2 {
	public static void main(String[] args) {
	//Data�� ��ü���� ������ ����Ǿ� �ֽ��ϴ�.
	//������ ȭ�鿡 ����ϴ� ���Դϴ�.
	ObjectInputStream	obInputStream=null;
	Data dataTemper = null;
	
	//PART2. Data�� �ڷ�� �б�
	try {
		obInputStream = new ObjectInputStream(new FileInputStream("data.dat"));
		while(true) {
			dataTemper = (Data) obInputStream.readObject();//�о �޸𸮿� ������� ���ĳ��� ����
			//(Data)�� ���赵, �ڷ��� ������ ���Ѵٰ� �����Ͻø� �˴ϴ�.
			System.out.println(dataTemper);
			}//whlie END
		
		}catch (Exception eException) {
			//��ø���� ������� �ᵵ �ǰ�, ����ó�� �Ʒ��� ����˴ϴ�.
			try {
				obInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	/*
	//������� �Ʒ��� ���� �κ�
	try {
		obInputStream.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	}
}
