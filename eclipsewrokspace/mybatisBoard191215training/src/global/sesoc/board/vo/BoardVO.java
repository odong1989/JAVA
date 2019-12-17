package global.sesoc.board.vo;

public class BoardVO {
	//1. 변수 생성(SQL-board.sql의 변수들을 그대로 합니다(자료형만 자바로) 
	private int	   num;			//글번호
	private String id; 			//작성자ID
	private String title;		//제목
	private String contents;	//내용
	private String inputdate;	//작성시간
	private int hits;			//조회수
	private int likes;			//추천수
	
	//2. 생성자
	//2.1 기본 생성자
	public BoardVO(){
		//기본생성자는 있어야 에러안나니 무조건 넣습니다.
	}
	
	//2.2 임의 생성자 
	//SQL의 INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS)
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
	 
	/* 19-12-13 1교시 내용 정리
	 * --------SQL 시작-----------
	 * 단계1 : 사용할 변수(칼럼) 및 자료형 결정
	 * 단계2 : SQL - DB형정(DB테이블 확정)
	 * 단계3 : SQL 작성(테이블생성파트)
	 * 
	 * --------자바 시작-------------
	 * 단계4 : VO패키지 BoardVO작성(java가 사용자에게 정보 받기 구성) 
	 * 단계5 : UI구성 - BoardMain 작성 
	 * 단계6 : UI구성 - BoardUI 작성 
	 * 
	 * 이대로 2교시 갑니다 =_=
	 * */
	
}
