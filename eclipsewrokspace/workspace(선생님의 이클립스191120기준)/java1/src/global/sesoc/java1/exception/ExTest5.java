package global.sesoc.java1.exception;

import java.io.IOException;

public class ExTest5 {

	public static void main(String[] args) {
		int a = 0;
		try {
			a = sub();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(a);

	}
	
	public static int sub() throws Exception {
		int ch = 0;
		ch = System.in.read();
		return ch;
	}

}


