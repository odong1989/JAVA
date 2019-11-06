//����� ���� �ڷ���
class Student
{
	//�Ӽ� = ���� (�������, �ʵ�)
	//���������� (public > protected > (default) > private)
	private String name;	//�л� �̸�
	private int kor;		//���� ����
	private int eng;		//���� ����
	private int mat;		//���� ����
	
	//������
	public Student() {
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(int kor, int eng, int mat) {
		this();	//���� Ŭ���� ���� �ٸ� �����ڸ� ȣ��
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public Student(String name, int kor, int eng, int mat) {
		this(kor, eng, mat);
		this.name = name;
	}

	//��� = �޼ҵ� 
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

	//���� ���Ͽ� �����ϴ� �޼ҵ�
	public int getTotal() {
		int t = kor + eng + mat;
		return t;
	}
	//��� ���Ͽ� �����ϴ� �޼ҵ� 
	public double getAvg() {
		double d = this.getTotal() / 3.0;
		return d;
	}
	//��~�� ������ ����� �����ϴ� �޼ҵ�
	public String getGrade() {
		String g = null;
		switch ((int) getAvg() / 10) {
			case 10:
			case 9: g = "��"; break;
			case 8: g = "��"; break;
			case 7: g = "��"; break;
			case 6: g = "��"; break;
			default: g = "��";
		}
		return g;
	}

}
