//���� : Ű����� ������ �Է¹޾� ��/��/��/��/���� �Ǻ�(100�� ����) 
import java.util.Scanner;

class IfTest2
{
	public static void main(String[] args) 
	{
		/*
		100����~90�̻� ��
		90�̸�~80�̻�  ��
		80�̸�~70�̻�  ��
		70�̸�~60�̻�  ��
		60�̸�~0��    ��
		.*/
	
		//��������
		double score ;
		//Scanner ��ü ����
		Scanner scan_input = new Scanner(System.in);
		score = scan_input.nextInt(); 
		

		//style3 : ��ø����
		
		if ( score >=0 && score <=100 ){ //�Է¿��� Ȯ��
			if(score <=100 && score >=90){//��
				System.out.println("�� �Դϴ�");
			}
			else if(score >=80 && score <90){ //�� 
				System.out.println("�� �Դϴ�.");
			}
		    else if( score >=70 && score <80 ){ //�� 
				System.out.println("�� �Դϴ�.");
			}
			else if( score >=60 && score <70 ){ //�� 
				System.out.println("�� �Դϴ�.");
			}
			else{//��
				System.out.println("�� �Դϴ�.");
			}
		}//�Է¿���&������� if end

		else{
			System.out.println("�Է¿����Դϴ�.");
		}


	}//main end
}//class end
