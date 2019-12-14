/* 11월 13일 수업물이다.
 * StudentTest191113 으로 이름을 지었지만 classStudent패키지에 합치기위해 이름을 변경할 예정이다.
 * 
 * */
package study191113;

import java.util.ArrayList;

public class StudentTest191113 {
	
	public static void main(String[] args) 
	{
		Student a = new Student();
		Student b = new Student(new String("김"),92,90,90);		
		Student c = new Student(new String("홍"),92,90,90);	
		
		
		System.out.println(b);//"김 92 90 90"식으로 값을 출력할 수 있어! 
		/*Student클래스에서 오브젝트 클래세에게 기본적으로 상속받는
		 * public String toString()메소드를 수정한 것이기에 가능해진것이지.
		 * 안그러면 전처럼 메모리주소를 보내줌.
		 */
		System.out.println(b==c);//이거는 

		System.out.println("b학생과 c학생의 이름과 국영수점수까지 모두 똑같나요? : " + b.equals(c));
		//[주의]나중에 따로 연습시 꼭! 오버라이딩된것으로 해야 합니다!
		//Stdudent클래스에서 오버라이딩(튜닝)을 실시하였다.안그러면 주소값비교로 해서 무조건 False로 나온다.
		
		System.out.printf("%3.2f \n",b.getAvg());	
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("박",10,10,10));
		list.add(new Student("이",10,10,10));		
		System.out.println(list);	
		
		
	}
}