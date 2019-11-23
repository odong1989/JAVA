package global.sesoc.study191121;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

//�������� : IOTest9
//�̹����� a.obj��� 1���� OBJ���� ���� & �̸� �д� �۾��� ��������
public class IOTest9 {
	public static void main(String[] args){
		//��ü�� ������ ����Ǿ��ֽ��ϴ�.
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		Integer i;
		
		//PART1. a.obj���� ����
		try {
			out = new ObjectOutputStream(new FileOutputStream("a.obj"));
			//FileOutputStream�����ε� ������� �־��.
			//������ ����Ʈ�����θ� �����ϴϱ� ������ ������.
			//�׷��� ���� Ȱ������ ObjectOutputStream�� ���� �ൿ�Ͽ� "a.obj"�� �����մϴ�.
			out.writeObject(new Integer(33));//Integer
			out.writeObject(new Integer(11));
			out.writeObject(new Integer(22));
			out.writeObject(new Integer(99));
			out.close();//�̺κ��� ������� "�� ����� ���µ� ����?"��� ������ �����Ѵ�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//PART2. a.obj���Ϸκ��� ��ü �б�(#���α׷��������δ� �о���°� �½��ϴ�. ����������� ���°� �ƴ�!)
			try {
				in = new ObjectInputStream(new FileInputStream("a.obj"));
				while(true) {
					i = (Integer) in.readObject();//readObject()�� ClassNotFoundException ����ó���� �ʿ��մϴ�.
					//i = (Integer) in.readObject(); <-������ ���·� �е��� ������ ��.	
					System.out.println(i);	
					/*[?]���ǹ��� ������� �ʾƵ� ���ѷ��� Ż���� �����Ѱ���?
					 * �� �����մϴ�.
					 * in.readObject()�� ��� ���� �дٰ� ������Ʈ�� �ƴ� ������ ������ �Ǵµ�
					 * (�Ѹ���� ���̻� ���� ���� ���, ��, ��� ������ �� �о��ٴ� �ֱ���)
					 * �̶� catch (IOException e) {
					*/
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//�ܼ�â(cmdâ)�� ����ó���� �߻��ߴٰ� �˷��ݴϴ�.
				//e.printStackTrace();�� ������� ��������忡���� ������ ���� ������ �˰� �˴ϴ�.
				//[?]e.printStackTrace()�� ������ ����ڵ� ����ó�����ϱ�?=> ��, ���ϴ�.
				System.out.println("catch (IOException e)�� in.readObject();�� ����ó���Դϴ�.");
				System.out.println("in.readObject();�� ����ó���� ���Ͽ� ������ Ż���ϰ� �˴ϴ�.");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				in.close();
				System.out.println("in.close()���� �ǽ��Ͽ� ���������� ���Ḧ �ϰԵ˴ϴ�.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
