import java.io.file;
import java.io.Reader;

class PackageTest
{
	public static void main(String[] args) 
	{
		//import �ʰ� �ش� Ŭ������ Ŭ������ Ȱ���ϴ� ���
		java.lang.String a= new String("abc");
		aaa.bbb.String b= new String("abc");
		//
		


		StringBuffer c= new StringBuffer("abc");
		StringBuffer d= new StringBuffer("abc");

		System.out.println("String a       :" + a);
		System.out.println("String b       :" + b);
		System.out.println("StringBuffer c :" + c);
		System.out.println("StringBuffer d :" + d);

		a= a+"d";
		/*
		a= a+"d";
		String ��� ���ο� ���ڸ� �߰��� ��� ������ �ּҹ����� ������
		���ο� �������� ��ũ�Ѵ�.
		�� a�� ������ abc�� ����Ǿ��ִ� 100������ ������
		abcd��� ���ο� ���ڿ��� ������ �ּ� 500������ ���� ��ũ�ϰ� �ȴ�. 
		
		*/
		
		
		c.append("d");
		System.out.println("a�� b�� �ּҴ� ����?(a == b):" + a == b );
		//a�� �ּҸ� ����Ű�� �����̴�.
		//�� "a�� �ּҿ� b�� �ּҴ� ����??"��� ���� �Ͱ� �ٸ��ٰ� ����.
		System.out.println("c�� d�� ���� ����?(c == d) :" + c == d);
		System.out.println(" :" + a.equals(b));
		System.out.println(" :"+c.equals(d));
		

	}
}
