import java.util.ArrayList;

class StudentList 
{
	public static void main(String[] args) 
	{
		ArrayList<StudentArrayTestEX> studentList = new ArrayList<>();

		//StudentArrayTestEX클래스의 
		//Step2. 생성자 선언
		//public StudentArrayTestEX(String name, double score)
		//를 활용하여 생성한다 
		studentList.add(new StudentArrayTestEX("홍길동",90));
		studentList.add(new StudentArrayTestEX("김개동",80));
		studentList.add(new StudentArrayTestEX("이말숙",100));

		/*
		studentList번호|name  | score
		--------------|------------------
				0	  |"홍길동"|90
		--------------------------------
				1	  |"김개동"|80
		--------------------------------
				2	  |"이말숙"|100
		--------------------------------
		*/

		for(int i=0; i<studentList.size(); i++){
			System.out.printf("이름 : %s  점수 : %3.2f \n",
							   studentList.get(i).getName(),
							   studentList.get(i).getScore());
			//get(),size()는 Class ArrayList<E>에서 기본제공하는 메소드이다.
			}
	}
}
