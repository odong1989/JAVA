import java.util.Scanner;
/*
   3. �¾ �ظ� �Է¹޾� �츦 ����Ѵ�(1989�� -> ���)
[����] ���س⵵�� Ȯ���� %12 ������������ Ȱ���Ͽ� �츦 Ȯ���Ѵ�.
*/
class HW3_190809
{
	public static void main(String[] args) 
	{
		/*	�� ���α׷������� 1924��(���)�� �������� ����Ѵ�.

		(����⵵-1924)%����������->���������� 0�� ���, 1�� �Ҷ�... ������ �ǽ��Ѵ�.

	   	        ��  |   ��  |  ȣ���� | �䳢  |  ��  |   ��  |  ��  |  ��   | ������ |  ��  |  ��  |  ���� |   ��  |  ...
		�⵵    1924 | 1925 |  1926 | 1927 | 1928 | 1929 | 1930 | 1931 | 1932 | 1933 | 1934 | 1935 | 1936 |  ...
	   ������ ��   0  |   1  |    2  |  3   |   4  |   5  |  6   |  7   |   8  |   9  |  10  |  11  |  12  |
		*/ 

		int birth_year=0;
		String birth_line=" ";
		Scanner scan = new Scanner(System.in);

		System.out.println("����츦 ����մϴ�. ����⵵�� �Է����ּ���.");
		birth_year = scan.nextInt();


		if((birth_year-1924)%12 ==0){
		birth_line="��";
		}
		else if((birth_year-1924)%12 ==1){
		birth_line="��";
		}
		else if((birth_year-1924)%12 ==2){
		birth_line="ȣ����";
		}
		else if((birth_year-1924)%12 ==3){
		birth_line="�䳢";
		}		
		else if((birth_year-1924)%12 ==4){
		birth_line="��";
		}
		else if((birth_year-1924)%12 ==5){
		birth_line="��";
		}
		else if((birth_year-1924)%12 ==6){
		birth_line="��";
		}
		else if((birth_year-1924)%12 ==7){
		birth_line="��";
		}
		else if((birth_year-1924)%12 ==8){
		birth_line="������";
		}
		else if((birth_year-1924)%12 ==9){
		birth_line="��";
		}		
		else if((birth_year-1924)%12 ==10){
		birth_line="��";
		}
		else if((birth_year-1924)%12 ==11){
		birth_line="����";
		}

		System.out.println("�Է��Ͻ� ����⵵��" + birth_year);
		System.out.println(birth_line + "�� �Դϴ�.");
	}
}
