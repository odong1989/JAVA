package global.sesoc.study191121;
//원제는 IOTest8.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest7MakeMyobjFileReader {
	public static void main(String[] args) {
		/* IOTest7File.java에서 만드는 object.obj은 아래와 같은 변수를 갖는다.
		StringBuffer sb = new StringBuffer("abcde");
		Integer in = new Integer(100);
		ArrayList<String> list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		object.obj의 값을 읽는 전용 프로그램을 만드는 IOTest7MakeReader도
		같은 변수값들이 선언되게 된다.
		*/
		ObjectInputStream in =null;//출력을 위해 만든다.
		
		StringBuffer a;//StringBuffer객체가 주소를 알고 있는 자이다.
		Integer b;
		ArrayList<String> c;

		
		try {
			in = new ObjectInputStream(new FileInputStream("object.obj"));
			
			a = (StringBuffer) in.readObject();//상위클래스라며 파일을 못받는다고 난리친다. 그래서 (StringBuffer)로 형변환 실시.
			//여담으로 a = (StringBuffer) in.readObject();도 예외처리(ClassNotFoundException)를 해야 한다.
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
		//다른분들은 끝을 지정안해서 에러난다는 등의 애기가 나왔는데 나는 그냥 문제가 없었다. 이유는 몰라.
	}
	
}
