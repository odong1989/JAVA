package global.sesoc.study191119;

import java.io.FileWriter;
import java.io.BufferedWriter;//�̹����� 1ȸ���� �ƴ϶� ��� ���ο� �Է��� �����ɶ������� �ݿ��� �ϰ� �ʹ�!!
import java.io.IOException;

public class IOTest5 {
	public static void main(String[] args) {
		//step1.��������
		BufferedWriter makeFile = null;
		String filename="makeByBufferedWriter.txt";
		
			try {
				makeFile = new BufferedWriter(new FileWriter(filename));
				//BufferedWriter�� FileWriter�� �ŵ���ִ� �����̶�� ������ �� �ִ�.
				//��������� ��Ƽ� ������ ä�õ �����ϴ�.
				makeFile.write(100);
				makeFile.write("srhwtraeaoijeriosdfjod");
				makeFile.write("\n");//����� ������ �ʴ� ����̴�.
				makeFile.write("���Ϲݾ� ");
				makeFile.write("AaA");
				makeFile.newLine();//����� �ǰ��ϴ� ����Դϴ�.
				makeFile.write("������");

				/*[�ñ�  ����] "\n"���� �����ϸ� �ȵ˴ϱ�?
				 *[�亯&Tip] ��������� �ٸ� �ý��ۿ� ����Ϸ� �� ��츦 ����Ͽ� 
				 *          newLine();�� Ȱ���մϴ�. 
				 *          �������� ��� "\r\n"���� �Է��ϸ� ���������� Ÿ �ý��۵��� �������� �ٸ���. 
				 *          ������ý��� ������ 
				 * */
				makeFile.close();
				System.out.println("makeByBufferedWriter.txt ������ ��������Ǿ����ϴ�.");
			}
			catch(IOException error) {
				error.printStackTrace(); 
			}
	}

}
