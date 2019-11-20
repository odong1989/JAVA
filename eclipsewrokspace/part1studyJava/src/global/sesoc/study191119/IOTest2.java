package global.sesoc.study191119;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class IOTest2 {
	public static void main(String[] args) {
		
		File file = null;
		FileReader inFile = null;

		int n =0;
		
		//Step1. 텍스트 파일을 가리키는 File 객체 생성
		file = new File("C:\\SES study store\\ExTest2.java");
		if(!file.isFile())
		{System.out.println(file+"이 확인되지않음.");
		 return;}
		else System.out.println(file+"이 확인됨.");
		
		//Step2. 해당 파일과 연결되는 스트림 FileReader 객체 생성
		try {
			inFile = new FileReader(file);//try내에서 작성을 않으면 컴파일에러(무조건 예외처리해야하는데 안했다!)라고 한다

			//Step3. 문자 읽기
			while(true) {
			n=inFile.read();
			if(n==-1) 
			{
				System.out.println("\n출력완료되었습니다.");				
				break;
			}
			else if(n==13) {
				System.out.println("");								
			}
			System.out.print((char)n);
			
		}

		//System.out.println(inFile);

		}
		catch(IOException error) {
			error.printStackTrace();
		}
		

		//Step4. 스트림닫기
		try {
			inFile.close();
		}
		catch(IOException error) {
			error.printStackTrace();
		}
		
	}
}
