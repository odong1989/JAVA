import java.util.Random;
import java.util.Date;
import java.util.Calendar;


class MethTest //å222������
{
	public static void main(String[] args) 
	{

		//error//Math m = new Math();
		//static �޼����̱⿡ �����̴�! ��ü�ȿ� ���� ��ɵ��� ������ ���������� ���� �ǵ�
		//�� ������ �����ε� ���Ϸ� �޸𸮳����Ϸ��� ��ü�� ����� ������ ġ��?
		//�׷��� �� ��ɵ鸸 ����� �а�.

		//Integer i =new Integer();
		//private�� ���� �� ���밳 �ҷ��� �̷��� �ߴ�.
		//������ ����� StudentŬ���� ������ ��� �л��� �̸�, ������� �߿������� �ְ� �̸� 
		//�� ���θ����� �߿������� �����ϱ� ���� ����� ���̴�.

		double a = Math.pow(2,10);
		System.out.println(" a 2^10: "+a);
	     a = Math.pow(0.5,2);
		System.out.println(" a 0.5^2: "+a);
	
		System.out.println(" 3.5���� ������ �ø� Math.ceil() : "+Math.ceil(3.5));		//�ø�	
		System.out.println(" 3.5���� ������ ���� Math.floor() : "+Math.floor(3.5));		//����
		System.out.println(" 3.5���� �ݿø��� �� Math.round() : "+Math.round(3.5));		//�ݿø�	

		System.out.println(" 2�� �ŵ������� Math.sqrt() : "+Math.sqrt(2));		//������
		
		System.out.println(" -2 ���밪 Math.abs() : "+Math.abs(-2));		//���밪

		System.out.println(" 2�� 3�߿��� ū����? Math.max() : "+Math.max(2,3));		//ū���ּ���.
		System.out.println(" 2�� 3�߿��� ������? Math.min() : "+Math.min(2,3));		//�������� �ּ���


		//����Ŭ����---------------------------------------------------------------------
		//���� �ش� ����ε�, ������ import�� ����� �Ѵ�!!
		//import java.util.Random;
		Random r = new Random();
		int i = r.nextInt(100);
		System.out.println(i);//0~100������ ����


		//��¥ ���� Ŭ����---------------------------------------------------------------
		Date d = new Date();				//���� �ð����� ����
		Calendar c = Calendar.getInstance();//���� �ð����� ����.
		/*Calendar�� Ŭ���������� �����ؾ� �ϴµ� �����ڷ� ������ ���ϰ� ���Ƶξ���.
		  �׷��� ��� ������ ���ִ� getInstance()�޼ҵ忡�� ��Ź�Ͽ� ��ȸ�����ϴ� ����� ���ϰ� �ȴ�.
		*/

		System.out.println(" Date d : "+ d);		//ū���ּ���.
		System.out.println(" Calendar c : "+c);		//�������� �ּ���
	
	
	}
}
