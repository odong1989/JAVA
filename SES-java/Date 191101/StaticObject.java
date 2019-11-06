class StaticObject 
{
	int num;		//멤버 변수
	static int cnt;	//클래스 변수

	public void printNum()
	{
		System.out.println("num은"+this.num);
		return;
	}

	public static void printCnt()
	{
		System.out.println("cnt는" + cnt);
		/*this는 객체를 가리키는 명령어인데
		  static int cnt;	클래스 변수는 그렇게 적용되지 않기에 
		  
		*/
		return;
	}


	//StaticObject의 생성자입니다.
	//주요사항(1)접근지정자를 public으로 한다.(무조건 항상 public인 것은 아니지만 거의 퍼블릭)
	//주요사항(2)클래스이름과 동일해야한다.
	//주요사항(3)반환타입을 기입하지 않는다.(일반 메소드경우 최소 void라도 적지만 생성자는 그딴거 거없음)
	public StaticObject()
	{
		num++;
		cnt++;
		System.out.println(cnt+"번째 객체가 생성되었습니다.");
	}

	/*
	아래처럼 작성할 경우 자바는 StaticObject()를 "단순한 하나의 메소드"로만 보지
	생성자로 취급하지 않는다.
	그래서 public void StaticObject()는 생성자를 목표로 만들었지만 
	public void StaticObject()
	{
		num++;
		cnt++;
		System.out.println(cnt+"번째 객체가 생성되었습니다.");
	}
	*/

}
