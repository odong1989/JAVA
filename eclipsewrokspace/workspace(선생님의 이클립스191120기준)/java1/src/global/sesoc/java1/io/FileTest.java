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
		
		//디렉토리 생성
		if (c.mkdir()) 
			System.out.println(c.getName() + "이 생성됨");
		else
			System.out.println("폴더 생성 실패");
		
		//파일 생성
		try {
			if (d.createNewFile()) 
				System.out.println(d.getName() + "이 생성됨");
			else
				System.out.println("파일 생성 실패");
		} 
		catch (IOException e1) {
			System.out.println("파일 생성 실패");
		}
		
		//파일 삭제
		d.delete();
		
		//파일 이름 변경
		File n = new File("b.txt");
		d.renameTo(n);
		
		//폴더 안의 서브폴더&파일의 이름을 읽어온다
		String names[] = a.list();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//폴더 안의 서브폴더&파일의 정보를 담은 File객체들을 읽어온다
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







