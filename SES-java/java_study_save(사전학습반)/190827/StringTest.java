class StringTest 
{
	public static void main(String[] args) 
	{
		String s = "Java �ڹ�";
		          //0123456 ������ ���ڵ��� ��ġ���� ���´�.(���鵵 ī�����Ѵ�) 
	//������ String s = new String("Java �ڹ�"); ��� �����Ͽ�
	//new�� Ȱ���ؾ� ������ �����ص� �ǵ��� StringŬ������ ���ǵǾ� �ִ�.

		System.out.println(s);

		char ch = s.charAt(3);
		System.out.println(ch);

		int t1 = s.indexOf('v');
		System.out.println(t1);
		int t2 = s.indexOf("v");
		System.out.println(t2);
		//'v' : �⺻ �ڷ����̴�(2����Ʈ)
		//"v" : ��ü�̴�.
		// v  


		int n = s.length();
		System.out.println("���ڼ� : "+n);

		String s2 = s.substring(0,4); //0���� 4�� ������.
		//substring(int beginIndex, int endIndex)
		System.out.println(s2);


		String s3 = s.substring(5); //5������ ������.
		//substring(int beginIndex)
		System.out.println(s3);


		s="ja";
		s=s+"va";
		System.out.println( s );
		System.out.println( s == "java" );//�ּҺ�(Not Good!)
		//false��� ����� ��´�.
		//������ ���� �ּҸ� ����Ű�Ĵ� �����̴�.(��, ���� ����� �ּҸ� ���� �񱳸� �Ѵٴ� ���̴�)
		//�ڹٴ� s�� java�� �ּҰ��� ���Ͽ� "�ٸ���!"��� �ǰ��� ���� ���̴�.

		System.out.println( s.equals("java") ); //�����(Good!)
		//true��� ����� ��� �ȴ�.
		//equals�� ��������μ� ������ "s�� ���尪�� 'java'�� �´°�?"���
		//����ڰ� ���ϴ� ������ �ǽõǾ���
		//������ java���� Ȯ��, �����ϱ⿡ TRUE��� ����� ���Դ�.
		//��� : ���ڿ��� ������ Ȯ���Ϸ��� �ݵ�� .equals() �޼ҵ带 ���Ͽ� ������ ������
	
		//.equals() �޼ҵ�� ����ҹ��ڸ� �����Ͽ� ���� �����ϴٸ�
		System.out.println( s.equalsIgnoreCase("java") ); //equalsIgnoreCase() �޼ҵ�� ��ҹ��� ������ �ʵ��� �ϸ� �ȴ�.
		System.out.println( s.startWith("ja") ); 
		System.out.println( s.endsWith("va") ); 

		/*
			������Ʈ ���� ���� �� �޼ҵ带 ���� ���ϴ�.
			api�� ���� �˼��� ����
		*/
	}
}
