package global.sesoc.java1.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest6 {

	public static void main(String[] args) {
		BufferedReader inFile = null;
		String filename = "\\Java\\product.txt";
		String line = null;
		
		//텍스트 파일 열기
		try {
			inFile = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(filename + " 파일 열기 실패");
			return;
		} 
		
		//한줄 단위로 읽어서 String 타입으로 리턴
		try {
			while ((line = inFile.readLine()) != null) {
				//읽은 한줄을 빈칸 기준으로 분리
				String ar[] = line.split(" ");
				//상품명과 금액(단가 * 수량)을 출력
				int amount = Integer.parseInt(ar[1]) * Integer.parseInt(ar[2]);
				System.out.println("상품명:" + ar[0] + " 금액:" + amount);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//스트림 닫기	
		try {
			inFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
