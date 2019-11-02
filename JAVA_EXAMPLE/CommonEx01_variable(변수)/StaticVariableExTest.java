/*
	출처 : SES 자바책 157페이지
*/
public class StaticVariableExTest
{
	public static void main(String[] args) 
	{
		StaticVariableEx count1 = new StaticVariableEx();	
		StaticVariableEx count2 = new StaticVariableEx();	
		StaticVariableEx count3 = new StaticVariableEx();	


		
		System.out.println("count1.serialNumber : " + count1.serialNumber);
		System.out.println("count2.serialNumber : " + count2.serialNumber);
		System.out.println("count3.serialNumber : " + count3.serialNumber);


		System.out.println("StaticVariableEx.counter : " + StaticVariableEx.counter );		

		System.out.println("count2.counter : " + count2.counter );				

	}
}
