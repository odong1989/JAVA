import java.util.Scanner;

class StringTest3_alpha 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String fileName;
		String ext;
		int dot;

		System.out.print("파일명 : ");//190101.홍길동이력서.hwp 같이 점이 여러개면 마지막꺼로 확인하도록.
		fileName = in.nextLine();

		/*
			나는 for문을 활용하여 전체의 길이를 확인한 다음,
			일일이 확인하여 배열에 저장 후 비교하는 방식으로 가려했는데
			자바의 api LastIndexOf()를 활용하면 손쉽게 해결됨... ㅜ.ㅜ
		*/
		dot = fileName.lastIndexOf('.');
		ext = fileName.substring(dot+1);
		System.out.println("확장자는" + ext + "입니다.");

	}
}
