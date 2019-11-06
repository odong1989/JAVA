/*
	출처 : SES 자바책 157페이지
*/
class StaticVariableEx
{
	public int serialNumber;
	public static int counter =0;

	public StaticVariableEx(){
		counter++;
		serialNumber = counter;
	}
}
