/**
====����ȭ ���� ����==================================================================
1.�� Ŭ���� ����
 : ��������Դϴ�. 1���� ������ �ϼ��ϸ� �¸��մϴ�.
   2���� �÷��̾ �ֽ��ϴ�.

2.import�ϴ� Ŭ����
��import java.util.Scanner;
(���Ͼ���)

3.�޼ҵ�(�Լ�) ����
��void DrawSquare() : ��������� �簢�� Ʋ �� ���ڸ� ��ġ�մϴ�.(10��24�� ������ ������.)

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
		//[1]�����������-------------------------------------------------
		String field[]={"1","2","3","4","5","6","7","8","9"};			//5
		int gameLimit=field.length;					//4	
		int[][] victoryCondition={{1,2,3},
						  	 	  {4,5,6},
						  	 	  {7,8,9},
						  	 	  {1,4,7},
						  	 	  {2,5,8},
						  	 	  {3,6,9},
						  	 	  {1,5,9},
						  	 	  {3,5,7} }; 
								  //6

		
		Scanner input = new Scanner(System.in);		//3
		int inputValue=Integer.MIN_VALUE;
		int[] player1={0,0,0,0};	//1
		int[] player2={0,0,0,0};	//1
		int turnplayer1=0;
		int turnplayer2=0;
		int flagTurn=0;	//0: �÷��̾�1(X)����, 1: �÷��̾�2����(O)
		int winFlag1=0;
		int winFlag2=0;
		//[1]������������--------------------------------------------------
		




		//[2]������� ���� for
		for (int turnCount=1 ; turnCount <= gameLimit ; turnCount++)
		{
			DrawSquare(field); //������� �ʵ� 3*3 �� ���� ��ġ���
			

			//step0.�÷��̾� ����------------------------------------------
			System.out.printf("�� : %d \n",turnCount);
			System.out.printf("�÷��̾� %d�� �����Դϴ�.\n",flagTurn+1);
			System.out.printf("player1 : %d, %d %d %d\n",player1[0],player1[1],player1[2],player1[3]);
			System.out.printf("player2 : %d, %d %d %d\n",player2[0],player2[1],player2[2],player2[3]);
			//step0.�÷��̾� ����------------------------------------------


			//step1.�÷��̾��� ���Է�--------------------------------------------------------
			System.out.print("������ ���� �Է��ϼ��� : ");				
			inputValue=input.nextInt();

			//step1.�÷��̾��� ���Է�--------------------------------------------------------



			//step2.�÷��̾��� �Է°� �����ߺ�(�ߺ��Է�) üũ---------------------------------------
			//		�ߺ��� Ȯ�εɰ�� �ش�����-ó���Ͽ� �ٽ� �Է¹��� �� �ֵ��� �Ұ�.			
			if(field[inputValue-1] == "X" || field[inputValue-1] == "O")
			{
				System.out.println("�̹� ���õ� ���Դϴ�. �ٽ� �������ּ���.");
				turnCount--; //ī��Ʈ ����ó���� �������ν� �ߺ������� ��ī��Ʈ�Ǵ� ������ ����.
				continue;
			}	
			//step2.�÷��̾��� �Է°� �����ߺ�(�ߺ��Է�) üũ ����---------------------------------------
		
			//[�ű�!]step4.���õ� ���ڴ� O/X���� ǥ���ϱ� ����--------------------------------------------
			else
			{
			switch (flagTurn)
			{
			case 0 : field[inputValue-1]="X";
					 player1[0]=inputValue;
//					 turnplayer1++;
				     System.out.println("turnplayer1 : "+turnplayer1);
			System.out.printf("player1 : %d, %d %d %d\n",player1[0],player1[1],player1[2],player1[3]);

					 BubbleSortFlag(player1);
//	  				 System.out.printf("<Ȯ�ο�>�÷��̾�%d�� ������ : %d\n",flagTurn+1,player[flagTurn]);//������Ȯ�ο��ڵ��Դϴ�. �Ϸ�� �������ּ���.
					 break;
			case 1 : field[inputValue-1]="O";
					 player2[0]=inputValue;
//					 turnplayer2++;
					 System.out.println("turnplayer2 : "+turnplayer2);
			System.out.printf("player2 : %d, %d %d %d\n",player2[0],player2[1],player2[2],player2[3]);


					 BubbleSortFlag(player2);
//	  				 System.out.printf("<Ȯ�ο�>�÷��̾�%d�� ������ : %d\n",flagTurn+1,player[flagTurn]);//������Ȯ�ο��ڵ��Դϴ�. �Ϸ�� �������ּ���.
					 break;
			default : System.out.println("������� �����߻��Դϴ�.");
					 break;
			}
			}
			//[�ű�!]step4.���õ� ���ڴ� O/X���� ǥ���ϱ� ����--------------------------------------------



			//step3.�÷��̾��� �¸����� Ȯ��---------------------------------------------------
			//		�¸������� �Ǵ� victoryCondition�迭�� ���� ������ ��� �¸��� �����Ѵ�.

				for(int CheckRow=0; CheckRow < victoryCondition.length; CheckRow++)
				{
					for(int CheckCell=0 ; CheckCell <4 ; CheckCell++)
					{
						if(player1[CheckCell] == victoryCondition[CheckRow][0] 
						   || player1[CheckCell] == victoryCondition[CheckRow][1]
						   || player1[CheckCell] == victoryCondition[CheckRow][2])
						{
						  winFlag1++;
						}

						if(player2[CheckCell] == victoryCondition[CheckRow][0] 
						   || player2[CheckCell] == victoryCondition[CheckRow][1]
						   || player2[CheckCell] == victoryCondition[CheckRow][2])
						{
						  winFlag2++;
						}					
					
					}	
					
					
					if(winFlag1>=3)	
					{
						DrawSquare(field); //������� �ʵ� 3*3 �� ���� ��ġ���
						System.out.printf("�÷��̾� 1�� �¸��Ͽ����ϴ�.");						
						System.out.println("������ �����մϴ�.");
						return;
					}
					else winFlag1=0;


					if(winFlag2>=3)	
					{
						DrawSquare(field); //������� �ʵ� 3*3 �� ���� ��ġ���
						System.out.printf("�÷��̾� 2�� �¸��Ͽ����ϴ�.");						
						System.out.println("������ �����մϴ�.");
						return;
					}
					else winFlag2=0;


					//		boolean[] winFlag={false,false,false}; �� �¸������� üũ�ϴ� �ڵ������.
					//for()

					/*�������� ��������.
					if(player1[] == victoryCondition[victoryCheck])
					{
						DrawSquare(field); //������� �ʵ� 3*3 �� ���� ��ġ���
						System.out.printf("�÷��̾� %d��/�� �¸��Ͽ����ϴ�.",flagTurn+1);
						System.out.println("������ �����մϴ�.");
						return;
					}
					else(player2[] == victoryCondition[victoryCheck])
					{
						DrawSquare(field); //������� �ʵ� 3*3 �� ���� ��ġ���
						System.out.printf("�÷��̾� %d��/�� �¸��Ͽ����ϴ�.",flagTurn+1);
						System.out.println("������ �����մϴ�.");
						return;
					}*/
				}//�¸�Ȯ�� for ����

				flagTurn=(flagTurn+1)%2; //������ ������ �����Ͽ� 0,1���� �÷��̾��� ����

			//step3.�÷��̾��� �¸����� Ȯ�� ����---------------------------------------------------
		
		}//������� ���� for end

			
			
	}//main method end

	




//Method-DrawSquare======================================================================================================
//�簢���� ���ڸ� �׸��� �޼ҵ�. main�޼ҵ尡 �ʹ� ���������� DrawSquare��� ������ �޼ҵ�� �����Ͽ���.
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




//Method-BubbleSort======================================================================================================
//BubbleSort : ��������
//boolean�� Flag�� �߰��Ͽ� 
//������ �� �ʿ䰡 ���ٰ� �Ǵܵ� ��� ��������(break)�� �� �� �ֵ��� �����Ͽ���.
	
	public static void BubbleSortFlag(int[] player) 
	{
		//������ ����
		int temp=0;
		boolean flag;
			

		//���� ���� ���
/*		for (int print=0; print <player.length; print++)
		{
			System.out.println("player"+print+": " + player[print]);
		}		
			System.out.println("");
*/
		//�� ��ȯ

		//Benchmark : ������
		for (int Benchmark=player.length; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : ����, �������� �񱳸� ���� �������̿��� ������ �迭���� ����.
//			System.out.println("Benchmark : "+Benchmark);
			flag=true; //�������� ���������� Ȯ�ο�.

			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(player[Comparison] > player[Comparison+1])
				{
					temp=player[Comparison];
					player[Comparison]=player[Comparison+1];
					player[Comparison+1]=temp;
					flag=false; //�������� ���������� Ȯ�ο�.
/*
					//���������� ��������� Ȯ������ �߰�üũ�� ��¹ݺ����Դϴ�.(���࿡ �������)-----------------------------------
					for (int print=0; print <player.length; print++)
					{		
						System.out.print(player[print]+" ");
					}		
					System.out.println("");
					//���������� ��������� Ȯ������ �߰�üũ�� ��¹ݺ����Դϴ�.(���࿡ �������)-----------------------------------
*/
				}//if end
			}//Comparison end 
			//flag�� true�̸� ���̻� ������ �� �ʿ䰡 ������ �̸� �����Ѵ�.
			//flag�� flase�̸� ������ ������ �ؾ� �Ѵٴ� �ǹ��̴� ��������϶� �����Ѵ�.
			if(flag) break;

			
			

			System.out.println("");
		}//interchangeSort end

		//����� ���� ���
		for (int print=0; print <player.length; print++)
		{
			System.out.print(player[print]+",");
		}		
		System.out.println("");
	}//BubbleSortFlag END





}//class class PJ_BingoGame END
