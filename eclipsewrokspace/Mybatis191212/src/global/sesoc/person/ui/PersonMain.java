package global.sesoc.person.ui;

import global.sesoc.person.dao.PersonDAO;

import java.util.ArrayList;
import java.util.Scanner;
import global.sesoc.person.vo.Person;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PersonMain {
	//UI는 생략하므로 dao를 바로 직접부르게 됩니다.
	PersonDAO dao = new PersonDAO();
	Person pe = new Person();	//값 보낼게 여러개라 담아서 보낼려고 pe객체 생성하여 값을 담아 전송.
	String searchName;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int selectMenu;
		PersonMain mainUI = new PersonMain();

		while(true) {
			selectMenu = mainUI.menuPrint();
			switch(selectMenu){
			case 1 : mainUI.menuInsertPerson();//System.out.println("1.회원추가");
					 break;
			case 2 : mainUI.menuUpdatePerson();//System.out.println("2.회원수정");
					 break;
			case 3 : mainUI.menuDeletePerson(); //System.out.println("3.회원삭제");	
					 break;
			case 4 : mainUI.menuShowAllPerson(); //System.out.println("4.회원전체출력");
			 		 break;
			case 5 : mainUI.menuUpdatePersonByNumber(); //System.out.println("5.번호로 검색");	
			 		 break;					 
			case 6 : mainUI.menuSearchPersonByName(); //System.out.println("6.이름으로검색");	
	 		 		 break;					 					 
					 
			case 0 : System.out.println("프로그램종료");
					 return;
			}
		}
	}//mainMethod END

	//0)메뉴출력메소드
	public int menuPrint(){
		int num;		
		System.out.println("\n\n [회원관리SQL]");
		System.out.println("1.회원추가");
		System.out.println("2.회원수정");
		System.out.println("3.회원삭제");	
		System.out.println("4.회원전체출력");
		System.out.println("5.번호로 검색");	
		System.out.println("6.이름으로검색");
		System.out.println("0.종료");		
		System.out.print("실시할 프로세스 번호 : ");		
		
		while(true) {
			num=scan.nextInt();
			scan.nextLine();
			if(num<0 || num>6){
				System.out.println("1~6만 입력하여 주십시오.");
			}
			break;
		}
		return num;
	}//menuPrint END
	
	//1)입력메소드
	public void menuInsertPerson(){
		String name;
		int setAge;

		System.out.println("\n[1.회원추가]");
			
		System.out.print("추가할 회원의 이름 : ");
		name=scan.nextLine();
		pe.setName(name);
		
		System.out.print("추가할 회원의 나이 : ");
		setAge=scan.nextInt();
		scan.nextLine();
		pe.setAge(setAge);
		dao.insertPerson(pe);		
	}
	
	//2)수정메소드
	public void menuUpdatePerson(){
		//19.12.11 수정SQL
		int targerNum;
		int setAge; 

		System.out.print("수정할 대상자의 번호 : ");
		targerNum=scan.nextInt();
		scan.nextLine();
		pe.setNum(targerNum); 
		
		
		System.out.print("수정할 나이 : ");
		setAge=scan.nextInt();
		scan.nextLine();
		pe.setAge(setAge);
		
		
		
		int n = dao.updatePerson(pe);//DAO클래스에서 메소드를 만들어야 합니다.
		//int n을 활용하여 dao.updatePerson(pe);에서 리턴받은 수정된 행의 값을 활용하여 수정여부출력
		if(n != 0){
			System.out.println("수정되었습니다.");
		}
		else{
			System.out.println("해당회원이 없습니다.");			
		}
	}//menuUpdatePerson END 

	//3)삭제메소드
	public void menuDeletePerson(){
		int targetDelete;
		System.out.print("삭제할 대상자 넘버 : ");	
		targetDelete = scan.nextInt();
		scan.nextLine();
		
		dao.deletePerson(targetDelete);	
	}
	
	
	//4)모든회원출력메소드

	public void menuShowAllPerson(){	
		ArrayList<Person> resultNames = new ArrayList<>();	
		resultNames = dao.ShowAllPerson();
		
		if (resultNames == null || resultNames.size() == 0){	
			System.out.println("저장된 회원이 없습니다");
		}
		else{	 
			for(int print=0; resultNames.size()>print ;print++ ) {
			System.out.printf("번호 : %d | 이름 : %s | 나이 : %d \n",
							  resultNames.get(print).getNum(),
							  resultNames.get(print).getName(),
							  resultNames.get(print).getAge()
							 );
			}//for END
		}//else END				
		
	}
	
	//5)회원검색-번호로 -------------------------------------
	public void menuUpdatePersonByNumber(){
		int searchNum; 
		int setingAge;
		//단계1.검색할 회원의 번호를 입력받는다.		
		System.out.println("검색할 회원의 번호를 입력해주세요 : ");
		searchNum = scan.nextInt();
		scan.nextLine();//스택에 남을 엔터값 삭제용					
		pe = dao.selectPerson(searchNum);
		
		if (pe == null){
			System.out.println("해당 번호의 회원이 없습니다.");
		}
		else{	 
			System.out.printf("번호 : %d | 이름 : %s | 나이 : %d \n",
							   pe.getNum(), pe.getName(), pe.getAge() );			
		}
	}//menuUpdatePersonByNumber END


	//6)회원검색-이름으로
	public void menuSearchPersonByName(){
		String searchName;
		ArrayList<Person> resultNames = new ArrayList<>();	
		System.out.print("검색할 회원의 이름을 입력해주세요 : ");
		searchName = scan.next();
		resultNames = dao.selectPersonByname(searchName);
		
		if (resultNames == null || resultNames.size() == 0){	
			System.out.println("해당이름으로 검색된 회원이 없습니다");
		}
		else{	 
			for(int print=0; resultNames.size()>print ;print++ ) {
			System.out.printf("번호 : %d | 이름 : %s | 나이 : %d \n",
							  resultNames.get(print).getNum(),
							  resultNames.get(print).getName(),
							  resultNames.get(print).getAge()
							 );
			}//for END
		}//else END			
	}//menuSearchPersonByName END-------------------------------
	
}// class PersonMain END
