package global.sesoc.study191121;

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

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

	public class TextEditorHWMyVersion {
		public static void main(String[] args) {
			String 			fileName		=null;
			Scanner 		scan			=new Scanner(System.in);
			File 			fileFind 		= null;
			BufferedWriter 	writeContents	= null;
			int 			numTextLine		=0;
			String 			text			=null;
			FileWriter		makeFile		=null;

			String 	fileNameCopyTarget=null;	
			FileInputStream inFile = null;
			FileOutputStream outFile = null;			
			int 	temp;
			
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
				writeContents = new BufferedWriter(new FileWriter(fileFind+"temp.txt"));
				fileNameCopyTarget=fileFind+"temp.txt"; //임시파일명 보관
			}
			catch(IOException error){
				System.out.println("임시파일 생성 중 오류입니다");
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
					writeContents.write(text);
					writeContents.newLine();
					
					if(text.equals("")){//1차적으로 종료의사(빈칸서 엔터시 종료인식) 체크
						System.out.println("빈칸 엔터입력 확인되었습니다.");			
						System.out.print("저장하시겠습니까?(y/n)");	
						text = scan.nextLine();						
						if(text.equals("y")) {//종료시 y, 저장전에 동일파일명이 있는가 확인, 있을 경우 사용자에게 문의
							System.out.print("저장하실 파일명과 주소 : ");			
							fileName=scan.nextLine();
							fileFind = new File(fileName);
							if(!fileFind.isFile()){
								writeContents.close();//임시파일의 닫기&저장종료.										
								System.out.println("동일명 파일없음 확인. 저장 진행합니다.");
								//임시파일에 저장된것을 최종파일로 복사실시-------------------------
								makeFile= new FileWriter(fileName+".txt");
								//3. 입출력 스트림 생성
								try {
									inFile = new FileInputStream(fileNameCopyTarget);
									outFile = new FileOutputStream(fileName+".txt");
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
								makeFile.close();
								//최종파일로 복사 종료-----------------------
								
								System.out.print(fileFind.getName()+".txt" + "파일이 저장되었습니다.");
								System.out.print("프로그램 종료.");
								break;
								}		
							else {
								System.out.println("동일명 파일이 있습니다. 파일명 재입력해주세요.");	}							
						}//if(text.equals("y")) END
						if(text.equals("n")) {
						System.out.println("저장취소");		
						}

					}//if(text.equals("")) END
					

					
				}//while(true) END
			}//try END
			catch(IOException error) {
			System.out.println("파일 저장 중 오류입니다");
			error.printStackTrace();
			}
	}//main END
}//class END
