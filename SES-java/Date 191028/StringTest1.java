//������ ��Ʈ������ ������ ���� �ʹٸ� �̰ɺ���!!!
class StringTest1
{
	public static void main(String[] args) 
	{
		String a;	//�ʱ�ȭ�� ���� �ʾƼ� �������� ���
		String b=null;//������ �ƴϴ�. ����ų ��Ʈ�� ��ü�� ���� �����̴�. ����ų �갡 �ִٸ� 
		String c="abc"; //
		String d="abc"; //c�� ����Ű�� abc��ü�� ����Ű�� �ȴ�. ���̽�ó�� �����͸� �Ƴ������� ���� �긦 ����Ű�� �� ���ϴ�.
		String e=new String("abc");
		String f=new String("abc");

		
//		System.out.println(a);//���� ������ ���� �ʾƼ� �������� ���
		System.out.println(b);
		
		//c,d,e,f�� ����Ű�� �������� �������� Ȯ���Ѵ�.
		//[�����ǡ�]�˻�ó�� �Էµ� ���ڿ��� �������� Ȯ���Ϸ��ϸ� .equals�� ������ ����.
		System.out.println(c==d);
		System.out.println(e==f);

		//c��f�� ���ڿ��� �������� Ȯ���Ѵ�.
		//[�����ǡ�]����Ű�� �������� ������ �˰� �ʹٸ� c==f������ '=='��ȣ�� �������.
		System.out.println(c.equals(f));
		boolean x = c.equals(f);
		System.out.println( c.length() );	
		

		//NullPointerException ����-----------------------------------------------------------
//		System.out.println( b.length() );	
		//NullPointerException : ��ü�� �� ������� �־(new), �� ����Ű�� �ּҰ� ���� ��쿡 �߻��ȴ�. 
		//					     �����Ͻÿ��� ������ �ȳ����� ������ �������� �����̱⿡ �����Ϸ��� �Ű澲�� �ʴ� ��.
		//[��������] Exception in thread "main" java.lang.NullPointerException at StringTest1.main(StringTest1.java:27)
		//NullPointerException ����-----------------------------------------------------------
	
		//�迭�� .length String�� .length�� ������ 
		//  �迭�� ��� .length���� �Ұ�ȣ�� ������� �ʴ´�.
		//String ��� .length()���� �Ұ�ȣ�� ����Ѵ�!
		//���� �ƴѵ� ������ �򰥸��� ���蹮���� ���� ��~��! ����!!!

		a="abcABCabcABC";
		System.out.println( a.charAt(1) );	
		System.out.println( a.indexOf('c') );//[���]2�� �����Ѵ�. c�� ��ǥ�� 0���� �����ؼ� 2�̴�.	
		System.out.println( a.indexOf('d') );//[���]-1�� �����Ѵ�. �� ã���� ��� -1�� �����մϴ�.
		System.out.println( a.indexOf('c',3) );//c�� �˻��Ѵ�. ��, 3��° ĭ���� �����Ѵ�.
		System.out.println( a.indexOf("cccc") );
		System.out.println( a.lastIndexOf('A') );
//		System.out.println( a.substring('6') );
			

		a="Abc";
		System.out.println( a.lastIndexOf("abc") );
		System.out.println( a.valueOf("AB") );
		System.out.println( a. endsWith("c") ); //"c"�� �����°�?
		System.out.println( a. toUpperCase());	//���ڿ� ���� "b"�� ��� "B"�� �����ϼ���.
		System.out.println("");
		System.out.println( a.compareTo("abc") );//

		System.out.println("");
		a="abcde";
		System.out.println( a.compareTo("abc") );//���ڼ��� 2�ڸ����̳���(=���ڰ� 2�� �����ϴ�) ��� �ǹ̸� ���´�.
		System.out.println("");

		a="010-1234-5678";
		String array[] = a.split("-");
		for (int i=0;i<array.length ; i++)
		{
			System.out.println(array[i] );
		}
	}
}
