package study191119;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest1 {
	public static void main(String[] args) {
	//--Step1. File 클래스 객체를 생성하여 목표파일의 존재를 확인.---------------------------------------
		File file = new File("C:\\Users\\user\\Documents\\JAVA\\eclipsewrokspace\\part2project\\part2_3completeTemplit\\class\\boardByJava\\src\\textIOTest1.txt");
//		File file = new File("C:\\SES study store\\ExTest2.java");
		if(!file.isFile())//파일이 없거나,파일로서 존재않을 경우
		{ System.out.println(file.getName()+"파일이 없습니다.");
		}
		else {System.out.println(file.getName()+"파일이 있음을 확인하였습니다.");
		}
		
		//FileInputStream클래스의
		//방법1. 주소를 알려주는 방법
		//FileInputStream inFile (적는데 가셨엉... ㅜ.ㅜ)
		//방법2. 해당파일을 가리키는 객체(File file)를 활용하여 연결
		FileInputStream inFile = null;//try문 내에 선언까지 적으면 try문 밖에서는 소멸되어 버린다.
		try {
		     inFile = new FileInputStream(file);
			/*[?]정상적으로 처리했는데 아래의 에러는 뭔가요?
			 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			 * Unhandled exception type FileNotFoundException
			  [!]"예외처리를 만들어라!"라는 의미입니다.
			         예외처리를 의무적으로 하도록 강제되어있기에 예외처리를 작성하지 않으면 에러로 취급됩니다.
			      try-catch문을 활용하여 에러처리를 정의하세요.
			 */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int n;
			try {
				while(true) {
				n = inFile.read();//딱 1바이트만! 읽어옵니다.
								  //텍스트파일에는 "A가"라는 정보가 있는데 맨앞글자인 'A'만 읽는 것이죠.
				if(n== -1 ) break;
				System.out.print(n+",");
				if(n==13) System.out.println("");
				/*
				//1바이트씩 계속 읽어보기(#무식하게 일일이 설정시)
				System.out.println((char)n);//char형으로 형변환하여 아스키코드번호에서 문자로 변환.
		
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);		
				n = inFile.read(); System.out.println(n);
				*/
				}
			}
			catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

