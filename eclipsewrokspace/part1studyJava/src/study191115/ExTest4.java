package study191115;
import java.io.IOException;

public class ExTest4 {

	//���ĺ� �ѱ��ڸ� �Է¹ް��� �մϴ�.
	//�ڹ��� Ű���� ��ü System.in.read(); �� Ȱ���Ͽ� ó���մϴ�
	//(���ĺ� 1�������� Scanner�� �����ʰ� ó�������մϴ�)

	public static void main(String[] args)throws IOException {
		int a=0;


//����ó�����1 : try-catch�� ���Ͽ� ����ó���ϱ�.		
/*		try {
			System.out.println("���ĺ� 1���ڸ� �Է����ּ���");
			a = System.in.read();
		}
		catch(IOException error) 
		{
			//����ڿ��� �������� �����ȳ����� �Ʒ��Ͱ���.
			System.out.println("error : IOException error");
			System.out.println("���α׷��� ������ �߻��Ǿ����ϴ�. ���� �˼��մϴ�.");			

			//������ ������ ������� ����, �α׸� ���ؼ��� �Ʒ�ó�� �ۼ��մϴ�.
			error.printStackTrace();//
		}
		//read()�޼ҵ�� Unhandled exception type IOException
		//��,read()�޼ҵ�� �ڽ��� ����Ǹ� IOException�� ������ ������.
		//read()�޼ҵ� �ڽ��� ����Ǿ����� ����ó���� �����Ǵ���϶�� ��ȣ�� �������� ���̴�.
*/
		
//����ó�����2 : ���� ȣ���� �༮���� ó���϶�� ���ѱ��
//	public static void main(String[] args)throws IOException {
//  ������ �⺻���� �ٷ� �����ʿ� "throws IOException"�� �ۼ��Ѵ�.
//��, ���θ޼ҵ尡 �ڽ��� ������ �߻��� ������ IOException���� ���������� ���̴�.
//
//[?]IOException���� �������� ���ѱ�� ������ ��ϳ���?
//	public static void main(String[] args)throws Exception {
//  �̶�� �ϸ�˴ϴ�.
//  ����... �������� �ʾƿ�.
//  �̰� "�� ����ó�� ���� �ſ���! �ɴ�� �Ƕ���!" ���� ��å���̱� ������...
//  Ư�� main���� ���������⿡ 
		a = System.in.read();		
		System.out.println(a);
	
	}

}

/*	
 * try
 * catch
 * finally
 * throw
 * throws
 * 11��15���� �ٽ��� �̷��� ���� 5���� Ű��������.
 * 
 * 
 * �л����� student
 * 
 * 
 * */
