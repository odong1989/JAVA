package global.sesoc.study191119;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class IOTest2 {
	public static void main(String[] args) {
		
		File file = null;
		FileReader inFile = null;

		int n =0;
		
		//Step1. �ؽ�Ʈ ������ ����Ű�� File ��ü ����
		file = new File("C:\\SES study store\\ExTest2.java");
		if(!file.isFile())
		{System.out.println(file+"�� Ȯ�ε�������.");
		 return;}
		else System.out.println(file+"�� Ȯ�ε�.");
		
		//Step2. �ش� ���ϰ� ����Ǵ� ��Ʈ�� FileReader ��ü ����
		try {
			inFile = new FileReader(file);//try������ �ۼ��� ������ �����Ͽ���(������ ����ó���ؾ��ϴµ� ���ߴ�!)��� �Ѵ�

			//Step3. ���� �б�
			while(true) {
			n=inFile.read();
			if(n==-1) 
			{
				System.out.println("\n��¿Ϸ�Ǿ����ϴ�.");				
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
		

		//Step4. ��Ʈ���ݱ�
		try {
			inFile.close();
		}
		catch(IOException error) {
			error.printStackTrace();
		}
		
	}
}
