/*
 * 191115일 수업-예외처리관련 수업입니다.
 * */

package study191115;

//예외처리 예제
public class ExTest1 {
	public static void main(String[] args)
	{
		//part1.변수 선언 및 초기값 설정하는 구간.
		String a= "11";//이처럼 공백외에도 숫자로 바꿀 수없는 값이 입력된 경우
		String b= "0";
		int i,j,k;
		
		//part2.입력된 값들을 처리하는 구간.
		//part3.에러처리를 하는구간.
		//try : 예외가 발생할 소지가 있는 구간을 설정합니다.
		try {
			i=Integer.parseInt(a);
			j=Integer.parseInt(b);
			k=i/j;
			System.out.println(k);
		}		

		catch(NumberFormatException e) {//입력값이 숫자가 아닌 경우(null포함)
			System.out.println("숫자가 아닙니다");
		}
		
		catch(ArithmeticException e) {//나누는 값(b)이 0인경우
			System.out.println("나누는 값(b)를 0으로 하지마세요.");		
			//return;//return을 써도 finally까지 실행됩니다.`
			//System.exit(0);//System.exit(0);는 finally를 실행하지 않고 바로 종료해버려요.
			//[?]왜 리턴등을 따집니까?
			//지금하는 프로그램을 완전 종료해야 할 수도 있고,
			//반복문 내에 있을시 현재의 프로세스만 뛰어넘어야 하는 경우도 있죠.
			//그러한 상황을 가정하여 해보는 겁니다.
		} 
		catch(Exception e) {//이외의 에러들이 나올경우입니다. 
			//Exception클래스가  NumberFormatException,ArithmeticException보다
			//상위의 클래스이기에 나중에 catch문을 작성하게 됩니다.
			//API문서의 Tree를 보고 상위 클래스일수록catch를 나중에 작성하세요.
			//그래야 세밀하게 예외처리를 할 수 있습니다. 상위클래스가 먼저 나올수록 예외처리가 약해집니다.
			
			System.out.println("그 밖의 에러입니다.");		
			return;
		} 
			
		finally{
			System.out.println("finallyBlock");			
		}

		System.out.println("프로그램을 종료합니다.");
		//System.out.println("프로그램을 종료합니다.");이 실행안되는 경우는 아래와 같죠.
		//경우1 : 중간에 에러가 나서 실행을 못한경우.
		//경우2 : catch에서 return을 하거나, exit(0)를 하여 프로그램을 중간에 종료시킨 경우
	}
}
