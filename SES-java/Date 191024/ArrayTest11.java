import java.util.Scanner;

class ArrayTest11 
{
	public static void main(String[] args) 
	{
		int a[]   = new int[6];
		int b[][] = new int[2][3];
		
	
		System.out.println("a�� ���� : "+ a.length);		
		System.out.println(" b.length = 'b�� ��� ���� �ֽ��ϱ�?' : "+ b.length);
		System.out.println(" b[0].length = 'b�� 0���� ��� ĭ���� �����Ǿ�����?' : "+ b[0].length);
		System.out.println("");


		System.out.println("a[0]��    �� : "+ a[0]);
		System.out.println("b[0][0]�� �� : "+ b[0][0]);
		System.out.println("");
		
		//1���� �迭 a�� ������ ���� Ȯ��
		for (int i=0;i< a.length ; i++ )
		{
		System.out.println("a["+ i +"]��    �� : "+ a[i]);
		}
		System.out.println("");


		//2���� �迭 b�� ������ ���� Ȯ��.
		for (int j=0;j< b.length ; j++ )
		{
			for (int k=0; k< b[j].length ; k++ )
			{
				//int b[][] = new int[2][3]; �ΰ��
				//3ĭ ��� ��  
				System.out.println("b["+j+"]["+k+"]��    �� : "+ b[j][k]);
			}
		}
		System.out.println("");
		
		//=========================================================================================
		//�л� 5���� ���� ���� ���� ����
		int score[][] = new int[5][3];
		Scanner input = new Scanner(System.in);

		for (int i=0; i < score.length ; i++)
		{
			System.out.printf("�л�%d�� �����Է� \n",i);

			for (int j=0; j < score[i].length ;j++ )
			{
				System.out.printf("�л�%d�� ����%d�� ���� : ", i,j);
				score[i][j] = input.nextInt(); 
			}
		}
		System.out.println("");			

		//���
		System.out.println("\t����\t����\t����\t ");
		for (int i=0; i < score.length ; i++)
		{
			System.out.printf("�л�%d \t ", i);
			for (int j=0; j < score[i].length ;j++ )
			{
				System.out.printf("%d  \t",score[i][j]);
			}
		System.out.println("");
		}

	}
}
