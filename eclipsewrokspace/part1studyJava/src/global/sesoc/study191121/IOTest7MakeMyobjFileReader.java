package global.sesoc.study191121;
//������ IOTest8.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest7MakeMyobjFileReader {
	public static void main(String[] args) {
		/* IOTest7File.java���� ����� object.obj�� �Ʒ��� ���� ������ ���´�.
		StringBuffer sb = new StringBuffer("abcde");
		Integer in = new Integer(100);
		ArrayList<String> list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		object.obj�� ���� �д� ���� ���α׷��� ����� IOTest7MakeReader��
		���� ���������� ����ǰ� �ȴ�.
		*/
		ObjectInputStream in =null;//����� ���� �����.
		
		StringBuffer a;//StringBuffer��ü�� �ּҸ� �˰� �ִ� ���̴�.
		Integer b;
		ArrayList<String> c;

		
		try {
			in = new ObjectInputStream(new FileInputStream("object.obj"));
			
			a = (StringBuffer) in.readObject();//����Ŭ������� ������ ���޴´ٰ� ����ģ��. �׷��� (StringBuffer)�� ����ȯ �ǽ�.
			//�������� a = (StringBuffer) in.readObject();�� ����ó��(ClassNotFoundException)�� �ؾ� �Ѵ�.
			System.out.println(a);	
				
			b = (Integer) in.readObject();
			System.out.println(b);	

			c = (ArrayList<String>) in.readObject();
			System.out.println(c);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ٸ��е��� ���� �������ؼ� �������ٴ� ���� �ֱⰡ ���Դµ� ���� �׳� ������ ������. ������ ����.
	}
	
}
