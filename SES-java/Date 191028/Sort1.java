//������ �����ϱ� ���� �����ϰ� ���� �ٲ��ִ� ���� �ǽ�.

class Sort1
{
	public static void main(String[] args) 
	{
		//������ ����
		int ar[] = {10,5, 1, 60, 35, 40, 90, 15, 10, 80};
		int temp=0;

		//���� ���� ���
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
			System.out.println("");

		//�� ��ȯ
		temp=ar[0];
		ar[0]=ar[1];
		ar[1]=temp;

		//����� ���� ���
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		

	}
}
