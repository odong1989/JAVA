class TypeTest2
{
	public static void main(String[] args) 
	{
		//����1. ��������(��ǰ����, ���԰�������)
		int price;	//����
		int ea;			//����
		int total_price;	//����� ����


		price = 3500;
		ea = 5;

		//����2. ���
		total_price = price * ea;

		//����3. ������
		//��¹��1 - �� ������ �����ϰδ�!(#only println)
		System.out.println("���� �� �ݾ��� ");
		System.out.println(total_price+"�� �Դϴ�.");

		//��¹��2 - �̷��� ������ ����!(print&println)
		System.out.print("���� �� �ݾ��� ");
		System.out.println(total_price+"�� �Դϴ�.");

		//��¹��3 - �� ��ť�� ���Ŵ�(+ ���� �̾���̱�)
		System.out.println("���� �� �ݾ��� "+total_price+"�� �Դϴ�.");

//2���� ��----


//3���� ����------
		//3���ô� �����ڷ���(57������ - ��ü,�迭,enum��..) ����

		char ch = 'A'; //�⺻�ڷ���
		String s ="A"; //�����ڷ���(���۷��� ��������)

		// 1  : ���ڰ� 1�̴�. 
		//'1' : �����ڵ�� 49�� ���´�.
		//"1" : 1�� ��ġ�� �ּҰ��� ���´�.

		System.out.println(1 + 1);
		System.out.println(1 + '1');
		System.out.println("1");
		System.out.println(1 + "1");
		System.out.println(1 + "1" +'1');
		System.out.println(1 + '1' + "1");


		System.out.println("----------------------------");


		System.out.println(1 + 1);
		System.out.println(1 + ch);
		System.out.println(s);
		System.out.println(1 + s);
		System.out.println(1 + s +ch);
		System.out.println(1 + ch + s);
	}
}