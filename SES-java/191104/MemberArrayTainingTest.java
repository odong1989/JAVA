import java.util.Scanner;

class MemberArrayTainingTest
{
		public static void main(String[] args) 
	{
		//[1]5���� ȸ�������� ���� �迭 ����

		Scanner input = new Scanner(System.in);
		int MemArrayLength=5;//������ 5�������� �ð��� 2������ �켱����
		String tempSt;
		Double tempDb;

		MemberArrayTaining MemArray[];
		MemArray = new MemberArrayTaining[MemArrayLength];

		//[2]Ű����� �ݺ����� �̿��Ͽ� 5���� ȸ�������� �Է¹޴´�.
		for (int create =0 ; create< MemArrayLength ; create++)
		{
			MemArray[create]=new MemberArrayTaining();
		}
		
		for (int repeatIn =0; repeatIn < MemArrayLength ; repeatIn++)
		{
			tempSt = input.nextLine();
			System.out.print("ȸ���� �̸��� �Է��Ͻʽÿ�. :");
			tempSt = input.nextLine();		
			MemArray[repeatIn].setName(tempSt);

			System.out.print("ȸ���� ������� �Է��Ͻʽÿ�. (950101������) :");
			tempSt= input.nextLine();		//	tempSt= input.nextLine();
			MemArray[repeatIn].setDateOfBirth(tempSt);

			System.out.print("ȸ���� �������� �Է��Ͻʽÿ�. :");
			tempSt=input.nextLine();			//tempSt=input.nextLine();
			MemArray[repeatIn].setBloodType(tempSt);

			System.out.print("ȸ���� Ű�� �Է��Ͻʽÿ�. :");
			tempDb= input.nextDouble();			//tempDb= input.nextDouble();
			MemArray[repeatIn].setHeight(tempDb);

			System.out.print("ȸ���� �����Ը� �Է��Ͻʽÿ�. :");
			tempDb= input.nextDouble();		//	tempDb= input.nextDouble();
			MemArray[repeatIn].setWeight(tempDb);
			
			System.out.println("");
			System.out.println("");

		}

		//[3]�Ʒ��� ���� ����Ѵ�.
			/*
			�褷�� 28�� 18.7 ����
			�褷�� 21�� 33.7 ��
			�褷�� 28�� 18.7 ����
			�褷�� 28�� 18.7 ����
			�褷�� 28�� 18.7 ����
			*/
		for (int repeatOut =0; repeatOut<MemArrayLength ; repeatOut++)
		{

			System.out.println("ȸ���� ���� : " + MemArray[repeatOut].getName());
			System.out.println("ȸ���� ���� : " + MemArray[repeatOut].getAge());
			System.out.println("ȸ�� BMI���� : " + MemArray[repeatOut].getBmi());
			System.out.println("ȸ���� BMI�� : " + MemArray[repeatOut].getBmi("GRADE"));
			System.out.println("ȸ���� ������ : " + MemArray[repeatOut].getDateOfBirth());
			System.out.println("ȸ���� ������ : " + MemArray[repeatOut].getBloodType());

			System.out.println("ȸ���� Ű    : " + MemArray[repeatOut].getHeight()); 
			System.out.println("ȸ���� ������ : " + MemArray[repeatOut].getWeight());
			
			System.out.println("");		
			System.out.println("");
		}
		System.out.println("Hello World!");

	}
}
