package global.sesoc.study191119;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

//IOTest6과 실행사항은 같습니다.
//다만 String 배열을 2차원으로 처리합니다.
public class IOTest6_2 {
	public static void main(String[] args) {
	//step1. 변수선언
	//step1.1변수-파일관련(파일찾기,1줄씩 읽기까지)
	File 			findFile = null;
	BufferedReader 	bufferReadFile = null;
	String 			bufferString = null;
	
	//step1.2변수-배열저장관련(2차원-string형배열로 실시.)
	String[][] 		arrStr = new String[3][3];//[?]어떻게 확장성을 늘려갈 것인가? ->allayList로 확장만이 유일한 답?
	String[] 		arrStrTemp = null;	
	int				raw=0;//arrStr의 셀카운터
	int				total=0;//제품의 총금액 합계	
	//step2.대상파일 확인------------------------------------------
	findFile = new File("C:\\Users\\user\\Documents\\JAVA\\eclipsewrokspace\\part2project\\part2_3completeTemplit\\class\\boardByJava\\sellResult.txt");
	if(!findFile.isFile()) 
	{System.out.println("못찾음"); return;}
	System.out.println("찾았다");
	
	
	//[핵심목표] 1줄씩 읽으세요
	//step3. 1줄씩 읽기 설정----------------------------------------
//	int cellarrStr=0;
	try {
		bufferReadFile = new BufferedReader(new FileReader(findFile));
	//step4. 1줄씩 읽기 실시---------------------------------------
		while(true)
			{
				bufferString=bufferReadFile.readLine();
				//더이상 내용이 없는 경우(null값 리턴) 반복문 종료. 
				if(bufferString == null){
					System.out.println("다읽었습니다. 종료합니다.");
					break;}	
				System.out.println(bufferString);
				arrStrTemp=bufferString.split(" ");
				System.out.println("--------------------");
				System.out.printf("arrStrTemp.length : %d \n",arrStrTemp.length);
				for(int cell=0; cell<arrStrTemp.length; cell++)
				{
						arrStr[raw][cell]=arrStrTemp[cell];
						System.out.printf("raw : %d arrStr[raw]: %s \n",raw,arrStr[raw]);
				}						
				raw++;
				System.out.println("--------------------");
			}//while END		
		//[추가목표] split활용하여 수량, 개수를 따로 저장하여 총계금액이 나오도록 해보세요.
		//추가목표힌트 : 1줄을 받으면 String으로 받으세요. 다음에 split()를 활용하여 나누고 값들을 int로 별개로 저장하세요.
			
	//		System.out.printf("%d 원", Integer.parseInt(arrStr[cell]) );				
			
	}//로드한 텍스트의 1줄씩 읽기 종료.
	
	catch(IOException error) {
		error.printStackTrace();
	}

	/* //테스트-정상기입 확인용, 정상기입확인됨.
	for(int cell=0;cell<arrStr.length;cell++){
		System.out.println(
		arrStr[cell]);		
	}
	*/

		for(int printRaw=0 ; printRaw<raw ; printRaw++){
		//	System.out.printf("%s %s %s", arrStr[printRaw][0], arrStr[printRaw][1], arrStr[printRaw][2]);
			System.out.printf("제품명 : %s / 제품별 합계 : %d\n", arrStr[printRaw][0],
														   Integer.parseInt(arrStr[printRaw][1])*Integer.parseInt(arrStr[printRaw][2]));
			total=total+Integer.parseInt(arrStr[printRaw][1])*Integer.parseInt(arrStr[printRaw][2]);
			}
	
	System.out.printf("총 합계금액 : %d",total);
	
	}//main END
}