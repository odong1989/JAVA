//interchangeSort : ��ȯ����

class Sort1interchangeSort
{
	public static void main(String[] args) 
	{
		//������ ����
		int ar[] = {10,5, 1, 60, 35, 40, 90, 15, 3, 80};
		int temp=0;

		//���� ���� ���
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
			System.out.println("");

		//�� ��ȯ
		//Benchmark : ������, ��ȯ���Ľ� ���� ������ �Ǵ� ��.
		for (int Benchmark=0; Benchmark < ar.length ; Benchmark++ )
		{
			//Comparison : ����, �������� �񱳸� ���� �������̿��� ������ �迭���� ����.
			//����-Comparison�� �ʱⰪ�� Comparison=1���� �ָ� �ȵȴ�.
			//ar[1]���� ������ ����� �ȸ����� ���°� �� �� �ִ�. 
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

		//����� ���� ���
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
		System.out.println("");
	}
}
