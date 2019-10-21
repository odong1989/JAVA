class ArrayTest4 
{
	public static void main(String[] args) 
	{
		//배열 선언후 값 입력하는 방법================================

		//방법1 : 일일이 낱개마다 입력 실시.
		int a[];
		a = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;

		//방법2 : {}괄호를 사용하여 1줄로 간결하게 선언처리(#방법1이랑 결과는 같다.)
		int b[]={10,20,30};
		double c[] = {1.5, 3.14, 5.5, 3.3};
		char d[] = {'a', 'b', 'c'};
		// 10,20,30 경우 각 4byte,
		// 1.5, 3.14등은 각 8byte,
		//'a'등은 2byte의 크기를 균일하게 갖습니다.
				
		
		//String은 자체가 객체입니다.
		//2중반복문처럼, 줄줄이 비엔나처럼 찾아떠나는 모험(?)을 맛볼 수 있다.
		//
		String e[] = {"aaa", "BBB", "CCC" };
		//e[] : String 배열의 주소를 갖는다.
		//"aaa" : String의 주소를 갖는다.
 		//		  (#우리는 "aaa"으로 저장했지만 컴에서는 주소값만 갖고 링크한 셈.)

		
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
