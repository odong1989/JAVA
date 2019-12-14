package global.sesoc.java1.oop1113;
//�Խ����� �� ���� 1���� ���� VO class
public class Board {
	private int num;			//�۹�ȣ (1,2,...)
	private String id;			//�ۼ��� ID (abc)
	private String title;		//����
	private String contents;	//�۳���
	
	//�⺻������
	public Board() {
	}

	//4���� �ʱⰪ�� ���޹޴� ������
	public Board(int num, String id, String title, String contents) {
		super();
		this.num = num;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}

	//get, set �޼����
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	//toString
	@Override
	public String toString() {
		return "Board [num=" + num + ", id=" + id + ", title=" + title + ", contents=" + contents + "]";
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Board)) {
			return false;
		}
		Board b = (Board) obj;
		//�̸��� ������ ������ ��� ������ true
		if (num == b.num && id.equals(b.id) && title.equals(b.title) && contents.equals(b.contents)) {
			return true;
		}
		else {
			return false;
		}
	}
}
