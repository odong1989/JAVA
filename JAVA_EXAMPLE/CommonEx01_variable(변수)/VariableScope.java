/*
코드출처 : SES 자바교육서적 142~143페이지 예제4.3-2
*/

public class VariableScope{
	private int i=0;		//private : 본 클래스 VariableScope 외에는 누구도 i변수에 손을 댈 수 없다.

	public void firstMethod(){
		int i=4;	//지역변수 i,j
		int j=5;
		this.i = i+j;
		System.out.println("first i =" + this.i); //9
		secondMethod(7);
	}

	public void secondMethod(int i){
		
	int j=8;
	this.i = i+j;
	System.out.println("Second i = " + this.i);
	return ;
	}

	public static void main(String[] args)
	{
	VariableScope scope = new VariableScope();
	scope.firstMethod();
	}
}