/*
�ڵ���ó : SES �ڹٱ������� 142~143������ ����4.3-2
*/

public class VariableScope{
	private int i=0;		//private : �� Ŭ���� VariableScope �ܿ��� ������ i������ ���� �� �� ����.

	public void firstMethod(){
		int i=4;	//�������� i,j
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