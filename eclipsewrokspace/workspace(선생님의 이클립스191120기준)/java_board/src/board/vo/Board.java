package board.vo;

/**
 * 게시글 정보를 담을 VO 클래스
 */
public class Board {
	/**
	 * 글 번호
	 */
	private int num;
	/**
	 * 작성자 아이디
	 */
	private String id;
	/**
	 * 글 제목
	 */
	private String title;
	/**
	 * 글 내용
	 */
	private String contents;
	
	/**
	 * 기본 생성자
	 */
	public Board() {
	}

	/** 
	 * 4개의 초기값을 전달받는 생성자
	 * @param num 글번호
	 * @param id 작성자 아이디
	 * @param title 글 제목
	 * @param contents 글 내용
	 */
	public Board(int num, String id, String title, String contents) {
		this.num = num;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}

	/**
	 * Setter, Getter 메소드들
	 */
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

	/**
	 * Object의 toString() 메소드 오버라이딩
	 */
	@Override
	public String toString() {
		return "글번호:" + num + ", 작성자:" + id + ", 제목:" + title + ", 내용" + contents;
	}
}
