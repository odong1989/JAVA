package study191115;

import java.io.IOException;

public class ExTest5 {
	public static void main(String[] args) throws Exception{
		int a=0;
		 try {
			 a=sub();//����ó���� �����ϴ��ķ� ������ �ʴ´ٸ�(����ó�� ����ڸ� ����������) ������ ���ϰ� �Ѵ�.�׷���try-catch������ ������Ѵ�.
		 }
		 catch (IOException e) {
				e.printStackTrace(); //������ ����� ����ó����, ��ո���°� �������� �ȳ��α׸� �������ִ� �� ������
				//read�޼ҵ�� �ڽ��� �������ؼ��� ������ ����ó���� �ۼ��ϱ� �䱸�Ѵ�(���ߴٸ� ������  ���۸��ϰ� �� ����.)	
			}
		System.out.println(a);
	}

	public static int sub() throws Exception {//������ �߻��Ǹ� �� ȣ���� ������� �ٽ� �帮�ڽ��ϴ�.
		int ch;
		ch = System.in.read();//���ܸ� ����ؾ� �����۵��� �Ǳ⿡(Unhandled exception type IOException) ��
		return ch;
	}
	/*
	at study191115.ExTest5.sub(ExTest5.java:12)
	at study191115.ExTest5.main(ExTest5.java:6)
	f*/

}
