/**
|�ѤѤѹ���ȭ �����ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�|
| [1��] ���α׷� ��ǥ �� �ǽ�����  				  										    	    |
|	 																				    	|
| 1.���α׷���ǥ : �ֹι�ȣ�� �Է¹����� �Է¹��� �ֹι�ȣ�� ����, ����, ������ ����մϴ�.                         |
| 2.������ ���� : �Է½� ����, ��½� ���� 2������ ������ �󼼳����� �Ʒ��� ����.                               |
| 2.1 �Է½� �ؼ�����																			|
|     (1) �ֹι�ȣ 14�ڸ���                                                                     |
|     (2) �����Է�(�̻��� �Է�)�� �Ʒ��� ���� �����Ѵ�.                                                 |
|         �����Է�1-�Է¹��ڿ��� ���̰� 14�ڸ��� �ƴ� ���                                               |
|         �����Է�2-�ֹι�ȣ�� �԰�(123456-1234567)�� ������ �������                                   |             
|         �����Է�3-�����̿��� ������ �Է��� ���.(�߰��� '-'����)								        |
|                                                                                           |
| 2.2 ��½� �ؼ�����																			|
|     (1) �Ʒ��� ���� ����� �ϵ��� �Ѵ�.															|
|     [��� ��] 90�� 01�� 01�ϻ� 29�� �����Դϴ�.													|
|	 																				    	|
|	 																				    	|
|  ---------------------------------------------------------------------------------------  |
| [2��] ���α׷��� ����(�ڵ�) 																		|
|																							|
| 1.Ŭ����																					|
| 1.1 import�ϴ� Ŭ����																			|
|  (1)import java.util.Scanner	: ������� �Է¼���												|
|  (2)import java.util.Calendar : ��¥ Ȯ�θ���													|
| 1.2 ���������ϴ� Ŭ����			 																|
|  (1)SocialSecurityNumberCheck.java : �ֹι�ȣ�Է�üũ(�����Է�Ȯ��) �޼ҵ� ����						|
|  (2)LeapYearCheck.java			 : ����üũ�޼ҵ�											|
|  (3)DdayCountAndOutput.java		 : Dday��¸޼ҵ� 											|
|																							|
| 2.Ȱ���ϴ� �޼ҵ�																				|
|  : ����.(�� �޼ҵ��� ȣ��κп��� �����ϴ°����� ��ü�Ѵ�.)												|
|																							|
| 3.��������																					|
|  : ����.(�� �޼ҵ��� ���ۺκп��� �����ϴ°����� ��ü�Ѵ�.)												|
|																							|
|�ѤѤѹ���ȭ ��������ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�|
*/
import java.util.Scanner;
import java.util.Calendar;

class BirthdayOutputBySocialSecurityNumberDevide
{
	public static void main(String[] args) 
	{
		int[] birthData={0, 0, 0, 0, 0};
				  //��� ��/ ��/ ��/ ��/ Dday(��ƿ³�)
		/*int birthData[] : �Է����� ��������� �����ϱ� ���� �迭�̴�.
							ŸŬ������ �޼ҵ�鿡�� ó���� �����ϸ鼭 
							2���̻��� �� ���ϹޱⰡ ���������,
							�̿����� ó���ϴ� �޼ҵ尡 ó���߿� ���� �������ִ� ������� �Ͽ���.
		*/

		person = new SocialSecurityNumberCheck();
		System.out.println("�ֹι�ȣ Ȱ���� ����� �� ���� �ؼ����α׷��Դϴ�.");


	String inputSSN=null; //SSN : �ֹι�ȣ(SocialSecurityNumber)�� ���. ���ڿ��� �Է¹��� �� ���ڰ����� ��ȯ.	
	Scanner in = new Scanner(System.in);
	Calendar cal = Calendar.getInstance(); //�ֹι�ȣ�� ����� �����Է� Ȯ�ο�	
	Calendar toDay = Calendar.getInstance();	   //d-day����(���ó�¥)	
	Calendar dDay = Calendar.getInstance(); //d-day����(���ϱ���)
	int now_year=cal.get(Calendar.YEAR);

	int DdayLife=0;//����� ���� ��ƿ� ��¥ ī��Ʈ
	

	int birth_year=0;	//����Ȯ������ 20xx������ �⵵�� 4�ڸ��� �����ϴ� ����.
	int birth_month=0;
	int birth_day=0;
	String sex="";		//�ֹι�ȣ�� ��/�� ���� Ȯ��
	char check;			//�����Է�3���� �����̿��� ���� �ԷµǾ����� Ȯ��.	


	boolean ContinueFalg=true; //������� �Է��� ��Ȯ�ؾ� �Է��� ����ȴ�.	
//����������Ʈ ��------------------------------------------------------------------------------
		
		
		
		while(ContinueFalg)
		{
			System.out.println("�ֹε�Ϲ�ȣ�� �Է����ּ���. (��)123456-1234567  : ");
			inputSSN = in.next();
				
			//�����Է�1 üũ_���ڼ� 14�� Ȯ��-----------------------------------------------
			if (inputSSN.length()!=14)//���Ͻ� ��� �����Է�2,3�� üũ����. 
			{	
				System.out.println("�ֹι�ȣ�� 14�� �Է����ּ���(-����)" );
				continue;
			}

			//�����Է�2_üũ 6��° ���� ��ġ�� '-'�� ������ Ȯ��.--------------------------------
			if (inputSSN.charAt(6)!= '-')
			{
				System.out.println(" '-'�Է¿����Դϴ�." );
				continue;
			}
			//�����Է�2_üũ 6��° ���� ��ġ�� '-'�� ������ Ȯ�� END-------------------------------------------------
			
			//�����Է�3_üũ �����̿��� �� �Է��� Ȯ��.(6���� ���ڴ� '-' üũ)-----------------------------------------		
			for(int point=0; point < inputSSN.length() ;point++)//�����Է� 2,3 üũ�� �ݺ���
			{
				check=inputSSN.charAt(point);
				if( point!= 6 &&(check < 48 || check > 57))
				{// point!= 6 : 6��° �ڸ��� '-'�̴� üũ�����ʵ��� ������.
					System.out.println("�����̿��� �� ����. �ٽ� �Է����ּ���." );
				continue;
				}
			}
			//�����Է�3_�����̿��� �� �Է��� Ȯ�� END------------------------------------------------------------		


			//���� ����
			switch (inputSSN.charAt(7))
			{
				/*            ����     /     ���� 
				---------------------------------------------
				1800��� ��� :    9     /      0
				---------------------------------------------
				1900��� ��� :    1     /      2
				---------------------------------------------
				2000��� ��� :    3     /      4
				*/
				//������ ��� : 9,1,3		
				case '9' : case '1' : case '3' :
				sex="����";
				break; 				
					
				//������ ��� : 0,2,4		
				case '0' : case '2' : case '4' :
				sex="����";
				break; 				
				
				default :System.out.println("�����Է��Դϴ�");			
			}//switch END

			ContinueFalg=false;
		}//while END

		//����üũ
		//step1.����⵵�� 4�ڸ��� ����.
			birth_year = Integer.parseInt(inputSSN.substring(0,2));
			if(birth_year<=(now_year-2000))//�ֹι�ȣ�� '1999��'ó�� 4�ڸ��� ������ �����Ƿ� 4�ڸ��� ���ߴ� �۾��ǽ�.
			{
				birth_year = Integer.parseInt("20"+inputSSN.substring(0,2));
			}
			else
			{
				birth_year = Integer.parseInt("19"+inputSSN.substring(0,2));
			}

			//6.step2.���⿩�� �ǰ�
			if((birth_year%4 == 0)&&((birth_year%100 != 0)||(birth_year%400 == 0)))
			{
				System.out.println(birth_year+"�� ��/�� �����Դϴ�");
			}
			else 
			{
				System.out.println(birth_year+"�� ��/�� ������ �ƴմϴ�.");
			}

			// üũ5_������ 1~12��, 1~31���̾�� �մϴ�. & üũ7_������ ���������� �ٸ��ϴ�. Ȯ�νǽ�
			//step1.�ֹι�ȣ�� ��� ��/��/���� �� ������ ����.
			birth_month=Integer.parseInt(inputSSN.substring(2,4));
			birth_day=Integer.parseInt(inputSSN.substring(4,6));

			/*step2.Calendar�� ���� cal�� ��¥�� �ֹι�ȣ�� ��/��/�Ϸ� ����.
			  �ڵ������Ǵ� Calendar�� Ȱ���Ͽ� �ֹι�ȣ�� ������� �����ԷµǾ����� üũ.
			*/
			cal.set(Calendar.YEAR, birth_year);
			cal.set(Calendar.MONTH, birth_month);
			cal.set(Calendar.DATE, birth_day);			

			//1~12�� ���� üũ,
			if(birth_month<1 || birth_month>12)
			{
				System.out.println("�Է¿����Դϴ�. �ֹι�ȣ�� �� ������ Ȯ�����ּ���."); 
				System.exit(0);
			}//�̾ �� üũ
			else if(birth_day>cal.getMaximum(Calendar.DAY_OF_MONTH))
			{
				System.out.println("�Է¿����Դϴ�. �ֹι�ȣ�� �� ������ Ȯ�����ּ���."); 
				System.exit(0);
			}


		/*
		��� ��/��/�� ����/���� �� ����Ѵ�.
	    (��) 90��� 1�� 1�ϻ� 29�� �����Դϴ�.
		*/
		System.out.println(birth_year+"��� "+birth_month+"�� "+birth_day+"�� "+(now_year-birth_year)+"�� "+sex+"�Դϴ�"); 

	}
}

