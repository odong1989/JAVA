/*
	��ó : SES �ڹ�å 157������
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
