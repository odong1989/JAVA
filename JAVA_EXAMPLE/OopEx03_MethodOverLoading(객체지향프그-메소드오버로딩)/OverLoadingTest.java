/*
	�ڵ���ó : SES�ڹ�å 148������
*/

public class OverLoadingTest{

	public int methodA(int a)
	{
		return a+10;
	}
	/*//�Ʒ��� �ڵ�¿����� �߻��Ѵ�.
	  //�����ε��� �Ķ���ͱ��� ���Ƽ��� �ȵǸ�,
	  //�������� �����ε��� ������ ������ ���� �ʴ´�.
	
	public double methodA(int a)
	{
		return a +12.5;
	}
	*/


	public double methodA(double a)
	{
		return a + 12.5;
	}


	public static void main(String[] args)
	{
		OverLoadingTest over = new OverLoadingTest();
		System.out.println("�����ε� int�� [over.methodA(10)] ȣ���� : " + over.methodA(10));
		System.out.println("�����ε� double�� [over.methodA(12.5)] ȣ���� : " + over.methodA(12.5));
	}

}