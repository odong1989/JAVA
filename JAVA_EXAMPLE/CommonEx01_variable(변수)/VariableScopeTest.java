public class VariableScopeTest{
/*
	private int i;

	public void firstMethod(){
		int i=4;
		int j=5;
		this.i = i+j;
		System.out.println("first i =" + this.i); //9
		secondMethod(7);
	}

	public void secondeMethod(int 
	i){
		
	int j=8;
	this.i = i+j;
	System.out.println("Second i = " + this.i);
	}
*/
	public static void main(String[] args)
	{
	VariableScope scope = new VariableScope();
	scope.firstMethod();
	}

}