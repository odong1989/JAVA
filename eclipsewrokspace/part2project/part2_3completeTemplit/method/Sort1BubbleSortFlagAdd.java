//BubbleSort : ��������
//boolean�� Flag�� �߰��Ͽ� 
//������ �� �ʿ䰡 ���ٰ� �Ǵܵ� ��� ��������(break)�� �� �� �ֵ��� �����Ͽ���.
class Sort1BubbleSortFlagAdd
{
	public static void main(String[] args) 
	{
		//������ ����
		int ar[] = {10,5, 1, 60, 35, 40, 90, 15, 3, 80};
		int temp=0;
		boolean flag;
			

		//���� ���� ���
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
			System.out.println("");

		//�� ��ȯ
		//Benchmark : ������
		for (int Benchmark=ar.length; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : ����, �������� �񱳸� ���� �������̿��� ������ �迭���� ����.
			System.out.println("Benchmark : "+Benchmark);
			flag=true; //�������� ���������� Ȯ�ο�.

			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(ar[Comparison] > ar[Comparison+1])
				{
					temp=ar[Comparison];
					ar[Comparison]=ar[Comparison+1];
					ar[Comparison+1]=temp;
					flag=false; //�������� ���������� Ȯ�ο�.

					//���������� ��������� Ȯ������ �߰�üũ�� ��¹ݺ����Դϴ�.(���࿡ �������)-----------------------------------
					for (int print=0; print <ar.length; print++)
					{		
						System.out.print(ar[print]+" ");
					}		
					System.out.println("");
					//���������� ��������� Ȯ������ �߰�üũ�� ��¹ݺ����Դϴ�.(���࿡ �������)-----------------------------------

				}//if end
			}//Comparison end 
			//flag�� true�̸� ���̻� ������ �� �ʿ䰡 ������ �̸� �����Ѵ�.
			//flag�� flase�̸� ������ ������ �ؾ� �Ѵٴ� �ǹ��̴� ��������϶� �����Ѵ�.
			if(flag) break;

			
			
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