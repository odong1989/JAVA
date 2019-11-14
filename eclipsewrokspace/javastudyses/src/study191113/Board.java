package study191113;
//�Խ����� �� ���� 1���� ���� VO Ŭ�����Դϴ�.
public class Board {
	
	//[1]������
	//�۹�ȣ(1,2,3....)	|int
	//�ۼ��� ID			|String
	//����				|String
	//�۳���				|String
	
	private int postNumber;
	private String id;
	private String title;
	private String contents;

	
	//[2]������
	//�⺻������
	//4���� ���� ��� �޴� ������

	//�⺻������
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	//4���� ���� ��� �޴� ������
	public Board(int postNumber, String id, String title, String contents) {
		super();
		this.postNumber = postNumber;
		this.id = id;
		this.title = title;
		this.contents = contents;
	}
	
	
	//[3]�޼ҵ��
	/*
	 * 	private int postNumber;
	 * 	private String id;
	 * 	private String title;
	 * 	private String contents;
	 * */
	
	//�⺻�޼ҵ�
	//get, set �޼ҵ��
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
	
	
	//�������̵� �޼ҵ�
	//toString
	//toString�� ArrayList�� ������ ����ϵ��� �����մϴ�.
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
