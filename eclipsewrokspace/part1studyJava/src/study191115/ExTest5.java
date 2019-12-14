package study191115;

import java.io.IOException;

public class ExTest5 {
	public static void main(String[] args) throws Exception{
		int a=0;
		 try {
			 a=sub();//에러처리를 누가하느냐로 결정을 않는다면(예외처리 담당자를 설정않으면) 실행을 못하게 한다.그래서try-catch문장을 ㅁ사용한다.
		 }
		 catch (IOException e) {
				e.printStackTrace(); //억지로 만드는 에러처리문, 기왕만드는거 에러정보 안내로그를 전송해주는 걸 만들자
				//read메소드는 자신을 쓰기위해서는 무조건 에러처리를 작성하길 요구한다(안했다면 에러로  싱핼목하게 할 정도.)	
			}
		System.out.println(a);
	}

	public static int sub() throws Exception {//에러가 발생되면 절 호출한 상관에게 다시 드리겠습니다.
		int ch;
		ch = System.in.read();//예외를 대비해야 정상작동이 되기에(Unhandled exception type IOException) 예
		return ch;
	}
	/*
	at study191115.ExTest5.sub(ExTest5.java:12)
	at study191115.ExTest5.main(ExTest5.java:6)
	f*/

}
