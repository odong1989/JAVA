package global.sesoc.java1.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {
		FileReader inFile = null;
		File file = null;
		int n = 0;
		
		//텍스트 파일을 가리키는 File객체 생성
		file = new File("\\Java\\text.txt");
		//해당 파일과 연결되는 스트림 FileReader 객체 생성
		try {
			inFile = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//문자 읽기
		try {
			while ((n = inFile.read()) != -1) {
				System.out.print((char)n);
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		//스트림 닫기
		try {
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
