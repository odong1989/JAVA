package global.sesoc.study191122;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataIOTester {
	public static void main(String[] args) {
		ObjectOutputStream 	obOutStream=null;
		
		Data d1 = new Data("홍길동",20,"광주시");
		Data d2 = new Data("김길동",30,"서울시");		
		Data d3 = new Data("박길동",40,"부산시");		
		
		
		//파일로 출력하는 스트림을 생성합니다.
		try {
			obOutStream = new ObjectOutputStream(new FileOutputStream("data.dat"));
			obOutStream.writeObject(d1);
			System.out.println(d1);
			obOutStream.writeObject(d2);
			obOutStream.writeObject(d3);
			System.out.println("data.dat 생성완료");
			//스트림을 닫습니다.
			obOutStream.close();
		} catch(IOException error) {
			error.printStackTrace();
		}
		
	}
}
