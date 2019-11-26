package board.vo;

import java.io.Serializable;

public class Board implements Serializable {
	//implements Serializable 이것을 실시않으면 
	//데이터의 직렬화가 안되고,
	//직렬화가 안되니 저장을 못하지!!
	//메소드들로 다 구현이 완료되어도 추상상속을 선언않으면 말짱 도루묵!!
	
	//1.변수선언
	private int num;		 //1)글번호
	private String name;	 //2)작성자이름
	private String title; 	 //3)글제목
	private String contents; //4)글내용
	
	//2.생성자선언
	
	public Board() {
		//기본형. 의미없어도 에러안나게 하려고 넣는다.
	}
	
	public Board(int num, String name, String title, String contents){
		//3.1메소드를 그대로 활용하는 방식으로 해봅시다.
		setNum(num);
		setName(name);
		setTitle(title);		
		setContents(contents);
	}
	
	//3.1메소드선언(오리지널)
	//set(데이터 설정)파트
	public void setNum(int num){
		this.num = num;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setContents(String contents){
		this.contents = contents;
	}
	
	//get(데이터 사용자에게 리턴)파트
	public int getNum() {
		return this.num;
	}
	public String getName() {
		return this.name;
	}
	public String getTitle() {
		return this.title;
	}	
	public String getContents() {
		return this.contents;
	}	
	
	//3.2메소드선언(오버라이딩)
	@Override
	public String toString() {
		return "글번호 : " + getNum() + "작성자이름 : " +getName() + "글제목 : " + getTitle() + "글내용 : " +getContents(); 
	}
	
}

