class LoopTest2
{
	/*
	0 0 0 0 0
	1 1 1 1 1
	2 2 2 2 2
	3 3 3 3 3
	4 4 4 4 4
	*/
	public static void main(String[] args) 
	{

		for(int i=0;i<5;i++)
		{
			for(int j =0;j<5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");

		
	/*
	1 1 1 1 1
	2 2 2 2 2
	3 3 3 3 3
	4 4 4 4 4
	5 5 5 5 5
	*/	
		for(int i=1;i<=5;i++)
		{
			for(int j =0;j<5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");


	/*
	1 2 3 4 5
	2 3 4 5
	3 4 5
	4 5
	5
	*/	
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");

	/*
	5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1
	*/	
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");

	/*
	1 2 3 4 5
	2 3 4 5 6
	3 4 5 6 7
	4 5 6 7 8
	5 6 7 8 9
	*/	
		int PrintNUM;
		for(int i=0;i<5;i++)
		{
			PrintNUM=i;
			for(int cnt=1;cnt<=5;cnt++)
			{
				PrintNUM++;
				System.out.print(PrintNUM+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");



		int[] array={0,1,2,3,4};
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println("\n=================================");
	
		double[] da =new double[3];
		da[0]=1.5;
		da[1]=3.3;

		array = new int[10];
		array = null;

		//new 생략하고 값 입력까지 실시.
		int ia[]={1,2,3};
		double da2[] = {1.0, 3.5, 6.9, 8.8};
		char ca[] = {'a','b','c','d','e'};
		String sa[]={"aaa","sdkg","wefew"};

		int total=0;
		for(int i=0;i<ia.length;i++)
		{
			System.out.println(ia[i]);
			total+=ia[i];
		}
		System.out.println(total);


		for(int i=0;i<ca.length;i++)
		{
			System.out.print(ca[i]+"  ");
		}

	}
}
