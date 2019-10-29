//정렬을 연습하기 위해 간단하게 값을 바꿔주는 연습 실시.

class Sort1
{
	public static void main(String[] args) 
	{
		//변수등 선언
		int ar[] = {10,5, 1, 60, 35, 40, 90, 15, 10, 80};
		int temp=0;

		//현재 상태 출력
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
			System.out.println("");

		//값 교환
		temp=ar[0];
		ar[0]=ar[1];
		ar[1]=temp;

		//변경된 상태 출력
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		

	}
}
