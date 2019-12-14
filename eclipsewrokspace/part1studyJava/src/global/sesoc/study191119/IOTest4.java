package global.sesoc.study191119;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest4 {
	public static void main(String[] args) {
	//step1.변수선언
	FileWriter makeFile = null;
	String filename="makeByFileWriter.txt";
	
		try {
			makeFile = new FileWriter(filename);
			//makeFile.write("100A가");//내가 실시한 방식 아예String으로 들어가버리니 100이 알파벳 d로 인식안됨.
			makeFile.write(100);
			makeFile.write('A');
			makeFile.write('가');
			makeFile.close();
			System.out.println("makeByFileWriter.txt 파일이 정상생성되었습니다.");
		}
		catch(IOException error) {
			error.printStackTrace(); 
		}
	}

}
