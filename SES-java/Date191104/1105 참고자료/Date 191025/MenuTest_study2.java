
/*
[���α׷� ����]

1. �Է�
2. ����
3. ����
4. ���
0. ����

��ȣ���� > �����Է¼��� > switch���� ���� �� ��ȣ �ൿ ��
(���߰ų�, �ߵ������) ùȭ������ �ٽø���(0�Էµɶ����� ���α׷��� �������ʾ� ģ��)

(#���� �ﱹ���������� ù����ȭ�鰰����..?)


��ǥ : �ּҷ� ���α׷�
�̸�, ��ȭ��ȣ,
���ο� ����̸��� ��� �Է¹������� 1��
�����Ϸ��� 2��
3���� ����
4���� ��ü��Ϻ���

*/

import java.util.Scanner;

class MenuTest_study2 
{
	public static void main(String[] args) 
	{
		//�̸� �غ��ؾ��ϴ� ��ü���� �� ���������� �ǽ��մϴ�. 
		Scanner scan = new Scanner(System.in);

		int menuNum;
		String names[]=new String[10];	//10������� �̸��� ������ �� �ִ� �迭.
										//null : � ��ü�� ����Ű�� �ʴ� ���¸� �ǹ��մϴ�.
		int cnt=0;//names[]�� �迭ĭ ������ ���� ����.		


		//���α׷� ��ü�� ���ѹݺ�
		while(true)//���ѹݺ� ���ѵ� �������� ������ �����.
		{
			//�޴� ���
			//printMenu()�� ���� ȣ��, ����� �����ϰ�, main�� ������ ����������.
			printMenu();

			//�޴���ȣ �Է¹���
			System.out.print("�����Ͻ� �޴��� ��ȣ : ");			
			menuNum = scan.nextInt();


			//�Է��� ��ȣ�� ���� �б�
			switch (menuNum)
			{
			case 1 : System.out.println("1. �Է� �޴��Դϴ�.\n");
			 		 System.out.print("�̸��� �Է��� �ּ���. : ");
					 //names[cnt] = scan.next();

					 scan.nextLine();//�Է¹��ۿ� �������� ���� �ִ� ������ ��� �޾��ش�.(#�����彯��#����ũ�� �̳༮���!)
					 names[cnt] = scan.nextLine();//���ð� ť�� �����ؾ� �Է��ϱ⵵ ���� �ڴ�� ����Ǵ��� �� �� �־��.
					 /*
					 next, nextLine�� scanner������ ���ڿ��� ���� �� �ִ� ����ε�
					 �������� �ִ�.

					 next : ���̳� �����̽����� �߻��� �����̽� ���� ����鸸 �����Ѵ�.(�������� �� �а� �Ҿ����)
					 nextline : �Է¹��ۿ� �����ִ� ���͸� �ڽ��� ��ȣ��� �����ϰ� �ڴ�� �����ϴ� ���� �ǹ�����.
					 			nextline�� ���� �Է��ϱ⵵ ���� �ڴ�� �Ѿ�ٸ�
								"nextline�� �Է¹��ۿ� �����ִ� ���� �ڴ�� �а� �����߱���"��� �����ϸ�ȴ�.

								[��å] 2�� scan����.nextLine();

								 scan.nextLine();//�Է¹��ۿ� �������� ���� �ִ� ������ ��� �޾��ش�.(#�����彯��#����ũ�� �̳༮���!)
								 names[cnt] = scan.nextLine();//���ð� ť�� �����ؾ� �Է��ϱ⵵ ���� �ڴ�� ����Ǵ��� �� �� �־��.
					 */
					 cnt++;
					 break;

			case 2 : System.out.println("2. ���� �޴��Դϴ�.\n");	
					 break;

			case 3 : System.out.println("3. ���� �޴��Դϴ�.\n");			
					 break;

			case 4 : System.out.println("4. ��� �޴��Դϴ�.\n");
					if(cnt==0)
						{
							System.out.println("����� ����� �����ϴ�.\n");
							break;
						}
					
					 for(int i=0 ; i<=cnt ;i++)
					 {

						System.out.printf("%d : %s \n",i,names[i]);						
					 }
					 break;

			case 0 : System.out.println("0. ���� �޴��Դϴ�.\n");
					 return;

			default : System.out.println("�޴���ȣ�� ���ڸ� �Է����ּ���.\n");		
					 break;
					 //�������� continue; �ε�? �� �ٸ�����?
			}//switch end
			
			
			
			//0�� �Է��ϸ� ���α׷� ��ü ����.
		}

	}//main���α׷��� ��


	public static void printMenu()
	{
		System.out.println("1. �Է�");
		System.out.println("2. ����");	
		System.out.println("3. ����");			
		System.out.println("4. ���");
		System.out.println("0. ����");		
	}

}
