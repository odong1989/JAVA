package global.sesoc.java1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//파일 복사
public class FileCopy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filename1;
		String filename2;
		File file1;
		File file2;
		FileInputStream in = null;
		FileOutputStream out = null;
		int temp = 0;
		
		//원본 파일의 이름과 경로를 입력받음 (예: \Java\a.jpg )
		//파일이 없으면 다시 입력받음
		while (true) {
			System.out.print("원본 파일명 : ");
			filename1 = scan.nextLine();
			file1 = new File(filename1);
			if (file1.isFile()) break;
			System.out.println("파일이 없습니다.");
		}
		
		//복사본 파일의 이름과 경로를 입력받음 (예: .\a2.jpg )
		//파일이 있으면 다시 입력받음
		while (true) {
			System.out.print("복사본 파일명 : ");
			filename2 = scan.nextLine();
			file2 = new File(filename2);
			if (!file2.isFile()) break;
			System.out.println("이미 사용중인 파일명입니다.");
		}
		
		//입,출력 스트림생성
		try {
			in = new FileInputStream(file1);
			out = new FileOutputStream(file2);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		//1 byte씩 복사
		try {
			while ((temp = in.read()) != -1) {
				out.write(temp);
			}
			in.close();
			out.close();
			System.out.println(filename1 + " -> " + "복사 완료");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}




