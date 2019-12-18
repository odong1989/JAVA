package global.sesoc.board.vo;

public class BoardVO {
	//1. ���� ����(SQL-board.sql�� �������� �״�� �մϴ�(�ڷ����� �ڹٷ�) 
	private int	   num;			//�۹�ȣ
	private String id; 			//�ۼ���ID
	private String title;		//����
	private String contents;	//����
	private String inputdate;	//�ۼ��ð�
	private int hits;			//��ȸ��
	private int likes;			//��õ��
	
	//2. ������
	//2.1 �⺻ ������
	public BoardVO(){
		//�⺻�����ڴ� �־�� �����ȳ��� ������ �ֽ��ϴ�.
	}
	
	//2.2 ���� ������ 
	//SQL�� INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS)
	public BoardVO(int num, String id, String title, String contents, String inputdate, int hits, int likes) {
		super();
		this.num = num;
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.inputdate = inputdate;
		this.hits = hits;
		this.likes = likes;
	}


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

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", id=" + id + ", title=" + title + ", contents=" + contents + ", inputdate="
				+ inputdate + ", hits=" + hits + ", likes=" + likes + "]";
	}
	 
	/* 19-12-13 1���� ���� ����
	 * --------SQL ����-----------
	 * �ܰ�1 : ����� ����(Į��) �� �ڷ��� ����
	 * �ܰ�2 : SQL - DB����(DB���̺� Ȯ��)
	 * �ܰ�3 : SQL �ۼ�(���̺������Ʈ)
	 * 
	 * --------�ڹ� ����-------------
	 * �ܰ�4 : VO��Ű�� BoardVO�ۼ�(java�� ����ڿ��� ���� �ޱ� ����) 
	 * �ܰ�5 : UI���� - BoardMain �ۼ� 
	 * �ܰ�6 : UI���� - BoardUI �ۼ� 
	 * 
	 * �̴�� 2���� ���ϴ� =_=
	 * */
	
}
