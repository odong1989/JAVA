class ArrayTest6 
{
	public static void main(String[] args) 
	{
		int ar[] = new int[6];

/*
		//�������� ä�����ô�.(���� : 1~45)
		for(int i=0; i<6; i++)
		{
			ar[i] = (int)(Math.random()*45)+1 ;//�������� : 1~45
	
			//�� ���������� ��� ����
			//���� ���� �߰ߵ� ��� 
			//���� ���ڸ� �ٽ� �����Ͽ� �����ϵ��� �ϼ���.
			for(int j=0; j < i; j++)
			{
				if(ar[j] == ar[i]){
					ar[i] = (int)(Math.random()*45)+1 ;//�������� : 1~45
				}
			}	
		}
*/


		//�������� ä�����ô�.(���� : 1~45)
		for(int i=0; i<6; i++)
		{
			ar[i] = (int)(Math.random()*6)+1;
	
			for(int j=0; j < i; j++)
			{
				if(ar[j] == ar[i])
				{
					i--;
					break;
				}
			}	
		}
			
		//������� Ȯ����¿�.
		for(int k=0; k<6; k++)
		{
			System.out.print(ar[k]+" "); 
		}
	
	}
}
