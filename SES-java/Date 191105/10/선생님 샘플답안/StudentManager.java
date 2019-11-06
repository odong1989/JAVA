//성적 관리 프로그램
import java.util.Scanner;
class StudentManager {
	Student ar[] = new Student[5];		//학생정보를 담을 배열 생성
	int count;							//현재까지 저장된 학생 수
	Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		StudentManager m = new StudentManager();

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
		System.out.println("[학생관리 프로그램]");
		System.out.println("1. 등록");
		System.out.println("2. 전체 학생 성적 출력");
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

	//학생 등록 메소드
	public void input() {
		System.out.println("[학생 등록]");

		//준비한 배열이 모두 찼을때는 2배 크기로 늘림
		if (count == ar.length) {
			Student x[] = new Student[ar.length * 2];
			for (int i = 0; i < count; i++) {
				x[i] = ar[i];
			}
			ar = x;
		}

		ar[count] = new Student();
		System.out.print("이름:");
		ar[count].setName(scan.next());
		System.out.print("국어점수:");
		ar[count].setKor(scan.nextInt());
		System.out.print("영어점수:");
		ar[count].setEng(scan.nextInt());
		System.out.print("수학점수:");
		ar[count].setMat(scan.nextInt());

		count++;
		System.out.print("* 등록되었습니다.");
	}

	//전체 학생 출력 메소드
	public void output() {
		if (count == 0) {
			System.out.println("* 등록된 학생이 없습니다.");
			return;
		}

		System.out.println("[전체 학생 목록]");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for (int i = 0; i < count; i++) {
				System.out.println(ar[i].getName() + "\t" 
					+ ar[i].getKor() + "\t"	+ ar[i].getEng() + "\t"
					+ ar[i].getMat() + "\t"	+ ar[i].getTotal() + "\t" 
					+ ar[i].getAvg() + "\t" + getRank(ar[i].getAvg()));
		}
	}

	//학생 검색 메소드
	public void search() {
		System.out.println("[학생 검색]");
		System.out.print("검색할 학생 : ");
		String name = scan.next();
		int n = 0;

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
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
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			System.out.println("총 " + n + "건이 검색되었습니다.");
		}
	}

	//전달받은 점수가 전체 중 몇등인지 구하여 리턴
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
[ 학생 성적 관리 ]
1. 등록
2. 전체 학생 성적 출력
3. 검색
0. 종료

-등록은 학생이름, 국/영/수 점수를 입력받아 배열에 저장 (Student 클래스 이용)
-출력은 학생이름, 국/영/수 점수, 총점, 평균, 석차를 출력
-검색은 학생이름을 입력받아 같은 이름의 학생정보 모두 출력
*/
