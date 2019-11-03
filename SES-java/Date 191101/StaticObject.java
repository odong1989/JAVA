class StaticObject 
{
	int num;		//��� ����
	static int cnt;	//Ŭ���� ����

	public void printNum()
	{
		System.out.println("num��"+this.num);
		return;
	}

	public static void printCnt()
	{
		System.out.println("cnt��" + cnt);
		/*this�� ��ü�� ����Ű�� ��ɾ��ε�
		  static int cnt;	Ŭ���� ������ �׷��� ������� �ʱ⿡ 
		  
		*/
		return;
	}


	//StaticObject�� �������Դϴ�.
	//�ֿ����(1)���������ڸ� public���� �Ѵ�.(������ �׻� public�� ���� �ƴ����� ���� �ۺ�)
	//�ֿ����(2)Ŭ�����̸��� �����ؾ��Ѵ�.
	//�ֿ����(3)��ȯŸ���� �������� �ʴ´�.(�Ϲ� �޼ҵ��� �ּ� void�� ������ �����ڴ� �׵��� �ž���)
	public StaticObject()
	{
		num++;
		cnt++;
		System.out.println(cnt+"��° ��ü�� �����Ǿ����ϴ�.");
	}

	/*
	�Ʒ�ó�� �ۼ��� ��� �ڹٴ� StaticObject()�� "�ܼ��� �ϳ��� �޼ҵ�"�θ� ����
	�����ڷ� ������� �ʴ´�.
	�׷��� public void StaticObject()�� �����ڸ� ��ǥ�� ��������� 
	public void StaticObject()
	{
		num++;
		cnt++;
		System.out.println(cnt+"��° ��ü�� �����Ǿ����ϴ�.");
	}
	*/

}
