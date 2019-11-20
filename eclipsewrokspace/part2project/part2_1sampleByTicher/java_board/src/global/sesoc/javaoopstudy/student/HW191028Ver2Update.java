package global.sesoc.javaoopstudy.student;

import java.util.Scanner;
import java.util.Calendar;


class HW191028Ver2Update
//���ʹ��� : HW191028Ver1 
{
	public static void main(String[] args) 
	{
		String id=null; //�ֹε�Ϲ�ȣ�̴�. �Է¹޴� ������ �մϴ�. �̰� ���������ִ��� �Ѱ���.
		Scanner input = new Scanner(System.in);
		boolean flag=true;
		Calendar cal =Calendar.getInstance(); 

		while(flag)
		{
			System.out.println("�ֹι�ȣ�� �Է����ֽʽÿ�(�� : 900101-1234567 )"); 
			id=input.next();

			//14���ڰ� �ƴϸ� �ٽ� �Է¹޾� �ֽʽÿ�.

			if(id.length()!=7)
			{
				System.out.println("14���� �Է����ּ���");
				continue;
			}
			//7��° ���ڰ� -���� Ȯ���Ͻʽÿ�.
			if(id.substring(6,7) != "-")
			{
				System.out.println("-�� �������ּ���");
				continue;
			}


			break;
			/*���ѹݺ����� ����Ѵٸ� �ݵ�� ��� ������ �ִ�,
				Ż�ⱸ�� ������ �մϴ�.
				�� ���� ��� 14���ڸ� ���߸� Ż��ó��.*/
		}//while


		//������ ������ ����ϼ���.
		//90�� 01�� 01�ϻ� 29�� �����Դϴ�.
			 System.out.print(id.substring(0,2)+"�� "); 
			 System.out.print(id.substring(2,4)+"�� "); 
			 System.out.print(id.substring(4,6)+"�ϻ� ");
//				 cal.get(Calendar.YEAR),
//				id.substring(0,2)
//���س⵵ �˾Ƴ��� ���̰���� ��.
//�׸��� ���̰��� �ֹι�ȣ913���� ������ �⵵�� �ݿ��Ұ�.




				switch (id.substring(7,8))
				{
				/*                 ����     /     ���� 
					---------------------------------------------
					1800��� ��� :    9     /      0
					---------------------------------------------
					1900��� ��� :    1     /      2
					---------------------------------------------
					2000��� ��� :    3     /      4
				*/
					//������ ��� : 9,1,3		
					case "9" :
							 break;
					case "1" :
							 break; 				
					case "3" :
							 System.out.println("�����Դϴ�.");
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



}
