/*
	출처 : SES 자바책 159페이지
	staticMethod클래스로 따로 두는 경우로 이해하고 실시.
*/

class staticMethod{
	int i =10;

	public void go(){
		int i = 1;
		System.out.println(this.i);
		System.out.println(i);
	}

	public static int goStatic(){
		//this 참조는 불가능 하다.
		int j = 2;
		System.out.println(j);
		return j;
	}

}