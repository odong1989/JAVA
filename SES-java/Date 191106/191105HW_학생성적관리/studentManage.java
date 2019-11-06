/*
[�л� ���� ����]
1. ���
2. ��ü�л����� ���
3. �˻�
4. ����
- ����� �л��̸�, ��/��/�� ������ �Է¹޾� �迭�� ����(Student class����ϼ���)
- ����� �л��̸�, ��/��/�� ����, ����,��� ������ ����մϴ�.
- �˻��� �л��̸��� �Է¹޾� ���� �̸��� �л������� ����մϴ�.
*/
import java.util.Scanner;

class studentManage{

	Scanner input = new Scanner(System.in);
	Student studentArray[] = new Student[5];
	int selectarrayCell=0;	

	public static void main(String[] args) 
	{
		int selectMenu=0;
		studentManage managerMan = new studentManage();

		while(true)
		{
			selectMenu = managerMan.menuPrint();
			switch (selectMenu)
			{
			case 1 : managerMan.addStudent();
						//�л��߰�
					 break;	
			case 2 : managerMan.viewStudent();	//�л���� ���(�������ı��� �ǽ�)
					 break;	
			case 3 : managerMan.search();		//�л��˻�
					 break;	
			case 4 : System.out.println("���α׷��� ����˴ϴ�.");
					 return;
			
			}//switch END
				System.out.println("Hello World!");
		}
	}//main END

	//[3]�޼ҵ�(main ����)------------------------------------------------------
	/*studentManage�� �޼ҵ���� 
	  (1) main���� �޴����(menuPrint)
	  (2) Student studentArray[]�� �迭�� ���� �Է�
	  (3) ���
	  (4) �� ���α׷� ����
	  �� �͵鸸 �ش��ϸ� ������������ ���� ���� ���� ����(���ؾ� switch�� �޴� ���ÿ� ����1,2,3,0
	*/

		public int menuPrint()
	{
		int menuValue=0;
		boolean flag=true;
		System.out.println("");
		System.out.println("[�л������������α׷�]");
		System.out.println("1. �л����� ���");
		System.out.println("2. ��ü�л��� �������");
		System.out.println("3. �˻�");			
		System.out.println("4. ����");

		System.out.print("�ǽ��� ����� ���ڸ� �Է��ϼ��� : ");

		while (flag)
		{
		menuValue = input.nextInt();
			if(menuValue<1 || menuValue>4){
				System.out.println("1~4������ �Է����ּ���");
			continue;	
			}
		flag=false;		
		}
		return menuValue;
	}


	public void addStudent()
	{
		System.out.println("");
		System.out.println("1�� - �л��߰� ");
		studentArray[selectarrayCell] = new Student();
		System.out.println( (selectarrayCell+1) +"�� �л��� ������ �Էµ˴ϴ� ");			
		System.out.print("�л��� �̸��� �Է����ּ���. : ");
		studentArray[selectarrayCell].setName(input.next());
		System.out.print("������� �Է����ּ���. : ");
		studentArray[selectarrayCell].setKor(input.nextInt());
		System.out.print("������� �Է����ּ���. : ");
		studentArray[selectarrayCell].setEng(input.nextInt());
		System.out.print("���м����� �Է����ּ���. : ");
		studentArray[selectarrayCell].setMath(input.nextInt());			

		System.out.println("�����ԷµǾ����ϴ�.");
		selectarrayCell++;
		System.out.println("selectarrayCell : "+selectarrayCell);
	}

	public void viewStudent()
	{
		System.out.println("selectarrayCell : "+selectarrayCell);
		
		if(selectarrayCell==0)
		{
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}	

		
		System.out.printf(" �̸�  ����  ����  ����   ����   ���   ����  \n");
		sortBubble();
		for (int view=0; view < selectarrayCell ; view++)
		{

			System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
								studentArray[view].getName(),
								studentArray[view].getKor(),
								studentArray[view].getEng(),
								studentArray[view].getMath(),
								studentArray[view].getTotal(),
								studentArray[view].getAvg()				
			);
		}
		System.out.println("��¿Ϸ�");
	}//viewStudent END


	public void search(){
		int searchCount=0;
		String SerchName="";
		System.out.println("�˻��Դϴ�.");
		System.out.print("�˻��� ��� : ");
		SerchName=input.next();	
		System.out.printf("�̸� ���� ���� ���� ���� ��� ���� \n");
		for(int searchLine=0; searchLine > selectarrayCell ;searchLine++ )
		{
			if(SerchName.equals(studentArray[searchLine].getName()))
			{
                                 //�̸�  ����   ����  ����  ����  ���   
				System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
									studentArray[searchLine].getName(),
									studentArray[searchLine].getKor(),
									studentArray[searchLine].getEng(),
									studentArray[searchLine].getMath(),
									studentArray[searchLine].getTotal(),
									studentArray[searchLine].getAvg()				
								);
				searchCount++;
			}
		}
	System.out.printf("�� %d���� ��ȸ�Ǿ����ϴ� \n",searchCount);
	}


	public void sortBubble(){
		Student temp = new Student();
		boolean flag;

		//���� ���� ���
		System.out.println("���������� �Է»����Դϴ�.");
		for (int print=0; print < selectarrayCell; print++)
		{
							 //�̸�  ����   ����  ����  ����  ���   
			System.out.printf(" %4s\t  %3d\t  %3d\t  %3d\t  %3d\t  %2.2f\t  \n",
								studentArray[print].getName(),
								studentArray[print].getKor(),
								studentArray[print].getEng(),
								studentArray[print].getMath(),
								studentArray[print].getTotal(),
								studentArray[print].getAvg()				
										);					
		}
				
		System.out.println("");
		
		
		
		//�� ��ȯ
		//Benchmark : ������
		for (int Benchmark=selectarrayCell; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : ����, �������� �񱳸� ���� �������̿��� ������ �迭���� ����.
			//System.out.println("Benchmark : "+Benchmark);
			
			flag=true; //�������� ���������� Ȯ�ο�.
			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(studentArray[Comparison].getTotal() < studentArray[Comparison+1].getTotal())
				{
					temp=studentArray[Comparison];
					studentArray[Comparison]=studentArray[Comparison+1];
					studentArray[Comparison+1]=temp;

					flag=false; //�������� ���������� Ȯ�ο�.

				/*

										 //�̸�  ����   ����  ����  ����  ���   
						System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
											temp.getName(),
											temp.getKor(),
											temp.getEng(),
											temp.getMath(),
											temp.getTotal(),
											temp.getAvg()				
										);						

					//���������� ��������� Ȯ������ �߰�üũ�� ��¹ݺ����Դϴ�.(���࿡ �������)-----------------------------------
						for (int print=0; print <studentArray.length; print++)
					{
										 //�̸�  ����   ����  ����  ����  ���   
						System.out.printf(" �������� ������ �������Դϴ�.      \n");
						System.out.printf(" %4s  %3d  %3d  %3d  %3d  %2.2f       \n",
											studentArray[print].getName(),
											studentArray[print].getKor(),
											studentArray[print].getEng(),
											studentArray[print].getMath(),
											studentArray[print].getTotal(),
											studentArray[print].getAvg()				
										);						
					}		
					System.out.println("");
					*/
					//���������� ��������� Ȯ������ �߰�üũ�� ��¹ݺ����Դϴ�.(���࿡ �������)-----------------------------------

				}//if end
			}//Comparison end 
			//flag�� true�̸� ���̻� ������ �� �ʿ䰡 ������ �̸� �����Ѵ�.
			//flag�� flase�̸� ������ ������ �ؾ� �Ѵٴ� �ǹ��̴� ��������϶� �����Ѵ�.
			if(flag) break;

			
			System.out.println("");
		}//interchangeSort end

		//����� ���� ���
		for (int print=0; print <selectarrayCell; print++)
		{
						System.out.printf(" �������� ������ ����� �����Դϴ�.      \n");
						System.out.printf(" %4s\t  %3d\t  %3d\t  %3d\t  %3d\t  %2.2f\t  \n",
											studentArray[print].getName(),
											studentArray[print].getKor(),
											studentArray[print].getEng(),
											studentArray[print].getMath(),
											studentArray[print].getTotal(),
											studentArray[print].getAvg()				
										);	
		}		
		System.out.println("�������� ����");
		System.out.println("");
	}




}
