package global.sesoc.java1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) {
		File file = new File("C:\\Java\\source\\Student.java");
		if (!file.isFile()) {
			System.out.println(file.getName() + " 파일이 없습니다.");
			return;
		}

		FileInputStream inFile = null;
		try {
			inFile = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int n;
		try {
			while (true) {
				n = inFile.read();
				if (n == -1) break;
				System.out.print((char)n);
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try {
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}







