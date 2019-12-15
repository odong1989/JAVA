package global.sesoc.person.vo;
import global.sesoc.person.dao.PersonDAO;
import global.sesoc.person.vo.Person;
/**
 * 개인 정보를 저장할 VO 클래스
 */
public class Person {
	//1. 변수정의
	private int num;					//일련번호
	private String name;				//이름
	private int age;					//나이
	
	//2.   생성자
	//2.1. 기본생성자(안써먹어도 무조건해야합니다! 기본생성자가 없으면 마이바틱스가 객체를 못만듭니다!!)
	public Person() {
	}
	
	//2.2. 생성자(이름,나이 입력시)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//2.3 생성자(번호,이름,나이)
	public Person(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
}
