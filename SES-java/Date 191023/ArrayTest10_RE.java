import java.util.Scanner;

class ArrayTest10_RE 
{
	public static void main(String[] args) 
	{
		String name[]={"���浿","�Ѹ�","��ġ","�����","����","����","�Ѱ���","����","���","������"};
		Scanner input=new Scanner(System.in);
		String input_name;

		System.out.print("�˻��� ���ϴ� �̸��� �Է� : ");
		input_name = input.next();

		for (int i=0 ; i<name.length ; )
		{
			if(input_name.equals(name[i]))
			{
				System.out.println(name[i]+"�� ã�ҽ��ϴ�.");
				System.out.println("�߰���ġ : " + i );
				break;
			}

			i++; //for i++
			if(i==name.length)
			{
				System.out.println("�˻���� ��ȸ���� �ʽ��ϴ�.");			
				break;
			}

		}

	}
}