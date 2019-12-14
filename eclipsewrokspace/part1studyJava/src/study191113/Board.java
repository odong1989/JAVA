package study191113;
//게시판의 글 정보 1개를 담을 VO 클래스입니다.
public class Board {
	
	//[1]변수명
	//글번호(1,2,3....)	|int
	//작성자 ID			|String
	//제목				|String
	//글내용				|String
	
	private int postNumber;
	private String id;
	private String title;
	private String contents;

	
	//[2]생성자
	//기본생성자
	//4개의 값을 모두 받는 생성자

	//기본생성자
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	//4개의 값을 모두 받는 생성자
	public Board(int postNumber, String id, String title, String contents) {
		super();
		this.postNumber = postNumber;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}
	
	
	//[3]메소드들
	/*
	 * 	private int postNumber;
	 * 	private String id;
	 * 	private String title;
	 * 	private String contents;
	 * */
	
	//기본메소드
	//get, set 메소드들
	public void setPostNumber(int number)
	{
		this.postNumber=number;
	}
	public int getPostNumber()
	{
		return this.postNumber;
	}
	//------------------------------------------
	
	public void setId(String id)
	{
		this.id=id;
	}	
	
	public String getId()
	{
		return this.id;
	}
	
	//-------------------------------------------
	public void setTitle(String title)
	{
		this.title=title;
	}	
	
	public String getTitle()
	{
		return this.title;
	}	
	//-------------------------------------------
	
	public void setContents(String contents)
	{
		this.contents = contents;
	}	
	public String getContents()
	{	
		return this.contents;
	}		
	
	
	//오버라이딩 메소드
	//toString
	//toString이 ArrayList의 값들을 출력하도록 설정합니다.
	@Override
	public String toString() 
	{
		String overrideSt;
		overrideSt = getPostNumber() + " " + getId() + " " + getTitle() + " " + getContents();
		return overrideSt;
	}
	
	//equals	
	@Override
	public boolean equals(Object obj)
	{		
	}


}
