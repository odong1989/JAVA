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

package global.sesoc.study191120;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class TextEditor {
	public static void main(String[] args) {
	String 			fileName		=null;
	Scanner 		scan			=new Scanner(System.in);
	File 			fileFind 		= null;
	BufferedWriter 	writeContents	= null;
	int 			numTextLine		=0;
	String 			text			=null;
	
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
			writeContents = new BufferedWriter(new FileWriter(fileFind));
		}
		catch(IOException error){
			System.out.println("���� ���� �� �����Դϴ�");
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
				if(text.equals("")){
					System.out.println("�����Է� Ȯ�εǾ����ϴ�.�����մϴ�.");			
					break;
				}
				/*[����] �����Է�Ȯ�ν� NG���
				 * 1) null������  �񱳸� �ϴ� ���
				 * 2) length()�� Ȯ���ϴ� ���
				 * 3) isEmpty()�� Ȯ���ϴ� ���
				 * ���ʹ� ��ü���� ���ٴ� �������� ���� NG��ʵ�δ� �����Է��� Ȯ���� �� ���ٰ� �Ѵ�.
				 * */
				
				writeContents.write(text);
				writeContents.newLine();
			}
			writeContents.close();
			System.out.print(fileFind.getName() + "������ ����Ǿ����ϴ�.");
		}
		catch(IOException error) {
			System.out.println("���� ���� �� �����Դϴ�");
			error.printStackTrace();
		}
	}
}
