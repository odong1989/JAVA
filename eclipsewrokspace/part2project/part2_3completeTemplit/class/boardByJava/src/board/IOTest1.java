package study191119;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest1 {
	public static void main(String[] args) {
	//--Step1. File Ŭ���� ��ü�� �����Ͽ� ��ǥ������ ���縦 Ȯ��.---------------------------------------
		File file = new File("C:\\Users\\user\\Documents\\JAVA\\eclipsewrokspace\\part2project\\part2_3completeTemplit\\class\\boardByJava\\src\\textIOTest1.txt");
//		File file = new File("C:\\SES study store\\ExTest2.java");
		if(!file.isFile())//������ ���ų�,���Ϸμ� ������� ���
		{ System.out.println(file.getName()+"������ �����ϴ�.");
		}
		else {System.out.println(file.getName()+"������ ������ Ȯ���Ͽ����ϴ�.");
		}
		
		//FileInputStreamŬ������
		//���1. �ּҸ� �˷��ִ� ���
		//FileInputStream inFile (���µ� ���̾�... ��.��)
		//���2. �ش������� ����Ű�� ��ü(File file)�� Ȱ���Ͽ� ����
		FileInputStream inFile = null;//try�� ���� ������� ������ try�� �ۿ����� �Ҹ�Ǿ� ������.
		try {
		     inFile = new FileInputStream(file);
			/*[?]���������� ó���ߴµ� �Ʒ��� ������ ������?
			 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			 * Unhandled exception type FileNotFoundException
			  [!]"����ó���� ������!"��� �ǹ��Դϴ�.
			         ����ó���� �ǹ������� �ϵ��� �����Ǿ��ֱ⿡ ����ó���� �ۼ����� ������ ������ ��޵˴ϴ�.
			      try-catch���� Ȱ���Ͽ� ����ó���� �����ϼ���.
			 */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int n;
			try {
				while(true) {
				n = inFile.read();//�� 1����Ʈ��! �о�ɴϴ�.
								  //�ؽ�Ʈ���Ͽ��� "A��"��� ������ �ִµ� �Ǿձ����� 'A'�� �д� ������.
				if(n== -1 ) break;
				System.out.print(n+",");
				if(n==13) System.out.println("");
				/*
				//1����Ʈ�� ��� �о��(#�����ϰ� ������ ������)
				System.out.println((char)n);//char������ ����ȯ�Ͽ� �ƽ�Ű�ڵ��ȣ���� ���ڷ� ��ȯ.
		
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);
				n = inFile.read(); System.out.println((char)n);		
				n = inFile.read(); System.out.println(n);
				*/
				}
			}
			catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

