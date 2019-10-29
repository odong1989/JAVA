//interchangeSort : 교환정렬

class Sort1interchangeSort
{
	public static void main(String[] args) 
	{
		//변수등 선언
		int ar[] = {10,5, 1, 60, 35, 40, 90, 15, 3, 80};
		int temp=0;

		//현재 상태 출력
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
			System.out.println("");

		//값 교환
		//Benchmark : 기준점, 교환정렬시 비교의 기준이 되는 점.
		for (int Benchmark=0; Benchmark < ar.length ; Benchmark++ )
		{
			//Comparison : 비교점, 기준점과 비교를 위해 기준점이외의 나머지 배열들을 선택.
			//주의-Comparison의 초기값을 Comparison=1으로 주면 안된다.
			//ar[1]부터 정렬이 제대로 안먹히는 사태가 날 수 있다. 
			for (int Comparison=Benchmark+1; Comparison <ar.length ; Comparison++)
			{
				if(ar[Benchmark] > ar[Comparison])
				{
					temp=ar[Benchmark];
					ar[Benchmark]=ar[Comparison];
					ar[Comparison]=temp;

					for (int print=0; print <ar.length; print++)
					{		
						System.out.print(ar[print]+" ");
					}		
					System.out.println("");
				}//if end
			}//Comparison end
			System.out.println("");
		}//interchangeSort end

		//변경된 상태 출력
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
		System.out.println("");
	}
}
