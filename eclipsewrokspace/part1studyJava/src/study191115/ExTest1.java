/*
 * 191115�� ����-����ó������ �����Դϴ�.
 * */

package study191115;

//����ó�� ����
public class ExTest1 {
	public static void main(String[] args)
	{
		//part1.���� ���� �� �ʱⰪ �����ϴ� ����.
		String a= "11";//��ó�� ����ܿ��� ���ڷ� �ٲ� ������ ���� �Էµ� ���
		String b= "0";
		int i,j,k;
		
		//part2.�Էµ� ������ ó���ϴ� ����.
		//part3.����ó���� �ϴ±���.
		//try : ���ܰ� �߻��� ������ �ִ� ������ �����մϴ�.
		try {
			i=Integer.parseInt(a);
			j=Integer.parseInt(b);
			k=i/j;
			System.out.println(k);
		}		

		catch(NumberFormatException e) {//�Է°��� ���ڰ� �ƴ� ���(null����)
			System.out.println("���ڰ� �ƴմϴ�");
		}
		
		catch(ArithmeticException e) {//������ ��(b)�� 0�ΰ��
			System.out.println("������ ��(b)�� 0���� ����������.");		
			//return;//return�� �ᵵ finally���� ����˴ϴ�.`
			//System.exit(0);//System.exit(0);�� finally�� �������� �ʰ� �ٷ� �����ع�����.
			//[?]�� ���ϵ��� �����ϱ�?
			//�����ϴ� ���α׷��� ���� �����ؾ� �� ���� �ְ�,
			//�ݺ��� ���� ������ ������ ���μ����� �پ�Ѿ�� �ϴ� ��쵵 ����.
			//�׷��� ��Ȳ�� �����Ͽ� �غ��� �̴ϴ�.
		} 
		catch(Exception e) {//�̿��� �������� ���ð���Դϴ�. 
			//ExceptionŬ������  NumberFormatException,ArithmeticException����
			//������ Ŭ�����̱⿡ ���߿� catch���� �ۼ��ϰ� �˴ϴ�.
			//API������ Tree�� ���� ���� Ŭ�����ϼ���catch�� ���߿� �ۼ��ϼ���.
			//�׷��� �����ϰ� ����ó���� �� �� �ֽ��ϴ�. ����Ŭ������ ���� ���ü��� ����ó���� �������ϴ�.
			
			System.out.println("�� ���� �����Դϴ�.");		
			return;
		} 
			
		finally{
			System.out.println("finallyBlock");			
		}

		System.out.println("���α׷��� �����մϴ�.");
		//System.out.println("���α׷��� �����մϴ�.");�� ����ȵǴ� ���� �Ʒ��� ����.
		//���1 : �߰��� ������ ���� ������ ���Ѱ��.
		//���2 : catch���� return�� �ϰų�, exit(0)�� �Ͽ� ���α׷��� �߰��� �����Ų ���
	}
}
