package global.sesoc.study191119;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class IOTest6 {
	public static void main(String[] args) {
	//step1.변수선언
	File 			findFile = null;		//파일을 찾고 연결(InputStream)하는 역할
//	FileReader		fileRead = null;		//파일을 열고 내용을 전체 퍼감.
	BufferedReader 	bufferReadFile = null;	//BufferedReader : 열린텍스트파일
	String 			bufferString = null;
	String[] 		arrStr = new String[9];//[?]어떻게 확장성을 늘려갈 것인가? ->allayList로 확장만이 유일한 답?
	String[] 		arrStrTemp = null;	
	int				arCell=0;//arrStr의 셀카운터
	int				total=0;//제품의 총금액 합계	
	//step2.대상파일 확인------------------------------------------
	findFile = new File("C:\\Users\\user\\Documents\\JAVA\\eclipsewrokspace\\part2project\\part2_3completeTemplit\\class\\boardByJava\\sellResult.txt");
	if(!findFile.isFile()) 
	{System.out.println("못찾음"); return;}
	System.out.println("찾았다");
	
	
	//[핵심목표] 1줄씩 읽으세요
	//step3. 1줄씩 읽기 설정----------------------------------------
	try {
  	  //bufferReadFile는 BufferedReader클래스의 객체이다! File클래스로 오해않게 주의하셈!!
		bufferReadFile = new BufferedReader(new FileReader(findFile));//읽을 텍스트 전체를 받습니다.
	//step4. 1줄씩 읽기 실시---------------------------------------
		while(true)
			{
				bufferString=bufferReadFile.readLine();//1줄을 읽고, 읽은 1줄을 리턴해줍니다.
				//더이상 내용이 없는 경우(null값 리턴) 반복문 종료. 
				//입출력에서 에러가 있는 경우에는 예외처리 catch IOException으로 갑니다.
				if(bufferString == null){
					System.out.println("다읽었습니다. 종료합니다.");
					break;}	
				System.out.println(bufferString);
				arrStrTemp=bufferString.split(" ");
				System.out.println("--------------------");
				System.out.printf("arrStrTemp.length : %d \n",arrStrTemp.length);
				for(int cell=0; cell<arrStrTemp.length; cell++)
				{
						arrStr[arCell]=arrStrTemp[cell];
						System.out.printf("arCell : %d arrStr[arCell]: %s \n",arCell,arrStr[arCell]);
						arCell++;
				}						
				System.out.println("--------------------");
			}//while END		
			
		
		//[추가목표] split활용하여 수량, 개수를 따로 저장하여 총계금액이 나오도록 해보세요.
		//추가목표힌트 : 1줄을 받으면 String으로 받으세요. 다음에 split()를 활용하여 나누고 값들을 int로 별개로 저장하세요.
			
	//		System.out.printf("%d 원", Integer.parseInt(arrStr[cell]) );				
			
		}//try문 종료(=로드한 텍스트의 1줄씩 읽기 종료.)
	catch(FileNotFoundException error) {//1개의 try에 2개이상 catch문을 쓸 경우 하위상속부터 최우선으로 씁니다.
		error.printStackTrace();
	}
	
	catch(IOException error) {
		error.printStackTrace();
	}


	/* //테스트-정상기입 확인용, 정상기입확인됨.
	for(int cell=0;cell<arrStr.length;cell++){
		System.out.println(
		arrStr[cell]);		
	}
	*/

	for(int cell=0;cell<arrStr.length;cell=cell+3){
		System.out.printf("제품명 : %s 제품별 합계 : %d\n",
						  arrStr[cell+1],
						  Integer.parseInt(arrStr[cell+1])*Integer.parseInt(arrStr[cell+2]));
		total=total+Integer.parseInt(arrStr[cell+1])*Integer.parseInt(arrStr[cell+2]);
	}
	
	System.out.printf("총 합계금액 : %d",total);
	
	}//main END
}
