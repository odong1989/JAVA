package global.sesoc.java1.oop1113;
//게시판의 글 정보 1개를 담을 VO class
public class Board {
	private int num;			//글번호 (1,2,...)
	private String id;			//작성자 ID (abc)
	private String title;		//제목
	private String contents;	//글내용
	
	//기본생성자
	public Board() {
	}

	//4개의 초기값을 전달받는 생성자
	public Board(int num, String id, String title, String contents) {
		super();
		this.num = num;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}

	//get, set 메서드들
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
		//이름과 국영수 점수가 모두 같으면 true
		if (num == b.num && id.equals(b.id) && title.equals(b.title) && contents.equals(b.contents)) {
			return true;
		}
		else {
			return false;
		}
	}
}
