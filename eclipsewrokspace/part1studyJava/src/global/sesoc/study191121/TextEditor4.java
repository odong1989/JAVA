package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//사용자가 입력한 내용으로 텍스트 파일 만들기 (임시파일 이용)
public class TextEditor4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filename = null;
		File file = null;
		File tempfile = null;
		BufferedWriter out = null;
		String text = null;
		String yn = null;
		int num = 0;

		//임시파일 생성
		try {
			tempfile = new File("./temp.tmp");
			out = new BufferedWriter(new FileWriter(tempfile));
		}
		catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		//입력받은 내용을 임시파일에 저장하고 종료
		System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터");
		try {
			while (true) {
				System.out.print(++num + ": ");
				text = scan.nextLine();
				if (text.equals("")) break;
				out.write(text);
				out.newLine();
			}
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		//파일 저장 여부 확인
		System.out.print("저장하시겠습니까? (y/n)");
		yn = scan.nextLine();
		if (yn.equalsIgnoreCase("n")) {
			//저장하지 않을 때는 임시파일 삭제
			System.out.println("저장을 취소합니다.");
			tempfile.delete();
			return;
		}
		
		//파일명 입력받아 File객체 생성. 있는 이름이면 확인 후 다시 입력받음
		while (true) {
			System.out.print("파일명 : ");
			filename = scan.nextLine();
			file = new File(filename + ".txt");
			if (!file.isFile()) break;
			System.out.print("이미 존재하는 파일명입니다. 덮어쓸까요? (y/n)");
			yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				break;
			}
		}
		
		//임시파일의 이름을 입력받은 내용으로 변경
		tempfile.renameTo(file);
		System.out.println(file.getName() + " 파일이 저장되었습니다.");
		
	}
}

/*
*내용을 입력하세요. 종료는 새로운 행에서 엔터
1:가나다라
2:abcd
3:
저장하시겠습니까? (y/n) y
파일명 : a
이미 존재하는 파일명입니다. 덮어쓸까요? (y/n) n
파일명 : b
* b.txt 파일이 저장되었습니다.

*/













