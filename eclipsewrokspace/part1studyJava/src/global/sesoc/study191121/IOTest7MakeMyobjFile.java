/*
 * 191120������ ��� ����Ȯ���� ���� �ؽ�Ʈ�� �ַ� �Ͽ�����
 * �����δ� ������ ���� �ϴ°�찡 ���⿡
 * ���� ������ ���Ϸ� �غ��ô�
 * (#���ӵ��� ����� �ڽŸ��� ���ϵ��� �����ݾ�? �׷� ������)
 * 
 * ������ �����Ϸ��� ���
 * fileoutStream(1����Ʈ�� ��������)
 * bufferreaderó�� 1�پ� ��°�� ������ ���ټ� �ִ� ģ���� �ʿ���!
 * �׷���!
 *  ObjectOutputStream�� �ֿ� / FileOutputStream�� �������� �ϴ�
 * ��ü ������ �غ���!�� ������ ��ǥ�̴�.
 * 
 * 
 * ��ü�� �����ϴ°� ��ǥ���� ������!
 * ��ü�� String, ArrayList�� �پ��� �԰������� ������
 * ObjectOutPutStream Ŭ������ ��� �����ڸ� ���� �����.(�ִ� �����ڿ� Protected �ɾ����..-_-)
 * ��ü
 * */

package global.sesoc.study191121;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOTest7MakeMyobjFile {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcde");
		Integer in = new Integer(100);
		ArrayList<String> list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//��ü�� ���Ͽ� ����
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.obj"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���� ���� ����!");
		}
		/* 
		 * [tip]ObjectOutputStream�� ����Ϸ��� ����ó���� �����ؾ� �մϴ�.
		 * [tip]����ó���� catch���� 1���� ����Ÿ�� Ŭ������ ó���ϰų�
		 *      catch�� 2���� ����� 2���� ����Ŭ������ Ȱ���Ͽ� ó���ϴ� ����� �ֽ��ϴ�.
		 * */

		//1���� ������ �����Ͽ� ������� �ǽ�.
		try {
			out.writeObject(sb);
			out.writeObject(in);
			out.writeObject(list);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();			
		}
		/*������� �Դٸ� object.obj ��� ������ �����ȴ�.
		 * 
		 * */
		
		//-----------------------------------------------		
		
		//���Ͽ��� ��ü�� �б�� IOTest7MakeReader ���Ͽ��� ���� �� �ִ�.
	}
}
