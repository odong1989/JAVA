class LoopTest1 
{
	public static void main(String[] args) 
	{
		out_Dfor:
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(j==2) break out_Dfor;
				//
				System.out.println("i=" +i+ ", J=" +j); //3
			}
		System.out.println("");
		}

	}
}
