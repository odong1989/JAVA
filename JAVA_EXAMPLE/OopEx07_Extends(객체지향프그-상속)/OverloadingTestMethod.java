public class OverloadingTestMethod
{
	/*�����ε� �޼ҵ��� Ư¡
	1)�޼��� �̸��� ����.
	2)argument List�� �ٸ���(����/Ÿ��/����)
	3)[����!] ��ȯ�Ǵ� ������Ÿ���� �����ε��޼ҵ�ʹ� ���谡 ����
	4)[����!] ��Ӱ� ������ ����
	*/
	public int methodA(int a){
		return a+10;
	}

	public int methodA(int a, int b){
		return a+b;
	}

	public double methodA(double a){
	//��ȯ�Ǵ� ������Ÿ���� �޼�������ε��� ��������ϴ�.
		return a+12.5;
	}

	public static void main(String[] args) 
	{
		OverloadingTestMethod over = new OverloadingTestMethod();
		System.out.println(over.methodA(10));
	}
}
