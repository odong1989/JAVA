//���Ϻ��� �����Դϴ�.
//�ǽ��� �����Դϴ�.
//1.   ���� ����ã�� 
//1.1. ���� ������ �̸��� ��θ� �Է¹޽��ϴ�.(��: \java\a.jpg)	
//1.2. ������ ���ٰ� �Ǵܽ� �ٽ� �Է¹޽��ϴ�.
	
//2.  ������ ������ �̸��� ��� ����
//2.1 ���纻 ������ �̸��� ��θ� �Է� �޽��ϴ�.(��: .\a2.jpg)
//2.2 ������ ������ �ٽ� �Է¹���

//3.  �����ϱ�
//3.1 1byte�� ����&�̵��ϴ� ������� �մϴ�.
package global.sesoc.study191120;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy {

	public static void main(String[] args) {
		String 	fileNameCopyTarget=null;	//�������� ������ : filename1
		String 	fileNameCopyAnother=null;	//�������� ������ : filename2
		int 	temp;
		File 	fileFind =null;				//�������� ������ :file1
		File 	fileCopyAnother =null;		//�������� ������ :file1
		Scanner input = new Scanner(System.in);
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		
		//1.   ���� ����ã�� 
		//1.1. ���� ������ �̸��� ��θ� �Է¹޽��ϴ�.(��: \java\a.jpg)	
		//1.2. ������ ���ٰ� �Ǵܽ� �ٽ� �Է¹޽��ϴ�.
		while(true){
			System.out.println("�������ϸ�(���縦 �� ���)�� �Է����ּ���.");
			System.out.println("�Է� ��: \\java\\a.jpg (���ϸ����!)");	
			fileNameCopyTarget=input.nextLine();
			fileFind = new File(fileNameCopyTarget);				
			if(fileFind.isFile()){
				System.out.println("������ ����Ȯ�εǾ����ϴ�.");		
				break;
			}
			System.out.println("������ Ȯ�ε��� �ʾҽ��ϴ�. �ٽ� �Է����ּ���.");
		}//while END

		//2.  ������ ������ �̸��� ��� ����
		//2.1 ���纻 ������ �̸��� ��θ� �Է� �޽��ϴ�.(��: .\a2.jpg)
		//2.2 ������ ������ �ٽ� �Է¹���
		while(true){
			System.out.println("���纻�� ������� �Է��ϼ���.");
			System.out.println("�Է� ��: \\java\\a.jpg (���ϸ����!)");	
			fileNameCopyAnother=input.nextLine();

			if(fileFind.isFile()){
				fileCopyAnother = new File(fileNameCopyAnother);				
				System.out.println("������ ��������Ǿ����ϴ�.");		
				break;
				}
			System.out.println("�Ȱ��� ������ �ֽ��ϴ�. �ٽ� �Է����ּ���.");
		}//while END
		
		
		//3. ����� ��Ʈ�� ����
		try {
			inFile = new FileInputStream(fileFind);
			outFile = new FileOutputStream(fileCopyAnother);
		}		
		catch(FileNotFoundException error) {
			error.printStackTrace();
		}
		
		
		//4. 1����Ʈ�� ����
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
