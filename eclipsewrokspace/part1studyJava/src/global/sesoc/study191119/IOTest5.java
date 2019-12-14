package global.sesoc.study191119;

import java.io.FileWriter;
import java.io.BufferedWriter;//이번에는 1회성이 아니라 계속 새로운 입력이 생성될때마다의 반영을 하고 싶다!!
import java.io.IOException;

public class IOTest5 {
	public static void main(String[] args) {
		//step1.변수선언
		BufferedWriter makeFile = null;
		String filename="makeByBufferedWriter.txt";
		
			try {
				makeFile = new BufferedWriter(new FileWriter(filename));
				//BufferedWriter가 FileWriter를 거들어주는 역할이라고 생각할 수 있다.
				//문장단위로 모아서 보내는 채팅등에 좋습니다.
				makeFile.write(100);
				makeFile.write("srhwtraeaoijeriosdfjod");
				makeFile.write("\n");//개행시 권하지 않는 방식이다.
				makeFile.write("나하반야 ");
				makeFile.write("AaA");
				makeFile.newLine();//개행시 권고하는 방식입니다.
				makeFile.write("가나다");

				/*[궁금  사항] "\n"으로 개행하면 안됩니까?
				 *[답변&Tip] 윈도우외의 다른 시스템에 사용하려 할 경우를 고려하여 
				 *          newLine();를 활용합니다. 
				 *          윈도우의 경우 "\r\n"으로 입력하면 개행하지만 타 시스템들은 개행방법이 다르죠. 
				 *          윈도우시스템 내에서 
				 * */
				makeFile.close();
				System.out.println("makeByBufferedWriter.txt 파일이 정상생성되었습니다.");
			}
			catch(IOException error) {
				error.printStackTrace(); 
			}
	}

}
