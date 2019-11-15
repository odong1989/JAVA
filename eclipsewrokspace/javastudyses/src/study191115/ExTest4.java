package study191115;
import java.io.IOException;

public class ExTest4 {

	//알파벳 한글자를 입력받고자 합니다.
	//자바의 키보드 객체 System.in.read(); 를 활용하여 처리합니다
	//(알파벳 1개정도는 Scanner를 쓰지않고도 처리가능합니다)

	public static void main(String[] args)throws IOException {
		int a=0;


//에러처리방법1 : try-catch를 통하여 에러처리하기.		
/*		try {
			System.out.println("알파벳 1글자만 입력해주세요");
			a = System.in.read();
		}
		catch(IOException error) 
		{
			//사용자에게 보여지는 에러안내문은 아래와같죠.
			System.out.println("error : IOException error");
			System.out.println("프로그램이 에러가 발생되었습니다. 고객님 죄송합니다.");			

			//개발자 본인의 디버깅을 위한, 로그를 위해서는 아래처럼 작성합니다.
			error.printStackTrace();//
		}
		//read()메소드느 Unhandled exception type IOException
		//즉,read()메소드는 자신이 실행되면 IOException을 무조건 던진다.
		//read()메소드 자신이 실행되었으니 예외처리를 무조건대비하라는 신호가 떨어지는 것이다.
*/
		
//에러처리방법2 : 나를 호출한 녀석에게 처리하라고 떠넘기기
//	public static void main(String[] args)throws IOException {
//  메인의 기본문장 바로 오른쪽에 "throws IOException"를 작성한다.
//즉, 메인메소드가 자신의 내에서 발생된 에러를 IOException에게 던져버리는 것이다.
//
//[?]IOException외의 에러들을 떠넘기고 싶으면 어떡하나요?
//	public static void main(String[] args)throws Exception {
//  이라고 하면됩니다.
//  물론... 권하지는 않아요.
//  이건 "전 에러처리 않을 거에요! 될대로 되라죠!" 급의 무책임이기 때문에...
//  특히 main에서 끝나버리기에 
		a = System.in.read();		
		System.out.println(a);
	
	}

}

/*	
 * try
 * catch
 * finally
 * throw
 * throws
 * 11월15일의 핵심은 이렇게 위의 5가지 키워드이죠.
 * 
 * 
 * 학생관리 student
 * 
 * 
 * */
