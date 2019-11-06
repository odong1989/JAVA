//회원정보 관리 프로그램
import java.util.Scanner;
class MemberTest3 {
	Member ar[] = new Member[5];		//회원정보를 담을 배열 생성
	int count;							//현재까지 저장된 회원 수
	Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		MemberTest3 m = new MemberTest3();

		while (true) {
			int num = m.menuPrint();		//메뉴 출력하고 메뉴번호 입력받음
			switch (num) {					//메뉴 번호에 따라 메소드 호출
				case 1: m.input(); break;
				case 2: m.output(); break;
				case 3: m.search(); break;
				case 0: System.out.println("프로그램을 종료합니다."); 
						return;
			}
		}
	}
	
	//메뉴 출력 메소드
	public int menuPrint() {
		int n = 0;
		System.out.println("[회원관리 프로그램]");
		System.out.println("1. 등록");
		System.out.println("2. 전체 목록");
		System.out.println("3. 검색");
		System.out.println("0. 종료");
		System.out.print("선택 > ");

		//0,1,2,3번이 아니면 다시 입력 받음
		while (true) {
			n = scan.nextInt();
			if (n < 0 || n > 3) {
				System.out.println("다시 선택하세요.");
			}
			else {
				break;
			}
		}
		return n;
	}

	//회원 등록 메소드
	public void input() {
		System.out.println("[회원 등록]");

		//준비한 배열이 모두 찼을때는 2배 크기로 늘림
		if (count == ar.length) {
			Member x[] = new Member[ar.length * 2];
			for (int i = 0; i < count; i++) {
				x[i] = ar[i];
			}
			ar = x;
		}

		ar[count] = new Member();
		System.out.print("이름:");
		ar[count].setName(scan.next());
		System.out.print("생년월일(YYMMDD):");
		ar[count].setBirth(scan.next());
		System.out.print("키:");
		ar[count].setHeight(scan.nextDouble());
		System.out.print("몸무게:");
		ar[count].setWeight(scan.nextDouble());
		System.out.print("혈액형:");
		ar[count].setType(scan.next());

		count++;
		System.out.print("* 등록되었습니다.");
	}

	//전체 회원 출력 메소드
	public void output() {
		if (count == 0) {
			System.out.println("* 등록된 회원이 없습니다.");
			return;
		}

		System.out.println("[전체 회원 목록]");
		for (int i = 0; i < count; i++) {
			System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t"
			+ ar[i].getBmi() + "\t" + ar[i].getBmi("GRADE"));
		}
	}

	//회원 검색 메소드
	public void search() {
		System.out.println("[회원 검색]");
		System.out.print("검색할 회원 : ");
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
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			System.out.println("총 " + n + "건이 검색되었습니다.");
		}
	}
}
