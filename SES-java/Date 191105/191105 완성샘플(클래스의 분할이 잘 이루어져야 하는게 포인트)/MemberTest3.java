//ȸ������ ���� ���α׷�
import java.util.Scanner;
class MemberTest3 {
	Member ar[] = new Member[5];		//ȸ�������� ���� �迭 ����
	int count;							//������� ����� ȸ�� ��
	Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		MemberTest3 m = new MemberTest3();

		while (true) {
			int num = m.menuPrint();		//�޴� ����ϰ� �޴���ȣ �Է¹���
			switch (num) {					//�޴� ��ȣ�� ���� �޼ҵ� ȣ��
				case 1: m.input(); break;
				case 2: m.output(); break;
				case 3: m.search(); break;
				case 0: System.out.println("���α׷��� �����մϴ�."); 
						return;
			}
		}
	}
	
	//�޴� ��� �޼ҵ�
	public int menuPrint() {
		int n = 0;
		System.out.println("[ȸ������ ���α׷�]");
		System.out.println("1. ���");
		System.out.println("2. ��ü ���");
		System.out.println("3. �˻�");
		System.out.println("0. ����");
		System.out.print("���� > ");

		//0,1,2,3���� �ƴϸ� �ٽ� �Է� ����
		while (true) {
			n = scan.nextInt();
			if (n < 0 || n > 3) {
				System.out.println("�ٽ� �����ϼ���.");
			}
			else {
				break;
			}
		}
		return n;
	}

	//ȸ�� ��� �޼ҵ�
	public void input() {
		System.out.println("[ȸ�� ���]");

		//�غ��� �迭�� ��� á������ 2�� ũ��� �ø�
		if (count == ar.length) {
			Member x[] = new Member[ar.length * 2];
			for (int i = 0; i < count; i++) {
				x[i] = ar[i];
			}
			ar = x;
		}

		ar[count] = new Member();
		System.out.print("�̸�:");
		ar[count].setName(scan.next());
		System.out.print("�������(YYMMDD):");
		ar[count].setBirth(scan.next());
		System.out.print("Ű:");
		ar[count].setHeight(scan.nextDouble());
		System.out.print("������:");
		ar[count].setWeight(scan.nextDouble());
		System.out.print("������:");
		ar[count].setType(scan.next());

		count++;
		System.out.print("* ��ϵǾ����ϴ�.");
	}

	//��ü ȸ�� ��� �޼ҵ�
	public void output() {
		if (count == 0) {
			System.out.println("* ��ϵ� ȸ���� �����ϴ�.");
			return;
		}

		System.out.println("[��ü ȸ�� ���]");
		for (int i = 0; i < count; i++) {
			System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t"
			+ ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
		}
	}

	//ȸ�� �˻� �޼ҵ�
	public void search() {
		System.out.println("[ȸ�� �˻�]");
		System.out.print("�˻��� ȸ�� : ");
		String name = scan.next();
		int n = 0;

		for (int i = 0; i < count; i++) {
			if (name.equals(ar[i].getName())) {
				n++;
				System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t"
				+ ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
			}
		}

		if (n == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
		else {
			System.out.println("�� " + n + "���� �˻��Ǿ����ϴ�.");
		}
	}
}
