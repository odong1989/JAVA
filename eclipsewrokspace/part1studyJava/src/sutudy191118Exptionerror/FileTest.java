package sutudy191118Exptionerror;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.io.IOException;

//å 358������ ����~
public class FileTest {
	public static void main(String[] args) {
		
		File a =new File("\\Windows");//������ �����Դϴ�. c\Windows�� �������� �⵵�� �����ϴ� ����Դϴ�.
		File b =new File("testB.txt");//����μ����Դϴ�. ������(.)�� �⵵�� �մϴ�.	
		File c =new File("./subByFileC");//������ε�.. ���� ������ �����.//����subByFileC��� �̸����� �� ��ġ������ �����մϴ�.
		
		File d =new File("makebyD.txt");
		
		File e =new File("e : "+ "C:\\Users\\user\\Documents\\JAVA\\SES-java\\�� ����\\adressT.java");//�����η� ������ �ִ� ��η� �ϴ� ���		

		System.out.println("a : "+ a.getAbsolutePath());
		System.out.println("b : "+ b.getAbsolutePath());
		System.out.println(b.getParent());
		System.out.println("c : "+ c.getAbsolutePath());
		System.out.println("d : "+ d.getAbsolutePath());
		System.out.println("e : "+ e.getAbsolutePath());
		System.out.println(e.getName());
		
		//������ ��ΰ� ���´ٰ� �ؼ� ������ ������ �ִ°��� �ƴմϴ�.
		//exists() �޼ҵ带 ���Ͽ� ���翩�θ� Ȯ���մϴ�.
		System.out.println("a�� �������� : "+a.exists());
		System.out.println("a�� �����ΰ�? : "+a.isFile());
		System.out.println("a�� ��� : "+a.isDirectory());	
		System.out.println("a�� �̸� : "+a.getName());
				
		System.out.println("b���� �������� : "+b.exists());
		System.out.println("c���� �������� : "+c.exists());
		System.out.println("d���� �������� : "+d.exists());
		if(d.exists()==false) {
			try {
			d.createNewFile();
			}
			catch(IOException error) {
				System.out.println("IOException error-d.createNewFile");
			}
		}	
		
		System.out.println("e���� �������� : "+e.exists());
		
		if(c.mkdir()) {//c.mkdir()�� boolean���� �����ϱ⿡ �̸� Ȱ���Ͽ� ���ǹ����� Ȯ���Ѵ�.
			System.out.println(c.getName()+"�� �����Ǿ����ϴ�.");
		}
		else
			System.out.println("���� ���� ����");			

		if(d.mkdir()) {//c.mkdir()�� boolean���� �����ϱ⿡ �̸� Ȱ���Ͽ� ���ǹ����� Ȯ���Ѵ�.
			System.out.println(d.getName()+"�� �����Ǿ����ϴ�.");
		}
		else
			System.out.println("���� ���� ����");		
		//���ϻ���
		try {
			if(d.createNewFile()) 
				{
				System.out.println(d.getName()+"�� �����Ǿ����ϴ�.");
				}
			else
				System.out.println(d.getName()+"���� ���� ����");
		}
		catch(IOException e1) {
			System.out.println("���� ���� ����");
		}
		
		//���� ����
		d.delete();
		
		//���� �̸�����
		File n=new File("makebyD.txt"); //File d�� �Ȱ��� ���� ����Ű���� �Ѵ�.�� �ǵ��ε�.. 
		d.renameTo(n);					//
		
		System.out.println(n.isDirectory());
		System.out.println(d.getName());		
		
		String names[] = a.list();
		for(int i=0; i<names.length;i++) {
			System.out.println("names["+i+"] :" +names[i]);
		}
			
		
		File files[] = a.listFiles();
		for(int cell=0; cell<files.length ;cell++) {
			System.out.println(files[cell].getName() +"\t" );						
			System.out.println(new Date(files[cell].lastModified()) +"\t" );
			System.out.println(files[cell].length() +"\t" );
		}
			
		System.out.println();			
		
		
		
	}	
}
