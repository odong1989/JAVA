class Switch_EX 
{
	public static void main(String[] args) 
	{

	
	
	
	
	/*������ ���� �Է¹��� ����� Switch----------------------------------------------------------------------------*/

		String n ="x";

		switch (n) 
		//���ǽĿ� ���� ���� �� ���ڴ� �������� �־��ּ���(�Ǽ����� �Ұ��մϴ�.#float, double �Ұ�) 
		//java 10���� ���Ŀ��� ���ǽĿ� String���� ���� �� �ֽ��ϴ�.
		//byte, short���� ��밡���մϴ�.(��, int���� ����ȯ�ؾ� �մϴ�)
		//
		{
		case "x":
			System.out.println("n�� 1�Դϴ�.");
			break;//�̰� ������ �Ʒ��� case����� ������ ������.
			//OR����ó�� �Ʒ��� �͵鵵 ������ �����ų���� 
			//break�� ���� ��쵵 �ִ�.
		case "y":
			System.out.println("n�� 2�Դϴ�.");
			break;
		default :
			System.out.println("n�� �� ���� ���Դϴ�.");
			break;

		}
	}
}
