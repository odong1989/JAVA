/*
 * 191120수업의 경우 빠른확인을 위해 텍스트를 주로 하였지만
 * 실제로는 파일을 상대로 하는경우가 많기에
 * 오늘 수업은 파일로 해봅시다
 * (#게임등을 만들면 자신만의 파일들을 만들잖아? 그런 것이죠)
 * 
 * 파일을 저장하려면 사용
 * fileoutStream(1바이트씩 저장진행)
 * bufferreader처럼 1줄씩 통째로 빠르게 해줄수 있는 친구가 필요해!
 * 그래서!
 *  ObjectOutputStream을 주연 / FileOutputStream을 조연으로 하는
 * 객체 저장을 해보자!가 오늘의 목표이다.
 * 
 * 
 * 객체를 저장하는게 목표에요 오늘은!
 * 객체는 String, ArrayList등 다양한 규격포맷을 갖지요
 * ObjectOutPutStream 클래스의 경우 생성자를 쓸수 없어요.(있는 생성자에 Protected 걸어놨음..-_-)
 * 객체
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
		
		//객체를 파일에 저장
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.obj"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 생성 실패!");
		}
		/* 
		 * [tip]ObjectOutputStream를 사용하려면 예외처리를 선언해야 합니다.
		 * [tip]예외처리의 catch문은 1개의 상위타입 클래스로 처리하거나
		 *      catch문 2개를 만들어 2개의 하위클래스를 활용하여 처리하는 방법이 있습니다.
		 * */

		//1개의 파일을 생성하여 내용기입 실시.
		try {
			out.writeObject(sb);
			out.writeObject(in);
			out.writeObject(list);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();			
		}
		/*여기까지 왔다면 object.obj 라는 파일이 생성된다.
		 * 
		 * */
		
		//-----------------------------------------------		
		
		//파일에서 객체를 읽기는 IOTest7MakeReader 파일에서 읽을 수 있다.
	}
}
