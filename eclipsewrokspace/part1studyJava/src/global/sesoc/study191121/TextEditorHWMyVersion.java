package global.sesoc.study191121;

	//�޸��尰�� �� ������ �����!
	/* [���� ��]
	 * ���ϸ� : adc
	 * ������ �Է��ϼ���. ����� ���ο� �࿡�� ���͸� �Ͻʽÿ�.
	 * �����ٶ�
	 * abcd
	 * (���ο� ���� ��ĭ��
	 * 
	 * ��Ʈ : �����ٶ� ���� ��ĳ�� ������ ���Źް�,
	 * ��ĳ�� ����-> ��Ʈ�� ���� -> ���Ͽ� �����۾�
	 * 
	 * ��Ʈ�� �ݰ�->�ȳ��޼��� ���->����
	 * */
	//step1. ���ϸ� �Է¹޾� File��ü�� �����մϴ�. �ִ� �̸��� �ٽ� �Է¹����ʽÿ�.
	//step2. ��½�Ʈ�� ����
	//step3. �ݺ������� �� �� �Է¹޾� �� �� �����մϴ�.
	//step4. �Է¾��� ���¿��� ����ġ�� �ݺ��� ����ȴ�.
	//step5. ��Ʈ���ݰ� ���α׷� ����

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
			
			//step1. ���ϸ� �Է¹޾� File��ü�� �����մϴ�. �ִ� �̸��� �ٽ� �Է¹����ʽÿ�.
			while(true){
			System.out.println("������ ���ϸ� : ");
			fileName=scan.nextLine();
			fileFind = new File(fileName);
			if(!fileFind.isFile()){
				System.out.println("���ϸ� ���Ͼ��� Ȯ��.");			
				break;
				}		
			System.out.println("���ϸ� ������ �ֽ��ϴ�. ���ϸ� ���Է����ּ���.");			
			}
		
		//step2. ��½�Ʈ�� ����
			try {
				writeContents = new BufferedWriter(new FileWriter(fileFind+"temp.txt"));
				fileNameCopyTarget=fileFind+"temp.txt"; //�ӽ����ϸ� ����
			}
			catch(IOException error){
				System.out.println("�ӽ����� ���� �� �����Դϴ�");
				error.printStackTrace();	
			}

				
		//step3. �ݺ������� �� �� �Է¹޾� �� �� �����մϴ�.
		//step4. �Է¾��� ���¿��� ����ġ�� �ݺ��� ����ȴ�.
		//step5. ��Ʈ���ݰ� ���α׷� ����
			try {
				System.out.println("������ �Է��ϼ���. ����� ���ο� �࿡�� ���� �Է��ϸ�˴ϴ�.");
				while(true){
					System.out.print(++numTextLine + ": ");
					text = scan.nextLine();
					writeContents.write(text);
					writeContents.newLine();
					
					if(text.equals("")){//1�������� �����ǻ�(��ĭ�� ���ͽ� �����ν�) üũ
						System.out.println("��ĭ �����Է� Ȯ�εǾ����ϴ�.");			
						System.out.print("�����Ͻðڽ��ϱ�?(y/n)");	
						text = scan.nextLine();						
						if(text.equals("y")) {//����� y, �������� �������ϸ��� �ִ°� Ȯ��, ���� ��� ����ڿ��� ����
							System.out.print("�����Ͻ� ���ϸ�� �ּ� : ");			
							fileName=scan.nextLine();
							fileFind = new File(fileName);
							if(!fileFind.isFile()){
								writeContents.close();//�ӽ������� �ݱ�&��������.										
								System.out.println("���ϸ� ���Ͼ��� Ȯ��. ���� �����մϴ�.");
								//�ӽ����Ͽ� ����Ȱ��� �������Ϸ� ����ǽ�-------------------------
								makeFile= new FileWriter(fileName+".txt");
								//3. ����� ��Ʈ�� ����
								try {
									inFile = new FileInputStream(fileNameCopyTarget);
									outFile = new FileOutputStream(fileName+".txt");
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
								makeFile.close();
								//�������Ϸ� ���� ����-----------------------
								
								System.out.print(fileFind.getName()+".txt" + "������ ����Ǿ����ϴ�.");
								System.out.print("���α׷� ����.");
								break;
								}		
							else {
								System.out.println("���ϸ� ������ �ֽ��ϴ�. ���ϸ� ���Է����ּ���.");	}							
						}//if(text.equals("y")) END
						if(text.equals("n")) {
						System.out.println("�������");		
						}

					}//if(text.equals("")) END
					

					
				}//while(true) END
			}//try END
			catch(IOException error) {
			System.out.println("���� ���� �� �����Դϴ�");
			error.printStackTrace();
			}
	}//main END
}//class END
