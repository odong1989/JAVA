package global.sesoc.oop.collection;

import java.util.Scanner;
import java.util.ArrayList;

class ListTestArrayList2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> slist = new ArrayList<>();
		String n;
		int k,e,m;	

		while(true) {
			System.out.print("��   �� : ");	
			n = scan.next();
			System.out.print("�������� : ");	
			k = scan.nextInt();
			System.out.print("�������� : ");	
			e = scan.nextInt();
			System.out.print("�������� : ");	
			m = scan.nextInt();	
			
			slist.add(new Student(n,k,e,m));
			System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n)");
			if(scan.next().equalsIgnoreCase("n")){
				break;	
			}
		}

//����� �̿��Ͽ� �����ϰ� �˴ϴ�.
		System.out.println(slist);//�̷��� �ϸ� ����� �޸� �ּҰ��� �˷��ش�. �츮�� ���ϴ°� �����°� �ƴ���.
		System.out.print(slist.get(0).getName());
		System.out.print(slist.get(0).getKor());
		System.out.print(slist.get(0).getEng());
		System.out.print(slist.get(0).getMath());
		Student s = new Student("ȫ�浿", 100, 100,100);
		
		
//		System.out.println(slist.indexOf(s));
	//�迭�� ������, 3��° �� ������ �غ�����.


	}

}