//파일복사 예제입니다.
//실시할 사항입니다.
//1.   원본 파일찾기 
//1.1. 원본 파일의 이름과 경로를 입력받습니다.(예: \java\a.jpg)	
//1.2. 파일이 없다고 판단시 다시 입력받습니다.
	
//2.  복사할 파일의 이름과 경로 설정
//2.1 복사본 파일의 이름과 경로를 입력 받습니다.(예: .\a2.jpg)
//2.2 파일이 있으면 다시 입력받음

//3.  복사하기
//3.1 1byte씩 복사&이동하는 방식으로 합니다.
package global.sesoc.study191120;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy {

	public static void main(String[] args) {
		String 	fileNameCopyTarget=null;	//오리지널 변수명 : filename1
		String 	fileNameCopyAnother=null;	//오리지널 변수명 : filename2
		int 	temp;
		File 	fileFind =null;				//오리지널 변수명 :file1
		File 	fileCopyAnother =null;		//오리지널 변수명 :file1
		Scanner input = new Scanner(System.in);
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		
		//1.   원본 파일찾기 
		//1.1. 원본 파일의 이름과 경로를 입력받습니다.(예: \java\a.jpg)	
		//1.2. 파일이 없다고 판단시 다시 입력받습니다.
		while(true){
			System.out.println("원본파일명(복사를 할 대상)을 입력해주세요.");
			System.out.println("입력 예: \\java\\a.jpg (파일명까지!)");	
			fileNameCopyTarget=input.nextLine();
			fileFind = new File(fileNameCopyTarget);				
			if(fileFind.isFile()){
				System.out.println("파일이 정상확인되었습니다.");		
				break;
			}
			System.out.println("파일이 확인되지 않았습니다. 다시 입력해주세요.");
		}//while END

		//2.  복사할 파일의 이름과 경로 설정
		//2.1 복사본 파일의 이름과 경로를 입력 받습니다.(예: .\a2.jpg)
		//2.2 파일이 있으면 다시 입력받음
		while(true){
			System.out.println("복사본의 저장명을 입력하세요.");
			System.out.println("입력 예: \\java\\a.jpg (파일명까지!)");	
			fileNameCopyAnother=input.nextLine();

			if(fileFind.isFile()){
				fileCopyAnother = new File(fileNameCopyAnother);				
				System.out.println("파일이 정상생성되었습니다.");		
				break;
				}
			System.out.println("똑같은 파일이 있습니다. 다시 입력해주세요.");
		}//while END
		
		
		//3. 입출력 스트림 생성
		try {
			inFile = new FileInputStream(fileFind);
			outFile = new FileOutputStream(fileCopyAnother);
		}		
		catch(FileNotFoundException error) {
			error.printStackTrace();
		}
		
		
		//4. 1바이트씩 복사
		try{
			while((temp = inFile.read()) != -1){
				outFile.write(temp);
			}
			inFile.close();
			outFile.close();
		}
		catch(IOException error){
			error.printStackTrace();
		}
	}//main END
}// class FileCopy END
