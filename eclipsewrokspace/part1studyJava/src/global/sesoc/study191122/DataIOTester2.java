package global.sesoc.study191122;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DataIOTester2 {
	public static void main(String[] args) {
	//Data형 객체들이 여러개 저장되어 있습니다.
	//내용을 화면에 출력하는 것입니다.
	ObjectInputStream	obInputStream=null;
	Data dataTemper = null;
	
	//PART2. Data형 자료들 읽기
	try {
		obInputStream = new ObjectInputStream(new FileInputStream("data.dat"));
		while(true) {
			dataTemper = (Data) obInputStream.readObject();//읽어서 메모리에 원래대로 펼쳐놓는 역할
			//(Data)는 설계도, 자료형 포맷을 말한다고 생각하시면 됩니다.
			System.out.println(dataTemper);
			}//whlie END
		
		}catch (Exception eException) {
			//중첩문의 양식으로 써도 되고, 기존처럼 아래에 적어도됩니다.
			try {
				obInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	/*
	//기존대로 아래에 적은 부분
	try {
		obInputStream.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	}
}
