class LoopTest2 
{
	public static void main(String[] args) 
	{

	//--------------------------------------------------------------------------------------------------------
	//(0)�Ϲ����� ���߹ݺ���(�߰��������)

		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("break Ȱ�� ����");
	System.out.println("=======================================================================================");

	/*
	0)break���� ������ ����� ���
	i=0,j=0 | i=0,j=1 | i=0,j=2 | i=0,j=3 | i=0,j=4 |
	i=1,j=0 | i=1,j=1 | i=1,j=2 | i=1,j=3 | i=1,j=4 |
	i=2,j=0 | i=2,j=1 | i=2,j=2 | i=2,j=3 | i=2,j=4 |
	i=3,j=0 | i=3,j=1 | i=3,j=2 | i=3,j=3 | i=3,j=4 |
	i=4,j=0 | i=4,j=1 | i=4,j=2 | i=4,j=3 | i=4,j=4 |
	���α׷� ����
	*/

	//--------------------------------------------------------------------------------------------------------
	//(1)break Ȱ��

		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
					break;
					/*���⼭ ���� �򰥸��� ���ƾ� �� ���� 
					  (X) break ��� = ���α׷��� ���� 
					  (��) break ��� = break�� �ִ� �ݺ����� ���� ������� ����ʰ� Ż���Ѵٴ� ���̴�.
					*/ 
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("break Ȱ�� ����");
	System.out.println("=======================================================================================");

	/*
	1)break ����
	i=0,j=0 | i=0,j=1 |
	i=1,j=0 | i=1,j=1 |
	i=2,j=0 | i=2,j=1 |
	i=3,j=0 | i=3,j=1 |
	i=4,j=0 | i=4,j=1 |
	*/

	//--------------------------------------------------------------------------------------------------------
	//(2)continue Ȱ��

		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				continue;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("continue Ȱ�� ����");	
	System.out.println("=======================================================================================");

	/*
	2)continue ����
	i=0,j=0 | i=0,j=1 | i=0,j=3 | i=0,j=4 |
	i=1,j=0 | i=1,j=1 | i=1,j=3 | i=1,j=4 |
	i=2,j=0 | i=2,j=1 | i=2,j=3 | i=2,j=4 |
	i=3,j=0 | i=3,j=1 | i=3,j=3 | i=3,j=4 |
	i=4,j=0 | i=4,j=1 | i=4,j=3 | i=4,j=4 |
	���α׷� ����
	*/

	//--------------------------------------------------------------------------------------------------------
	//(3) (#goto�� ����1 : goto��+break)

		out: //�ݺ����� �̸��� out�̶�� �����߽��ϴ�.
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				break out;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end



	System.out.println("goto break(out: & break out:) ����");	
	System.out.println("=======================================================================================");
	/*
	//������ : 
		i=0,j=0 | i=0,j=1 | goto break(out: & break out:) ����
	*/


	//--------------------------------------------------------------------------------------------------------
	//(4) (#goto�� ����2 : goto��+continue)

		out: //�ݺ����� �̸��� out�̶�� �����߽��ϴ�.
		for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				continue out;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end

	System.out.println("goto continue(out: & continue out:) ����");	
	System.out.println("=======================================================================================");
	/*
	//������
	i=0,j=0 | i=0,j=1 | i=1,j=0 | i=1,j=1 | i=2,j=0 | i=2,j=1 | i=3,j=0 | i=3,j=1 | i=4,j=0 | i=4,j=1 | goto continue(out: & break out:) ����
	*/

	
	for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				return;
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("return���๮ ����");	
	System.out.println("=======================================================================================");



	
	for(int i=0; i<5; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				{
				System.exit(0);
				}
				System.out.print("i=" + i +",j=" +j+" | ");
			}//for j end
			System.out.println();
		}//for i end
	System.out.println("return���๮ ����");	
	System.out.println("=======================================================================================");

	}
}



