//SES java book197page
/*API������ ����
Modifier and Type		/	Method and Description 
boolean					/	 equals(Object obj) 
							Indicates whether some other object is "equal to" this one 
*/
public class StringEquals
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello"); 
		String s2 = "Hello";			//�Ѵ� �Ȱ��� �����̴�. s1����� �����̰�, s2����� ������������� �����ڸ� �������� ��.
		
		if(s1 == s2){
			System.out.println("[�ܼ�IF��]���ڿ�s1�� ���ڿ�s2�� ����.");		
		}
		else{
			System.out.println("[�ܼ� if��] �ܼ� if�񱳷δ� String�� �񱳰� �ƴ϶� �ּҺ񱳰� ���� �� �� �ִ�. \n");
		}
		

		System.out.println("equals()�޼ҵ带 Ȱ���Ͽ���. �� s1.equals(s2) ���� �񱳽ǽ�.");		
		if(s1.equals(s2)){
			System.out.println("[equalsȰ���� if��]���ڿ�s1�� ���ڿ�s2�� ����.");		
		}
		else{
			System.out.println("equals()�޼ҵ�ε� �ȵǸ� ������ ����.");
		}		
	}
}