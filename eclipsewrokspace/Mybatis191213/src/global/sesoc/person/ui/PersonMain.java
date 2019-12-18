package global.sesoc.person.ui;

import global.sesoc.person.dao.PersonDAO;

import java.util.ArrayList;
import java.util.Scanner;
import global.sesoc.person.vo.Person;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PersonMain {
	//UI�� �����ϹǷ� dao�� �ٷ� �����θ��� �˴ϴ�.
	PersonDAO dao = new PersonDAO();
	Person pe = new Person();	//�� ������ �������� ��Ƽ� �������� pe��ü �����Ͽ� ���� ��� ����.
	String searchName;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int selectMenu;
		PersonMain mainUI = new PersonMain();

		while(true) {
			selectMenu = mainUI.menuPrint();
			switch(selectMenu){
			case 1 : mainUI.menuInsertPerson();//System.out.println("1.ȸ���߰�");
					 break;
			case 2 : mainUI.menuUpdatePerson();//System.out.println("2.ȸ������");
					 break;
			case 3 : mainUI.menuDeletePerson(); //System.out.println("3.ȸ������");	
					 break;
			case 4 : mainUI.menuShowAllPerson(); //System.out.println("4.ȸ����ü���");
			 		 break;
			case 5 : mainUI.menuUpdatePersonByNumber(); //System.out.println("5.��ȣ�� �˻�");	
			 		 break;					 
			case 6 : mainUI.menuSearchPersonByName(); //System.out.println("6.�̸����ΰ˻�");	
	 		 		 break;					 					 
					 
			case 0 : System.out.println("���α׷�����");
					 return;
			}
		}
	}//mainMethod END

	//0)�޴���¸޼ҵ�
	public int menuPrint(){
		int num;		
		System.out.println("\n\n [ȸ������SQL]");
		System.out.println("1.ȸ���߰�");
		System.out.println("2.ȸ������");
		System.out.println("3.ȸ������");	
		System.out.println("4.ȸ����ü���");
		System.out.println("5.��ȣ�� �˻�");	
		System.out.println("6.�̸����ΰ˻�");
		System.out.println("0.����");		
		System.out.print("�ǽ��� ���μ��� ��ȣ : ");		
		
		while(true) {
			num=scan.nextInt();
			scan.nextLine();
			if(num<0 || num>6){
				System.out.println("1~6�� �Է��Ͽ� �ֽʽÿ�.");
			}
			break;
		}
		return num;
	}//menuPrint END
	
	//1)�Է¸޼ҵ�
	public void menuInsertPerson(){
		String name;
		int setAge;

		System.out.println("\n[1.ȸ���߰�]");
			
		System.out.print("�߰��� ȸ���� �̸� : ");
		name=scan.nextLine();
		pe.setName(name);
		
		System.out.print("�߰��� ȸ���� ���� : ");
		setAge=scan.nextInt();
		scan.nextLine();
		pe.setAge(setAge);
		dao.insertPerson(pe);		
	}
	
	//2)�����޼ҵ�
	public void menuUpdatePerson(){
		//19.12.11 ����SQL
		int targerNum;
		int setAge; 

		System.out.print("������ ������� ��ȣ : ");
		targerNum=scan.nextInt();
		scan.nextLine();
		pe.setNum(targerNum); 
		
		
		System.out.print("������ ���� : ");
		setAge=scan.nextInt();
		scan.nextLine();
		pe.setAge(setAge);
		
		
		
		int n = dao.updatePerson(pe);//DAOŬ�������� �޼ҵ带 ������ �մϴ�.
		//int n�� Ȱ���Ͽ� dao.updatePerson(pe);���� ���Ϲ��� ������ ���� ���� Ȱ���Ͽ� �����������
		if(n != 0){
			System.out.println("�����Ǿ����ϴ�.");
		}
		else{
			System.out.println("�ش�ȸ���� �����ϴ�.");			
		}
	}//menuUpdatePerson END 

	//3)�����޼ҵ�
	public void menuDeletePerson(){
		int targetDelete;
		System.out.print("������ ����� �ѹ� : ");	
		targetDelete = scan.nextInt();
		scan.nextLine();
		
		dao.deletePerson(targetDelete);	
	}
	
	
	//4)���ȸ����¸޼ҵ�

	public void menuShowAllPerson(){	
		ArrayList<Person> resultNames = new ArrayList<>();	
		resultNames = dao.ShowAllPerson();
		
		if (resultNames == null || resultNames.size() == 0){	
			System.out.println("����� ȸ���� �����ϴ�");
		}
		else{	 
			for(int print=0; resultNames.size()>print ;print++ ) {
			System.out.printf("��ȣ : %d | �̸� : %s | ���� : %d \n",
							  resultNames.get(print).getNum(),
							  resultNames.get(print).getName(),
							  resultNames.get(print).getAge()
							 );
			}//for END
		}//else END				
		
	}
	
	//5)ȸ���˻�-��ȣ�� -------------------------------------
	public void menuUpdatePersonByNumber(){
		int searchNum; 
		int setingAge;
		//�ܰ�1.�˻��� ȸ���� ��ȣ�� �Է¹޴´�.		
		System.out.println("�˻��� ȸ���� ��ȣ�� �Է����ּ��� : ");
		searchNum = scan.nextInt();
		scan.nextLine();//���ÿ� ���� ���Ͱ� ������					
		pe = dao.selectPerson(searchNum);
		
		if (pe == null){
			System.out.println("�ش� ��ȣ�� ȸ���� �����ϴ�.");
		}
		else{	 
			System.out.printf("��ȣ : %d | �̸� : %s | ���� : %d \n",
							   pe.getNum(), pe.getName(), pe.getAge() );			
		}
	}//menuUpdatePersonByNumber END


	//6)ȸ���˻�-�̸�����
	public void menuSearchPersonByName(){
		String searchName;
		ArrayList<Person> resultNames = new ArrayList<>();	
		System.out.print("�˻��� ȸ���� �̸��� �Է����ּ��� : ");
		searchName = scan.next();
		resultNames = dao.selectPersonByname(searchName);
		
		if (resultNames == null || resultNames.size() == 0){	
			System.out.println("�ش��̸����� �˻��� ȸ���� �����ϴ�");
		}
		else{	 
			for(int print=0; resultNames.size()>print ;print++ ) {
			System.out.printf("��ȣ : %d | �̸� : %s | ���� : %d \n",
							  resultNames.get(print).getNum(),
							  resultNames.get(print).getName(),
							  resultNames.get(print).getAge()
							 );
			}//for END
		}//else END			
	}//menuSearchPersonByName END-------------------------------
	
}// class PersonMain END
