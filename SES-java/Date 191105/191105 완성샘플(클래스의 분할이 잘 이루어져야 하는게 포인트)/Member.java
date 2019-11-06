//이름, 생년월일, 키, 몸무게, 혈액형
//예) 홍길동, 900101, 177.7, 88.8, A

import java.util.Calendar;
public class Member {
	private String name;
	private String birth;
	private double height;
	private double weight;
	private String type;
	
	//생성자
	public Member() {
	}
	public Member(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	public Member(String name, String birth, double height, double weight, String type) {
		this.name = name;
		this.birth = birth;
		this.height = height;
		this.weight = weight;
		this.type = type;
	}
	//Getters, Setters
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return this.birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		Calendar c = Calendar.getInstance();
		int year = Integer.parseInt(birth.substring(0,2));
		int age = c.get(Calendar.YEAR) - 1900 - year;
		if (age > 100) age -= 100;
		return age;
	}
	public double getBmi() {
		double bmi = weight / Math.pow(height / 100.0, 2);
		return bmi;
	}
	public String getBmi(String msg) {
		double bmi = getBmi();
		String s = "";
		if (msg.equalsIgnoreCase("GRADE")) {
			if (bmi < 18.5)			s = "저체중";
			else if (bmi < 23.0)	s = "정상체중";
			else if (bmi < 25.0)	s = "과체중";
			else					s = "비만";
		}
		return s;
	}
	
}
