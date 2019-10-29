import java.util.Scanner;

class APItest1WebID
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		String email;

		System.out.print("이메일 입력 : ");
		email = scan.next();//.next() : 빈칸없는 String문자열을 받습니다.
			

		//이메일을 출력하시오.
		System.out.println(email);
	
		 //문자열 길이를 출력하시오.
		System.out.println(email.length());


		//이멜제대로 썼는지 확인('@'1개와 '.(점);1개 포함되어 있는지를 확인하시오.

		//---------------------------------------------------------------------------------------------
		//ID만 출력해주세요.[힌트]찾는 문자가 없을 시 -1이 리턴됩니다.
		if(email.indexOf('@')!=-1 &&email.indexOf('.') != -1)
		System.out.println("이메일 주소가 정상입력되었습니다.");
		else 
		System.out.println("잘못된 주소입니다.");

		//선생님께서 하신 스타일(3번아이디출력)
		System.out.println(email.contains("@")&& email.contains("."));
		//---------------------------------------------------------------------------------------------

		//ID만 출력해주세요.
		System.out.println(email.substring(0,email.indexOf('@')));		
		//선생님께서 하신 스타일(4번아이디출력)
		String s[] = email.split("@");	//split(입력한 글자를 기준으로 나누기 처리)한 다음 s배열에 저장시켰다.(걍 String형으로 저장하려 하면 에러남. 배열로 하라고..)
		System.out.println(s[0]);		

	}
}
