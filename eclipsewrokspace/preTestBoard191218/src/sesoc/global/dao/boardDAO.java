package sesoc.global.dao;

public class boardDAO {
	private int num;
	private String id;
	private String title;
	private String contents;
	private int inputdate;
	private int hits;
	private int likes;
	
	
	//持失切
	public boardDAO() {
		super();
	}

	public boardDAO(int num, String id, String title, String contents, int inputdate, int hits, int likes) {
		super();
		this.num = num;
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.inputdate = inputdate;
		this.hits = hits;
		this.likes = likes;
	}

	//五社球
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

	public int getInputdate() {
		return inputdate;
	}

	public void setInputdate(int inputdate) {
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
		return "boardDAO [num=" + num + ", id=" + id + ", title=" + title + ", contents=" + contents + ", inputdate="
				+ inputdate + ", hits=" + hits + ", likes=" + likes + "]";
	}

		
}
