class ArrayTest4 
{
	public static void main(String[] args) 
	{
		//�迭 ������ �� �Է��ϴ� ���================================

		//���1 : ������ �������� �Է� �ǽ�.
		int a[];
		a = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;

		//���2 : {}��ȣ�� ����Ͽ� 1�ٷ� �����ϰ� ����ó��(#���1�̶� ����� ����.)
		int b[]={10,20,30};
		double c[] = {1.5, 3.14, 5.5, 3.3};
		char d[] = {'a', 'b', 'c'};
		// 10,20,30 ��� �� 4byte,
		// 1.5, 3.14���� �� 8byte,
		//'a'���� 2byte�� ũ�⸦ �����ϰ� �����ϴ�.
				
		
		//String�� ��ü�� ��ü�Դϴ�.
		//2�߹ݺ���ó��, ������ �񿣳�ó�� ã�ƶ����� ����(?)�� ���� �� �ִ�.
		//
		String e[] = {"aaa", "BBB", "CCC" };
		//e[] : String �迭�� �ּҸ� ���´�.
		//"aaa" : String�� �ּҸ� ���´�.
 		//		  (#�츮�� "aaa"���� ���������� �Ŀ����� �ּҰ��� ���� ��ũ�� ��.)

		
		for (int i=0; i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("");


		for (int i=0; i<b.length;i++)
		{
			System.out.println("b["+i+"]="+b[i]);
		}
		System.out.println("");


		for (int i=0; i<c.length;i++)
		{
			System.out.println("c["+i+"]="+c[i]);
		}
		System.out.println("");


		for (int i=0; i<d.length;i++)
		{
			System.out.println("d["+i+"]="+d[i]);
		}
		System.out.println("");


		for (int i=0; i<e.length;i++)
		{
			System.out.println("e["+i+"]="+e[i]);
		}
		System.out.println("");



	}
}