class StudentTest2 
{
	public static void main(String[] args) 
	{

		Student_2 a = new Student_2();
//		a.setScore(100, 90, 80);
//		a.setName("김");
		
		Student_2 b = new Student_2("1111", "박", 50,60,70);
		//기본생성자로 생성된 이후 사용자가 원하는 겂으로 입력되도록 한다.
		
		System.out.println("Hello World!");

		String x = new String();

		//Math m = new Math();//이 문장은 오류가 정상이다. private으로 설정되어 있기에 사용자가 수정은 못한다. 설정되어 있는 기능을 호출하여 사용만 가능하다.

		double xx = Math.pow(2,10);


	}
}
