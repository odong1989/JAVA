/**
| ��ǥ : ȸ���� �����ϸ� �Ʒ��� ������ �Է¹ް� ��¿�ó�� ���� �� �ֵ��� �Ͻʽÿ�.
| 
|
|
*/


public class Member{
//public class��� �� �����Ͻÿ�!!!
//public�� �Է����� ���� ���
//���� ��Ű����� �ص� ���� �������� ������ ����� �Ұ��ϴ�!!!

	//1. ������ �ڷ��� ����
	 private String name;
	 private String dateOfBirth;
	 private String bloodType;
	 private double height;
	 private double weight;


	//2. ������ ����(�ּ��� �⺻�����ڴ� ����)
		//2.1 �⺻������(���ص��� ���� ��±���� ���Ƿ� �־���)
		public Member()
		{
			System.out.println("�⺻�������Դϴ�. ���ظ� ���ؼ� ����������� ��.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}

		//2.2 ���ǻ�����(�� 2�� ��Ÿ��)
		public Member(String name, String dateOfBirth)
		{
			System.out.println("2��°(����1) ��Ÿ�� �������Դϴ�.");
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}
	


		public Member(String name, String dateOfBirth, double height, double weight, String bloodType)
		{
			 this.name = name;
			 this.dateOfBirth=dateOfBirth;
			 this.bloodType=bloodType;
			 this.height=height;
			 this.weight=weight;


			System.out.println("3��°(����2) ��Ÿ�� �������Դϴ�.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}
	


}
