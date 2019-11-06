//사용자 정의 자료형
class Student
{
	//속성 = 변수 (멤버변수, 필드)
	//접근지정자 (public > protected > (default) > private)
	private String name;	//학생 이름
	private int kor;		//국어 점수
	private int eng;		//영어 점수
	private int mat;		//수학 점수
	
	//생성자
	public Student() {
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(int kor, int eng, int mat) {
		this();	//같은 클래스 내의 다른 생성자를 호출
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public Student(String name, int kor, int eng, int mat) {
		this(kor, eng, mat);
		this.name = name;
	}

	//기능 = 메소드 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKor(int k) {
		if (k < 0 || k > 100) {
			return;
		}
		this.kor = k;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int e) {
		if (e < 0 || e > 100) {
			return;
		}
		this.eng = e;
	}
	public int getEng() {
		return eng;
	}
	public void setMat(int m) {
		if (m < 0 || m > 100) {
			return;
		}
		this.mat = m;
	}
	public int getMat() {
		return mat;
	}
	public void print() {
		System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.mat);
	}

	//총점 구하여 리턴하는 메소드
	public int getTotal() {
		int t = kor + eng + mat;
		return t;
	}
	//평균 구하여 리턴하는 메소드 
	public double getAvg() {
		double d = this.getTotal() / 3.0;
		return d;
	}
	//수~가 까지의 등급을 리턴하는 메소드
	public String getGrade() {
		String g = null;
		switch ((int) getAvg() / 10) {
			case 10:
			case 9: g = "수"; break;
			case 8: g = "우"; break;
			case 7: g = "미"; break;
			case 6: g = "양"; break;
			default: g = "가";
		}
		return g;
	}

}
