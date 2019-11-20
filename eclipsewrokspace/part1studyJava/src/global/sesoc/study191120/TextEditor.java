//메모장같은 글 편집기 만들기!
/* [실행 예]
 * 파일명 : adc
 * 내용을 입력하세요. 종료는 새로운 행에서 엔터를 하십시오.
 * 가나다라
 * abcd
 * (새로운 행이 빈칸시
 * 
 * 힌트 : 가나다라 등은 스캐너 변수로 수신받고,
 * 스캐너 수신-> 스트림 생성 -> 파일에 쓰기작업
 * 
 * 스트림 닫고->안내메세지 출력->종료
 * */
//step1. 파일명 입력받아 File객체를 생성합니다. 있는 이름시 다시 입력받으십시오.
//step2. 출력스트림 생성
//step3. 반복적으로 한 줄 입력받아 한 줄 저장합니다.
//step4. 입력없는 상태에서 엔터치면 반복이 종료된다.
//step5. 스트림닫고 프로그램 종료

package global.sesoc.study191120;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class TextEditor {
	public static void main(String[] args) {
	String 			fileName		=null;
	Scanner 		scan			=new Scanner(System.in);
	File 			fileFind 		= null;
	BufferedWriter 	writeContents	= null;
	int 			numTextLine		=0;
	String 			text			=null;
	
	//step1. 파일명 입력받아 File객체를 생성합니다. 있는 이름시 다시 입력받으십시오.
		while(true){
		System.out.println("저장할 파일명 : ");
		fileName=scan.nextLine();
		fileFind = new File(fileName);
		if(!fileFind.isFile()){
			System.out.println("동일명 파일없음 확인.");			
			break;
			}		
		System.out.println("동일명 파일이 있습니다. 파일명 재입력해주세요.");			
		}
	
	//step2. 출력스트림 생성
		try {
			writeContents = new BufferedWriter(new FileWriter(fileFind));
		}
		catch(IOException error){
			System.out.println("파일 생성 중 오류입니다");
			error.printStackTrace();	
		}


		
			
	//step3. 반복적으로 한 줄 입력받아 한 줄 저장합니다.
	//step4. 입력없는 상태에서 엔터치면 반복이 종료된다.
	//step5. 스트림닫고 프로그램 종료
		try {
			System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터 입력하면됩니다.");
			while(true){
				System.out.print(++numTextLine + ": ");
				text = scan.nextLine();
				if(text.equals("")){
					System.out.println("엔터입력 확인되었습니다.종료합니다.");			
					break;
				}
				/*[여담] 엔터입력확인시 NG사례
				 * 1) null값인지  비교를 하는 경우
				 * 2) length()로 확인하는 경우
				 * 3) isEmpty()로 확인하는 경우
				 * 엔터는 자체값이 없다는 점때문에 위의 NG사례들로는 엔터입력을 확인할 수 없다고 한다.
				 * */
				
				writeContents.write(text);
				writeContents.newLine();
			}
			writeContents.close();
			System.out.print(fileFind.getName() + "파일이 저장되었습니다.");
		}
		catch(IOException error) {
			System.out.println("파일 저장 중 오류입니다");
			error.printStackTrace();
		}
	}
}
