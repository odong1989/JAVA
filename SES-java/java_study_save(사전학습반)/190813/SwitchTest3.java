
import java.util.Scanner;
/*
   3. 태어난 해를 입력받아 띠를 출력한다(1989년 -> 뱀띠)
[조언] 기준년도를 확인후 %12 나머지연산을 활용하여 띠를 확인한다.
*/
class SwitchTest3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str=null;
		//y 또는 n을 입력받기 위해서 스트링변수

		System.out.println("계속 하시겠습니까?(y/n)");
		str = input.next(); // input.nextLine();으로도 문자열 입력받기 가능.


		switch(str){
			case "Y" :
			case "y" : System.out.println("YES를 선택하셨습니다.");
					break;
			//break전까지는 멈추지 않는 특성을 활용하여 
			case "N" :
			case "n" : System.out.println("NO를 선택하셨습니다.");
					break;
			default : System.out.println("only \"y \" or \"n \" ");
					break;

		}
	}
}
