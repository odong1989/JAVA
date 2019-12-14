package sutudy191118Exptionerror;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.io.IOException;

//책 358페이지 참고염~
public class FileTest {
	public static void main(String[] args) {
		
		File a =new File("\\Windows");//절대경로 설정입니다. c\Windows를 기준으로 잡도록 설정하는 경우입니다.
		File b =new File("testB.txt");//상대경로설정입니다. 현재경로(.)로 잡도록 합니다.	
		File c =new File("./subByFileC");//상대경로인데.. 없는 폴더인 경우죠.//폴더subByFileC라는 이름으로 현 위치내에서 생성합니다.
		
		File d =new File("makebyD.txt");
		
		File e =new File("e : "+ "C:\\Users\\user\\Documents\\JAVA\\SES-java\\새 폴더\\adressT.java");//절대경로로 실제로 있는 경로로 하는 경우		

		System.out.println("a : "+ a.getAbsolutePath());
		System.out.println("b : "+ b.getAbsolutePath());
		System.out.println(b.getParent());
		System.out.println("c : "+ c.getAbsolutePath());
		System.out.println("d : "+ d.getAbsolutePath());
		System.out.println("e : "+ e.getAbsolutePath());
		System.out.println(e.getName());
		
		//위에서 경로가 나온다고 해서 파일이 무조건 있는것은 아닙니다.
		//exists() 메소드를 통하여 존재여부를 확인합니다.
		System.out.println("a의 실존여부 : "+a.exists());
		System.out.println("a는 파일인가? : "+a.isFile());
		System.out.println("a의 경로 : "+a.isDirectory());	
		System.out.println("a의 이름 : "+a.getName());
				
		System.out.println("b파일 실존여부 : "+b.exists());
		System.out.println("c파일 실존여부 : "+c.exists());
		System.out.println("d파일 실존여부 : "+d.exists());
		if(d.exists()==false) {
			try {
			d.createNewFile();
			}
			catch(IOException error) {
				System.out.println("IOException error-d.createNewFile");
			}
		}	
		
		System.out.println("e파일 실존여부 : "+e.exists());
		
		if(c.mkdir()) {//c.mkdir()이 boolean값을 리턴하기에 이를 활용하여 조건문으로 확인한다.
			System.out.println(c.getName()+"이 생성되엇습니다.");
		}
		else
			System.out.println("폴더 생성 실패");			

		if(d.mkdir()) {//c.mkdir()이 boolean값을 리턴하기에 이를 활용하여 조건문으로 확인한다.
			System.out.println(d.getName()+"이 생성되엇습니다.");
		}
		else
			System.out.println("폴더 생성 실패");		
		//파일생성
		try {
			if(d.createNewFile()) 
				{
				System.out.println(d.getName()+"이 생성되엇습니다.");
				}
			else
				System.out.println(d.getName()+"파일 생성 실패");
		}
		catch(IOException e1) {
			System.out.println("파일 생성 실패");
		}
		
		//파일 삭제
		d.delete();
		
		//파일 이름변경
		File n=new File("makebyD.txt"); //File d와 똑같은 것을 가리키도록 한다.는 의도인데.. 
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
