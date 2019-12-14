/* 11월 13일 수업물이다.
 * Student으로 이름을 지었지만 classStudent패키지에 합치기위해 이름을 변경할 예정이다.
 * 
 * */

package study191113;//start first



public class Student// Student 옆으로 extends, implements가 올수 있습니다!
{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
		
	public double getAvg() {
		double avg = getTotal()/3.0; 	
		return avg;	
	}

	//Object 클래스에서그대로 가져온다.
	@Override //toString()을 오버라이딩하고 있다. 컴파일러야 오버라이딩되는지 확인해라~ 라는 명령이다.
	//System.out.printf("%3.2f \n",b.getAvg());	, System.out.println(list);
	//과 같은 성적출력에서 사용된다. 명령등에 적용된다.
	public String toString() //오버라이딩을 실시했다고 할수 있이죠
	{
		String output=name +" "+ kor +" "+ eng + " "+ math ;
		return output;
	}
	
	
	
	
	
	/*[tip]자주하는 실수시리즈 - 오버라이딩할 메소드 명의 대소문자 실수로 바꿀 경우
	 * public String tostring() //자바는 오버라이딩이 아니라, tostring()이라는 메소드가 새로 생성되었다!라고 이해하게 되죠. 
		{
		String output=name +" "+ kor +" "+ eng + " "+ math ;
		return output;
		}
		
		컴파일시 에러로 잡히지 않아서 골치 아프게 되죠.
	
		[tip]@Override라고 넣어두면 
			"컴파일러야, 내가 오버라이딩을 하고 있는데 컴파일러야 체크해줘"
			하게된다.
		    이클립스에서는 
	 * */
	

	//Object 클래스에서그대로 가져온다.
	public boolean equals(Object obj)
	{//현재클래스내에서 국어값이 같네? 이런것을 확인할 목적으로 위의 메소드원본을 가져왔다.
	 //이처럼 기존의 메소드를 오버라이딩(튜닝)을 할지는 자신이 정해야 한다.
	 //지금 오버라이딩 하는 이유는 기존의 메소드를 그대로 사용하면
	 //프로그래머가 원하는 성적비교가 아닌, 엉뚱하게 주소값비교만 하니까 쓸모가 없기에 튜닝을 하는 것이다.
		
		
	 // this가 가리키는 객체랑 
		if(!(obj instanceof Student))//파라미터 값이 객체형이 맞는지를 확인한다.
		{
			return false;//입력된자료가 엉뚱한 형이 들어왔으니 무조건 false로 퇴짜해야하니까.
		}
		
		Student st = (Student) obj; //객체는 1개뿐이고 obj가 가리키다가 st라는 아이가 함께 가리키게 되는 형태이죠.
		//왜 귀찮이 2명이 1개를 가리키게 하냐고요? 
		//간단하게 st라고 적을 수 있으니까요(#짧게 쓰고싶다면 이렇게 상속을 활용한 방식을 써먹자)
		
		/*국어성적이 같은지 확인하고 싶을 경우의 코딩---------------------------------
		if(this.kor == st.kor)
		//if(this.kor == ((Student)obj).kor)랑 같다!
		{
			return true;
		}
		
		else {
			return false;
		}
		국어성적이 같은지 확인하고 싶을 경우의 코딩종료---------------------------------*/
	
		//이름부터 국영수 성적까지 모두 똑같은지 확인하고싶어요
		if(this.name.contentEquals(st.name) && this.kor == st.kor && this.eng == st.eng && this.math == st.math)
		//if(this.kor == ((Student)obj).kor)랑 같다!
		{
			return true;
		}
		
		else {
			return false;
		}
	
	
	}
	
}
