/**
====����ȭ ���� ����==================================================================
1.�� Ŭ���� ����
 : ���������Դϴ�. 1���� ������ �ϼ��ϸ� �¸��մϴ�.
   2���� �÷��̾ �ֽ��ϴ�.

2.import�ϴ� Ŭ����
��import java.util.Scanner;
(���Ͼ���)

3.�޼ҵ�(�Լ�) ����
�޼ҵ��DrawSquare(String[] field)   : ���������� �簢�� Ʋ �� ���ڸ� ��ġ�մϴ�.(10��24�� ������ ������.)
�޼ҵ��BubbleSortFlag(int[] player) : ����ڰ� ������ ���ڵ��� �����մϴ�. �¸������� �񱳸� ���� �����մϴ�.  
(���Ͼ���)

4. ��������(main �޼ҵ常)
������String field[];			   
   : 3*3�� �������� ����(String�� �ڷ�)���� ����մϴ�.
������	int gameLimit=field.length;								
   : �������� ���ڸ�ŭ�� �����÷���(��Ƚ��)�� �����մϴ�.
������	int[][] victoryCondition;		
   : �¸������� ������ ���� 8*1�� �迭�Դϴ�.(3*3������ ����)
������	Scanner input = new Scanner(System.in);
   : ������� �Է°��� �޽��ϴ�.
������	int inputValue=Integer.MIN_VALUE;					 
   : Scanner�� ����(������ Scanner input)
     �� ���� ���� �����մϴ�.
������	int[] player1={0,0,0,0};							 
������	int[] player2={0,0,0,0};						 	 
   : �÷��̾� 1,�÷��̾� 2 �Է°��� �ް� �����մϴ�.    
   �Էµ� ������ �������ĸ޼ҵ带 ���� ���� ���ĵ˴ϴ�.
   ���� ���ĵǾ�� �¸����ǰ��� �񱳰� �����մϴ�.
������	int turnplayer1=0;
������	int turnplayer2=0;
  : �÷��̾� 1�� �����ؿ� �Է°�(������	int[] player1)��
    �¸�����(������	int[][] victoryCondition)�� �����ϴ��� ���� Ȯ���մϴ�.
	(3*3���� ���ӱ���) 
������	int flagTurn=0;			 
   : ��� �÷��̾��� ���������� �����մϴ�.
	 ���� 0: �÷��̾�1�� �����Դϴ�. 
	 ���� 1: �÷��̾�2�� �����Դϴ�.
������	int winFlag1=0;										 
������	int winFlag2=0;		
  : �÷��̾���� �¸������� üũ�ϱ����� �����Դϴ�.
    boolean���ǹ��� ����� ���� 3�̻��� ���� ������� �¸����ǿ� �ش�˴ϴ�.

====����ȭ ���� ����==================================================================
*/

import java.util.Scanner;

class PJ_BingoGameCommentRefair
{
	public static void main(String[] args) 
	{
	//[1]�����������-------------------------------------------------
		String field[]={"1","2","3","4","5","6","7","8","9"};//������
		int gameLimit=field.length;							 //������
		int[][] victoryCondition={{1,2,3},
						  	 	  {4,5,6},
						  	 	  {7,8,9},
						  	 	  {1,4,7},
						  	 	  {2,5,8},
						  	 	  {3,6,9},
						  	 	  {1,5,9},
						  	 	  {3,5,7} };				 //������
		
		Scanner input = new Scanner(System.in);				 //������
		int inputValue=Integer.MIN_VALUE;					 //������
		int[] player1={0,0,0,0};							 //������
		int[] player2={0,0,0,0};						 	 //������
		int turnplayer1=0;									 //������
		int turnplayer2=0;									 //������
		int flagTurn=0;	//0: �÷��̾�1(X), 1: �÷��̾�2����(O)		 //������
		int winFlag1=0;										 //������
		int winFlag2=0;										 //������
		//[1]������������--------------------------------------------------
			

		//[2]�������ӽ���--------------------------------------------------
		for (int turnCount=1 ; turnCount <= gameLimit ; turnCount++)
		{
			//step0.�÷��̾� ���� ����------------------------------------------
			DrawSquare(field); //�������� �ʵ� 3*3 �� ���� ��ġ���
			System.out.printf("�� : %d \n",turnCount);
			System.out.printf("�÷��̾� %d�� �����Դϴ�.\n",flagTurn+1);
			//step0.�÷��̾� ���� ����------------------------------------------
 
			//������ Logüũ�� �ڵ�------------------------------------------------------
			//System.out.printf("player1 : %d, %d %d %d\n",player1[0],player1[1],player1[2],player1[3]);
			//System.out.printf("player2 : %d, %d %d %d\n",player2[0],player2[1],player2[2],player2[3]);
			//������ Logüũ�� �ڵ�------------------------------------------------------
		

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
				continue;	 //������ ���೻����� ������� �ʵ��� ���ó��.
			}	
			//step2.�÷��̾��� �Է°� �����ߺ�(�ߺ��Է�) üũ ����---------------------------------------
		
			//step3.���õ� ���ڴ� O/X���� ǥ���ϱ� ����--------------------------------------------
			else
			{
				switch (flagTurn)
				{
				case 0 : field[inputValue-1]="X";
						 player1[0]=inputValue;
					     System.out.println("turnplayer1 : "+turnplayer1);
				 		 System.out.printf("player1 : %d, %d %d %d\n",player1[0],player1[1],player1[2],player1[3]);
						 BubbleSortFlag(player1);

						 //������ Logüũ�� �ڵ�//System.out.printf("<Ȯ�ο�>�÷��̾�%d�� ������ : %d\n",flagTurn+1,player[flagTurn]);
						 break;
				case 1 : field[inputValue-1]="O";
						 player2[0]=inputValue;
						 System.out.println("turnplayer2 : "+turnplayer2);
						System.out.printf("player2 : %d, %d %d %d\n",player2[0],player2[1],player2[2],player2[3]);
						 BubbleSortFlag(player2);

						//������ Logüũ�� �ڵ� //System.out.printf("<Ȯ�ο�>�÷��̾�%d�� ������ : %d\n",flagTurn+1,player[flagTurn]);//������Ȯ�ο��ڵ��Դϴ�. �Ϸ�� �������ּ���.
						 break;
				default : System.out.println("������� �����߻��Դϴ�.");
						 break;
				}// switch end
			}//else end
			//step3.���õ� ���ڴ� O/X���� ǥ���ϱ� ����--------------------------------------------



			//step4.�÷��̾��� �¸����� Ȯ��---------------------------------------------------
			//		�¸������� �Ǵ� victoryCondition�迭�� ���� 3�� �̻� ������ ��� �¸��� �����Ѵ�.
				for(int CheckRow=0; CheckRow < victoryCondition.length; CheckRow++)
				{//�¸�����victoryCondition�� �����࿡ ���� �����ֱ⿡ ���Ƕ��μ���ŭ �ݺ��Ѵ�.
					for(int CheckCell=0 ; CheckCell <4 ; CheckCell++)
					{//�¸������� {1,2,3}ó�� ����Ǿ��ֱ⿡ �� ���� ���� Ȯ���Ѵ�.
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
					
					if(winFlag1>=3)//3*3�ǿ� 1���� �����̹Ƿ� 3���� ���ϼ����Ͻ� �¸��� �Ǵ��Ѵ�.
					{
						System.out.printf("�÷��̾� 1�� �¸��Ͽ����ϴ�.");						
						System.out.println("������ �����մϴ�.");
						return;
					}
					else winFlag1=0; //�¸����ǿ� ���ո����� Ȯ�������Ƿ� 0���� �ʱ�ȭ.


					if(winFlag2>=3)	//3*3�ǿ� 1���� �����̹Ƿ� 3���� ���ϼ����Ͻ� �¸��� �Ǵ��Ѵ�.	
					{
						System.out.printf("�÷��̾� 2�� �¸��Ͽ����ϴ�.");						
						System.out.println("������ �����մϴ�.");
						return;
					} 
					else winFlag2=0;//�¸����ǿ� ���ո����� Ȯ�������Ƿ� 0���� �ʱ�ȭ.

					
				}//�¸�Ȯ�� for ����

				flagTurn=(flagTurn+1)%2; //������ ������ �����Ͽ� 0,1���� �÷��̾��� ����

			//step4.�÷��̾��� �¸����� Ȯ�� ����---------------------------------------------------
		
		}//�������� for end
	//[2]������������--------------------------------------------------

	}//main method end

	

//Method-DrawSquare======================================================================================================
//�簢���� ���ڸ� �׸��� �޼ҵ�. main�޼ҵ尡 �ʹ� ���������� DrawSquare��� ������ �޼ҵ�� �����Ͽ���.
	public static void DrawSquare(String[] field) 
	{
		//String[] field : ���θ޼ҵ忡�� �������� ����(String�� ����)���� ���� �´�.
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
			
						
			for(int j=0; j<7 ;j++)// ���ڰ� ��µǴ� ���ε��� ���ڵ�� ���� ���.
			{
				if(j%2==1) //����� ���ڵ��� �����Ѵ�.
				{
					System.out.printf("%s",field[arraySellector]);
					arraySellector++;	
				}

				switch (j)
				{
				case 0 : System.out.print("��   ");		//�������� �������� �׸��ϴ�.
						 break;							//1,4,7�� ���� ���� �ش�˴ϴ�.

				case 2:  System.out.print("   ��   ");	//�������� �߾ӿ��� ���� ������ �׸��ϴ�.	
						 break;							//1~2, 4~5, 7~8 ������ ���� �ش�˴ϴ�.

				case 4:  System.out.print("   ��   ");	//�������� �߾ӿ��� ������ ������ �׸��ϴ�.	
						 break;							//2~3, 5~6, 8~9 ������ ���� �ش�˴ϴ�.

				case 6:  System.out.print("   ��\n");	//�������� �������� �׸��ϴ�.		
						 break;							//3,6,9�� ���� ���� �ش�˴ϴ�.
		
				default : System.out.print("");
						  break;
				}
			}
		}
		System.out.print("��������������������������������������������������\n");//������ �κ� ���.		
	}// DrowSquare() method END
//Method-DrawSquare======================================================================================================



//Method-BubbleSort======================================================================================================
//BubbleSort : ��������
//boolean�� Flag�� �߰��Ͽ� 
//������ �� �ʿ䰡 ���ٰ� �Ǵܵ� ��� ��������(break)�� �� �� �ֵ��� �����Ͽ���.
	
	public static void BubbleSortFlag(int[] player) 
	{
		int temp=0;	  //�迭�� �� �̵��� �ٲٱ� ���� �ӽ� �����ϴ� ����.		
		boolean flag; //������ �ϴ� �߿� �����Ⱓ ������ �߻����� ��� 
					  //'���ĿϷ�'�� �˰� BubbleSortFlag�޼ҵ� ����.
			
	//������ Logüũ�� �ڵ�------------------------------------------------------
	//���� ���� ���
/*		for (int print=0; print <player.length; print++)
		{
			System.out.println("player"+print+": " + player[print]);
		}		
			System.out.println("");
*/
	//������ Logüũ�� �ڵ�------------------------------------------------------

		//Benchmark : ������/���������� ��� �ǳ��� ������ ���ĵȴ�.
		for (int Benchmark=player.length; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : ����, �������� �񱳸� ���� �������̿��� ������ �迭���� ����.
			//������ Logüũ�� �ڵ�----------------------------------------------
			//System.out.println("Benchmark : "+Benchmark);
			//������ Logüũ�� �ڵ�----------------------------------------------	

			flag=true; 
			//flag�� true�̸� ���̻� ������ �� �ʿ䰡 ������ �̸� �����Ѵ�.
			//flag�� flase�̸� ������ ������ �ؾ� �Ѵٴ� �ǹ��̴� ��������϶� �����Ѵ�.
			
			//Comparison : ���� / ���������� ��� n��° ���� n-1��°�� ���� �񱳵ȴ�.
			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(player[Comparison] > player[Comparison+1])
				{
					temp=player[Comparison];
					player[Comparison]=player[Comparison+1];
					player[Comparison+1]=temp;
					flag=false; 
					//������ Logüũ�� �ڵ�----------------------------------
					/*for (int print=0; print <player.length; print++)
					{		
						System.out.print(player[print]+" ");
					}		
					System.out.println("");*/
					//������ Logüũ�� �ڵ�----------------------------------
				}//if end

			}//Comparison end 


			if(flag) break; //������ ������ �ʾƵ� ������ �����Ѵ�.
							//�������� �ݺ��߿� �ش��Ͽ��� ������ 1���� �߻����⿡ ���ĿϷ�� �����Ѵ�.


			System.out.println("");//��°����
		}//interchangeSort end

			
		//����� ���� ���
		for (int print=0; print <player.length; print++)
		{
			System.out.print(player[print]+",");
		}		
		System.out.println("");
	}//BubbleSortFlag END
//Method-BubbleSort======================================================================================================

}//class class PJ_BingoGame END