//MemberArrayTaining Ŭ������ Ȱ���Ͽ� ȸ�� 5�� �� ���� �������α׷��� 
//�������� ���� �����ִ� �ǵ��2
import java.util.Scanner;

class MemberArrayTainingTeacher2
{
	//[1]2���� ȸ�������� ���� �迭 ����(#���� �� �迭ĭ���� link(��ü����)�Ȱ� �ƴϾ�!))
	MemberArrayTaining ar[] = new MemberArrayTaining[5];	
	Scanner scan = new Scanner(System.in);
	int countAr=0;

	public static void main(String[] args) 
	{
		MemberArrayTainingTeacher2 staticMethodExe = new MemberArrayTainingTeacher2();
		
		while(true){
			//�޴� ���
			int menuNum =staticMethodExe.menuPrint();
			switch (menuNum)
			{
				case 1 : System.out.println("1. �Է� �޴��Դϴ�.\n");
						 staticMethodExe.inputPersonMemberData();break;

				case 2 : System.out.println("2. ������ �޴��Դϴ�.\n");	
						 staticMethodExe.output();break;

				case 3 : System.out.println("3. �˻� �޴��Դϴ�.\n");			
						 break;

				case 0 : System.out.println("0. ���� �޴��Դϴ�.\n"); return;
				default : System.out.println("�޴���ȣ�� ���ڸ� �Է����ּ���.\n");	break;
			}//swtitch END
		}//while END				

	}//main END


	//�޴� ��� �޼ҵ�
	public int menuPrint(){
		int input=0;
		System.out.println("[ȸ������ ���α׷�]");			
		System.out.println("1. ���");			
		System.out.println("2. ��ü���");			
		System.out.println("3. �˻�");			
		System.out.println("0. ����");			
		System.out.println("�����Ͻ� �޴��� ��ȣ : ");			
		input=scan.nextInt();
		return input;
	}


	public void output()
	{
						
		for (int repeatOut =0; repeatOut < countAr ; repeatOut++)
		{
			if(countAr==0){
			System.out.println("����� ����� �����ϴ�.\n");
			break;}
		
			System.out.println("ȸ���� ���� : " + ar[repeatOut].getName());
			System.out.println("ȸ���� ���� : " + ar[repeatOut].getAge());
			System.out.println("ȸ���� ������ : " + ar[repeatOut].getDateOfBirth());
			System.out.println("ȸ���� ������ : " + ar[repeatOut].getBloodType());
			System.out.println("ȸ���� Ű    : " + ar[repeatOut].getHeight()); 
			System.out.println("ȸ���� ������ : " + ar[repeatOut].getWeight());		
		}

	}



	public void inputPersonMemberData() 
	{
		//�غ��� �迭�� ��� á�� ��� 2��� ũ�⸦ �ø��ÿ�.
//		if(countAr == ar.length)
//		{
//			MemberArrayTaining ar[] = new MemberArrayTaining[ar.length*2];
//		}

			//[2]�迭�鿡�� ��ü�� link(��ü�����Ͽ� ��ü�� �ּҸ� �Ҵ�)
			ar[countAr]= new MemberArrayTaining();


			//[3]�� �迭ĭ�鿡�� ���� �Է�.
			System.out.print("�̸� �Է� :");
			ar[countAr].setName(scan.next());

			System.out.print("����� �Է� :");
			ar[countAr].setDateOfBirth(scan.next());
		
			System.out.print("������ �Է� :");
			ar[countAr].setBloodType(scan.next());

			//System.out.print("Ű �Է� :");
			//ar[countAr].getHeight(scan.nextDouble());

			//System.out.print("������ �Է� :");
			//ar[countAr].getWeight(scan.nextDouble());
			countAr++;
			System.out.println("��ϿϷ�");

	}



}//Class END