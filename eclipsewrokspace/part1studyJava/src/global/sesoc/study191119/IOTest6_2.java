package global.sesoc.study191119;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

//IOTest6�� ��������� �����ϴ�.
//�ٸ� String �迭�� 2�������� ó���մϴ�.
public class IOTest6_2 {
	public static void main(String[] args) {
	//step1. ��������
	//step1.1����-���ϰ���(����ã��,1�پ� �б����)
	File 			findFile = null;
	BufferedReader 	bufferReadFile = null;
	String 			bufferString = null;
	
	//step1.2����-�迭�������(2����-string���迭�� �ǽ�.)
	String[][] 		arrStr = new String[3][3];//[?]��� Ȯ�强�� �÷��� ���ΰ�? ->allayList�� Ȯ�常�� ������ ��?
	String[] 		arrStrTemp = null;	
	int				raw=0;//arrStr�� ��ī����
	int				total=0;//��ǰ�� �ѱݾ� �հ�	
	//step2.������� Ȯ��------------------------------------------
	findFile = new File("C:\\Users\\user\\Documents\\JAVA\\eclipsewrokspace\\part2project\\part2_3completeTemplit\\class\\boardByJava\\sellResult.txt");
	if(!findFile.isFile()) 
	{System.out.println("��ã��"); return;}
	System.out.println("ã�Ҵ�");
	
	
	//[�ٽɸ�ǥ] 1�پ� ��������
	//step3. 1�پ� �б� ����----------------------------------------
//	int cellarrStr=0;
	try {
		bufferReadFile = new BufferedReader(new FileReader(findFile));
	//step4. 1�پ� �б� �ǽ�---------------------------------------
		while(true)
			{
				bufferString=bufferReadFile.readLine();
				//���̻� ������ ���� ���(null�� ����) �ݺ��� ����. 
				if(bufferString == null){
					System.out.println("���о����ϴ�. �����մϴ�.");
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
		//[�߰���ǥ] splitȰ���Ͽ� ����, ������ ���� �����Ͽ� �Ѱ�ݾ��� �������� �غ�����.
		//�߰���ǥ��Ʈ : 1���� ������ String���� ��������. ������ split()�� Ȱ���Ͽ� ������ ������ int�� ������ �����ϼ���.
			
	//		System.out.printf("%d ��", Integer.parseInt(arrStr[cell]) );				
			
	}//�ε��� �ؽ�Ʈ�� 1�پ� �б� ����.
	
	catch(IOException error) {
		error.printStackTrace();
	}

	/* //�׽�Ʈ-������� Ȯ�ο�, �������Ȯ�ε�.
	for(int cell=0;cell<arrStr.length;cell++){
		System.out.println(
		arrStr[cell]);		
	}
	*/

		for(int printRaw=0 ; printRaw<raw ; printRaw++){
		//	System.out.printf("%s %s %s", arrStr[printRaw][0], arrStr[printRaw][1], arrStr[printRaw][2]);
			System.out.printf("��ǰ�� : %s / ��ǰ�� �հ� : %d\n", arrStr[printRaw][0],
														   Integer.parseInt(arrStr[printRaw][1])*Integer.parseInt(arrStr[printRaw][2]));
			total=total+Integer.parseInt(arrStr[printRaw][1])*Integer.parseInt(arrStr[printRaw][2]);
			}
	
	System.out.printf("�� �հ�ݾ� : %d",total);
	
	}//main END
}