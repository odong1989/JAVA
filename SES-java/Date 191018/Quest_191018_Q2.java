class Quest_191018_Q2 
// ����2. 100�� ��� ����� ����ϼ���.
{
	public static void main(String[] args) 
	{			
		System.out.println("����2. 100�� ��� ����� ����ϼ���.");

		// measure : ���
		for(int measure=1; measure <=100 ;measure++)
		{
			if(100%measure == 0)
			{
				System.out.print(measure+" ");
			}
		}
	}
}