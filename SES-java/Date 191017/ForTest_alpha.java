import java.unit.Scanner;

		/* (+a)
			�Է�7�϶�
		   000*	
		   00***
		   0*****
		   *******
		   0*****
           00***
		   000*

		   �Է�11�϶�
		   00000*		
		   0000***
		   000*****	
		   00*******
		   0*********
		   ***********
		   0*********
           00*******
		   000*****
		   0000***
		   00000*		
		*/

class ForTest_alpha
{
	public void output(int line_x, int nothing) 
	{
		for(line_x =0; line_x<=2 ; line_x++)
		{
			if (Flag_trun == 0)
			{
			//������ ���ﰢ��
			for(; nothing>line_x ; nothing--)
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

	}

	public static void main(String[] args) 
	{
		byte Flag_turn=0;
		Scanner input = new Scanner();

		System.out.println("+a, ���� �Է��� Ȧ���� ���� �˾Ƽ� ���̾ư� �����ǵ����Ѵ�.(�Է�Ȧ��=");
		System.out.println("* �Է�Ȧ��= ���̾��� �㸮�ѷ�");
		System.out.println("���ϴ� ���̾��� �ѷ����Է��ϼ���(Ȧ���� ����) ");

		/*�Է��� ���� 2��+1�� �� ������ Ȯ���� ������ 
		  �߾����� �������� �þ�ٸ� ���?
�迭�� �����̶�� �ؾ��ϳ�?
*/

	}


	}//main end
}//class end