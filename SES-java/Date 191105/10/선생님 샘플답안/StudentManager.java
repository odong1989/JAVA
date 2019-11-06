//���� ���� ���α׷�
import java.util.Scanner;
class StudentManager {
	Student ar[] = new Student[5];		//�л������� ���� �迭 ����
	int count;							//������� ����� �л� ��
	Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		StudentManager m = new StudentManager();

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
		System.out.println("[�л����� ���α׷�]");
		System.out.println("1. ���");
		System.out.println("2. ��ü �л� ���� ���");
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

	//�л� ��� �޼ҵ�
	public void input() {
		System.out.println("[�л� ���]");

		//�غ��� �迭�� ��� á������ 2�� ũ��� �ø�
		if (count == ar.length) {
			Student x[] = new Student[ar.length * 2];
			for (int i = 0; i < count; i++) {
				x[i] = ar[i];
			}
			ar = x;
		}

		ar[count] = new Student();
		System.out.print("�̸�:");
		ar[count].setName(scan.next());
		System.out.print("��������:");
		ar[count].setKor(scan.nextInt());
		System.out.print("��������:");
		ar[count].setEng(scan.nextInt());
		System.out.print("��������:");
		ar[count].setMat(scan.nextInt());

		count++;
		System.out.print("* ��ϵǾ����ϴ�.");
	}

	//��ü �л� ��� �޼ҵ�
	public void output() {
		if (count == 0) {
			System.out.println("* ��ϵ� �л��� �����ϴ�.");
			return;
		}

		System.out.println("[��ü �л� ���]");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for (int i = 0; i < count; i++) {
				System.out.println(ar[i].getName() + "\t" 
					+ ar[i].getKor() + "\t"	+ ar[i].getEng() + "\t"
					+ ar[i].getMat() + "\t"	+ ar[i].getTotal() + "\t" 
					+ ar[i].getAvg() + "\t" + getRank(ar[i].getAvg()));
		}
	}

	//�л� �˻� �޼ҵ�
	public void search() {
		System.out.println("[�л� �˻�]");
		System.out.print("�˻��� �л� : ");
		String name = scan.next();
		int n = 0;

		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for (int i = 0; i < count; i++) {
			if (name.equals(ar[i].getName())) {
				n++;
				System.out.println(ar[i].getName() + "\t" 
					+ ar[i].getKor() + "\t"	+ ar[i].getEng() + "\t"
					+ ar[i].getMat() + "\t"	+ ar[i].getTotal() + "\t" 
					+ ar[i].getAvg() + "\t" + getRank(ar[i].getAvg()));
			}
		}

		if (n == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
		else {
			System.out.println("�� " + n + "���� �˻��Ǿ����ϴ�.");
		}
	}

	//���޹��� ������ ��ü �� ������� ���Ͽ� ����
	public int getRank(double avg) {
		int rank = 1;
		for (int i = 0; i < count; i++) {
			if (avg < ar[i].getAvg()) {
				rank++;
			}
		}
		return rank;
	}
}

/*
[ �л� ���� ���� ]
1. ���
2. ��ü �л� ���� ���
3. �˻�
0. ����

-����� �л��̸�, ��/��/�� ������ �Է¹޾� �迭�� ���� (Student Ŭ���� �̿�)
-����� �л��̸�, ��/��/�� ����, ����, ���, ������ ���
-�˻��� �л��̸��� �Է¹޾� ���� �̸��� �л����� ��� ���
*/
