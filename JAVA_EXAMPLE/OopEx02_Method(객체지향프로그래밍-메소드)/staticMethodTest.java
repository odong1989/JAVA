/*
	출처 : SES 자바책 159페이지
	staticMethod클래스로 따로 두는 경우로 이해하고 실시.
*/

class staticMethodTest{
	public static void main(String[] args){
		staticMethod st = new staticMethod();	 
		st.go();

		//main메소드에서 바로 접근할 수 있다.
		staticMethod.goStatic();
		goStatic();
		System.out.println(goStatic());

		//불가능사항1 - go()는 객체를 선언하지 않으면 쓸수 없다.
		//System.out.println(go());


		//불가능사항2 - static int goStatic()는 this를 통한 참조는 불가능하다.
		//System.out.println(this.i);
	}



}