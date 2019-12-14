public class TestMethodOverriding
{
	public static void main(String[] args) 
	{
		Student student = new Student("Ã¶¼ö", 21, "2008290003");
		String report = student.printAll();
		System.out.println("Student Report");
		System.out.println(report);
	}
}

class Student extends Person{
	protected String no;
	
	public Student(String name, int age, String no){
	super(name, age);
	this.no = no;
	}

	public String printAll(){
		return "Name : " + name + " Age : "+ age + " No : "+ no;		
	}

}

class Person {
		protected String name;
		protected int age;

		public Person(String name, int age){
		this.name = name;
		this.age = age;
		}

		public String printAll(){
			return "Name : " + name + " Age : "+ age;
		}
}