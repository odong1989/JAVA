package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//사용자가 입력한 내용으로 텍스트 파일 만들기 (ArrayList 이용)
public class TextEditor3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filename = null;
		File file = null;
		BufferedWriter out = null;
		String text = null;
		ArrayList<String> list = null;
		String yn = null;
		int num = 0;

		//반복적으로 한줄 입력받아 StringBuffer 생성
		//입력없이 엔터치면 반복 종료
		list = new ArrayList<>();
		
		System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터");
		while (true) {
			System.out.print(++num + ": ");
			text = scan.nextLine();
			if (text.equals("")) break;
			list.add(text + "\r\n");	//입력한 내용 ArrayList에 추가
		}

		//파일 저장 여부 확인
		System.out.print("저장하시겠습니까? (y/n)");
		yn = scan.nextLine();
		if (yn.equalsIgnoreCase("n")) {
			System.out.println("저장을 취소합니다.");
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
		
		//출력스트림생성. ArrayList의 내용 저장
		try {
			out = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i));
			}
			out.close();
			System.out.println(file.getName() + " 파일이 저장되었습니다.");
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류");
		}
		
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













