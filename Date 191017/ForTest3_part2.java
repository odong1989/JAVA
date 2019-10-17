

class ForTest3_part2 
{
	public static void main(String[] args) 
	{
		/*
		(ex1)
		*
		**
		***
		****
		*****
		-------------------
		(ex2)
		*****
		****
		***
		**
		*
		---------------------
		(ex3)
			*
		   **
		  ***
		 ****
		*****
		-----------------------
		(ex4)
		*****
		 ****
		  ***
		   **
			*
		---------------------
		(ex5)
			  *
			 ***	
			*****
		   *******
		  *********	
		---------------------
		(ex6)
			 *
			***
		   *****
			***
             *
		----------------------
		*/

/***************************************************************************************************************************/
		/*
		(ex1)
		*
		**
		***
		****
		*****
		*/
		System.out.println("ex1");
		for(int i =0; i<5;i++)
		{
			for(int j=0 ; j<=i ;j++)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------------------\n");
		/*
		(ex2)
		*****
		****
		***
		**
		*
		*/
		System.out.println("ex2");
		for(int i =0; i<5;i++)
		{
			for(int j=5 ; j>=i ;j--)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------------------\n");

		/*
		(ex3)
			*
		   **
		  ***
		 ****
		*****
		*/

		System.out.println("ex3");
		char output=0;
		for(int i =4; i>=0;i--)
		{
			for(int j=0; j<=4 ;j++)
			{
			output= j>=i ? '*' : ' ';
			System.out.print(output);
			}

			System.out.println("");
		}
		System.out.println("----------------------\n");

		/*
		(ex4)
		*****
		 ****
		  ***
		   **
			*
		*/
		System.out.println("ex4");
		int count_exe=0;
		for(int i =0; i<=4 ; i++)
		{
			count_exe=0;
			for(int j=0; count_exe<=4 ;j++)
			{
			output= j>=i ? '*' : ' ';
			System.out.print(output);
			count_exe++;
			}

			System.out.println("");
		}
		System.out.println("----------------------\n");

		/*
		(ex5)
			  *
			 ***	
			*****
		   *******
		  *********	
		*/
		System.out.println("ex5");
		for(int line_x =0; line_x<=3 ; line_x++)
		{
			//������ ���ﰢ��
			for(int nothing=2; nothing>=line_x ; nothing--)
			{
				System.out.print(" ");
			}

			//���� �ﰢ��
			for(int star=1+2*line_x; star>0;star--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------------------\n");


		/*
		(ex6)
			 *
			***
		   *****
			***
             *
		*/
		System.out.println("ex6");
		//��Ʈ1_���� 1->5���� �����ϴ� �κ�.
		for(int line_x =0; line_x<=2 ; line_x++)
		{
			//������ ���ﰢ��
			for(int nothing=2; nothing>line_x ; nothing--)
			{
				System.out.print(" ");
			}
			//���� �ﰢ��
			for(int star=1+2*line_x; star>0;star--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		//��Ʈ1_���� 5->1���� �����ϴ� �κ�.
		for(int line_x =0; line_x<=1 ; line_x++)
		{
			//������ ���ﰢ��
			for(int nothing= line_x+1 ; nothing>0 ; nothing--)
			{
				System.out.print(" ");
			}
			//���� �ﰢ��
			for(int star=3-2*line_x; star>0;star--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}//main end
}//class end
