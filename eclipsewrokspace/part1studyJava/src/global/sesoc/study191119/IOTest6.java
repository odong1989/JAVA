package global.sesoc.study191119;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class IOTest6 {
	public static void main(String[] args) {
	//step1.��������
	File 			findFile = null;		//������ ã�� ����(InputStream)�ϴ� ����
//	FileReader		fileRead = null;		//������ ���� ������ ��ü �۰�.
	BufferedReader 	bufferReadFile = null;	//BufferedReader : �����ؽ�Ʈ����
	String 			bufferString = null;
	String[] 		arrStr = new String[9];//[?]��� Ȯ�强�� �÷��� ���ΰ�? ->allayList�� Ȯ�常�� ������ ��?
	String[] 		arrStrTemp = null;	
	int				arCell=0;//arrStr�� ��ī����
	int				total=0;//��ǰ�� �ѱݾ� �հ�	
	//step2.������� Ȯ��------------------------------------------
	findFile = new File("C:\\Users\\user\\Documents\\JAVA\\eclipsewrokspace\\part2project\\part2_3completeTemplit\\class\\boardByJava\\sellResult.txt");
	if(!findFile.isFile()) 
	{System.out.println("��ã��"); return;}
	System.out.println("ã�Ҵ�");
	
	
	//[�ٽɸ�ǥ] 1�پ� ��������
	//step3. 1�پ� �б� ����----------------------------------------
	try {
  	  //bufferReadFile�� BufferedReaderŬ������ ��ü�̴�! FileŬ������ ���ؾʰ� �����ϼ�!!
		bufferReadFile = new BufferedReader(new FileReader(findFile));//���� �ؽ�Ʈ ��ü�� �޽��ϴ�.
	//step4. 1�پ� �б� �ǽ�---------------------------------------
		while(true)
			{
				bufferString=bufferReadFile.readLine();//1���� �а�, ���� 1���� �������ݴϴ�.
				//���̻� ������ ���� ���(null�� ����) �ݺ��� ����. 
				//����¿��� ������ �ִ� ��쿡�� ����ó�� catch IOException���� ���ϴ�.
				if(bufferString == null){
					System.out.println("���о����ϴ�. �����մϴ�.");
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
			
		
		//[�߰���ǥ] splitȰ���Ͽ� ����, ������ ���� �����Ͽ� �Ѱ�ݾ��� �������� �غ�����.
		//�߰���ǥ��Ʈ : 1���� ������ String���� ��������. ������ split()�� Ȱ���Ͽ� ������ ������ int�� ������ �����ϼ���.
			
	//		System.out.printf("%d ��", Integer.parseInt(arrStr[cell]) );				
			
		}//try�� ����(=�ε��� �ؽ�Ʈ�� 1�پ� �б� ����.)
	catch(FileNotFoundException error) {//1���� try�� 2���̻� catch���� �� ��� ������Ӻ��� �ֿ켱���� ���ϴ�.
		error.printStackTrace();
	}
	
	catch(IOException error) {
		error.printStackTrace();
	}


	/* //�׽�Ʈ-������� Ȯ�ο�, �������Ȯ�ε�.
	for(int cell=0;cell<arrStr.length;cell++){
		System.out.println(
		arrStr[cell]);		
	}
	*/

	for(int cell=0;cell<arrStr.length;cell=cell+3){
		System.out.printf("��ǰ�� : %s ��ǰ�� �հ� : %d\n",
						  arrStr[cell+1],
						  Integer.parseInt(arrStr[cell+1])*Integer.parseInt(arrStr[cell+2]));
		total=total+Integer.parseInt(arrStr[cell+1])*Integer.parseInt(arrStr[cell+2]);
	}
	
	System.out.printf("�� �հ�ݾ� : %d",total);
	
	}//main END
}
