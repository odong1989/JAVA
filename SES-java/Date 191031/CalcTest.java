//CalcŬ������ ��ü�� �������(�׽�Ʈ)�ϴ� Ŭ�����Դϴ�.

class CalcTest
{
	public static void main(String[] args) 
	{
		Calc calTest = new Calc();
		int a[] = {1,2,3,4,5};
		calTest.setArray(a);
		System.out.println();

		int cnt = calTest.count();
		System.out.println("���� : "+ cnt );

		int sum = calTest.sum();
		System.out.println("�հ� : " + sum);


		calTest.sumAll(100);


		
		System.out.println("�ŵ����� ��� : " + calTest.power(2,3) );	
	}
}