import java.util.Scanner;
class StringTest3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String email;
		String id;
		int idx;

		System.out.print("이메일 주소 : ");//abcd@mail.com
		email = in.nextLine();

		idx = email.indexOf('@');
		if(idx == -1){
			//indexOf에서 찾는 단어가 없을경우 -1(false)가 출력된다.
			System.out.println("Email형식이 아닙니다");
		}
		else{
			id = email.substring(0,idx);
			System.out.println("ID는" + id + "입니다.");
		}
	}
}
