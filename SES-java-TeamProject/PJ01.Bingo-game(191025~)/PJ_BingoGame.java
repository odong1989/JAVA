/**
====����ȭ ���� ����==================================================================
1.�� Ŭ���� ����
 : ���������Դϴ�. 1���� ������ �ϼ��ϸ� �¸��մϴ�.
   2���� �÷��̾ �ֽ��ϴ�.

2.import�ϴ� Ŭ����
��import java.util.Scanner;


3.�޼ҵ�(�Լ�) ����
��void DrawSquare() : ���������� �簢�� Ʋ �� ���ڸ� ��ġ�մϴ�.(10��24�� ����)

4. ��������(main �޼ҵ常)
//�� int player1LineValue
  : �÷��̾�1�� �׸� �迭�� 

//�� int player2LineValue 
  :

//�� Scanner input
  :

//�� int turnLimit
  :

//�� int field[]
  : 3*3�� �簢���� ���ڸ� ����Ѵ�.

//�� 
  :

====����ȭ ���� ����==================================================================
*/

import java.util.Scanner;

class PJ_BingoGame
{
	public static void main(String[] args) 
	{
		//�����������-------------------------------------------------
		String field[]={"1","2","3","4","5","6","7","8","9"};			//5
		int gameLimit=field.length;					//4	
		int victoryCondition[]={6,12,15,18,24};		//6

		
		Scanner input = new Scanner(System.in);		//3
		int inputValue=Integer.MIN_VALUE;
		int player[]={0,0};	//1
		int flagTurn=0;	//0: �÷��̾�1����, 1: �÷��̾�2����
		//������������--------------------------------------------------
		




		//�������� ���� for
		for (int turnCount=1 ; turnCount <= gameLimit ; turnCount++)
		{
			DrawSquare(field); //�������� �ʵ� 3*3 �� ���� ��ġ���

			//step0.�÷��̾� ����- ���� �̱��������Դϴ�.-----------------------------------------
			System.out.println("flagTurn : "+flagTurn );
			System.out.printf("�÷��̾� %d�� �����Դϴ�.",flagTurn);
			//step0.�÷��̾� ����- ���� �̱��������Դϴ�.-----------------------------------------


			//step1.�÷��̾��� ���Է�--------------------------------------------------------
			System.out.print("������ ���� �Է��ϼ��� : ");				
			inputValue=input.nextInt();
			//player1+=inputValue; //test�� / step2�� �Է°� �����Ϸ�� ������ ��.

			//step1.�÷��̾��� ���Է�--------------------------------------------------------



			//step2.�÷��̾��� �Է°� �����ߺ�(�ߺ��Է�) üũ---------------------------------------
			//		�ߺ��� Ȯ�εɰ�� �ش�����-ó���Ͽ� �ٽ� �Է¹��� �� �ֵ��� �Ұ�.			
			if(field[inputValue-1] == "X" || field[inputValue-1] == "O")
			{
				System.out.println("�̹� ���õ� ���Դϴ�. �ٽ� �������ּ���.");
				System.out.println("flagTurn : "+flagTurn );
				continue;
			}	
			//step2.�÷��̾��� �Է°� �����ߺ�(�ߺ��Է�) üũ ����---------------------------------------
			//[�ű�!]step4.���õ� ���ڴ� O/X���� ǥ���ϱ� ����--------------------------------------------
			else	
			{
				field[inputValue-1]="X";			
			}

			//[�ű�!]step4.���õ� ���ڴ� O/X���� ǥ���ϱ� ����--------------------------------------------


			//step3.�÷��̾��� �¸����� Ȯ��---------------------------------------------------
			//		�¸������� �Ǵ� victoryCondition�迭�� ���� ������ ��� �¸��� �����Ѵ�.
				for(int victoryCheck=0; victoryCheck < victoryCondition.length; victoryCheck++)
				{
					if(player[flagTurn] == victoryCondition[victoryCheck])
					{
						DrawSquare(field); //�������� �ʵ� 3*3 �� ���� ��ġ���
						System.out.println("�÷��̾�1��/�� �¸��Ͽ����ϴ�.");
						System.out.println("������ �����մϴ�.");
						return;
					}
				}
			//step3.�÷��̾��� �¸����� Ȯ�� ����---------------------------------------------------
		}//�������� ���� for end
			System.out.println("flagTurn : "+flagTurn );
			
			
	}//main method end

	

//Method-DrawSquare======================================================================================================

	public static void DrawSquare(String[] field) 
	{
		int arraySellector=0;//�簢�� ���� �ݺ������δ� ������ ���� ������ �� �� ����.		

		for (int i=0; i<3; i++)//���ζ���(������¾ʴ� �κи�) ���
		{
			switch (i)
			{
			case 0 : System.out.print("��������������������������������������������������\n");	//��������(�ٷ����)
					 break;
			case 1 : System.out.print("��������������������������������������������������\n");		//3���� �����, 6���� �����,9���� �����		
				     break;
			case 2 : System.out.print("��������������������������������������������������\n");		//3���� �����, 6���� �����,9���� �����		
					 break;
			default : System.out.print("���ǵ������� ������ �߻��Ǿ����ϴ�.\n");
					  break;
			}
			
						
			for(int j=0; j<7 ;j++)// �Τ��� |���� ĭ���� ���� 
			{

				if(j%2==1)
				{
					System.out.printf("%s",field[arraySellector]);
					arraySellector++;	
				}

				switch (j)
				{
				case 0 : System.out.print("��   ");			//1,4,7�� ���� ��
						 break;
				case 2:  System.out.print("   ��   ");		//1~2, 4~5, 7~8 ������ �� |	
						 break;
				case 4:  System.out.print("   ��   ");		//2~3, 5~6, 8~9 ������ �� |	
						 break;
				case 6:  System.out.print("   ��\n");			//3,6,9�� ���� ��		
						 break;
				default : System.out.print("");
						  break;
				}
			}
		}
		System.out.print("��������������������������������������������������\n");		//9�������� �����		
	}// DrowSquare() method END

//Method-DrawSquare======================================================================================================


}//class class PJ_BingoGame END