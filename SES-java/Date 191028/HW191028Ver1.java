import java.util.Scanner;

class HW191028Ver1 
{
	public static void main(String[] args) 
	{
		String id=null; //�ֹε�Ϲ�ȣ�̴�. �Է¹޴� ������ �մϴ�. �̰� ���������ִ��� �Ѱ���.
		Scanner input = new Scanner(System.in);
		boolean flag=true;
			
		while(flag)
		{
			id=input.next();


			if(id.length()==14)
			{	
				 System.out.print(id.substring(0,2)+"�� "); 
				 System.out.print(id.substring(2,4)+"�� "); 
				 System.out.print(id.substring(4,6)+"�ϻ� ");
				 
				switch (id.substring(7,8))
				{
					//������ ��� : 9,1,3		
					case "9" :
					case "1" :
					case "3" : System.out.println("�����Դϴ�.");
							 break; 				
					//������ ��� : 0,2,4		
					case "0" :
					case "2" :
					case "4" : System.out.println("�����Դϴ�.");
							 break; 				
					default :System.out.println("�����Է��Դϴ�");
							
				}
				

				 flag=false;
			}
			else
			{
				System.out.println("-�����Ͽ� 14���� �Է����ּ���");				
			}
		}

		
		//�Է��� 14���ڰ� �ƴϸ� �����ϼ���.(-����)
		//������ ������ ����ϼ���.
		//90�� 01�� 01�ϻ� �����Դϴ�.

		/*
			Ȯ���� ������
			1) 14���� �����Է�
			2) ��� ������ 6�ڸ��� 2���� ������ ����,  
		*/

	}
}