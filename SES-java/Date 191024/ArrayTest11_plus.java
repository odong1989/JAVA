import java.util.Scanner;

class ArrayTest11_plus
{
	public static void main(String[] args) 
	{
		//=========================================================================================
		//ArrayTest11�� �л� 5���� ���� ���� �������� �Է�&��¹��̴�.
		//��¼����� ������������ ��� ����� ���� ���� ��� ��� ���������� ���������� ��� ����ϵ��� �غ���
		//��°���� ������ ������ ó�� ���μ����� �ٸ��ٰ� �� �� �ְڴ�.
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
		//�Ϻ��ϰ� ������ ���ߴ� ���� �����غ���
		System.out.println("\t����\t����\t����\t ");
		for (int i=0; i < score[0].length ; i++)
		{
			System.out.printf("�л�%d \t ", i);
			for (int j=0; j < score.length ;j++ )
			{
				System.out.printf("%d  \t",score[j][i]);
			}
		System.out.println("");
		}
	}
}
