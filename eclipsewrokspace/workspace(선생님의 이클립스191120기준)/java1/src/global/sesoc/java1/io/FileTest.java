package global.sesoc.java1.io;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileTest {
	public static void main(String[] args) {
		File a = new File("\\Windows");
		File b = new File(".");
		File c = new File("./sub");
		File d = new File("a.txt");
		File e = new File("\\Java\\source\\Sort1.java");
		
		System.out.println(a.getAbsolutePath());
		System.out.println(b.getAbsolutePath());
		System.out.println(b.getParent());
		System.out.println(e.getName());
		
		System.out.println(a.exists());
		System.out.println(a.isFile());
		System.out.println(a.isDirectory());
		System.out.println(a.canRead());
		
		//���丮 ����
		if (c.mkdir()) 
			System.out.println(c.getName() + "�� ������");
		else
			System.out.println("���� ���� ����");
		
		//���� ����
		try {
			if (d.createNewFile()) 
				System.out.println(d.getName() + "�� ������");
			else
				System.out.println("���� ���� ����");
		} 
		catch (IOException e1) {
			System.out.println("���� ���� ����");
		}
		
		//���� ����
		d.delete();
		
		//���� �̸� ����
		File n = new File("b.txt");
		d.renameTo(n);
		
		//���� ���� ��������&������ �̸��� �о�´�
		String names[] = a.list();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//���� ���� ��������&������ ������ ���� File��ü���� �о�´�
		File files[] = a.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i].getName() + "\t");
			System.out.print(new Date(files[i].lastModified()) + "\t");
			System.out.print(files[i].length() + "bytes");
		}
		
		//a.getCanonicalPath()
		
		System.out.println();
		
	}
}







