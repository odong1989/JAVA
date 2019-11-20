//ArrayList예제1
//SES자바책 303페이지 

public class StudentArrayTestEX
{
	//Step1. 변수선언
	private String name;
	private double score;

	//Step2. 생성자 선언
	public StudentArrayTestEX(String name, double score){
		this.name = name;
		this.score = score;
	}
	public StudentArrayTestEX(){}//생성자 기본형. 없을시 에러나서 필요없어도 추가해넣었다.

	//Step3. 메소드
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getScore(){
		return score;
	}

	public void setScore(double score){
		this.score = score;
	}


}
