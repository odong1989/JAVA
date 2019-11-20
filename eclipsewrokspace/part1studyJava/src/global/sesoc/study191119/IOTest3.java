package global.sesoc.study191119;

import java.io.FileOutputStream;
import java.io.IOException;

//파일생성하기 예제입니다!
public class IOTest3 {
	public static void main(String[] args) {
		FileOutputStream outFile = null;
		String filename ="a.txt";
		
		try {
			//실제로는 이렇게 try내에 몽땅 작성하면 안되요!!
			outFile = new FileOutputStream(filename);
			//해당클래스의 폴더내에 a.txt가 생성됩니다.
			
			outFile.write(100);//아스키코드의 100인 알파벳 'd'가 타이핑된다. 100이 저장된건 맞다
			outFile.write('A');//컴퓨터는 65로 인식하고 A으로 저장한것.
			outFile.write('가');//'가'대신 ' '이라는 공백1칸이 들어갔다.한마디로 쓰레기값이 입력된 셈.
			
			outFile.close();//스트림 닫기.
		}
		catch(IOException error) {
			error.printStackTrace();
		}
	}
}
