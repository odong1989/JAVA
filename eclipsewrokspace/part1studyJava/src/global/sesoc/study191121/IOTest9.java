package global.sesoc.study191121;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

//원래제목 : IOTest9
//이번에는 a.obj라는 1개의 OBJ파일 생성 & 이를 읽는 작업을 동시진행
public class IOTest9 {
	public static void main(String[] args){
		//객체가 여러개 저장되어있습니다.
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		Integer i;
		
		//PART1. a.obj파일 생성
		try {
			out = new ObjectOutputStream(new FileOutputStream("a.obj"));
			//FileOutputStream만으로도 만들수는 있어요.
			//하지만 바이트정도로만 진행하니까 약점이 있지요.
			//그래서 같이 활동해줄 ObjectOutputStream이 같이 행동하여 "a.obj"를 생성합니다.
			out.writeObject(new Integer(33));//Integer
			out.writeObject(new Integer(11));
			out.writeObject(new Integer(22));
			out.writeObject(new Integer(99));
			out.close();//이부분이 없을경우 "더 만들게 없는데 뭐해?"라며 에러를 시전한다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//PART2. a.obj파일로부터 객체 읽기(#프로그램기준으로는 읽어오는게 맞습니다. 사람기준으로 보는게 아님!)
			try {
				in = new ObjectInputStream(new FileInputStream("a.obj"));
				while(true) {
					i = (Integer) in.readObject();//readObject()는 ClassNotFoundException 예외처리가 필요합니다.
					//i = (Integer) in.readObject(); <-원래의 형태로 읽도록 설정한 것.	
					System.out.println(i);	
					/*[?]조건문을 사용하지 않아도 무한루프 탈출이 가능한가요?
					 * 네 가능합니다.
					 * in.readObject()가 계속 값을 읽다가 오브젝트가 아닌 값들이 나오게 되는데
					 * (한마디로 더이상 값이 없는 경우, 즉, 모든 값들을 다 읽었다는 애기죠)
					 * 이때 catch (IOException e) {
					*/
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//콘솔창(cmd창)에 예외처리가 발생했다고 알려줍니다.
				//e.printStackTrace();가 없을경우 사용자입장에서는 에러가 없는 것으로 알게 됩니다.
				//[?]e.printStackTrace()문 있으면 사용자도 예외처리봅니까?=> 네, 봅니다.
				System.out.println("catch (IOException e)는 in.readObject();는 예외처리입니다.");
				System.out.println("in.readObject();는 예외처리를 통하여 밖으로 탈출하게 됩니다.");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				in.close();
				System.out.println("in.close()까지 실시하여 정상적으로 종료를 하게됩니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
