package board.vo;

import java.io.Serializable;

public class Board implements Serializable {
	//implements Serializable �̰��� �ǽþ����� 
	//�������� ����ȭ�� �ȵǰ�,
	//����ȭ�� �ȵǴ� ������ ������!!
	//�޼ҵ��� �� ������ �Ϸ�Ǿ �߻����� ��������� ��¯ ���繬!!
	
	//1.��������
	private int num;		 //1)�۹�ȣ
	private String name;	 //2)�ۼ����̸�
	private String title; 	 //3)������
	private String contents; //4)�۳���
	
	//2.�����ڼ���
	
	public Board() {
		//�⺻��. �ǹ̾�� �����ȳ��� �Ϸ��� �ִ´�.
	}
	
	public Board(int num, String name, String title, String contents){
		//3.1�޼ҵ带 �״�� Ȱ���ϴ� ������� �غ��ô�.
		setNum(num);
		setName(name);
		setTitle(title);		
		setContents(contents);
	}
	
	//3.1�޼ҵ弱��(��������)
	//set(������ ����)��Ʈ
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
	
	//get(������ ����ڿ��� ����)��Ʈ
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
	
	//3.2�޼ҵ弱��(�������̵�)
	@Override
	public String toString() {
		return "�۹�ȣ : " + getNum() + "�ۼ����̸� : " +getName() + "������ : " + getTitle() + "�۳��� : " +getContents(); 
	}
	
}

